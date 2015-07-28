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
import org.kevoree.modeling.idea.psi.MetaModelClassDeclaration;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MetaModelStructureViewClassElement implements StructureViewTreeElement, SortableTreeElement {

    private MetaModelClassDeclaration classDecl;
    private String presText;
    private Editor editor;
    public List<MetaModelStructureViewAnnotationElement> annotationsDeclr = new ArrayList<MetaModelStructureViewAnnotationElement>();

    public List<MetaModelStructureViewAttributeElement> attributes = new ArrayList<MetaModelStructureViewAttributeElement>();
    public List<MetaModelStructureViewReferenceElement> references = new ArrayList<MetaModelStructureViewReferenceElement>();

    public List<MetaModelStructureViewDependencyElement> dependencies = new ArrayList<MetaModelStructureViewDependencyElement>();
    public List<MetaModelStructureViewInputElement> inputs = new ArrayList<MetaModelStructureViewInputElement>();
    public List<MetaModelStructureViewOutputElement> outputs = new ArrayList<MetaModelStructureViewOutputElement>();


    public List<MetaModelStructureViewOperationElement> operations = new ArrayList<MetaModelStructureViewOperationElement>();
    public List<MetaModelStructureViewParentElement> parents = new ArrayList<MetaModelStructureViewParentElement>();

    public MetaModelStructureViewClassElement(MetaModelClassDeclaration classDecl, Editor editor) {
        this.classDecl = classDecl;
        this.editor = editor;
        int indexOfPoint = classDecl.getTypeDeclaration().getName().lastIndexOf(".");
        if (indexOfPoint > 0) {
            presText = classDecl.getTypeDeclaration().getName().substring(indexOfPoint + 1);
        } else {
            presText = classDecl.getTypeDeclaration().getName();
        }
    }

    @Override
    public Object getValue() {
        return classDecl;
    }

    @Override
    public void navigate(boolean b) {
        editor.getCaretModel().moveToOffset(classDecl.getTextOffset());
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
                return PlatformIcons.CLASS_ICON;
            }
        };
    }

    @Override
    public TreeElement[] getChildren() {
        List<TreeElement> all = new ArrayList<TreeElement>();
        all.addAll(parents);

        all.addAll(annotationsDeclr);

        all.addAll(attributes);
        all.addAll(references);

        all.addAll(dependencies);
        all.addAll(inputs);
        all.addAll(outputs);

        all.addAll(operations);
        return all.toArray(new TreeElement[all.size()]);
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        return presText;
    }
}
