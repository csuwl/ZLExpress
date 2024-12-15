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
: expressionNotReturn
| returnExpression
| (expressionNotReturn (';')+)* (returnExpression (';')+)?
;

forExprList
: expressionNotReturn
| returnExpression
| (expressionNotReturn (';')+)* (returnExpression (';')+)?
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
: IDENTIFIER LEFT_PARENTHESIS functionExecuteParameterList RIGHT_PARENTHESIS          #localFunctionExecute
| packagePath LEFT_PARENTHESIS functionExecuteParameterList RIGHT_PARENTHESIS         #objectFunctionExecute
;

functionExecuteParameterList
:functionExecuteParameter?
|functionExecuteParameter (',' functionExecuteParameter)*
;

expression
: expressionNotReturn
| returnExpression
;


expressionNotReturn
: booleanExpression
| assignExpression
| computeExpression
| groupExpression
| defFunction
| functionExecute
| importExpression
| newObjectExpression
| constant
| array
| id
| null
| if
| for
| break
| continue
;

for
:FOR LEFT_PARENTHESIS assignExpression ';' booleanExpression ';' computeExpression RIGHT_PARENTHESIS BLOCK_LEFT forExprList BLOCK_RIGHT
;

break
:BREAK;

continue
:CONTINUE;

if
: IF LEFT_PARENTHESIS booleanExpression RIGHT_PARENTHESIS BLOCK_LEFT ifContent BLOCK_RIGHT (elseContent)?
;

ifContent:exprList;

elseContent
:ELSE BLOCK_LEFT exprList BLOCK_RIGHT
;

returnExpression
: RETURN  (null | id | constant | functionExecute | computeExpression | array |booleanExpression | groupExpression)
;


groupExpression
:(LEFT_PARENTHESIS groupExpression RIGHT_PARENTHESIS )
|(LEFT_PARENTHESIS booleanExpression RIGHT_PARENTHESIS )
|(LEFT_PARENTHESIS assignExpression RIGHT_PARENTHESIS )
;


assignExpression
  : not_void_type? IDENTIFIER ASSIGN constant
 |not_void_type? IDENTIFIER ASSIGN booleanExpression
 |not_void_type? IDENTIFIER ASSIGN computeExpression
 |not_void_type? IDENTIFIER ASSIGN functionExecute
 |not_void_type? IDENTIFIER ASSIGN newObjectExpression
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
| (MINUS | PLUS)? (id|num)                                                                          # NumExpression
| id PLUS PLUS                                                                                      # PlusPlusExpression
;

booleanExpression
    : (id|constant|null|computeExpression) compare (id|constant|null|computeExpression)                  # CompareExpression
    | (id|constant|null) IN (array|id)                               # InExpression
    | (id|constant|null) (NOT IN | NIN) (array|id)                   # NinExpression
    | left=booleanExpression operator=AND right=booleanExpression    # AndExpression
    | left=booleanExpression operator=OR right=booleanExpression     # OrExpression
    | NOT booleanExpression                                          # NotExpression
    | BOOLEAN_VALUE                                                  # BoolValueExpression
    | like                                                           # LikeExpression
    ;

like:
| (id|stringQuoted) LIKE (id|stringQuoted)
;


array
    : LEFT_SQUARE_BRACKETS arrayContent? (COMMA arrayContent)* RIGHT_SQUARE_BRACKETS
    ;

arrayContent
: (id|constant|null|array)
;
compare
:    EQUALS | GT | GE | LT | LE | NE;


num
  : INTEGER_VALUE # IntegerConstant
  | DECIMAL_VALUE # DecimalConstant
  ;

constant
    : num                           # NumConstant
    | stringQuoted                  # TextConstant
    | BOOLEAN_VALUE                 # BooleanConstant
    | array                         # ArrayConstant
    ;

stringQuoted:QUOTED_STRING+;

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
ARRAY_TYPE: 'Array' | 'array';

BLOCK_LEFT:'{';
BLOCK_RIGHT:'}';

RETURN:'return';
IMPORT:'import';
NEW:'new';
AS:'as';
IF:'if';
ELSE:'else';
FOR:'for';
BREAK:'break';
CONTINUE:'continue';
LIKE:'like';

objectType:IDENTIFIER;
type :objectType|INT_TYPE|DOUBLE_TYPE|STRING_TYPE|BOOL_TYPE|VOID_TYPE|ARRAY_TYPE;
return_type:type;
not_void_type:objectType|INT_TYPE|DOUBLE_TYPE|STRING_TYPE|BOOL_TYPE|ARRAY_TYPE;
null:NULL;
function_parameter_type:INT_TYPE|DOUBLE_TYPE|STRING_TYPE|BOOL_TYPE|ARRAY_TYPE;
functionExecuteParameter: (id | constant | array | functionExecute)
;

importExpression
:IMPORT packagePath (AS id)?
;

packagePath
:id
|id (DOT id)*
;

newObjectExpression
: NEW packagePath LEFT_PARENTHESIS functionExecuteParameterList RIGHT_PARENTHESIS
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