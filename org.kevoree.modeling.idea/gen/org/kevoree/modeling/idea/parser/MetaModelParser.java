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
    else if (t == ENUM_DECLARATION) {
      r = ENUM_DECLARATION(b, 0);
    }
    else if (t == ENUM_ELEM_DECLARATION) {
      r = ENUM_ELEM_DECLARATION(b, 0);
    }
    else if (t == INDEX_DECLARATION) {
      r = INDEX_DECLARATION(b, 0);
    }
    else if (t == INDEX_ELEM_DECLARATION) {
      r = INDEX_ELEM_DECLARATION(b, 0);
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
    else if (t == SEMANTIC_DECLR) {
      r = SEMANTIC_DECLR(b, 0);
    }
    else if (t == SEMANTIC_ELEM_DECLR) {
      r = SEMANTIC_ELEM_DECLR(b, 0);
    }
    else if (t == SEMANTIC_FROM) {
      r = SEMANTIC_FROM(b, 0);
    }
    else if (t == SEMANTIC_USING) {
      r = SEMANTIC_USING(b, 0);
    }
    else if (t == SEMANTIC_WITH) {
      r = SEMANTIC_WITH(b, 0);
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
  // ATT ATTRIBUTE_NAME COLON TYPE_DECLARATION SEMANTIC_DECLR?
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

  // SEMANTIC_DECLR?
  private static boolean ATTRIBUTE_DECLARATION_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ATTRIBUTE_DECLARATION_4")) return false;
    SEMANTIC_DECLR(b, l + 1);
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
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS);
    r = r && TYPE_DECLARATION(b, l + 1);
    r = r && CLASS_DECLARATION_2(b, l + 1);
    r = r && consumeToken(b, BODY_OPEN);
    r = r && CLASS_DECLARATION_4(b, l + 1);
    r = r && CLASS_DECLARATION_5(b, l + 1);
    r = r && consumeToken(b, BODY_CLOSE);
    exit_section_(b, m, CLASS_DECLARATION, r);
    return r;
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
      if (!consumeToken(b, ANNOTATION_DECLR)) break;
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
  // ATTRIBUTE_DECLARATION | RELATION_DECLARATION | DEPENDENCY_DECLARATION
  public static boolean CLASS_ELEM_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_ELEM_DECLARATION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_ELEM_DECLARATION, "<class elem declaration>");
    r = ATTRIBUTE_DECLARATION(b, l + 1);
    if (!r) r = RELATION_DECLARATION(b, l + 1);
    if (!r) r = consumeToken(b, DEPENDENCY_DECLARATION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CLASS_DECLARATION | ENUM_DECLARATION | INDEX_DECLARATION | eof | newline | CRLF
  public static boolean DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DECLARATION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, "<declaration>");
    r = CLASS_DECLARATION(b, l + 1);
    if (!r) r = ENUM_DECLARATION(b, l + 1);
    if (!r) r = INDEX_DECLARATION(b, l + 1);
    if (!r) r = consumeToken(b, EOF);
    if (!r) r = consumeToken(b, NEWLINE);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ENUM TYPE_DECLARATION BODY_OPEN ENUM_ELEM_DECLARATION (COMMA ENUM_ELEM_DECLARATION)* BODY_CLOSE
  public static boolean ENUM_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ENUM_DECLARATION")) return false;
    if (!nextTokenIs(b, ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENUM);
    r = r && TYPE_DECLARATION(b, l + 1);
    r = r && consumeToken(b, BODY_OPEN);
    r = r && ENUM_ELEM_DECLARATION(b, l + 1);
    r = r && ENUM_DECLARATION_4(b, l + 1);
    r = r && consumeToken(b, BODY_CLOSE);
    exit_section_(b, m, ENUM_DECLARATION, r);
    return r;
  }

  // (COMMA ENUM_ELEM_DECLARATION)*
  private static boolean ENUM_DECLARATION_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ENUM_DECLARATION_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ENUM_DECLARATION_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ENUM_DECLARATION_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA ENUM_ELEM_DECLARATION
  private static boolean ENUM_DECLARATION_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ENUM_DECLARATION_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ENUM_ELEM_DECLARATION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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
  // INDEX TYPE_DECLARATION COLON TYPE_DECLARATION BODY_OPEN INDEX_ELEM_DECLARATION (COMMA INDEX_ELEM_DECLARATION)* BODY_CLOSE
  public static boolean INDEX_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INDEX_DECLARATION")) return false;
    if (!nextTokenIs(b, INDEX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INDEX);
    r = r && TYPE_DECLARATION(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && TYPE_DECLARATION(b, l + 1);
    r = r && consumeToken(b, BODY_OPEN);
    r = r && INDEX_ELEM_DECLARATION(b, l + 1);
    r = r && INDEX_DECLARATION_6(b, l + 1);
    r = r && consumeToken(b, BODY_CLOSE);
    exit_section_(b, m, INDEX_DECLARATION, r);
    return r;
  }

  // (COMMA INDEX_ELEM_DECLARATION)*
  private static boolean INDEX_DECLARATION_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INDEX_DECLARATION_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!INDEX_DECLARATION_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "INDEX_DECLARATION_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA INDEX_ELEM_DECLARATION
  private static boolean INDEX_DECLARATION_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INDEX_DECLARATION_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && INDEX_ELEM_DECLARATION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT
  public static boolean INDEX_ELEM_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INDEX_ELEM_DECLARATION")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    exit_section_(b, m, INDEX_ELEM_DECLARATION, r);
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
  // REF RELATION_NAME COLON TYPE_DECLARATION SEMANTIC_DECLR?
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
    exit_section_(b, m, RELATION_DECLARATION, r);
    return r;
  }

  // SEMANTIC_DECLR?
  private static boolean RELATION_DECLARATION_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RELATION_DECLARATION_4")) return false;
    SEMANTIC_DECLR(b, l + 1);
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
  // BODY_OPEN SEMANTIC_ELEM_DECLR* BODY_CLOSE
  public static boolean SEMANTIC_DECLR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SEMANTIC_DECLR")) return false;
    if (!nextTokenIs(b, BODY_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BODY_OPEN);
    r = r && SEMANTIC_DECLR_1(b, l + 1);
    r = r && consumeToken(b, BODY_CLOSE);
    exit_section_(b, m, SEMANTIC_DECLR, r);
    return r;
  }

  // SEMANTIC_ELEM_DECLR*
  private static boolean SEMANTIC_DECLR_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SEMANTIC_DECLR_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!SEMANTIC_ELEM_DECLR(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SEMANTIC_DECLR_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // SEMANTIC_USING|SEMANTIC_WITH|SEMANTIC_FROM
  public static boolean SEMANTIC_ELEM_DECLR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SEMANTIC_ELEM_DECLR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEMANTIC_ELEM_DECLR, "<semantic elem declr>");
    r = SEMANTIC_USING(b, l + 1);
    if (!r) r = SEMANTIC_WITH(b, l + 1);
    if (!r) r = SEMANTIC_FROM(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FROM string
  public static boolean SEMANTIC_FROM(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SEMANTIC_FROM")) return false;
    if (!nextTokenIs(b, FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FROM, STRING);
    exit_section_(b, m, SEMANTIC_FROM, r);
    return r;
  }

  /* ********************************************************** */
  // USING string
  public static boolean SEMANTIC_USING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SEMANTIC_USING")) return false;
    if (!nextTokenIs(b, USING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, USING, STRING);
    exit_section_(b, m, SEMANTIC_USING, r);
    return r;
  }

  /* ********************************************************** */
  // WITH IDENT string
  public static boolean SEMANTIC_WITH(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SEMANTIC_WITH")) return false;
    if (!nextTokenIs(b, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WITH, IDENT, STRING);
    exit_section_(b, m, SEMANTIC_WITH, r);
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
  // !(CLASS|ENUM|INDEX)
  static boolean rule_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_start")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !rule_start_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CLASS|ENUM|INDEX
  private static boolean rule_start_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_start_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS);
    if (!r) r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, INDEX);
    exit_section_(b, m, null, r);
    return r;
  }

}
