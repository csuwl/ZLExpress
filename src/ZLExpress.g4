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
: expression
| ( expression ';')*
| ( expression_not_return ';')
;

defFunction
:return_type IDENTIFIER LEFT_PARENTHESIS functionParameterList RIGHT_PARENTHESIS BLOCK_LEFT exprList  BLOCK_RIGHT
;

functionParameterList:
(functionParameterItem)? (',' functionParameterItem)*
;

functionParameterItem:
function_parameter_type IDENTIFIER
;

functionExecute
: IDENTIFIER LEFT_PARENTHESIS functionExecuteParameterList RIGHT_PARENTHESIS
;

functionExecuteParameterList
:(functionExecuteParameter) ? (',' functionExecuteParameter)*
;

expression
: expression_not_return
| returnExpression
;


expression_not_return
: booleanExpression
| assignExpression
| computeExpression
| groupExpression
| defFunction
| functionExecute
;

returnExpression
: RETURN  (null | id | constant | functionExecute | computeExpression | booleanExpression | groupExpression)
;


groupExpression
:(LEFT_PARENTHESIS groupExpression RIGHT_PARENTHESIS )
|(LEFT_PARENTHESIS booleanExpression RIGHT_PARENTHESIS )
|(LEFT_PARENTHESIS assignExpression RIGHT_PARENTHESIS )
;


assignExpression
  : type? IDENTIFIER ASSIGN constant
 |type? IDENTIFIER ASSIGN booleanExpression
 |type? IDENTIFIER ASSIGN computeExpression
 |type? IDENTIFIER ASSIGN functionExecute
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
| (MINUS | PLUS)? (id|num)                                                                  # NumExpression
;

booleanExpression
    : id compare constant                                 # CompareExpression
    | id compare id                                       # CompareExpression
    | id IN constantArray                                 # InExpression
    | id (NOT IN | NIN) constantArray                     # NinExpression
    | left=booleanExpression operator=AND right=booleanExpression # AndExpression
    | left=booleanExpression operator=OR right=booleanExpression  # OrExpression
    | NOT booleanExpression                                       # NotExpression
    ;

constantArray
    : LEFT_SQUARE_BRACKETS constant (COMMA constant)* RIGHT_SQUARE_BRACKETS
    ;

compare
:    EQUALS | GT | GE | LT | LE | NE;


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

INT_TYPE: 'Int' | 'int';
DOUBLE_TYPE: 'Double' | 'double';
STRING_TYPE: 'String'| 'string';
VOID_TYPE: 'Void' | 'void';
BOOL_TYPE: 'Bool' | 'bool' | 'boolean';

BLOCK_LEFT:'{';
BLOCK_RIGHT:'}';

RETURN:'return';

type :INT_TYPE|DOUBLE_TYPE|STRING_TYPE|BOOL_TYPE|VOID_TYPE;
return_type:type;
return_not_void_type:INT_TYPE|DOUBLE_TYPE|STRING_TYPE|BOOL_TYPE;
null:NULL;
function_parameter_type:INT_TYPE|DOUBLE_TYPE|STRING_TYPE|BOOL_TYPE;
functionExecuteParameter: (IDENTIFIER | constant | constantArray)
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

id:
IDENTIFIER
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