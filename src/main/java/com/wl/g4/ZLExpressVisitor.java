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

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ZLExpressParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ZLExpressVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ZLExpressParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(ZLExpressParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZLExpressParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ZLExpressParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZLExpressParser#groupExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupExpression(ZLExpressParser.GroupExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZLExpressParser#assignExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(ZLExpressParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZLExpressParser#computeGroupExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputeGroupExpression(ZLExpressParser.ComputeGroupExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusExpression}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpression(ZLExpressParser.PlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpression(ZLExpressParser.MinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulExpression}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(ZLExpressParser.MulExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivExpression}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(ZLExpressParser.DivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumExpression}
	 * labeled alternative in {@link ZLExpressParser#computeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpression(ZLExpressParser.NumExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NinExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNinExpression(ZLExpressParser.NinExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(ZLExpressParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(ZLExpressParser.InExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(ZLExpressParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(ZLExpressParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link ZLExpressParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(ZLExpressParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZLExpressParser#constantArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantArray(ZLExpressParser.ConstantArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZLExpressParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(ZLExpressParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZLExpressParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ZLExpressParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerConstant}
	 * labeled alternative in {@link ZLExpressParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstant(ZLExpressParser.IntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecimalConstant}
	 * labeled alternative in {@link ZLExpressParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalConstant(ZLExpressParser.DecimalConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumConstant}
	 * labeled alternative in {@link ZLExpressParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumConstant(ZLExpressParser.NumConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextConstant}
	 * labeled alternative in {@link ZLExpressParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextConstant(ZLExpressParser.TextConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link ZLExpressParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConstant(ZLExpressParser.BooleanConstantContext ctx);
}