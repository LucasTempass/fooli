
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class LexParse extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public LexParse() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public LexParse(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public LexParse(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\067\000\002\002\004\000\002\002\003\000\002\003" +
    "\003\000\002\003\003\000\002\004\003\000\002\004\003" +
    "\000\002\005\005\000\002\006\005\000\002\007\003\000" +
    "\002\007\004\000\002\010\003\000\002\010\003\000\002" +
    "\011\005\000\002\012\006\000\002\040\007\000\002\040" +
    "\007\000\002\013\004\000\002\013\006\000\002\014\002" +
    "\000\002\014\003\000\002\015\003\000\002\015\004\000" +
    "\002\016\003\000\002\017\003\000\002\017\003\000\002" +
    "\017\003\000\002\020\010\000\002\041\004\000\002\041" +
    "\002\000\002\031\006\000\002\027\003\000\002\027\005" +
    "\000\002\030\002\000\002\030\003\000\002\024\004\000" +
    "\002\022\005\000\002\023\006\000\002\035\003\000\002" +
    "\035\003\000\002\035\003\000\002\035\004\000\002\036" +
    "\003\000\002\036\005\000\002\037\003\000\002\037\005" +
    "\000\002\032\003\000\002\032\005\000\002\032\005\000" +
    "\002\034\003\000\002\034\005\000\002\033\003\000\002" +
    "\033\005\000\002\025\003\000\002\026\003\000\002\026" +
    "\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\135\000\004\004\005\001\002\000\004\002\137\001" +
    "\002\000\004\033\007\001\002\000\004\002\000\001\002" +
    "\000\004\007\010\001\002\000\010\014\014\015\012\016" +
    "\015\001\002\000\004\002\ufffb\001\002\000\004\033\ufffd" +
    "\001\002\000\004\007\044\001\002\000\004\033\ufffc\001" +
    "\002\000\004\033\040\001\002\000\012\010\ufff6\014\ufff6" +
    "\015\ufff6\016\ufff6\001\002\000\012\010\036\014\014\015" +
    "\012\016\015\001\002\000\004\033\023\001\002\000\012" +
    "\010\ufff7\014\ufff7\015\ufff7\016\ufff7\001\002\000\012\010" +
    "\ufff9\014\ufff9\015\ufff9\016\ufff9\001\002\000\006\005\024" +
    "\012\025\001\002\000\012\010\ufff5\014\ufff5\015\ufff5\016" +
    "\ufff5\001\002\000\010\013\uffef\014\014\015\012\001\002" +
    "\000\006\006\033\013\uffee\001\002\000\004\013\032\001" +
    "\002\000\004\033\031\001\002\000\006\006\ufff1\013\ufff1" +
    "\001\002\000\004\007\ufff3\001\002\000\006\014\014\015" +
    "\012\001\002\000\004\033\035\001\002\000\006\006\ufff0" +
    "\013\ufff0\001\002\000\004\002\ufffa\001\002\000\012\010" +
    "\ufff8\014\ufff8\015\ufff8\016\ufff8\001\002\000\004\012\041" +
    "\001\002\000\010\013\uffef\014\014\015\012\001\002\000" +
    "\004\013\043\001\002\000\004\007\ufff2\001\002\000\004" +
    "\017\050\001\002\000\006\010\136\017\050\001\002\000" +
    "\006\010\uffed\017\uffed\001\002\000\006\010\uffeb\017\uffeb" +
    "\001\002\000\004\012\051\001\002\000\012\026\064\031" +
    "\066\032\055\033\061\001\002\000\022\005\uffd4\006\uffd4" +
    "\013\uffd4\022\076\024\uffd4\025\uffd4\027\uffd4\030\uffd4\001" +
    "\002\000\024\005\uffdb\006\uffdb\013\uffdb\022\uffdb\023\uffdb" +
    "\024\uffdb\025\uffdb\027\uffdb\030\uffdb\001\002\000\020\005" +
    "\uffd1\006\uffd1\013\uffd1\024\uffd1\025\uffd1\027\074\030\073" +
    "\001\002\000\024\005\ufffe\006\ufffe\013\ufffe\022\ufffe\023" +
    "\ufffe\024\ufffe\025\ufffe\027\ufffe\030\ufffe\001\002\000\024" +
    "\005\uffd8\006\uffd8\013\uffd8\022\uffd8\023\uffd8\024\uffd8\025" +
    "\uffd8\027\uffd8\030\uffd8\001\002\000\004\013\113\001\002" +
    "\000\014\005\uffcf\006\uffcf\013\uffcf\024\071\025\uffcf\001" +
    "\002\000\026\005\uffda\006\uffda\012\104\013\uffda\022\uffda" +
    "\023\uffda\024\uffda\025\uffda\027\uffda\030\uffda\001\002\000" +
    "\024\005\uffdc\006\uffdc\013\uffdc\022\uffdc\023\uffdc\024\uffdc" +
    "\025\uffdc\027\uffdc\030\uffdc\001\002\000\024\005\uffd6\006" +
    "\uffd6\013\uffd6\022\uffd6\023\100\024\uffd6\025\uffd6\027\uffd6" +
    "\030\uffd6\001\002\000\012\026\064\031\066\032\055\033" +
    "\061\001\002\000\012\005\uffcd\006\uffcd\013\uffcd\025\067" +
    "\001\002\000\024\005\uffff\006\uffff\013\uffff\022\uffff\023" +
    "\uffff\024\uffff\025\uffff\027\uffff\030\uffff\001\002\000\012" +
    "\026\064\031\066\032\055\033\061\001\002\000\014\005" +
    "\uffce\006\uffce\013\uffce\024\071\025\uffce\001\002\000\012" +
    "\026\064\031\066\032\055\033\061\001\002\000\020\005" +
    "\uffd0\006\uffd0\013\uffd0\024\uffd0\025\uffd0\027\074\030\073" +
    "\001\002\000\012\026\064\031\066\032\055\033\061\001" +
    "\002\000\012\026\064\031\066\032\055\033\061\001\002" +
    "\000\022\005\uffd3\006\uffd3\013\uffd3\022\076\024\uffd3\025" +
    "\uffd3\027\uffd3\030\uffd3\001\002\000\012\026\064\031\066" +
    "\032\055\033\061\001\002\000\024\005\uffd5\006\uffd5\013" +
    "\uffd5\022\uffd5\023\100\024\uffd5\025\uffd5\027\uffd5\030\uffd5" +
    "\001\002\000\012\026\064\031\066\032\055\033\061\001" +
    "\002\000\024\005\uffd7\006\uffd7\013\uffd7\022\uffd7\023\uffd7" +
    "\024\uffd7\025\uffd7\027\uffd7\030\uffd7\001\002\000\022\005" +
    "\uffd2\006\uffd2\013\uffd2\022\076\024\uffd2\025\uffd2\027\uffd2" +
    "\030\uffd2\001\002\000\024\005\uffd9\006\uffd9\013\uffd9\022" +
    "\uffd9\023\uffd9\024\uffd9\025\uffd9\027\uffd9\030\uffd9\001\002" +
    "\000\014\013\uffe1\026\064\031\066\032\055\033\061\001" +
    "\002\000\004\013\112\001\002\000\006\006\110\013\uffe0" +
    "\001\002\000\006\006\uffe3\013\uffe3\001\002\000\012\026" +
    "\064\031\066\032\055\033\061\001\002\000\006\006\uffe2" +
    "\013\uffe2\001\002\000\024\005\uffe4\006\uffe4\013\uffe4\022" +
    "\uffe4\023\uffe4\024\uffe4\025\uffe4\027\uffe4\030\uffe4\001\002" +
    "\000\006\021\114\033\116\001\002\000\014\005\uffcb\026" +
    "\064\031\066\032\055\033\061\001\002\000\010\010\uffe8" +
    "\017\uffe8\020\uffe8\001\002\000\006\011\127\012\104\001" +
    "\002\000\010\010\uffe5\017\uffe5\020\124\001\002\000\004" +
    "\005\123\001\002\000\010\010\uffe9\017\uffe9\020\uffe9\001" +
    "\002\000\010\010\uffea\017\uffea\020\uffea\001\002\000\010" +
    "\010\uffdf\017\uffdf\020\uffdf\001\002\000\006\021\114\033" +
    "\116\001\002\000\006\010\uffe7\017\uffe7\001\002\000\006" +
    "\010\uffe6\017\uffe6\001\002\000\012\026\064\031\066\032" +
    "\055\033\061\001\002\000\004\005\131\001\002\000\010" +
    "\010\uffdd\017\uffdd\020\uffdd\001\002\000\004\005\uffcc\001" +
    "\002\000\004\005\134\001\002\000\010\010\uffde\017\uffde" +
    "\020\uffde\001\002\000\006\010\uffec\017\uffec\001\002\000" +
    "\012\010\ufff4\014\ufff4\015\ufff4\016\ufff4\001\002\000\004" +
    "\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\135\000\006\002\003\005\005\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\006\010" +
    "\001\001\000\016\004\017\007\016\010\021\011\020\012" +
    "\015\040\012\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\004\017\010\036\011\020\012\015" +
    "\040\012\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\004\027\013\025\014\026\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\004\033\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\004\027\013\025\014\041\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\015\044\016\045" +
    "\020\046\001\001\000\006\016\134\020\046\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\024" +
    "\003\061\025\056\031\052\032\053\033\064\034\057\035" +
    "\055\036\062\037\051\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\003\061\031" +
    "\052\035\102\001\001\000\002\001\001\000\002\001\001" +
    "\000\020\003\061\031\052\032\053\034\067\035\055\036" +
    "\062\037\051\001\001\000\002\001\001\000\016\003\061" +
    "\031\052\032\071\035\055\036\062\037\051\001\001\000" +
    "\002\001\001\000\014\003\061\031\052\035\055\036\062" +
    "\037\101\001\001\000\014\003\061\031\052\035\055\036" +
    "\062\037\074\001\001\000\002\001\001\000\012\003\061" +
    "\031\052\035\055\036\076\001\001\000\002\001\001\000" +
    "\010\003\061\031\052\035\100\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\030\003\061\025" +
    "\106\027\105\030\104\031\052\032\053\033\064\034\057" +
    "\035\055\036\062\037\051\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\024\003\061\025\110" +
    "\031\052\032\053\033\064\034\057\035\055\036\062\037" +
    "\051\001\001\000\002\001\001\000\002\001\001\000\014" +
    "\017\116\022\120\023\114\024\121\031\117\001\001\000" +
    "\026\003\061\025\131\026\132\031\052\032\053\033\064" +
    "\034\057\035\055\036\062\037\051\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\041\124\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\014\017\125\022\120\023\114\024\121\031\117" +
    "\001\001\000\002\001\001\000\002\001\001\000\024\003" +
    "\061\025\127\031\052\032\053\033\064\034\057\035\055" +
    "\036\062\037\051\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$LexParse$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$LexParse$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$LexParse$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$LexParse$actions {
  private final LexParse parser;

  /** Constructor */
  CUP$LexParse$actions(LexParse parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$LexParse$do_action_part00000000(
    int                        CUP$LexParse$act_num,
    java_cup.runtime.lr_parser CUP$LexParse$parser,
    java.util.Stack            CUP$LexParse$stack,
    int                        CUP$LexParse$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$LexParse$result;

      /* select the action based on the action number */
      switch (CUP$LexParse$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= goal EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$LexParse$stack.elementAt(CUP$LexParse$top-1)).value;
		RESULT = start_val;
              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-1)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$LexParse$parser.done_parsing();
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // goal ::= class_declaration 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("goal",0, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // literal ::= INTEGER_LITERAL 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("literal",1, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // literal ::= BOOLEAN_LITERAL 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("literal",1, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // primitive_type ::= INT 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("primitive_type",2, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // primitive_type ::= BOOLEAN 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("primitive_type",2, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // class_declaration ::= CLASS IDENTIFIER class_body 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("class_declaration",3, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-2)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // class_body ::= LBRACE class_body_declarations RBRACE 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("class_body",4, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-2)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // class_body_declarations ::= class_member_declaration 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("class_body_declarations",5, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // class_body_declarations ::= class_body_declarations class_member_declaration 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("class_body_declarations",5, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-1)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // class_member_declaration ::= field_declaration 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("class_member_declaration",6, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // class_member_declaration ::= method_declaration 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("class_member_declaration",6, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // field_declaration ::= primitive_type IDENTIFIER SEMICOLON 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("field_declaration",7, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-2)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // method_declaration ::= method_header LBRACE method_statements RBRACE 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("method_declaration",8, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-3)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // method_header ::= primitive_type IDENTIFIER LPAREN method_parameter_list_opt RPAREN 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("method_header",30, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-4)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // method_header ::= VOID IDENTIFIER LPAREN method_parameter_list_opt RPAREN 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("method_header",30, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-4)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // method_parameter_list ::= primitive_type IDENTIFIER 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("method_parameter_list",9, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-1)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // method_parameter_list ::= method_parameter_list COMMA primitive_type IDENTIFIER 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("method_parameter_list",9, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-3)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // method_parameter_list_opt ::= 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("method_parameter_list_opt",10, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // method_parameter_list_opt ::= method_parameter_list 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("method_parameter_list_opt",10, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // method_statements ::= method_statement 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("method_statements",11, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // method_statements ::= method_statements method_statement 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("method_statements",11, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-1)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // method_statement ::= if_statement 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("method_statement",12, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // simple_statement ::= method_invocation_statement 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("simple_statement",13, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // simple_statement ::= return_statement 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("simple_statement",13, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // simple_statement ::= assignment_statement 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("simple_statement",13, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // if_statement ::= IF LPAREN expression RPAREN simple_statement else_statement 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("if_statement",14, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-5)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // else_statement ::= ELSE simple_statement 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("else_statement",31, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-1)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // else_statement ::= 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("else_statement",31, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // method_invocation ::= IDENTIFIER LPAREN argument_list_opt RPAREN 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("method_invocation",23, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-3)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // argument_list ::= expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("argument_list",21, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // argument_list ::= argument_list COMMA expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("argument_list",21, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-2)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // argument_list_opt ::= 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("argument_list_opt",22, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // argument_list_opt ::= argument_list 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("argument_list_opt",22, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // method_invocation_statement ::= method_invocation SEMICOLON 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("method_invocation_statement",18, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-1)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // return_statement ::= RETURN expression_opt SEMICOLON 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("return_statement",16, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-2)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // assignment_statement ::= IDENTIFIER EQ expression SEMICOLON 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("assignment_statement",17, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-3)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // unary_expression ::= literal 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("unary_expression",27, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // unary_expression ::= method_invocation 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("unary_expression",27, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // unary_expression ::= IDENTIFIER 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("unary_expression",27, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // unary_expression ::= NOT unary_expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("unary_expression",27, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-1)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // multiplicative_expression ::= unary_expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("multiplicative_expression",28, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // multiplicative_expression ::= multiplicative_expression MULT unary_expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("multiplicative_expression",28, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-2)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // additive_expression ::= multiplicative_expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("additive_expression",29, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // additive_expression ::= additive_expression PLUS multiplicative_expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("additive_expression",29, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-2)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // equality_expression ::= additive_expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("equality_expression",24, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // equality_expression ::= equality_expression EQEQ additive_expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("equality_expression",24, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-2)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // equality_expression ::= equality_expression NOTEQ additive_expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("equality_expression",24, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-2)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // boolean_and_expression ::= equality_expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("boolean_and_expression",26, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // boolean_and_expression ::= boolean_and_expression AND equality_expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("boolean_and_expression",26, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-2)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // boolean_expression ::= boolean_and_expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("boolean_expression",25, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // boolean_expression ::= boolean_expression OR boolean_and_expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("boolean_expression",25, ((java_cup.runtime.Symbol)CUP$LexParse$stack.elementAt(CUP$LexParse$top-2)), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // expression ::= boolean_expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("expression",19, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // expression_opt ::= expression 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("expression_opt",20, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // expression_opt ::= 
            {
              Object RESULT =null;

              CUP$LexParse$result = parser.getSymbolFactory().newSymbol("expression_opt",20, ((java_cup.runtime.Symbol)CUP$LexParse$stack.peek()), RESULT);
            }
          return CUP$LexParse$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$LexParse$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$LexParse$do_action(
    int                        CUP$LexParse$act_num,
    java_cup.runtime.lr_parser CUP$LexParse$parser,
    java.util.Stack            CUP$LexParse$stack,
    int                        CUP$LexParse$top)
    throws java.lang.Exception
    {
              return CUP$LexParse$do_action_part00000000(
                               CUP$LexParse$act_num,
                               CUP$LexParse$parser,
                               CUP$LexParse$stack,
                               CUP$LexParse$top);
    }
}

}
