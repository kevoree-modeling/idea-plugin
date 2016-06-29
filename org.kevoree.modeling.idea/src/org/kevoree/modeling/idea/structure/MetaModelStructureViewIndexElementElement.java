package org.kevoree.modeling.idea.structure;

import com.intellij.icons.AllIcons;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.ScrollType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.kevoree.modeling.idea.psi.MetaModelEnumElemDeclaration;
import org.kevoree.modeling.idea.psi.MetaModelIndexElemDeclaration;

import javax.swing.*;

public class MetaModelStructureViewIndexElementElement implements StructureViewTreeElement, SortableTreeElement {

    private MetaModelIndexElemDeclaration indexDecl;
    private String presText;
    private Editor editor;

    public MetaModelStructureViewIndexElementElement(MetaModelIndexElemDeclaration iDecl, Editor editor) {
        this.indexDecl = iDecl;
        this.editor = editor;
        presText = iDecl.getText();
    }

    @Override
    public Object getValue() {
        return indexDecl;
    }

    @Override
    public void navigate(boolean b) {
        //System.out.println("Editor:" + editor.getClass());
        editor.getCaretModel().moveToOffset(indexDecl.getTextOffset());
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
                return presText;
            }

            @Nullable
            @Override
            public String getLocationString() {
                return null;
            }

            @Nullable
            @Override
            public Icon getIcon(boolean b) {
                return AllIcons.Nodes.Static;
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
        return presText;
    }
}
