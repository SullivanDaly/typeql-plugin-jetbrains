// This is a generated file. Not intended for manual editing.
package com.intellij.lang.graql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraqlPath extends PsiElement {

  @NotNull
  List<GraqlIdentifier> getIdentifierList();

  @Nullable
  GraqlInList getInList();

}
