// This is a generated file. Not intended for manual editing.
package org.kevoree.modeling.idea.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.kevoree.modeling.idea.psi.impl.*;

public interface MetaModelTypes {

  IElementType ATTRIBUTE_DECLARATION = new MetaModelElementType("ATTRIBUTE_DECLARATION");
  IElementType ATTRIBUTE_NAME = new MetaModelElementType("ATTRIBUTE_NAME");
  IElementType CLASS_DECLARATION = new MetaModelElementType("CLASS_DECLARATION");
  IElementType CLASS_ELEM_DECLARATION = new MetaModelElementType("CLASS_ELEM_DECLARATION");
  IElementType DECLARATION = new MetaModelElementType("DECLARATION");
  IElementType ENUM_DECLARATION = new MetaModelElementType("ENUM_DECLARATION");
  IElementType ENUM_ELEM_DECLARATION = new MetaModelElementType("ENUM_ELEM_DECLARATION");
  IElementType INDEX_DECLARATION = new MetaModelElementType("INDEX_DECLARATION");
  IElementType INDEX_ELEM_DECLARATION = new MetaModelElementType("INDEX_ELEM_DECLARATION");
  IElementType PARENTS_DECLARATION = new MetaModelElementType("PARENTS_DECLARATION");
  IElementType RELATION_DECLARATION = new MetaModelElementType("RELATION_DECLARATION");
  IElementType RELATION_NAME = new MetaModelElementType("RELATION_NAME");
  IElementType SEMANTIC_DECLR = new MetaModelElementType("SEMANTIC_DECLR");
  IElementType SEMANTIC_ELEM_DECLR = new MetaModelElementType("SEMANTIC_ELEM_DECLR");
  IElementType SEMANTIC_FROM = new MetaModelElementType("SEMANTIC_FROM");
  IElementType SEMANTIC_USING = new MetaModelElementType("SEMANTIC_USING");
  IElementType SEMANTIC_WITH = new MetaModelElementType("SEMANTIC_WITH");
  IElementType TYPE_DECLARATION = new MetaModelElementType("TYPE_DECLARATION");

  IElementType ANNOTATION_DECLR = new MetaModelTokenType("ANNOTATION_DECLR");
  IElementType ANNOT_PARAM_CLOSE = new MetaModelTokenType(")");
  IElementType ANNOT_PARAM_OPEN = new MetaModelTokenType("(");
  IElementType ARRAY = new MetaModelTokenType("[]");
  IElementType ATT = new MetaModelTokenType("att");
  IElementType BODY_CLOSE = new MetaModelTokenType("}");
  IElementType BODY_OPEN = new MetaModelTokenType("{");
  IElementType CLASS = new MetaModelTokenType("class");
  IElementType COLON = new MetaModelTokenType(":");
  IElementType COMMA = new MetaModelTokenType(",");
  IElementType COMMENT = new MetaModelTokenType("comment");
  IElementType CRLF = new MetaModelTokenType("CRLF");
  IElementType DEPENDENCY_DECLARATION = new MetaModelTokenType("DEPENDENCY_DECLARATION");
  IElementType ENUM = new MetaModelTokenType("enum");
  IElementType EOF = new MetaModelTokenType("<<EOF>>");
  IElementType EQ = new MetaModelTokenType("=");
  IElementType EXTENDS = new MetaModelTokenType("extends");
  IElementType FROM = new MetaModelTokenType("from");
  IElementType FUNC = new MetaModelTokenType("func");
  IElementType IDENT = new MetaModelTokenType("IDENT");
  IElementType INDEX = new MetaModelTokenType("index");
  IElementType MULT_SEP = new MetaModelTokenType(".");
  IElementType NEWLINE = new MetaModelTokenType("newline");
  IElementType NUMBER = new MetaModelTokenType("NUMBER");
  IElementType REF = new MetaModelTokenType("rel");
  IElementType STRING = new MetaModelTokenType("string");
  IElementType SUB = new MetaModelTokenType("/");
  IElementType USING = new MetaModelTokenType("using");
  IElementType WITH = new MetaModelTokenType("with");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ATTRIBUTE_DECLARATION) {
        return new MetaModelAttributeDeclarationImpl(node);
      }
      else if (type == ATTRIBUTE_NAME) {
        return new MetaModelAttributeNameImpl(node);
      }
      else if (type == CLASS_DECLARATION) {
        return new MetaModelClassDeclarationImpl(node);
      }
      else if (type == CLASS_ELEM_DECLARATION) {
        return new MetaModelClassElemDeclarationImpl(node);
      }
      else if (type == DECLARATION) {
        return new MetaModelDeclarationImpl(node);
      }
      else if (type == ENUM_DECLARATION) {
        return new MetaModelEnumDeclarationImpl(node);
      }
      else if (type == ENUM_ELEM_DECLARATION) {
        return new MetaModelEnumElemDeclarationImpl(node);
      }
      else if (type == INDEX_DECLARATION) {
        return new MetaModelIndexDeclarationImpl(node);
      }
      else if (type == INDEX_ELEM_DECLARATION) {
        return new MetaModelIndexElemDeclarationImpl(node);
      }
      else if (type == PARENTS_DECLARATION) {
        return new MetaModelParentsDeclarationImpl(node);
      }
      else if (type == RELATION_DECLARATION) {
        return new MetaModelRelationDeclarationImpl(node);
      }
      else if (type == RELATION_NAME) {
        return new MetaModelRelationNameImpl(node);
      }
      else if (type == SEMANTIC_DECLR) {
        return new MetaModelSemanticDeclrImpl(node);
      }
      else if (type == SEMANTIC_ELEM_DECLR) {
        return new MetaModelSemanticElemDeclrImpl(node);
      }
      else if (type == SEMANTIC_FROM) {
        return new MetaModelSemanticFromImpl(node);
      }
      else if (type == SEMANTIC_USING) {
        return new MetaModelSemanticUsingImpl(node);
      }
      else if (type == SEMANTIC_WITH) {
        return new MetaModelSemanticWithImpl(node);
      }
      else if (type == TYPE_DECLARATION) {
        return new MetaModelTypeDeclarationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
