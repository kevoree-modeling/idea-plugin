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
    if (t == ATTRIBUTE_DECLARATION) {
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
    else if (t == INFER_WITH_DECLARATION) {
      r = INFER_WITH_DECLARATION(b, 0);
    }
    else if (t == INPUT_DECLARATION) {
      r = INPUT_DECLARATION(b, 0);
    }
    else if (t == INPUT_NAME) {
      r = INPUT_NAME(b, 0);
    }
    else if (t == KMF_VERSION_DECLARATION) {
      r = KMF_VERSION_DECLARATION(b, 0);
    }
    else if (t == MODEL_VERSION_DECLARATION) {
      r = MODEL_VERSION_DECLARATION(b, 0);
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
    else if (t == OUTPUT_DECLARATION) {
      r = OUTPUT_DECLARATION(b, 0);
    }
    else if (t == OUTPUT_NAME) {
      r = OUTPUT_NAME(b, 0);
    }
    else if (t == PARENTS_DECLARATION) {
      r = PARENTS_DECLARATION(b, 0);
    }
    else if (t == PRECISION_DECLARATION) {
      r = PRECISION_DECLARATION(b, 0);
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
    else if (t == TEMPORAL_LIMIT_DECLARATION) {
      r = TEMPORAL_LIMIT_DECLARATION(b, 0);
    }
    else if (t == TEMPORAL_RESOLUTION_DECLARATION) {
      r = TEMPORAL_RESOLUTION_DECLARATION(b, 0);
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
  // ATT ATTRIBUTE_NAME COLON TYPE_DECLARATION PRECISION_DECLARATION?
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

  // PRECISION_DECLARATION?
  private static boolean ATTRIBUTE_DECLARATION_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ATTRIBUTE_DECLARATION_4")) return false;
    PRECISION_DECLARATION(b, l + 1);
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
  // TEMPORAL_LIMIT_DECLARATION | TEMPORAL_RESOLUTION_DECLARATION | ATTRIBUTE_DECLARATION | RELATION_DECLARATION | OPERATION_DECLARATION | DEPENDENCY_DECLARATION | INPUT_DECLARATION | OUTPUT_DECLARATION | INFER_WITH_DECLARATION
  public static boolean CLASS_ELEM_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_ELEM_DECLARATION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class elem declaration>");
    r = TEMPORAL_LIMIT_DECLARATION(b, l + 1);
    if (!r) r = TEMPORAL_RESOLUTION_DECLARATION(b, l + 1);
    if (!r) r = ATTRIBUTE_DECLARATION(b, l + 1);
    if (!r) r = RELATION_DECLARATION(b, l + 1);
    if (!r) r = OPERATION_DECLARATION(b, l + 1);
    if (!r) r = DEPENDENCY_DECLARATION(b, l + 1);
    if (!r) r = INPUT_DECLARATION(b, l + 1);
    if (!r) r = OUTPUT_DECLARATION(b, l + 1);
    if (!r) r = INFER_WITH_DECLARATION(b, l + 1);
    exit_section_(b, l, m, CLASS_ELEM_DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MODEL_VERSION_DECLARATION | KMF_VERSION_DECLARATION | CLASS_DECLARATION | ENUM_DECLARATION | eof | newline | CRLF
  public static boolean DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DECLARATION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<declaration>");
    r = MODEL_VERSION_DECLARATION(b, l + 1);
    if (!r) r = KMF_VERSION_DECLARATION(b, l + 1);
    if (!r) r = CLASS_DECLARATION(b, l + 1);
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
  // INFER_WITH string
  public static boolean INFER_WITH_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INFER_WITH_DECLARATION")) return false;
    if (!nextTokenIs(b, INFER_WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INFER_WITH, STRING);
    exit_section_(b, m, INFER_WITH_DECLARATION, r);
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
  // KMF_VERSION string
  public static boolean KMF_VERSION_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KMF_VERSION_DECLARATION")) return false;
    if (!nextTokenIs(b, KMF_VERSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KMF_VERSION, STRING);
    exit_section_(b, m, KMF_VERSION_DECLARATION, r);
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
  // VERSION string
  public static boolean MODEL_VERSION_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MODEL_VERSION_DECLARATION")) return false;
    if (!nextTokenIs(b, VERSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VERSION, STRING);
    exit_section_(b, m, MODEL_VERSION_DECLARATION, r);
    return r;
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
  // PRECISION NUMBER
  public static boolean PRECISION_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PRECISION_DECLARATION")) return false;
    if (!nextTokenIs(b, PRECISION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PRECISION, NUMBER);
    exit_section_(b, m, PRECISION_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // REF RELATION_NAME COLON TYPE_DECLARATION MULTIPLICITY_DECLARATION? RELATION_OPPOSITE?
  public static boolean RELATION_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RELATION_DECLARATION")) return false;
    if (!nextTokenIs(b, REF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REF);
    r = r && RELATION_NAME(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && TYPE_DECLARATION(b, l + 1);
    r = r && RELATION_DECLARATION_4(b, l + 1);
    r = r && RELATION_DECLARATION_5(b, l + 1);
    exit_section_(b, m, RELATION_DECLARATION, r);
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
  // TEMPORAL_LIMIT NUMBER
  public static boolean TEMPORAL_LIMIT_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEMPORAL_LIMIT_DECLARATION")) return false;
    if (!nextTokenIs(b, TEMPORAL_LIMIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TEMPORAL_LIMIT, NUMBER);
    exit_section_(b, m, TEMPORAL_LIMIT_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // TEMPORAL_RESOLUTION NUMBER
  public static boolean TEMPORAL_RESOLUTION_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEMPORAL_RESOLUTION_DECLARATION")) return false;
    if (!nextTokenIs(b, TEMPORAL_RESOLUTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TEMPORAL_RESOLUTION, NUMBER);
    exit_section_(b, m, TEMPORAL_RESOLUTION_DECLARATION, r);
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
  // !(VERSION|KMF_VERSION|CLASS|ENUM)
  static boolean rule_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_start")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !rule_start_0(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // VERSION|KMF_VERSION|CLASS|ENUM
  private static boolean rule_start_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_start_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VERSION);
    if (!r) r = consumeToken(b, KMF_VERSION);
    if (!r) r = consumeToken(b, CLASS);
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
