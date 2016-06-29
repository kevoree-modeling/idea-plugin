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
import org.kevoree.modeling.idea.psi.MetaModelEnumDeclaration;
import org.kevoree.modeling.idea.psi.MetaModelIndexDeclaration;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MetaModelStructureViewIndexElement implements StructureViewTreeElement, SortableTreeElement {

    private MetaModelIndexDeclaration indexDecl;
    private String presText;
    private Editor editor;
    public List<MetaModelStructureViewIndexElementElement> elements = new ArrayList<MetaModelStructureViewIndexElementElement>();

    public MetaModelStructureViewIndexElement(MetaModelIndexDeclaration iDecl, Editor editor) {
        this.indexDecl = iDecl;
        this.editor = editor;
        int indexOfPoint = iDecl.getTypeDeclarationList().get(0).getName().lastIndexOf(".");
        if (indexOfPoint > 0) {
            presText = iDecl.getTypeDeclarationList().get(0).getName().substring(indexOfPoint + 1);
        } else {
            presText = iDecl.getTypeDeclarationList().get(0).getName();
        }
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
                return AllIcons.Nodes.Tag;
            }
        };
    }

    @Override
    public TreeElement[] getChildren() {
        List<TreeElement> all = new ArrayList<TreeElement>();
        all.addAll(elements);
        return all.toArray(new TreeElement[all.size()]);
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        return presText;
    }
}
