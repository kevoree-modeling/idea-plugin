/* The following code was generated by JFlex 1.4.3 on 8/25/15 7:18 PM */

package org.kevoree.modeling;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.kevoree.modeling.idea.psi.MetaModelTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 8/25/15 7:18 PM from the specification file
 * <tt>/Users/duke/Documents/dev/kevoree-modeling/idea-plugin/org.kevoree.modeling.idea/src/org/kevoree/modeling/_MetaModelLexer.flex</tt>
 */
public class _MetaModelLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\2\1\0\1\1\1\1\22\0\1\1\1\0\1\12"+
    "\4\0\1\10\1\46\1\47\1\31\1\0\1\42\1\4\1\6\1\3"+
    "\12\5\1\41\1\0\1\50\1\43\1\54\2\0\2\7\1\55\1\7"+
    "\1\51\1\53\5\7\1\57\2\7\1\52\2\7\1\56\10\7\1\36"+
    "\1\11\1\37\1\0\1\7\1\0\1\21\1\7\1\17\1\33\1\23"+
    "\1\27\1\7\1\16\1\14\2\7\1\20\1\26\1\24\1\32\1\34"+
    "\1\7\1\30\1\22\1\15\1\25\1\7\1\13\1\40\1\35\1\7"+
    "\1\44\1\0\1\45\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\4"+
    "\2\1\12\4\1\1\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\1\1\4\1\16\1\5\1\0\1\17"+
    "\3\0\14\4\1\20\1\0\4\4\1\21\5\4\1\22"+
    "\2\4\1\0\1\4\1\23\2\4\1\24\2\4\1\25"+
    "\1\26\1\27\2\4\1\0\1\30\1\31\1\32\4\4"+
    "\1\0\2\4\1\33\1\4\1\0\1\34\1\35\1\4"+
    "\1\36\2\4\1\37";

  private static int [] zzUnpackAction() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0120"+
    "\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0"+
    "\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\60\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\u03c0\0\u03f0\0\u0420\0\u0450"+
    "\0\u0150\0\60\0\u0480\0\u0180\0\u04b0\0\u04e0\0\u0510\0\u0540"+
    "\0\u0570\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u0660\0\u0690\0\u06c0"+
    "\0\u06f0\0\60\0\u0720\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0120"+
    "\0\u0810\0\u0840\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960"+
    "\0\u0990\0\u09c0\0\u0120\0\u09f0\0\u0a20\0\u0120\0\u0a50\0\u0a80"+
    "\0\u0120\0\u0120\0\u0120\0\u0ab0\0\u0ae0\0\u0b10\0\u0120\0\u0120"+
    "\0\u0120\0\u0b40\0\u0b70\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30\0\u0c60"+
    "\0\u0120\0\u0c90\0\u0cc0\0\u0120\0\u0120\0\u0cf0\0\60\0\u0d20"+
    "\0\u0d50\0\u0120";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\2\1\12\1\13\1\14\2\10\1\15\1\10\1\16"+
    "\1\10\1\17\1\20\2\10\1\21\1\22\1\10\1\23"+
    "\1\24\2\10\1\25\1\2\1\10\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\3\10\1\2\1\36"+
    "\2\10\61\0\2\3\60\0\1\37\60\0\1\10\1\6"+
    "\2\10\3\0\23\10\2\0\1\10\10\0\3\10\1\0"+
    "\3\10\4\0\1\10\1\6\1\40\1\10\3\0\23\10"+
    "\2\0\1\10\10\0\3\10\1\0\3\10\4\0\4\10"+
    "\3\0\23\10\2\0\1\10\10\0\3\10\1\0\3\10"+
    "\10\41\1\42\1\43\46\41\11\44\1\45\1\42\45\44"+
    "\4\0\4\10\3\0\1\10\1\46\21\10\2\0\1\10"+
    "\10\0\3\10\1\0\3\10\4\0\4\10\3\0\11\10"+
    "\1\47\11\10\2\0\1\10\10\0\3\10\1\0\3\10"+
    "\4\0\4\10\3\0\5\10\1\50\15\10\2\0\1\10"+
    "\10\0\3\10\1\0\3\10\4\0\4\10\3\0\2\10"+
    "\1\51\20\10\2\0\1\10\10\0\3\10\1\0\3\10"+
    "\4\0\4\10\3\0\11\10\1\52\11\10\2\0\1\53"+
    "\10\0\3\10\1\0\3\10\4\0\4\10\3\0\10\10"+
    "\1\54\12\10\2\0\1\10\10\0\3\10\1\0\3\10"+
    "\4\0\4\10\3\0\12\10\1\55\2\10\1\56\5\10"+
    "\2\0\1\10\10\0\3\10\1\0\3\10\4\0\4\10"+
    "\3\0\10\10\1\57\12\10\2\0\1\10\10\0\3\10"+
    "\1\0\3\10\4\0\4\10\3\0\12\10\1\60\10\10"+
    "\2\0\1\10\10\0\3\10\1\0\3\10\4\0\4\10"+
    "\3\0\10\10\1\61\12\10\2\0\1\10\10\0\3\10"+
    "\1\0\3\10\37\0\1\62\70\0\1\63\13\0\4\10"+
    "\3\0\23\10\2\0\1\10\10\0\3\10\1\0\1\10"+
    "\1\64\1\10\2\37\1\0\55\37\4\0\1\10\1\40"+
    "\2\10\3\0\23\10\2\0\1\10\10\0\3\10\1\0"+
    "\3\10\2\41\1\0\55\41\2\44\1\0\55\44\4\0"+
    "\4\10\3\0\2\10\1\65\20\10\2\0\1\10\10\0"+
    "\3\10\1\0\3\10\4\0\4\10\3\0\21\10\1\66"+
    "\1\10\2\0\1\10\10\0\3\10\1\0\3\10\4\0"+
    "\4\10\3\0\6\10\1\67\14\10\2\0\1\10\10\0"+
    "\3\10\1\0\3\10\4\0\4\10\3\0\2\10\1\70"+
    "\20\10\2\0\1\10\10\0\3\10\1\0\3\10\4\0"+
    "\4\10\3\0\12\10\1\71\10\10\2\0\1\10\10\0"+
    "\3\10\1\0\3\10\4\0\4\10\3\0\2\10\1\72"+
    "\20\10\2\0\1\10\10\0\3\10\1\0\3\10\4\0"+
    "\4\10\3\0\1\73\22\10\2\0\1\10\10\0\3\10"+
    "\1\0\3\10\4\0\4\10\3\0\11\10\1\74\11\10"+
    "\2\0\1\10\10\0\3\10\1\0\3\10\4\0\4\10"+
    "\3\0\17\10\1\75\3\10\2\0\1\10\10\0\3\10"+
    "\1\0\3\10\4\0\4\10\3\0\14\10\1\76\6\10"+
    "\2\0\1\10\10\0\3\10\1\0\3\10\4\0\4\10"+
    "\3\0\2\10\1\77\20\10\2\0\1\10\10\0\3\10"+
    "\1\0\3\10\4\0\4\10\3\0\21\10\1\100\1\10"+
    "\2\0\1\10\10\0\3\10\1\0\3\10\51\0\1\101"+
    "\12\0\4\10\3\0\23\10\2\0\1\10\10\0\3\10"+
    "\1\0\2\10\1\102\4\0\4\10\3\0\3\10\1\103"+
    "\17\10\2\0\1\10\10\0\3\10\1\0\3\10\4\0"+
    "\4\10\3\0\12\10\1\104\10\10\2\0\1\10\10\0"+
    "\3\10\1\0\3\10\4\0\4\10\3\0\7\10\1\105"+
    "\13\10\2\0\1\10\10\0\3\10\1\0\3\10\4\0"+
    "\4\10\3\0\13\10\1\106\7\10\2\0\1\10\10\0"+
    "\3\10\1\0\3\10\4\0\4\10\3\0\10\10\1\107"+
    "\12\10\2\0\1\10\10\0\3\10\1\0\3\10\4\0"+
    "\4\10\3\0\5\10\1\110\15\10\2\0\1\10\10\0"+
    "\3\10\1\0\3\10\4\0\4\10\3\0\4\10\1\111"+
    "\16\10\2\0\1\10\10\0\3\10\1\0\3\10\4\0"+
    "\4\10\3\0\13\10\1\112\7\10\2\0\1\10\10\0"+
    "\3\10\1\0\3\10\4\0\4\10\3\0\16\10\1\113"+
    "\4\10\2\0\1\10\10\0\3\10\1\0\3\10\4\0"+
    "\4\10\3\0\21\10\1\114\1\10\2\0\1\10\10\0"+
    "\3\10\1\0\3\10\4\0\4\10\3\0\10\10\1\115"+
    "\12\10\2\0\1\10\10\0\3\10\1\0\3\10\52\0"+
    "\1\116\11\0\4\10\3\0\23\10\2\0\1\10\10\0"+
    "\2\10\1\117\1\0\3\10\4\0\4\10\3\0\2\10"+
    "\1\120\20\10\2\0\1\10\10\0\3\10\1\0\3\10"+
    "\4\0\4\10\3\0\7\10\1\121\13\10\2\0\1\10"+
    "\10\0\3\10\1\0\3\10\4\0\4\10\3\0\11\10"+
    "\1\122\11\10\2\0\1\10\10\0\3\10\1\0\3\10"+
    "\4\0\4\10\3\0\1\10\1\123\21\10\2\0\1\10"+
    "\10\0\3\10\1\0\3\10\4\0\4\10\3\0\12\10"+
    "\1\124\10\10\2\0\1\10\10\0\3\10\1\0\3\10"+
    "\4\0\4\10\3\0\11\10\1\125\11\10\2\0\1\10"+
    "\10\0\3\10\1\0\3\10\53\0\1\126\10\0\4\10"+
    "\3\0\20\10\1\127\2\10\2\0\1\10\10\0\3\10"+
    "\1\0\3\10\4\0\4\10\3\0\11\10\1\130\11\10"+
    "\2\0\1\10\10\0\3\10\1\0\3\10\4\0\4\10"+
    "\3\0\2\10\1\131\20\10\2\0\1\10\10\0\3\10"+
    "\1\0\3\10\4\0\4\10\3\0\20\10\1\132\2\10"+
    "\2\0\1\10\10\0\3\10\1\0\3\10\54\0\1\133"+
    "\7\0\4\10\3\0\7\10\1\134\13\10\2\0\1\10"+
    "\10\0\3\10\1\0\3\10\4\0\4\10\3\0\10\10"+
    "\1\135\12\10\2\0\1\10\10\0\3\10\1\0\3\10"+
    "\4\0\4\10\3\0\10\10\1\136\12\10\2\0\1\10"+
    "\10\0\3\10\1\0\3\10\54\0\1\137\7\0\4\10"+
    "\3\0\11\10\1\140\11\10\2\0\1\10\10\0\3\10"+
    "\1\0\3\10\4\0\4\10\3\0\4\10\1\141\16\10"+
    "\2\0\1\10\10\0\3\10\1\0\3\10\4\0\4\10"+
    "\3\0\22\10\1\142\2\0\1\10\10\0\3\10\1\0"+
    "\3\10";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3456];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\23\1\7\11\4\1\1\0\1\11\3\0"+
    "\14\1\1\11\1\0\15\1\1\0\14\1\1\0\7\1"+
    "\1\0\4\1\1\0\3\1\1\11\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  public _MetaModelLexer() {
    this((java.io.Reader)null);
  }


  public _MetaModelLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _MetaModelLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 148) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 8: 
          { return COMMA;
          }
        case 32: break;
        case 23: 
          { return MREF;
          }
        case 33: break;
        case 14: 
          { return COMMENT;
          }
        case 34: break;
        case 21: 
          { return FUNC;
          }
        case 35: break;
        case 27: 
          { return OUTPUT;
          }
        case 36: break;
        case 17: 
          { return ATT;
          }
        case 37: break;
        case 30: 
          { return EOF;
          }
        case 38: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 39: break;
        case 3: 
          { return SUB;
          }
        case 40: break;
        case 11: 
          { return BODY_CLOSE;
          }
        case 41: break;
        case 13: 
          { return ANNOT_PARAM_CLOSE;
          }
        case 42: break;
        case 29: 
          { return NEWLINE;
          }
        case 43: break;
        case 7: 
          { return COLON;
          }
        case 44: break;
        case 28: 
          { return EXTENDS;
          }
        case 45: break;
        case 25: 
          { return INPUT;
          }
        case 46: break;
        case 10: 
          { return BODY_OPEN;
          }
        case 47: break;
        case 31: 
          { return DEPENDENCY;
          }
        case 48: break;
        case 18: 
          { return REF;
          }
        case 49: break;
        case 22: 
          { return FROM;
          }
        case 50: break;
        case 9: 
          { return EQ;
          }
        case 51: break;
        case 15: 
          { return STRING;
          }
        case 52: break;
        case 24: 
          { return CRLF;
          }
        case 53: break;
        case 20: 
          { return ENUM;
          }
        case 54: break;
        case 26: 
          { return CLASS;
          }
        case 55: break;
        case 12: 
          { return ANNOT_PARAM_OPEN;
          }
        case 56: break;
        case 4: 
          { return IDENT;
          }
        case 57: break;
        case 5: 
          { return NUMBER;
          }
        case 58: break;
        case 6: 
          { return MULT_SEP;
          }
        case 59: break;
        case 19: 
          { return WITH;
          }
        case 60: break;
        case 16: 
          { return ARRAY;
          }
        case 61: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 62: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
