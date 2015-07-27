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
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MetaModelParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ANNOTATION_DECLR) {
      r = ANNOTATION_DECLR(b, 0);
    }
    else if (t == ANNOTATION_NAME) {
      r = ANNOTATION_NAME(b, 0);
    }
    else if (t == ATTRIBUTE_DECLARATION) {
      r = ATTRIBUTE_DECLARATION(b, 0);
    }
    else if (t == ATTRIBUTE_NAME) {
      r = ATTRIBUTE_NAME(b, 0);
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
    else if (t == DEPENDENCY_DECLARATION) {
      r = DEPENDENCY_DECLARATION(b, 0);
    }
    else if (t == DEPENDENCY_NAME) {
      r = DEPENDENCY_NAME(b, 0);
    }
    else if (t == ENUM_DECLARATION) {
      r = ENUM_DECLARATION(b, 0);
    }
    else if (t == ENUM_ELEM_DECLARATION) {
      r = ENUM_ELEM_DECLARATION(b, 0);
    }
    else if (t == INPUT_DECLARATION) {
      r = INPUT_DECLARATION(b, 0);
    }
    else if (t == INPUT_NAME) {
      r = INPUT_NAME(b, 0);
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
    else if (t == OUTPUT_DECLARATION) {
      r = OUTPUT_DECLARATION(b, 0);
    }
    else if (t == OUTPUT_NAME) {
      r = OUTPUT_NAME(b, 0);
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
    else if (t == TYPE_DECLARATION) {
      r = TYPE_DECLARATION(b, 0);
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
  // WITH ANNOTATION_NAME (NUMBER|string)?
  public static boolean ANNOTATION_DECLR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ANNOTATION_DECLR")) return false;
    if (!nextTokenIs(b, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WITH);
    r = r && ANNOTATION_NAME(b, l + 1);
    r = r && ANNOTATION_DECLR_2(b, l + 1);
    exit_section_(b, m, ANNOTATION_DECLR, r);
    return r;
  }

  // (NUMBER|string)?
  private static boolean ANNOTATION_DECLR_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ANNOTATION_DECLR_2")) return false;
    ANNOTATION_DECLR_2_0(b, l + 1);
    return true;
  }

  // NUMBER|string
  private static boolean ANNOTATION_DECLR_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ANNOTATION_DECLR_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT
  public static boolean ANNOTATION_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ANNOTATION_NAME")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    exit_section_(b, m, ANNOTATION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ATT ATTRIBUTE_NAME COLON TYPE_DECLARATION ANNOTATION_DECLR*
  public static boolean ATTRIBUTE_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ATTRIBUTE_DECLARATION")) return false;
    if (!nextTokenIs(b, ATT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATT);
    r = r && ATTRIBUTE_NAME(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && TYPE_DECLARATION(b, l + 1);
    r = r && ATTRIBUTE_DECLARATION_4(b, l + 1);
    exit_section_(b, m, ATTRIBUTE_DECLARATION, r);
    return r;
  }

  // ANNOTATION_DECLR*
  private static boolean ATTRIBUTE_DECLARATION_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ATTRIBUTE_DECLARATION_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ANNOTATION_DECLR(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ATTRIBUTE_DECLARATION_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // IDENT
  public static boolean ATTRIBUTE_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ATTRIBUTE_NAME")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    exit_section_(b, m, ATTRIBUTE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS TYPE_DECLARATION PARENTS_DECLARATION? BODY_OPEN ANNOTATION_DECLR* CLASS_ELEM_DECLARATION* BODY_CLOSE
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
    r = p && report_error_(b, CLASS_DECLARATION_5(b, l + 1)) && r;
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

  // ANNOTATION_DECLR*
  private static boolean CLASS_DECLARATION_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_DECLARATION_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ANNOTATION_DECLR(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CLASS_DECLARATION_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CLASS_ELEM_DECLARATION*
  private static boolean CLASS_DECLARATION_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_DECLARATION_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CLASS_ELEM_DECLARATION(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CLASS_DECLARATION_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ATTRIBUTE_DECLARATION | RELATION_DECLARATION | OPERATION_DECLARATION | DEPENDENCY_DECLARATION | INPUT_DECLARATION | OUTPUT_DECLARATION
  public static boolean CLASS_ELEM_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_ELEM_DECLARATION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class elem declaration>");
    r = ATTRIBUTE_DECLARATION(b, l + 1);
    if (!r) r = RELATION_DECLARATION(b, l + 1);
    if (!r) r = OPERATION_DECLARATION(b, l + 1);
    if (!r) r = DEPENDENCY_DECLARATION(b, l + 1);
    if (!r) r = INPUT_DECLARATION(b, l + 1);
    if (!r) r = OUTPUT_DECLARATION(b, l + 1);
    exit_section_(b, l, m, CLASS_ELEM_DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CLASS_DECLARATION | ENUM_DECLARATION | eof | newline | CRLF
  public static boolean DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DECLARATION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<declaration>");
    r = CLASS_DECLARATION(b, l + 1);
    if (!r) r = ENUM_DECLARATION(b, l + 1);
    if (!r) r = consumeToken(b, EOF);
    if (!r) r = consumeToken(b, NEWLINE);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, l, m, DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DEPENDENCY DEPENDENCY_NAME COLON TYPE_DECLARATION
  public static boolean DEPENDENCY_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEPENDENCY_DECLARATION")) return false;
    if (!nextTokenIs(b, DEPENDENCY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPENDENCY);
    r = r && DEPENDENCY_NAME(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && TYPE_DECLARATION(b, l + 1);
    exit_section_(b, m, DEPENDENCY_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT
  public static boolean DEPENDENCY_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEPENDENCY_NAME")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    exit_section_(b, m, DEPENDENCY_NAME, r);
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
  // INPUT INPUT_NAME string
  public static boolean INPUT_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INPUT_DECLARATION")) return false;
    if (!nextTokenIs(b, INPUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INPUT);
    r = r && INPUT_NAME(b, l + 1);
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, INPUT_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT
  public static boolean INPUT_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INPUT_NAME")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    exit_section_(b, m, INPUT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ANNOTATION_DECLR* DECLARATION*
  static boolean METAMODEL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "METAMODEL")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = METAMODEL_0(b, l + 1);
    r = r && METAMODEL_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ANNOTATION_DECLR*
  private static boolean METAMODEL_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "METAMODEL_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ANNOTATION_DECLR(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "METAMODEL_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DECLARATION*
  private static boolean METAMODEL_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "METAMODEL_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!DECLARATION(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "METAMODEL_1", c)) break;
      c = current_position_(b);
    }
    return true;
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
  // OUTPUT OUTPUT_NAME COLON TYPE_DECLARATION
  public static boolean OUTPUT_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OUTPUT_DECLARATION")) return false;
    if (!nextTokenIs(b, OUTPUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OUTPUT);
    r = r && OUTPUT_NAME(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && TYPE_DECLARATION(b, l + 1);
    exit_section_(b, m, OUTPUT_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT
  public static boolean OUTPUT_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OUTPUT_NAME")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    exit_section_(b, m, OUTPUT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // EXTENDS TYPE_DECLARATION (COMMA TYPE_DECLARATION)*
  public static boolean PARENTS_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PARENTS_DECLARATION")) return false;
    if (!nextTokenIs(b, EXTENDS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
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
  // (REF|MREF) RELATION_NAME COLON TYPE_DECLARATION ANNOTATION_DECLR*
  public static boolean RELATION_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RELATION_DECLARATION")) return false;
    if (!nextTokenIs(b, "<relation declaration>", MREF, REF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<relation declaration>");
    r = RELATION_DECLARATION_0(b, l + 1);
    r = r && RELATION_NAME(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && TYPE_DECLARATION(b, l + 1);
    r = r && RELATION_DECLARATION_4(b, l + 1);
    exit_section_(b, l, m, RELATION_DECLARATION, r, false, null);
    return r;
  }

  // REF|MREF
  private static boolean RELATION_DECLARATION_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RELATION_DECLARATION_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REF);
    if (!r) r = consumeToken(b, MREF);
    exit_section_(b, m, null, r);
    return r;
  }

  // ANNOTATION_DECLR*
  private static boolean RELATION_DECLARATION_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RELATION_DECLARATION_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ANNOTATION_DECLR(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RELATION_DECLARATION_4", c)) break;
      c = current_position_(b);
    }
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
  // !(CLASS|ENUM)
  static boolean rule_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_start")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !rule_start_0(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // CLASS|ENUM
  private static boolean rule_start_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_start_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS);
    if (!r) r = consumeToken(b, ENUM);
    exit_section_(b, m, null, r);
    return r;
  }

  final static Parser rule_start_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return rule_start(b, l + 1);
    }
  };
}
