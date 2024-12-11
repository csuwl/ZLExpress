// Generated from E:/IdeaProject/ZLExpress/src/ZLExpress.g4 by ANTLR 4.13.2
package com.wl.g4;

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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ZLExpressParser}.
 */
public interface ZLExpressListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ZLExpressParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(ZLExpressParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZLExpressParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(ZLExpressParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefFunctionOne}
	 * labeled alternative in {@link ZLExpressParser#defFunction}.
	 * @param ctx the parse tree
	 */
	void enterDefFunctionOne(ZLExpressParser.DefFunctionOneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefFunctionOne}
	 * labeled alternative in {@link ZLExpressParser#defFunction}.
	 * @param ctx the parse tree
	 */
	void exitDefFunctionOne(ZLExpressParser.DefFunctionOneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefFunctionTwo}
	 * labeled alternative in {@link ZLExpressParser#defFunction}.
	 * @param ctx the parse tree
	 */
	void enterDefFunctionTwo(ZLExpressParser.DefFunctionTwoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefFunctionTwo}
	 * labeled alternative in {@link ZLExpressParser#defFunction}.
	 * @param ctx the parse tree
	 */
	void exitDefFunctionTwo(ZLExpressParser.DefFunctionTwoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZLExpressParser#functionExecute}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExecute(ZLExpressParser.FunctionExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZLExpressParser#functionExecute}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExecute(ZLExpressParser.FunctionExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZLExpressParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ZLExpressParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZLExpressParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ZLExpressParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZLExpressParser#groupExpression}.
	 * @param ctx the parse tree
	 */
	void enterGroupExpression(ZLExpressParser.GroupExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZLExpressParser#groupExpression}.
	 * @param ctx the parse tree
	 */
	void exitGroupExpression(ZLExpressParser.GroupExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZLExpressParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(ZLExpressParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZLExpressParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(ZLExpressParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZLExpressParser#groupComputeExpression}.
	 * @param ctx the parse tree
	 */
	void enterGroupComputeExpression(ZLExpressParser.GroupComputeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZLExpressParser#groupComputeExpression}.
	 * @param ctx the parse tree
	 */
	void exitGroupComputeExpression(ZLExpressParser.GroupComputeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusExpression}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpression(ZLExpressParser.PlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusExpression}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpression(ZLExpressParser.PlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumExpression}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumExpression(ZLExpressParser.NumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumExpression}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumExpression(ZLExpressParser.NumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupComputeExpressionA}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 */
	void enterGroupComputeExpressionA(ZLExpressParser.GroupComputeExpressionAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupComputeExpressionA}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 */
	void exitGroupComputeExpressionA(ZLExpressParser.GroupComputeExpressionAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(ZLExpressParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(ZLExpressParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivExpression}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(ZLExpressParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivExpression}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(ZLExpressParser.DivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulExpression}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(ZLExpressParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulExpression}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(ZLExpressParser.MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NinExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterNinExpression(ZLExpressParser.NinExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NinExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitNinExpression(ZLExpressParser.NinExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(ZLExpressParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(ZLExpressParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(ZLExpressParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(ZLExpressParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(ZLExpressParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(ZLExpressParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(ZLExpressParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(ZLExpressParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(ZLExpressParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(ZLExpressParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZLExpressParser#constantArray}.
	 * @param ctx the parse tree
	 */
	void enterConstantArray(ZLExpressParser.ConstantArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZLExpressParser#constantArray}.
	 * @param ctx the parse tree
	 */
	void exitConstantArray(ZLExpressParser.ConstantArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZLExpressParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(ZLExpressParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZLExpressParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(ZLExpressParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerConstant}
	 * labeled alternative in {@link ZLExpressParser#num}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(ZLExpressParser.IntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerConstant}
	 * labeled alternative in {@link ZLExpressParser#num}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(ZLExpressParser.IntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalConstant}
	 * labeled alternative in {@link ZLExpressParser#num}.
	 * @param ctx the parse tree
	 */
	void enterDecimalConstant(ZLExpressParser.DecimalConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalConstant}
	 * labeled alternative in {@link ZLExpressParser#num}.
	 * @param ctx the parse tree
	 */
	void exitDecimalConstant(ZLExpressParser.DecimalConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumConstant}
	 * labeled alternative in {@link ZLExpressParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumConstant(ZLExpressParser.NumConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumConstant}
	 * labeled alternative in {@link ZLExpressParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumConstant(ZLExpressParser.NumConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextConstant}
	 * labeled alternative in {@link ZLExpressParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTextConstant(ZLExpressParser.TextConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextConstant}
	 * labeled alternative in {@link ZLExpressParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTextConstant(ZLExpressParser.TextConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link ZLExpressParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConstant(ZLExpressParser.BooleanConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link ZLExpressParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConstant(ZLExpressParser.BooleanConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZLExpressParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ZLExpressParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZLExpressParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ZLExpressParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZLExpressParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(ZLExpressParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZLExpressParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(ZLExpressParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZLExpressParser#function_parameter_typre}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter_typre(ZLExpressParser.Function_parameter_typreContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZLExpressParser#function_parameter_typre}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter_typre(ZLExpressParser.Function_parameter_typreContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZLExpressParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter(ZLExpressParser.Function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZLExpressParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter(ZLExpressParser.Function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZLExpressParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(ZLExpressParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZLExpressParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(ZLExpressParser.IdContext ctx);
}