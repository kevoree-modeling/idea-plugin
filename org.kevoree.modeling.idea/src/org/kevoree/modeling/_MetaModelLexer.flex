package org.kevoree.modeling;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.kevoree.modeling.idea.psi.MetaModelTypes.*;

%%

%{
  public _MetaModelLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _MetaModelLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

COMMENT="//".*
NUMBER=[\-]?[0-9]+[.]?[0-9]*
IDENT=[\*\.a-zA-Z0-9_\-]+
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")

%%
<YYINITIAL> {
  {WHITE_SPACE}               { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "with"                      { return WITH; }
  "index"                     { return INDEX; }
  "class"                     { return CLASS; }
  "enum"                      { return ENUM; }
  "func"                      { return FUNC; }
  "att"                       { return ATT; }
  "rel"                       { return REF; }
  "from"                      { return FROM; }
  "using"                     { return USING; }
  "[]"                        { return ARRAY; }
  "extends"                   { return EXTENDS; }
  ":"                         { return COLON; }
  ","                         { return COMMA; }
  "/"                         { return SUB; }
  "="                         { return EQ; }
  "{"                         { return BODY_OPEN; }
  "}"                         { return BODY_CLOSE; }
  "("                         { return ANNOT_PARAM_OPEN; }
  ")"                         { return ANNOT_PARAM_CLOSE; }
  "."                         { return MULT_SEP; }
  "<<EOF>>"                   { return EOF; }
  "newline"                   { return NEWLINE; }
  "CRLF"                      { return CRLF; }
  "ANNOTATION_DECLR"          { return ANNOTATION_DECLR; }
  "DEPENDENCY_DECLARATION"    { return DEPENDENCY_DECLARATION; }

  {COMMENT}                   { return COMMENT; }
  {NUMBER}                    { return NUMBER; }
  {IDENT}                     { return IDENT; }
  {STRING}                    { return STRING; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
