import java_cup.runtime.Symbol;

%%

%cup

%public

%line
%column

%class Lexer
%type java_cup.runtime.Symbol

%{

  private Symbol symbol(int type) {
      return new FoolSymbol(type, yyline+1, yycolumn+1);
    }

    private Symbol symbol(int type, Object value) {
      return new FoolSymbol(type, yyline+1, yycolumn+1, value);
    }

%}


Letter = [a-zA-Z]
Digit = [0-9]

// identificadores não podem começar com números
Identifier = {Letter}({Letter}|{Digit})*

IntegerLiteral = {Digit}+

// apenas para facilitar a definição de tokens
WhiteSpace = \s

%%

<YYINITIAL> {
  // keywords
  "bool"                         { return symbol(sym.BOOLEAN); }
  "class"                        { return symbol(sym.CLASS); }
  "else"                         { return symbol(sym.ELSE); }
  "int"                          { return symbol(sym.INT); }
  "if"                           { return symbol(sym.IF); }
  "return"                       { return symbol(sym.RETURN); }
  "void"                         { return symbol(sym.VOID); }

  // separadores
  "("                            { return symbol(sym.LPAREN); }
  ")"                            { return symbol(sym.RPAREN); }
  "{"                            { return symbol(sym.LBRACE); }
  "}"                            { return symbol(sym.RBRACE); }
  ";"                            { return symbol(sym.SEMICOLON); }
  ","                            { return symbol(sym.COMMA); }

  // operadores
  "="                            { return symbol(sym.EQ); }
  // operadores de comparação
  "=="                           { return symbol(sym.EQEQ); }
  "<>"                           { return symbol(sym.NOTEQ); }
  // operadores lógicos
  "not"                            { return symbol(sym.NOT); }
  "and"                           { return symbol(sym.AND); }
  "or"                           { return symbol(sym.OR); }
  // operadores aritméticos
  "+"                            { return symbol(sym.PLUS); }
  "*"                            { return symbol(sym.MULT); }

   /* literais booleanos */
   "True"                         { return symbol(sym.BOOLEAN_LITERAL, true); }
   "False"                        { return symbol(sym.BOOLEAN_LITERAL, false); }

  {IntegerLiteral}            { return symbol(sym.INTEGER_LITERAL, Integer.valueOf(yytext().toString())); }

  {WhiteSpace}                   { /* ignore */ }

  // identificadores de classes, argumentos e variáveis
  {Identifier}                   { return symbol(sym.IDENTIFIER, yytext()); }
}

[^]                              { throw new RuntimeException("Caracter inválido \"" +yytext() + "\" na linha " + yyline + ", coluna " + yycolumn + "."); }