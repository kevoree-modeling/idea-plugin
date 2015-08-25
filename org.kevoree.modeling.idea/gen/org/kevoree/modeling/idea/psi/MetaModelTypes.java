// This is a generated file. Not intended for manual editing.
package org.kevoree.modeling.idea.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.kevoree.modeling.idea.psi.impl.*;

public interface MetaModelTypes {

  IElementType ANNOTATION_DECLR = new MetaModelElementType("ANNOTATION_DECLR");
  IElementType ANNOTATION_NAME = new MetaModelElementType("ANNOTATION_NAME");
  IElementType ATTRIBUTE_DECLARATION = new MetaModelElementType("ATTRIBUTE_DECLARATION");
  IElementType ATTRIBUTE_NAME = new MetaModelElementType("ATTRIBUTE_NAME");
  IElementType CLASS_DECLARATION = new MetaModelElementType("CLASS_DECLARATION");
  IElementType CLASS_ELEM_DECLARATION = new MetaModelElementType("CLASS_ELEM_DECLARATION");
  IElementType DECLARATION = new MetaModelElementType("DECLARATION");
  IElementType DEPENDENCY_DECLARATION = new MetaModelElementType("DEPENDENCY_DECLARATION");
  IElementType DEPENDENCY_NAME = new MetaModelElementType("DEPENDENCY_NAME");
  IElementType ENUM_DECLARATION = new MetaModelElementType("ENUM_DECLARATION");
  IElementType ENUM_ELEM_DECLARATION = new MetaModelElementType("ENUM_ELEM_DECLARATION");
  IElementType INPUT_DECLARATION = new MetaModelElementType("INPUT_DECLARATION");
  IElementType INPUT_NAME = new MetaModelElementType("INPUT_NAME");
  IElementType OPERATION_DECLARATION = new MetaModelElementType("OPERATION_DECLARATION");
  IElementType OPERATION_NAME = new MetaModelElementType("OPERATION_NAME");
  IElementType OPERATION_PARAM = new MetaModelElementType("OPERATION_PARAM");
  IElementType OPERATION_PARAMS = new MetaModelElementType("OPERATION_PARAMS");
  IElementType OPERATION_RETURN = new MetaModelElementType("OPERATION_RETURN");
  IElementType OUTPUT_DECLARATION = new MetaModelElementType("OUTPUT_DECLARATION");
  IElementType OUTPUT_NAME = new MetaModelElementType("OUTPUT_NAME");
  IElementType PARENTS_DECLARATION = new MetaModelElementType("PARENTS_DECLARATION");
  IElementType RELATION_DECLARATION = new MetaModelElementType("RELATION_DECLARATION");
  IElementType RELATION_NAME = new MetaModelElementType("RELATION_NAME");
  IElementType TYPE_DECLARATION = new MetaModelElementType("TYPE_DECLARATION");

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
  IElementType DEPENDENCY = new MetaModelTokenType("dependency");
  IElementType ENUM = new MetaModelTokenType("enum");
  IElementType EOF = new MetaModelTokenType("<<EOF>>");
  IElementType EQ = new MetaModelTokenType("=");
  IElementType EXTENDS = new MetaModelTokenType("extends");
  IElementType FROM = new MetaModelTokenType("from");
  IElementType FUNC = new MetaModelTokenType("func");
  IElementType IDENT = new MetaModelTokenType("IDENT");
  IElementType INPUT = new MetaModelTokenType("input");
  IElementType MREF = new MetaModelTokenType("ref*");
  IElementType MULT_SEP = new MetaModelTokenType(".");
  IElementType NEWLINE = new MetaModelTokenType("newline");
  IElementType NUMBER = new MetaModelTokenType("NUMBER");
  IElementType OUTPUT = new MetaModelTokenType("output");
  IElementType REF = new MetaModelTokenType("ref");
  IElementType STRING = new MetaModelTokenType("string");
  IElementType SUB = new MetaModelTokenType("/");
  IElementType WITH = new MetaModelTokenType("with");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ANNOTATION_DECLR) {
        return new MetaModelAnnotationDeclrImpl(node);
      }
      else if (type == ANNOTATION_NAME) {
        return new MetaModelAnnotationNameImpl(node);
      }
      else if (type == ATTRIBUTE_DECLARATION) {
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
      else if (type == DEPENDENCY_DECLARATION) {
        return new MetaModelDependencyDeclarationImpl(node);
      }
      else if (type == DEPENDENCY_NAME) {
        return new MetaModelDependencyNameImpl(node);
      }
      else if (type == ENUM_DECLARATION) {
        return new MetaModelEnumDeclarationImpl(node);
      }
      else if (type == ENUM_ELEM_DECLARATION) {
        return new MetaModelEnumElemDeclarationImpl(node);
      }
      else if (type == INPUT_DECLARATION) {
        return new MetaModelInputDeclarationImpl(node);
      }
      else if (type == INPUT_NAME) {
        return new MetaModelInputNameImpl(node);
      }
      else if (type == OPERATION_DECLARATION) {
        return new MetaModelOperationDeclarationImpl(node);
      }
      else if (type == OPERATION_NAME) {
        return new MetaModelOperationNameImpl(node);
      }
      else if (type == OPERATION_PARAM) {
        return new MetaModelOperationParamImpl(node);
      }
      else if (type == OPERATION_PARAMS) {
        return new MetaModelOperationParamsImpl(node);
      }
      else if (type == OPERATION_RETURN) {
        return new MetaModelOperationReturnImpl(node);
      }
      else if (type == OUTPUT_DECLARATION) {
        return new MetaModelOutputDeclarationImpl(node);
      }
      else if (type == OUTPUT_NAME) {
        return new MetaModelOutputNameImpl(node);
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
      else if (type == TYPE_DECLARATION) {
        return new MetaModelTypeDeclarationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
