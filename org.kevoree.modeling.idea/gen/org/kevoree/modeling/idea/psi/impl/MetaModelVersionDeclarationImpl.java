// This is a generated file. Not intended for manual editing.
package org.kevoree.modeling.idea.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.kevoree.modeling.idea.psi.MetaModelTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.kevoree.modeling.idea.psi.*;

public class MetaModelVersionDeclarationImpl extends ASTWrapperPsiElement implements MetaModelVersionDeclaration {

  public MetaModelVersionDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MetaModelVisitor) ((MetaModelVisitor)visitor).visitVersionDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MetaModelKmfVersionDeclaration getKmfVersionDeclaration() {
    return findChildByClass(MetaModelKmfVersionDeclaration.class);
  }

  @Override
  @Nullable
  public MetaModelModelVersionDeclaration getModelVersionDeclaration() {
    return findChildByClass(MetaModelModelVersionDeclaration.class);
  }

}
