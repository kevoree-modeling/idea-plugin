// This is a generated file. Not intended for manual editing.
package org.kevoree.modeling.idea.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.kevoree.modeling.idea.psi.MetaModelTypes.*;
import static org.kevoree.modeling.idea.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MetaModelParser implements PsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ANNOTATION) {
      r = ANNOTATION(b, 0);
    }
    else if (t == ANNOTATIONS) {
      r = ANNOTATIONS(b, 0);
    }
    else if (t == ANNOTATION_PARAM) {
      r = ANNOTATION_PARAM(b, 0);
    }
    else if (t == CLASS_DECLARATION) {
      r = CLASS_DECLARATION(b, 0);
    }
    else if (t == CLASS_ELEM_DECLARATION) {
      r = CLASS_ELEM_DECLARATION(b, 0);
    }
    else if (t == DECLARATION) {
      r = DECLARATION(b, 0);
    }
    else if (t == ENUM_DECLARATION) {
      r = ENUM_DECLARATION(b, 0);
    }
    else if (t == ENUM_ELEM_DECLARATION) {
      r = ENUM_ELEM_DECLARATION(b, 0);
    }
    else if (t == INFER_DECLARATION) {
      r = INFER_DECLARATION(b, 0);
    }
    else if (t == INFER_DEP_DECLARATION) {
      r = INFER_DEP_DECLARATION(b, 0);
    }
    else if (t == INFER_DEP_TIME_DECL) {
      r = INFER_DEP_TIME_DECL(b, 0);
    }
    else if (t == MULTIPLICITY_DECLARATION) {
      r = MULTIPLICITY_DECLARATION(b, 0);
    }
    else if (t == MULTIPLICITY_DECLARATION_LOWER) {
      r = MULTIPLICITY_DECLARATION_LOWER(b, 0);
    }
    else if (t == MULTIPLICITY_DECLARATION_UPPER) {
      r = MULTIPLICITY_DECLARATION_UPPER(b, 0);
    }
    else if (t == OPERATION_DECLARATION) {
      r = OPERATION_DECLARATION(b, 0);
    }
    else if (t == OPERATION_NAME) {
      r = OPERATION_NAME(b, 0);
    }
    else if (t == OPERATION_PARAM) {
      r = OPERATION_PARAM(b, 0);
    }
    else if (t == OPERATION_PARAMS) {
      r = OPERATION_PARAMS(b, 0);
    }
    else if (t == OPERATION_RETURN) {
      r = OPERATION_RETURN(b, 0);
    }
    else if (t == PARENTS_DECLARATION) {
      r = PARENTS_DECLARATION(b, 0);
    }
    else if (t == RELATION_DECLARATION) {
      r = RELATION_DECLARATION(b, 0);
    }
    else if (t == RELATION_NAME) {
      r = RELATION_NAME(b, 0);
    }
    else if (t == RELATION_OPPOSITE) {
      r = RELATION_OPPOSITE(b, 0);
    }
    else if (t == TYPE_DECLARATION) {
      r = TYPE_DECLARATION(b, 0);
    }
    else if (t == USING_DECLARATION) {
      r = USING_DECLARATION(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return METAMODEL(b, l + 1);
  }

  /* ********************************************************** */
  // TANNOTATION ANNOTATION_PARAM?
  public static boolean ANNOTATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ANNOTATION")) return false;
    if (!nextTokenIs(b, TANNOTATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TANNOTATION);
    r = r && ANNOTATION_1(b, l + 1);
    exit_section_(b, m, ANNOTATION, r);
    return r;
  }

  // ANNOTATION_PARAM?
  private static boolean ANNOTATION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ANNOTATION_1")) return false;
    ANNOTATION_PARAM(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ANNOTATION*
  public static boolean ANNOTATIONS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ANNOTATIONS")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<annotations>");
    int c = current_position_(b);
    while (true) {
      if (!ANNOTATION(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ANNOTATIONS", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, ANNOTATIONS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // ANNOT_PARAM_OPEN NUMBER ANNOT_PARAM_CLOSE
  public static boolean ANNOTATION_PARAM(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ANNOTATION_PARAM")) return false;
    if (!nextTokenIs(b, ANNOT_PARAM_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ANNOT_PARAM_OPEN, NUMBER, ANNOT_PARAM_CLOSE);
    exit_section_(b, m, ANNOTATION_PARAM, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS TYPE_DECLARATION PARENTS_DECLARATION? BODY_OPEN CLASS_ELEM_DECLARATION* BODY_CLOSE
  public static boolean CLASS_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_DECLARATION")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<class declaration>");
    r = consumeToken(b, CLASS);
    p = r; // pin = 1
    r = r && report_error_(b, TYPE_DECLARATION(b, l + 1));
    r = p && report_error_(b, CLASS_DECLARATION_2(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, BODY_OPEN)) && r;
    r = p && report_error_(b, CLASS_DECLARATION_4(b, l + 1)) && r;
    r = p && consumeToken(b, BODY_CLOSE) && r;
    exit_section_(b, l, m, CLASS_DECLARATION, r, p, rule_start_parser_);
    return r || p;
  }

  // PARENTS_DECLARATION?
  private static boolean CLASS_DECLARATION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_DECLARATION_2")) return false;
    PARENTS_DECLARATION(b, l + 1);
    return true;
  }

  // CLASS_ELEM_DECLARATION*
  private static boolean CLASS_DECLARATION_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_DECLARATION_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CLASS_ELEM_DECLARATION(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CLASS_DECLARATION_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // RELATION_DECLARATION | OPERATION_DECLARATION
  public static boolean CLASS_ELEM_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_ELEM_DECLARATION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class elem declaration>");
    r = RELATION_DECLARATION(b, l + 1);
    if (!r) r = OPERATION_DECLARATION(b, l + 1);
    exit_section_(b, l, m, CLASS_ELEM_DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CLASS_DECLARATION | ENUM_DECLARATION | INFER_DECLARATION | eof | newline | CRLF
  public static boolean DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DECLARATION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<declaration>");
    r = CLASS_DECLARATION(b, l + 1);
    if (!r) r = ENUM_DECLARATION(b, l + 1);
    if (!r) r = INFER_DECLARATION(b, l + 1);
    if (!r) r = consumeToken(b, EOF);
    if (!r) r = consumeToken(b, NEWLINE);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, l, m, DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ENUM TYPE_DECLARATION BODY_OPEN ENUM_ELEM_DECLARATION* BODY_CLOSE
  public static boolean ENUM_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ENUM_DECLARATION")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<enum declaration>");
    r = consumeToken(b, ENUM);
    p = r; // pin = 1
    r = r && report_error_(b, TYPE_DECLARATION(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BODY_OPEN)) && r;
    r = p && report_error_(b, ENUM_DECLARATION_3(b, l + 1)) && r;
    r = p && consumeToken(b, BODY_CLOSE) && r;
    exit_section_(b, l, m, ENUM_DECLARATION, r, p, rule_start_parser_);
    return r || p;
  }

  // ENUM_ELEM_DECLARATION*
  private static boolean ENUM_DECLARATION_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ENUM_DECLARATION_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ENUM_ELEM_DECLARATION(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ENUM_DECLARATION_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // IDENT
  public static boolean ENUM_ELEM_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ENUM_ELEM_DECLARATION")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    exit_section_(b, m, ENUM_ELEM_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // INFER TYPE_DECLARATION USING_DECLARATION BODY_OPEN INFER_DEP_DECLARATION* BODY_CLOSE
  public static boolean INFER_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INFER_DECLARATION")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<infer declaration>");
    r = consumeToken(b, INFER);
    p = r; // pin = 1
    r = r && report_error_(b, TYPE_DECLARATION(b, l + 1));
    r = p && report_error_(b, USING_DECLARATION(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, BODY_OPEN)) && r;
    r = p && report_error_(b, INFER_DECLARATION_4(b, l + 1)) && r;
    r = p && consumeToken(b, BODY_CLOSE) && r;
    exit_section_(b, l, m, INFER_DECLARATION, r, p, rule_start_parser_);
    return r || p;
  }

  // INFER_DEP_DECLARATION*
  private static boolean INFER_DECLARATION_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INFER_DECLARATION_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!INFER_DEP_DECLARATION(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "INFER_DECLARATION_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // IDENT COLON TYPE_DECLARATION MULTIPLICITY_DECLARATION? INFER_DEP_TIME_DECL?
  public static boolean INFER_DEP_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INFER_DEP_DECLARATION")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENT, COLON);
    r = r && TYPE_DECLARATION(b, l + 1);
    r = r && INFER_DEP_DECLARATION_3(b, l + 1);
    r = r && INFER_DEP_DECLARATION_4(b, l + 1);
    exit_section_(b, m, INFER_DEP_DECLARATION, r);
    return r;
  }

  // MULTIPLICITY_DECLARATION?
  private static boolean INFER_DEP_DECLARATION_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INFER_DEP_DECLARATION_3")) return false;
    MULTIPLICITY_DECLARATION(b, l + 1);
    return true;
  }

  // INFER_DEP_TIME_DECL?
  private static boolean INFER_DEP_DECLARATION_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INFER_DEP_DECLARATION_4")) return false;
    INFER_DEP_TIME_DECL(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FROM string
  public static boolean INFER_DEP_TIME_DECL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INFER_DEP_TIME_DECL")) return false;
    if (!nextTokenIs(b, FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FROM, STRING);
    exit_section_(b, m, INFER_DEP_TIME_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // DECLARATION*
  static boolean METAMODEL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "METAMODEL")) return false;
    int c = current_position_(b);
    while (true) {
      if (!DECLARATION(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "METAMODEL", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // MULT_OPEN MULTIPLICITY_DECLARATION_LOWER COMMA MULTIPLICITY_DECLARATION_UPPER MULT_CLOSE
  public static boolean MULTIPLICITY_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTIPLICITY_DECLARATION")) return false;
    if (!nextTokenIs(b, MULT_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MULT_OPEN);
    r = r && MULTIPLICITY_DECLARATION_LOWER(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && MULTIPLICITY_DECLARATION_UPPER(b, l + 1);
    r = r && consumeToken(b, MULT_CLOSE);
    exit_section_(b, m, MULTIPLICITY_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // STAR_OR_NB
  public static boolean MULTIPLICITY_DECLARATION_LOWER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTIPLICITY_DECLARATION_LOWER")) return false;
    if (!nextTokenIs(b, "<multiplicity declaration lower>", NUMBER, STAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<multiplicity declaration lower>");
    r = STAR_OR_NB(b, l + 1);
    exit_section_(b, l, m, MULTIPLICITY_DECLARATION_LOWER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STAR_OR_NB
  public static boolean MULTIPLICITY_DECLARATION_UPPER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTIPLICITY_DECLARATION_UPPER")) return false;
    if (!nextTokenIs(b, "<multiplicity declaration upper>", NUMBER, STAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<multiplicity declaration upper>");
    r = STAR_OR_NB(b, l + 1);
    exit_section_(b, l, m, MULTIPLICITY_DECLARATION_UPPER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FUNC OPERATION_NAME (ANNOT_PARAM_OPEN OPERATION_PARAMS ANNOT_PARAM_CLOSE)? (OPERATION_RETURN)?
  public static boolean OPERATION_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_DECLARATION")) return false;
    if (!nextTokenIs(b, FUNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNC);
    r = r && OPERATION_NAME(b, l + 1);
    r = r && OPERATION_DECLARATION_2(b, l + 1);
    r = r && OPERATION_DECLARATION_3(b, l + 1);
    exit_section_(b, m, OPERATION_DECLARATION, r);
    return r;
  }

  // (ANNOT_PARAM_OPEN OPERATION_PARAMS ANNOT_PARAM_CLOSE)?
  private static boolean OPERATION_DECLARATION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_DECLARATION_2")) return false;
    OPERATION_DECLARATION_2_0(b, l + 1);
    return true;
  }

  // ANNOT_PARAM_OPEN OPERATION_PARAMS ANNOT_PARAM_CLOSE
  private static boolean OPERATION_DECLARATION_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_DECLARATION_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANNOT_PARAM_OPEN);
    r = r && OPERATION_PARAMS(b, l + 1);
    r = r && consumeToken(b, ANNOT_PARAM_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OPERATION_RETURN)?
  private static boolean OPERATION_DECLARATION_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_DECLARATION_3")) return false;
    OPERATION_DECLARATION_3_0(b, l + 1);
    return true;
  }

  // (OPERATION_RETURN)
  private static boolean OPERATION_DECLARATION_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_DECLARATION_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OPERATION_RETURN(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT
  public static boolean OPERATION_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_NAME")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    exit_section_(b, m, OPERATION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT COLON TYPE_DECLARATION
  public static boolean OPERATION_PARAM(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_PARAM")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENT, COLON);
    r = r && TYPE_DECLARATION(b, l + 1);
    exit_section_(b, m, OPERATION_PARAM, r);
    return r;
  }

  /* ********************************************************** */
  // OPERATION_PARAM (COMMA OPERATION_PARAM)*
  public static boolean OPERATION_PARAMS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_PARAMS")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OPERATION_PARAM(b, l + 1);
    r = r && OPERATION_PARAMS_1(b, l + 1);
    exit_section_(b, m, OPERATION_PARAMS, r);
    return r;
  }

  // (COMMA OPERATION_PARAM)*
  private static boolean OPERATION_PARAMS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_PARAMS_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OPERATION_PARAMS_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "OPERATION_PARAMS_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA OPERATION_PARAM
  private static boolean OPERATION_PARAMS_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_PARAMS_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && OPERATION_PARAM(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COLON TYPE_DECLARATION
  public static boolean OPERATION_RETURN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_RETURN")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && TYPE_DECLARATION(b, l + 1);
    exit_section_(b, m, OPERATION_RETURN, r);
    return r;
  }

  /* ********************************************************** */
  // COLON TYPE_DECLARATION (COMMA TYPE_DECLARATION)*
  public static boolean PARENTS_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PARENTS_DECLARATION")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && TYPE_DECLARATION(b, l + 1);
    r = r && PARENTS_DECLARATION_2(b, l + 1);
    exit_section_(b, m, PARENTS_DECLARATION, r);
    return r;
  }

  // (COMMA TYPE_DECLARATION)*
  private static boolean PARENTS_DECLARATION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PARENTS_DECLARATION_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!PARENTS_DECLARATION_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PARENTS_DECLARATION_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA TYPE_DECLARATION
  private static boolean PARENTS_DECLARATION_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PARENTS_DECLARATION_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TYPE_DECLARATION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ANNOTATIONS RELATION_NAME COLON TYPE_DECLARATION MULTIPLICITY_DECLARATION? RELATION_OPPOSITE?
  public static boolean RELATION_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RELATION_DECLARATION")) return false;
    if (!nextTokenIs(b, "<relation declaration>", IDENT, TANNOTATION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<relation declaration>");
    r = ANNOTATIONS(b, l + 1);
    r = r && RELATION_NAME(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && TYPE_DECLARATION(b, l + 1);
    r = r && RELATION_DECLARATION_4(b, l + 1);
    r = r && RELATION_DECLARATION_5(b, l + 1);
    exit_section_(b, l, m, RELATION_DECLARATION, r, false, null);
    return r;
  }

  // MULTIPLICITY_DECLARATION?
  private static boolean RELATION_DECLARATION_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RELATION_DECLARATION_4")) return false;
    MULTIPLICITY_DECLARATION(b, l + 1);
    return true;
  }

  // RELATION_OPPOSITE?
  private static boolean RELATION_DECLARATION_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RELATION_DECLARATION_5")) return false;
    RELATION_OPPOSITE(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENT
  public static boolean RELATION_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RELATION_NAME")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    exit_section_(b, m, RELATION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // OPPOSITE IDENT
  public static boolean RELATION_OPPOSITE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RELATION_OPPOSITE")) return false;
    if (!nextTokenIs(b, OPPOSITE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPPOSITE, IDENT);
    exit_section_(b, m, RELATION_OPPOSITE, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER | STAR
  static boolean STAR_OR_NB(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STAR_OR_NB")) return false;
    if (!nextTokenIs(b, "", NUMBER, STAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STAR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT
  public static boolean TYPE_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TYPE_DECLARATION")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    exit_section_(b, m, TYPE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // USING IDENT
  public static boolean USING_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "USING_DECLARATION")) return false;
    if (!nextTokenIs(b, USING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, USING, IDENT);
    exit_section_(b, m, USING_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // !(CLASS|ENUM|INFER)
  static boolean rule_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_start")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !rule_start_0(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // CLASS|ENUM|INFER
  private static boolean rule_start_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_start_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS);
    if (!r) r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, INFER);
    exit_section_(b, m, null, r);
    return r;
  }

  final static Parser rule_start_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return rule_start(b, l + 1);
    }
  };
}
