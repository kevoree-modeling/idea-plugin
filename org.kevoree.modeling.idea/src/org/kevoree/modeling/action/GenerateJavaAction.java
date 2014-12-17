package org.kevoree.modeling.action;

import com.google.common.io.ByteStreams;
import com.intellij.execution.configurations.CommandLineBuilder;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.configurations.JavaCommandLineStateUtil;
import com.intellij.execution.configurations.JavaParameters;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.projectRoots.JavaSdkType;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.impl.JavaAwareProjectJdkTableImpl;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.roots.libraries.Library;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.model.java.JavaResourceRootType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by duke on 7/17/14.
 */
public class GenerateJavaAction extends AnAction implements DumbAware {

    @Override
    public void update(AnActionEvent e) {
        super.update(e);
        VirtualFile currentFile = DataKeys.VIRTUAL_FILE.getData(e.getDataContext());
        final Presentation presentation = e.getPresentation();
        if (currentFile != null && (currentFile.getName().endsWith(".mm") || currentFile.getName().endsWith(".ecore"))) {
            presentation.setEnabledAndVisible(true);
        } else {
            presentation.setEnabledAndVisible(false);
        }
    }

    @Override
    public void actionPerformed(final AnActionEvent anActionEvent) {
        generate(anActionEvent, false);
    }

    public void generate(final AnActionEvent anActionEvent, final boolean js) {

        ApplicationManager.getApplication().invokeLater(new Runnable() {
            public void run() {
                ApplicationManager.getApplication().runWriteAction(new Runnable() {
                    public void run() {
                        final VirtualFile currentFile = DataKeys.VIRTUAL_FILE.getData(anActionEvent.getDataContext());
                        Module module = ProjectRootManager.getInstance(anActionEvent.getProject()).getFileIndex().getModuleForFile(currentFile);
                        FileDocumentManager.getInstance().saveDocument(FileDocumentManager.getInstance().getDocument(currentFile));
                        VirtualFile moduleRoot = null;
                        if (module.getModuleFile() == null) {
                            String relPath = module.getModuleFilePath().substring(0, module.getModuleFilePath().lastIndexOf(File.separator));
                            moduleRoot = anActionEvent.getProject().getBaseDir().getFileSystem().findFileByPath(relPath);
                        } else {
                            moduleRoot = module.getModuleFile().getParent();
                        }

                        try {
                            VirtualFile foundDir = moduleRoot.findChild("gen");
                            if (foundDir == null) {
                                foundDir = moduleRoot.createChildDirectory(this, "gen");
                            } else {
                                foundDir.delete(this);
                                foundDir = moduleRoot.createChildDirectory(this, "gen");
                            }

                            VirtualFile resourcesDir = null;
                            if (js) {
                                resourcesDir = moduleRoot.findChild("resources");
                                if (resourcesDir == null) {
                                    resourcesDir = moduleRoot.createChildDirectory(this, "resources");
                                }
                            }
                            final VirtualFile finalResourcesDir = resourcesDir;
                            final VirtualFile genDir = foundDir;
                            final VirtualFile finalModuleRoot = moduleRoot;
                            ProgressManager.getInstance().run(new Task.Backgroundable(anActionEvent.getProject(), "KMF Compiler 2 JAR") {
                                public void run(@NotNull ProgressIndicator progressIndicator) {
                                    Notifications.Bus.notify(new Notification("kevoree modeling framework", "KMF Compilation", "Compilation started", NotificationType.INFORMATION));
                                    progressIndicator.setFraction(0.10);
                                    progressIndicator.setText("Downloading KMF Compiler...");
                                    final String askedVersion = VersionAnalyzer.getKMFVersion(currentFile);
                                    final File compiler = KMFCompilerResolver.resolveCompiler(askedVersion);
                                    if (compiler == null) {
                                        progressIndicator.setFraction(1.0);
                                        progressIndicator.setText("compiler not found");
                                        Notifications.Bus.notify(new Notification("kevoree modeling framework", "KMF Compilation", "Compiler not found for version " + askedVersion, NotificationType.INFORMATION));
                                        return;
                                    }
                                    progressIndicator.setFraction(0.20);
                                    progressIndicator.setText("compile KMF code...");
                                    try {
                                        Sdk[] sdks = JavaAwareProjectJdkTableImpl.getInstance().getAllJdks();
                                        Sdk foundSdk = null;
                                        for (Sdk sdk : sdks) {
                                            if (sdk.getSdkType() instanceof JavaSdkType) {
                                                if (sdk.getVersionString() != null && sdk.getVersionString().contains("1.8")) {
                                                    foundSdk = sdk;
                                                }
                                            }
                                        }
                                        if (foundSdk != null) {
                                            JavaParameters parameters = new JavaParameters();
                                            parameters.setJdk(foundSdk);
                                            parameters.setUseDynamicClasspath(false);
                                            parameters.setMainClass("org.kevoree.modeling.generator.standalone.App");
                                            parameters.setWorkingDirectory(anActionEvent.getProject().getBasePath());
                                            parameters.getClassPath().add(compiler);
                                            parameters.getVMParametersList().add("-Doutput=" + genDir.getPath() + "");
                                            parameters.getProgramParametersList().add(currentFile.getPath());
                                            if (js) {
                                                parameters.getProgramParametersList().add("js");
                                                parameters.getVMParametersList().add("-Dresources=" + finalResourcesDir.getPath() + "");
                                            }
                                            GeneralCommandLine gcmd = CommandLineBuilder.createFromJavaParameters(parameters, anActionEvent.getProject(), false);
                                            OSProcessHandler handler = JavaCommandLineStateUtil.startProcess(gcmd, true);
                                            handler.setShouldDestroyProcessRecursively(true);
                                            int res = handler.getProcess().waitFor();
                                            progressIndicator.setFraction(1.0);
                                            progressIndicator.setText("finished");
                                            Notifications.Bus.notify(new Notification("kevoree modeling framework", "KMF Compilation", "Compilation success", NotificationType.INFORMATION));
                                            genDir.refresh(false, true);
                                            genDir.getParent().refresh(false, true);
                                            ApplicationManager.getApplication().invokeLater(new Runnable() {
                                                public void run() {
                                                    ApplicationManager.getApplication().runWriteAction(new Runnable() {
                                                        public void run() {
                                                            Module module = ProjectRootManager.getInstance(anActionEvent.getProject()).getFileIndex().getModuleForFile(currentFile);
                                                            ModuleRootManager moduleRootManager = ModuleRootManager.getInstance(module);
                                                            ModifiableRootModel rootModel = moduleRootManager.getModifiableModel();
                                                            VirtualFile srcJava = genDir.findChild("java");
                                                            if (srcJava != null) {
                                                                rootModel.getContentEntries()[0].addSourceFolder(srcJava, false);
                                                            }
                                                            if (finalResourcesDir != null) {
                                                                rootModel.getContentEntries()[0].addSourceFolder(finalResourcesDir, JavaResourceRootType.RESOURCE);
                                                            }
                                                            //TODO avoid in case of maven
                                                            VirtualFile libDir = finalModuleRoot.findChild("lib");
                                                            if (libDir == null) {
                                                                try {
                                                                    libDir = finalModuleRoot.createChildDirectory(this, "lib");
                                                                } catch (IOException e) {
                                                                    e.printStackTrace();
                                                                }
                                                            }
                                                            File microFramework = KMFCompilerResolver.resolveMicroFramework(askedVersion);
                                                            if (microFramework != null) {
                                                                VirtualFile kmf_fwk = libDir.findChild(microFramework.getName());
                                                                if (kmf_fwk == null) {
                                                                    try {
                                                                        VirtualFile framework = libDir.createChildData(this, microFramework.getName());
                                                                        byte[] payload = ByteStreams.toByteArray(new FileInputStream(microFramework));
                                                                        OutputStream os = framework.getOutputStream(this);
                                                                        os.write(payload);
                                                                        os.flush();
                                                                        os.close();
                                                                    } catch (IOException e) {
                                                                        e.printStackTrace();
                                                                    }
                                                                }
                                                                Library library = rootModel.getModuleLibraryTable().getLibraryByName("kmf");
                                                                if (library == null) {
                                                                    library = rootModel.getModuleLibraryTable().getModifiableModel().createLibrary("kmf");
                                                                }
                                                                Library.ModifiableModel modifiableModel = library.getModifiableModel();
                                                                modifiableModel.addJarDirectory(libDir, false);
                                                                modifiableModel.commit();

                                                            }
                                                            rootModel.commit();
                                                            currentFile.getParent().refresh(false, true);

                                                            if (finalResourcesDir != null) {
                                                                finalResourcesDir.refresh(false, true);
                                                            }

                                                        }
                                                    });
                                                }
                                            });

                                        } else {
                                            progressIndicator.setFraction(1.0);
                                            progressIndicator.setText("error");
                                            Notifications.Bus.notify(new Notification("kevoree modeling framework", "KMF Compilation", "Compilation fail, no compatible JDK founded", NotificationType.INFORMATION));
                                        }
                                        // Finished
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            });
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });


    }

}
