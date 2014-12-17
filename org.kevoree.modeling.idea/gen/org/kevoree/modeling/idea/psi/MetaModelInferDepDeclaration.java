// This is a generated file. Not intended for manual editing.
package org.kevoree.modeling.idea.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MetaModelInferDepDeclaration extends PsiElement {

  @Nullable
  MetaModelInferDepTimeDecl getInferDepTimeDecl();

  @Nullable
  MetaModelMultiplicityDeclaration getMultiplicityDeclaration();

  @NotNull
  MetaModelTypeDeclaration getTypeDeclaration();

  @NotNull
  PsiElement getIdent();

}
