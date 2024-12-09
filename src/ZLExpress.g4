grammar ZLExpress;

@header {
/*
 * Copyright 2023-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// ############################################################
// # NOTE: This is ANTLR4 auto-generated code. Do not modify! #
// ############################################################
}

expression
: (booleanExpression ';')*
| (assignExpression ';')*
| (computeExpression ';')*
;

assignExpression
  : IDENTIFIER ASSIGN constant                   # AssigExpression
 |IDENTIFIER ASSIGN booleanExpression            # AssigExpression
 |IDENTIFIER ASSIGN computeExpression            # AssigExpression
 ;


computeExpression
: (IDENTIFIER|num) PLUS (IDENTIFIER|num)              # PlusExpression
| (IDENTIFIER|num) MINUS (IDENTIFIER|num)             # MinusExpression
| (IDENTIFIER|num) MUL (IDENTIFIER|num)               # MulExpression
| (IDENTIFIER|num) DIV (IDENTIFIER|num)               # DivExpression
;

booleanExpression
    : identifier compare constant                                 # CompareExpression
    | identifier IN constantArray                                 # InExpression
    | identifier (NOT IN | NIN) constantArray                     # NinExpression
    | left=booleanExpression operator=AND right=booleanExpression # AndExpression
    | left=booleanExpression operator=OR right=booleanExpression  # OrExpression
    | LEFT_PARENTHESIS booleanExpression RIGHT_PARENTHESIS        # GroupExpression
    | NOT booleanExpression                                       # NotExpression
    ;

constantArray
    : LEFT_SQUARE_BRACKETS constant (COMMA constant)* RIGHT_SQUARE_BRACKETS
    ;

compare:
    EQUALS | GT | GE | LT | LE | NE;

identifier
    : IDENTIFIER DOT IDENTIFIER
    | IDENTIFIER
    | QUOTED_STRING
    ;

num
  : (MINUS | PLUS)? INTEGER_VALUE # IntegerConstant
  | (MINUS | PLUS)? DECIMAL_VALUE # DecimalConstant
  ;

constant
    : num                           # NumConstant
    | QUOTED_STRING+                # TextConstant
    | BOOLEAN_VALUE                 # BooleanConstant
    ;

ASSIGN  : '=';

NULL: 'null' | 'NULL';
DOT: '.';
COMMA: ',';
LEFT_SQUARE_BRACKETS: '[';
RIGHT_SQUARE_BRACKETS: ']';
LEFT_PARENTHESIS: '(';
RIGHT_PARENTHESIS: ')';
EQUALS: '==';
MINUS : '-';
PLUS: '+';
MUL: '*';
DIV: '/';
GT: '>';
GE: '>=';
LT: '<';
LE: '<=';
NE: '!=';

AND: 'AND' | 'and' | '&&';
OR: 'OR' | 'or' | '||';
IN: 'IN' | 'in';
NIN: 'NIN' | 'nin';
NOT: 'NOT' | 'not';

BOOLEAN_VALUE
    : 'TRUE' | 'true' | 'FALSE' | 'false'
    ;

QUOTED_STRING
    : '\'' ( ~('\''|'\\') | ('\\' .) )* '\''
    | '"' ( ~('"'|'\\') | ('\\' .) )* '"'
    ;

INTEGER_VALUE
    : DIGIT+
    ;

DECIMAL_VALUE
    : DECIMAL_DIGITS
    ;

IDENTIFIER
    : (LETTER | DIGIT | '_')+
    ;

fragment DECIMAL_DIGITS
    : DIGIT+ '.' DIGIT*
    | '.' DIGIT+
    ;

fragment DIGIT
    : [0-9]
    ;

fragment LETTER
    : [a-zA-Z]
    ;

WS
    : [ \r\n\t]+ -> channel(HIDDEN)
    ;