package org.kevoree.modeling.idea.structure;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.ScrollType;
import com.intellij.util.PlatformIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.kevoree.modeling.idea.psi.MetaModelDependencyDeclaration;
import org.kevoree.modeling.idea.psi.MetaModelOuputDeclaration;

import javax.swing.*;

public class MetaModelStructureViewOutputElement implements StructureViewTreeElement, SortableTreeElement {

    private MetaModelOuputDeclaration refDecl;
    private Editor editor;
    private String simpleType;
    private boolean id = false;
    private boolean contained = false;

    public MetaModelStructureViewOutputElement(MetaModelOuputDeclaration refDecl, Editor editor) {
        this.refDecl = refDecl;
        this.editor = editor;
        simpleType = refDecl.getTypeDeclaration().getName().substring(refDecl.getTypeDeclaration().getName().lastIndexOf(".") + 1);
    }

    public boolean isAttribute() {
        return false;
    }

    public boolean isId() {
        return id;
    }

    public boolean isContained() {
        return contained;
    }

    @Override
    public Object getValue() {
        return refDecl;
    }

    @Override
    public void navigate(boolean b) {
        editor.getCaretModel().moveToOffset(refDecl.getTextOffset());
        editor.getScrollingModel().scrollToCaret(ScrollType.CENTER_UP);
    }


    @Override
    public boolean canNavigate() {
        return true;
    }

    @Override
    public boolean canNavigateToSource() {
        return true;
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return refDecl.getOutputName().getText() + " : " + simpleType;
            }

            @Nullable
            @Override
            public String getLocationString() {
                return null;
            }

            @Nullable
            @Override
            public Icon getIcon(boolean b) {
                return PlatformIcons.EXPORT_ICON;
            }
        };
    }

    @Override
    public TreeElement[] getChildren() {
        return EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        return refDecl.getOutputName().getText();
    }
}
