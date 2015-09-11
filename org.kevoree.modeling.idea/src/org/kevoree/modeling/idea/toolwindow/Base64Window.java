package org.kevoree.modeling.idea.toolwindow;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;

/**
 * Created by gnain on 11/09/15.
 */
public class Base64Window implements ToolWindowFactory {

    @Override
    public void createToolWindowContent(Project project, ToolWindow toolWindow) {

        toolWindow.getComponent().add(new Base64ToolWindowPanel());


    }
}
