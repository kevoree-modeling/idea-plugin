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
  IElementType DEPENDENCY_DECLARATION = new MetaModelElementType("DEPENDENCY_DECLARATION");
  IElementType DEPENDENCY_NAME = new MetaModelElementType("DEPENDENCY_NAME");
  IElementType ENUM_DECLARATION = new MetaModelElementType("ENUM_DECLARATION");
  IElementType ENUM_ELEM_DECLARATION = new MetaModelElementType("ENUM_ELEM_DECLARATION");
  IElementType INFER_WITH_DECLARATION = new MetaModelElementType("INFER_WITH_DECLARATION");
  IElementType INPUT_DECLARATION = new MetaModelElementType("INPUT_DECLARATION");
  IElementType INPUT_NAME = new MetaModelElementType("INPUT_NAME");
  IElementType KMF_VERSION_DECLARATION = new MetaModelElementType("KMF_VERSION_DECLARATION");
  IElementType MODEL_VERSION_DECLARATION = new MetaModelElementType("MODEL_VERSION_DECLARATION");
  IElementType MULTIPLICITY_DECLARATION = new MetaModelElementType("MULTIPLICITY_DECLARATION");
  IElementType MULTIPLICITY_DECLARATION_LOWER = new MetaModelElementType("MULTIPLICITY_DECLARATION_LOWER");
  IElementType MULTIPLICITY_DECLARATION_UPPER = new MetaModelElementType("MULTIPLICITY_DECLARATION_UPPER");
  IElementType OPERATION_DECLARATION = new MetaModelElementType("OPERATION_DECLARATION");
  IElementType OPERATION_NAME = new MetaModelElementType("OPERATION_NAME");
  IElementType OPERATION_PARAM = new MetaModelElementType("OPERATION_PARAM");
  IElementType OPERATION_PARAMS = new MetaModelElementType("OPERATION_PARAMS");
  IElementType OPERATION_RETURN = new MetaModelElementType("OPERATION_RETURN");
  IElementType OUTPUT_DECLARATION = new MetaModelElementType("OUTPUT_DECLARATION");
  IElementType OUTPUT_NAME = new MetaModelElementType("OUTPUT_NAME");
  IElementType PARENTS_DECLARATION = new MetaModelElementType("PARENTS_DECLARATION");
  IElementType PRECISION_DECLARATION = new MetaModelElementType("PRECISION_DECLARATION");
  IElementType RELATION_DECLARATION = new MetaModelElementType("RELATION_DECLARATION");
  IElementType RELATION_NAME = new MetaModelElementType("RELATION_NAME");
  IElementType RELATION_OPPOSITE = new MetaModelElementType("RELATION_OPPOSITE");
  IElementType TEMPORAL_LIMIT_DECLARATION = new MetaModelElementType("TEMPORAL_LIMIT_DECLARATION");
  IElementType TEMPORAL_RESOLUTION_DECLARATION = new MetaModelElementType("TEMPORAL_RESOLUTION_DECLARATION");
  IElementType TYPE_DECLARATION = new MetaModelElementType("TYPE_DECLARATION");

  IElementType ANNOT_PARAM_CLOSE = new MetaModelTokenType(")");
  IElementType ANNOT_PARAM_OPEN = new MetaModelTokenType("(");
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
  IElementType FROM = new MetaModelTokenType("from");
  IElementType FUNC = new MetaModelTokenType("func");
  IElementType IDENT = new MetaModelTokenType("IDENT");
  IElementType INFER_WITH = new MetaModelTokenType("inferWith");
  IElementType INPUT = new MetaModelTokenType("input");
  IElementType KMF_VERSION = new MetaModelTokenType("kmfVersion");
  IElementType MULT_CLOSE = new MetaModelTokenType("]");
  IElementType MULT_OPEN = new MetaModelTokenType("[");
  IElementType MULT_SEP = new MetaModelTokenType(".");
  IElementType NEWLINE = new MetaModelTokenType("newline");
  IElementType NUMBER = new MetaModelTokenType("NUMBER");
  IElementType OPPOSITE = new MetaModelTokenType("oppositeOf");
  IElementType OUTPUT = new MetaModelTokenType("output");
  IElementType PRECISION = new MetaModelTokenType("precision");
  IElementType REF = new MetaModelTokenType("ref");
  IElementType STAR = new MetaModelTokenType("*");
  IElementType STRING = new MetaModelTokenType("string");
  IElementType SUB = new MetaModelTokenType("/");
  IElementType TEMPORAL_LIMIT = new MetaModelTokenType("temporalLimit");
  IElementType TEMPORAL_RESOLUTION = new MetaModelTokenType("temporalResolution");
  IElementType VERSION = new MetaModelTokenType("version");

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
      else if (type == INFER_WITH_DECLARATION) {
        return new MetaModelInferWithDeclarationImpl(node);
      }
      else if (type == INPUT_DECLARATION) {
        return new MetaModelInputDeclarationImpl(node);
      }
      else if (type == INPUT_NAME) {
        return new MetaModelInputNameImpl(node);
      }
      else if (type == KMF_VERSION_DECLARATION) {
        return new MetaModelKmfVersionDeclarationImpl(node);
      }
      else if (type == MODEL_VERSION_DECLARATION) {
        return new MetaModelModelVersionDeclarationImpl(node);
      }
      else if (type == MULTIPLICITY_DECLARATION) {
        return new MetaModelMultiplicityDeclarationImpl(node);
      }
      else if (type == MULTIPLICITY_DECLARATION_LOWER) {
        return new MetaModelMultiplicityDeclarationLowerImpl(node);
      }
      else if (type == MULTIPLICITY_DECLARATION_UPPER) {
        return new MetaModelMultiplicityDeclarationUpperImpl(node);
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
      else if (type == PRECISION_DECLARATION) {
        return new MetaModelPrecisionDeclarationImpl(node);
      }
      else if (type == RELATION_DECLARATION) {
        return new MetaModelRelationDeclarationImpl(node);
      }
      else if (type == RELATION_NAME) {
        return new MetaModelRelationNameImpl(node);
      }
      else if (type == RELATION_OPPOSITE) {
        return new MetaModelRelationOppositeImpl(node);
      }
      else if (type == TEMPORAL_LIMIT_DECLARATION) {
        return new MetaModelTemporalLimitDeclarationImpl(node);
      }
      else if (type == TEMPORAL_RESOLUTION_DECLARATION) {
        return new MetaModelTemporalResolutionDeclarationImpl(node);
      }
      else if (type == TYPE_DECLARATION) {
        return new MetaModelTypeDeclarationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
