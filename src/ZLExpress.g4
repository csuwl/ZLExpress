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


exprList
:(expression ';')*
;

defFunction
:DEF FUNCTION IDENTIFIER LEFT_PARENTHESIS (function_parameter_typre IDENTIFIER)? (',' function_parameter_typre IDENTIFIER)* RIGHT_PARENTHESIS BLOCK_LEFT exprList BLOCK_RIGHT  #DefFunctionOne
|IDENTIFIER ASSIGN DEF return_type FUNCTION  LEFT_PARENTHESIS (function_parameter_typre IDENTIFIER)? (',' function_parameter_typre IDENTIFIER)* RIGHT_PARENTHESIS BLOCK_LEFT exprList BLOCK_RIGHT #DefFunctionTwo
;

functionExecute
: IDENTIFIER LEFT_PARENTHESIS (function_parameter) ? (',' function_parameter)* RIGHT_PARENTHESIS
;

expression
: booleanExpression
| assignExpression
| computeExpression
| groupExpression
| defFunction
| functionExecute
;

groupExpression
:(LEFT_PARENTHESIS groupExpression RIGHT_PARENTHESIS )
|(LEFT_PARENTHESIS booleanExpression RIGHT_PARENTHESIS )
|(LEFT_PARENTHESIS assignExpression RIGHT_PARENTHESIS )
;


assignExpression
  : IDENTIFIER ASSIGN constant
 |IDENTIFIER ASSIGN booleanExpression
 |IDENTIFIER ASSIGN computeExpression
 |IDENTIFIER ASSIGN functionExecute
 ;

groupComputeExpression
:LEFT_PARENTHESIS computeExpression RIGHT_PARENTHESIS
;

computeExpression
: computeExpression MUL computeExpression                                                           # MulExpression
| computeExpression DIV computeExpression                                                           # DivExpression
| computeExpression PLUS computeExpression                                                          # PlusExpression
| computeExpression MINUS computeExpression                                                         # MinusExpression
| groupComputeExpression                                                                            # GroupComputeExpressionA
| (MINUS | PLUS)? (IDENTIFIER|num)                                                                  # NumExpression
;

booleanExpression
    : identifier compare constant                                 # CompareExpression
    | identifier compare identifier                               # CompareExpression
    | identifier IN constantArray                                 # InExpression
    | identifier (NOT IN | NIN) constantArray                     # NinExpression
    | left=booleanExpression operator=AND right=booleanExpression # AndExpression
    | left=booleanExpression operator=OR right=booleanExpression  # OrExpression
    | NOT booleanExpression                                       # NotExpression
    ;

constantArray
    : LEFT_SQUARE_BRACKETS constant (COMMA constant)* RIGHT_SQUARE_BRACKETS
    ;

compare
:    EQUALS | GT | GE | LT | LE | NE;

identifier
    : IDENTIFIER DOT IDENTIFIER
    | IDENTIFIER
    | QUOTED_STRING
    ;

num
  : INTEGER_VALUE # IntegerConstant
  | DECIMAL_VALUE # DecimalConstant
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
DEF: 'def';
FUNCTION:'func'|'function';

INT_TYPE: 'Int';
DOUBLE_TYPE: 'Double';
STRING_TYPE: 'String';
VOID_TYPE: 'Void' | 'void';
BOOL_TYPE: 'Bool';

BLOCK_LEFT:'{';
BLOCK_RIGHT:'}';

type :INT_TYPE|DOUBLE_TYPE|STRING_TYPE|BOOL_TYPE|VOID_TYPE;
return_type:type;
function_parameter_typre:INT_TYPE|DOUBLE_TYPE|STRING_TYPE|BOOL_TYPE;
function_parameter: (IDENTIFIER | constant | constantArray)
;


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