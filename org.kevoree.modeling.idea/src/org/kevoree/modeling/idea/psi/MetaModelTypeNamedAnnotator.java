package org.kevoree.modeling.idea.psi;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.kevoree.modeling.idea.psi.impl.MetaModelRelationDeclarationImpl;
import org.kevoree.modeling.util.PrimitiveTypes;

/**
 * Created by duke on 7/16/14.
 */
public class MetaModelTypeNamedAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull final PsiElement psiElement, @NotNull final AnnotationHolder annotationHolder) {

        if (psiElement instanceof MetaModelTypeDeclaration) {
            if (((MetaModelTypeDeclaration) psiElement).getName().indexOf(".") < 1) {
                for (PrimitiveTypes p : PrimitiveTypes.values()) {
                    if (((MetaModelTypeDeclaration) psiElement).getName().equals(p.name())) {
                        return;
                    }
                }
                annotationHolder.createErrorAnnotation(psiElement, "Type identifier must be a qualified name with at least one package as : pack.ClassName");
            } else {
                final MetaModelTypeDeclaration casted = (MetaModelTypeDeclaration) psiElement;
                if (casted != null && casted.getParent() != null && (casted.getParent() instanceof MetaModelAttributeDeclaration || casted.getParent() instanceof MetaModelOutputDeclaration)) {
                    final boolean[] isValidated = {false};
                    for (PrimitiveTypes p : PrimitiveTypes.values()) {
                        if (casted.getName().equals(p.name())) {
                            isValidated[0] = true;
                        }
                    }
                    if (!isValidated[0]) {
                        //look for enum
                        PsiElement parent = psiElement.getParent();
                        if (!(parent instanceof MetaModelClassDeclaration) && !(parent instanceof MetaModelEnumDeclaration)) {
                            PsiFile file = psiElement.getContainingFile();
                            file.acceptChildren(new MetaModelVisitor() {
                                @Override
                                public void visitPsiElement(@NotNull PsiElement o) {
                                    super.visitPsiElement(o);
                                    if (o != null && !isValidated[0]) {
                                        o.acceptChildren(this);
                                    }
                                }

                                @Override
                                public void visitEnumDeclaration(@NotNull MetaModelEnumDeclaration o) {
                                    if (o != null && o.getTypeDeclaration() != null && o.getTypeDeclaration().getName() != null && o.getTypeDeclaration().getName().equals(casted.getName())) {
                                        isValidated[0] = true;
                                    }
                                }

                            });
                            if (!isValidated[0]) {
                                annotationHolder.createErrorAnnotation(psiElement, "References and Dependencies must have a declared type, please declare corresponding class");
                            }
                        }
                    }
                    if (!isValidated[0]) {
                        annotationHolder.createErrorAnnotation(psiElement, "Attributes and Outputs must have a primitive type such as Long, Double, Continous, Int or Bool");
                    }
                } else if (casted != null && casted.getParent() != null && (casted.getParent() instanceof MetaModelRelationDeclaration || casted.getParent() instanceof MetaModelDependencyDeclaration)) {
                    final boolean[] isValidated = {false};
                    if (!isValidated[0]) {
                        PsiElement parent = psiElement.getParent();
                        if (!(parent instanceof MetaModelClassDeclaration) && !(parent instanceof MetaModelEnumDeclaration)) {
                            PsiFile file = psiElement.getContainingFile();
                            file.acceptChildren(new MetaModelVisitor() {
                                @Override
                                public void visitPsiElement(@NotNull PsiElement o) {
                                    super.visitPsiElement(o);
                                    if (o != null && !isValidated[0]) {
                                        o.acceptChildren(this);
                                    }
                                }

                                @Override
                                public void visitClassDeclaration(@NotNull MetaModelClassDeclaration o) {
                                    if (o != null && o.getTypeDeclaration() != null && o.getTypeDeclaration().getName() != null && o.getTypeDeclaration().getName().equals(casted.getName())) {
                                        isValidated[0] = true;
                                    }
                                }
                            });
                            if (!isValidated[0]) {
                                annotationHolder.createErrorAnnotation(psiElement, "References and Dependencies must have a declared type, please declare corresponding class");
                            }
                        }
                    }
                }
            }
        }
    }
}
