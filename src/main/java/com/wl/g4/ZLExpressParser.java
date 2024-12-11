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

import com.wl.zl.impl.IScopeValue;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ZLExpressParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ASSIGN=2, NULL=3, DOT=4, COMMA=5, LEFT_SQUARE_BRACKETS=6, RIGHT_SQUARE_BRACKETS=7, 
		LEFT_PARENTHESIS=8, RIGHT_PARENTHESIS=9, EQUALS=10, MINUS=11, PLUS=12, 
		MUL=13, DIV=14, GT=15, GE=16, LT=17, LE=18, NE=19, AND=20, OR=21, IN=22, 
		NIN=23, NOT=24, BOOLEAN_VALUE=25, QUOTED_STRING=26, INTEGER_VALUE=27, 
		DECIMAL_VALUE=28, IDENTIFIER=29, WS=30;
	public static final int
		RULE_exprList = 0, RULE_expression = 1, RULE_groupExpression = 2, RULE_assignExpression = 3, 
		RULE_computeGroupExpression = 4, RULE_computeExpression = 5, RULE_booleanExpression = 6, 
		RULE_constantArray = 7, RULE_compare = 8, RULE_identifier = 9, RULE_num = 10, 
		RULE_constant = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"exprList", "expression", "groupExpression", "assignExpression", "computeGroupExpression", 
			"computeExpression", "booleanExpression", "constantArray", "compare", 
			"identifier", "num", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", null, "'.'", "','", "'['", "']'", "'('", "')'", "'=='", 
			"'-'", "'+'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ASSIGN", "NULL", "DOT", "COMMA", "LEFT_SQUARE_BRACKETS", 
			"RIGHT_SQUARE_BRACKETS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "EQUALS", 
			"MINUS", "PLUS", "MUL", "DIV", "GT", "GE", "LT", "LE", "NE", "AND", "OR", 
			"IN", "NIN", "NOT", "BOOLEAN_VALUE", "QUOTED_STRING", "INTEGER_VALUE", 
			"DECIMAL_VALUE", "IDENTIFIER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ZLExpress.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ZLExpressParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext implements IScopeValue{
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1023416576L) != 0)) {
				{
				{
				setState(24);
				expression();
				setState(25);
				match(T__0);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext implements IScopeValue {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public ComputeExpressionContext computeExpression() {
			return getRuleContext(ComputeExpressionContext.class,0);
		}
		public GroupExpressionContext groupExpression() {
			return getRuleContext(GroupExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				booleanExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				assignExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				computeExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				groupExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupExpressionContext extends ParserRuleContext implements IScopeValue {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(ZLExpressParser.LEFT_PARENTHESIS, 0); }
		public ComputeExpressionContext computeExpression() {
			return getRuleContext(ComputeExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(ZLExpressParser.RIGHT_PARENTHESIS, 0); }
		public ComputeGroupExpressionContext computeGroupExpression() {
			return getRuleContext(ComputeGroupExpressionContext.class,0);
		}
		public GroupExpressionContext groupExpression() {
			return getRuleContext(GroupExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public GroupExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterGroupExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitGroupExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitGroupExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupExpressionContext groupExpression() throws RecognitionException {
		GroupExpressionContext _localctx = new GroupExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_groupExpression);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(38);
				match(LEFT_PARENTHESIS);
				setState(39);
				computeExpression();
				setState(40);
				match(RIGHT_PARENTHESIS);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(42);
				match(LEFT_PARENTHESIS);
				setState(43);
				computeGroupExpression();
				setState(44);
				match(RIGHT_PARENTHESIS);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(46);
				match(LEFT_PARENTHESIS);
				setState(47);
				groupExpression();
				setState(48);
				match(RIGHT_PARENTHESIS);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(50);
				match(LEFT_PARENTHESIS);
				setState(51);
				booleanExpression(0);
				setState(52);
				match(RIGHT_PARENTHESIS);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(54);
				match(LEFT_PARENTHESIS);
				setState(55);
				assignExpression();
				setState(56);
				match(RIGHT_PARENTHESIS);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignExpressionContext extends ParserRuleContext implements IScopeValue{
		public TerminalNode IDENTIFIER() { return getToken(ZLExpressParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ZLExpressParser.ASSIGN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ComputeExpressionContext computeExpression() {
			return getRuleContext(ComputeExpressionContext.class,0);
		}
		public ComputeGroupExpressionContext computeGroupExpression() {
			return getRuleContext(ComputeGroupExpressionContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignExpression);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(IDENTIFIER);
				setState(61);
				match(ASSIGN);
				setState(62);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(IDENTIFIER);
				setState(64);
				match(ASSIGN);
				setState(65);
				booleanExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(IDENTIFIER);
				setState(67);
				match(ASSIGN);
				setState(68);
				computeExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				match(IDENTIFIER);
				setState(70);
				match(ASSIGN);
				setState(71);
				computeGroupExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComputeGroupExpressionContext extends ParserRuleContext implements IScopeValue {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(ZLExpressParser.LEFT_PARENTHESIS, 0); }
		public ComputeExpressionContext computeExpression() {
			return getRuleContext(ComputeExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(ZLExpressParser.RIGHT_PARENTHESIS, 0); }
		public List<ComputeGroupExpressionContext> computeGroupExpression() {
			return getRuleContexts(ComputeGroupExpressionContext.class);
		}
		public ComputeGroupExpressionContext computeGroupExpression(int i) {
			return getRuleContext(ComputeGroupExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ZLExpressParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ZLExpressParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(ZLExpressParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ZLExpressParser.DIV, 0); }
		public ComputeGroupExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computeGroupExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterComputeGroupExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitComputeGroupExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitComputeGroupExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputeGroupExpressionContext computeGroupExpression() throws RecognitionException {
		ComputeGroupExpressionContext _localctx = new ComputeGroupExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_computeGroupExpression);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(74);
				match(LEFT_PARENTHESIS);
				setState(75);
				computeExpression();
				setState(76);
				match(RIGHT_PARENTHESIS);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(78);
				match(LEFT_PARENTHESIS);
				setState(79);
				computeGroupExpression();
				setState(80);
				match(PLUS);
				setState(81);
				computeGroupExpression();
				setState(82);
				match(RIGHT_PARENTHESIS);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(84);
				match(LEFT_PARENTHESIS);
				setState(85);
				computeGroupExpression();
				setState(86);
				match(MINUS);
				setState(87);
				computeGroupExpression();
				setState(88);
				match(RIGHT_PARENTHESIS);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(90);
				match(LEFT_PARENTHESIS);
				setState(91);
				computeGroupExpression();
				setState(92);
				match(MUL);
				setState(93);
				computeGroupExpression();
				setState(94);
				match(RIGHT_PARENTHESIS);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(96);
				match(LEFT_PARENTHESIS);
				setState(97);
				computeGroupExpression();
				setState(98);
				match(DIV);
				setState(99);
				computeGroupExpression();
				setState(100);
				match(RIGHT_PARENTHESIS);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(102);
				match(LEFT_PARENTHESIS);
				setState(103);
				computeGroupExpression();
				setState(104);
				match(RIGHT_PARENTHESIS);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComputeExpressionContext extends ParserRuleContext implements IScopeValue{
		public ComputeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computeExpression; }
	 
		public ComputeExpressionContext() { }
		public void copyFrom(ComputeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusExpressionContext extends ComputeExpressionContext implements IScopeValue{
		public List<TerminalNode> PLUS() { return getTokens(ZLExpressParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ZLExpressParser.PLUS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ZLExpressParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ZLExpressParser.IDENTIFIER, i);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public List<ComputeGroupExpressionContext> computeGroupExpression() {
			return getRuleContexts(ComputeGroupExpressionContext.class);
		}
		public ComputeGroupExpressionContext computeGroupExpression(int i) {
			return getRuleContext(ComputeGroupExpressionContext.class,i);
		}
		public PlusExpressionContext(ComputeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumExpressionContext extends ComputeExpressionContext implements IScopeValue {
		public TerminalNode IDENTIFIER() { return getToken(ZLExpressParser.IDENTIFIER, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ZLExpressParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(ZLExpressParser.PLUS, 0); }
		public NumExpressionContext(ComputeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterNumExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitNumExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitNumExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusExpressionContext extends ComputeExpressionContext implements IScopeValue {
		public List<TerminalNode> MINUS() { return getTokens(ZLExpressParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ZLExpressParser.MINUS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ZLExpressParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ZLExpressParser.IDENTIFIER, i);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public List<ComputeGroupExpressionContext> computeGroupExpression() {
			return getRuleContexts(ComputeGroupExpressionContext.class);
		}
		public ComputeGroupExpressionContext computeGroupExpression(int i) {
			return getRuleContext(ComputeGroupExpressionContext.class,i);
		}
		public MinusExpressionContext(ComputeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivExpressionContext extends ComputeExpressionContext implements IScopeValue {
		public List<TerminalNode> DIV() { return getTokens(ZLExpressParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ZLExpressParser.DIV, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ZLExpressParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ZLExpressParser.IDENTIFIER, i);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public List<ComputeGroupExpressionContext> computeGroupExpression() {
			return getRuleContexts(ComputeGroupExpressionContext.class);
		}
		public ComputeGroupExpressionContext computeGroupExpression(int i) {
			return getRuleContext(ComputeGroupExpressionContext.class,i);
		}
		public DivExpressionContext(ComputeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulExpressionContext extends ComputeExpressionContext implements IScopeValue {
		public List<TerminalNode> MUL() { return getTokens(ZLExpressParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ZLExpressParser.MUL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ZLExpressParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ZLExpressParser.IDENTIFIER, i);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public List<ComputeGroupExpressionContext> computeGroupExpression() {
			return getRuleContexts(ComputeGroupExpressionContext.class);
		}
		public ComputeGroupExpressionContext computeGroupExpression(int i) {
			return getRuleContext(ComputeGroupExpressionContext.class,i);
		}
		public MulExpressionContext(ComputeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitMulExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputeExpressionContext computeExpression() throws RecognitionException  {
		ComputeExpressionContext _localctx = new ComputeExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_computeExpression);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new PlusExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(108);
					match(IDENTIFIER);
					}
					break;
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(109);
					num();
					}
					break;
				case LEFT_PARENTHESIS:
					{
					setState(110);
					computeGroupExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(113);
				match(PLUS);
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(114);
					match(IDENTIFIER);
					}
					break;
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(115);
					num();
					}
					break;
				case LEFT_PARENTHESIS:
					{
					setState(116);
					computeGroupExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(119);
					match(PLUS);
					setState(123);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(120);
						match(IDENTIFIER);
						}
						break;
					case INTEGER_VALUE:
					case DECIMAL_VALUE:
						{
						setState(121);
						num();
						}
						break;
					case LEFT_PARENTHESIS:
						{
						setState(122);
						computeGroupExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new MinusExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(130);
					match(IDENTIFIER);
					}
					break;
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(131);
					num();
					}
					break;
				case LEFT_PARENTHESIS:
					{
					setState(132);
					computeGroupExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135);
				match(MINUS);
				setState(139);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(136);
					match(IDENTIFIER);
					}
					break;
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(137);
					num();
					}
					break;
				case LEFT_PARENTHESIS:
					{
					setState(138);
					computeGroupExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(141);
					match(MINUS);
					setState(145);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(142);
						match(IDENTIFIER);
						}
						break;
					case INTEGER_VALUE:
					case DECIMAL_VALUE:
						{
						setState(143);
						num();
						}
						break;
					case LEFT_PARENTHESIS:
						{
						setState(144);
						computeGroupExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new MulExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(152);
					match(IDENTIFIER);
					}
					break;
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(153);
					num();
					}
					break;
				case LEFT_PARENTHESIS:
					{
					setState(154);
					computeGroupExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(157);
				match(MUL);
				setState(161);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(158);
					match(IDENTIFIER);
					}
					break;
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(159);
					num();
					}
					break;
				case LEFT_PARENTHESIS:
					{
					setState(160);
					computeGroupExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MUL) {
					{
					{
					setState(163);
					match(MUL);
					setState(167);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(164);
						match(IDENTIFIER);
						}
						break;
					case INTEGER_VALUE:
					case DECIMAL_VALUE:
						{
						setState(165);
						num();
						}
						break;
					case LEFT_PARENTHESIS:
						{
						setState(166);
						computeGroupExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				_localctx = new DivExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(174);
					match(IDENTIFIER);
					}
					break;
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(175);
					num();
					}
					break;
				case LEFT_PARENTHESIS:
					{
					setState(176);
					computeGroupExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(179);
				match(DIV);
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(180);
					match(IDENTIFIER);
					}
					break;
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(181);
					num();
					}
					break;
				case LEFT_PARENTHESIS:
					{
					setState(182);
					computeGroupExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV) {
					{
					{
					setState(185);
					match(DIV);
					setState(189);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(186);
						match(IDENTIFIER);
						}
						break;
					case INTEGER_VALUE:
					case DECIMAL_VALUE:
						{
						setState(187);
						num();
						}
						break;
					case LEFT_PARENTHESIS:
						{
						setState(188);
						computeGroupExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new NumExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(196);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(201);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(199);
					match(IDENTIFIER);
					}
					break;
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(200);
					num();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ParserRuleContext implements IScopeValue {
		public Map<Object,Object> context;
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
			this.context = ctx.context;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NinExpressionContext extends BooleanExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantArrayContext constantArray() {
			return getRuleContext(ConstantArrayContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ZLExpressParser.NOT, 0); }
		public TerminalNode IN() { return getToken(ZLExpressParser.IN, 0); }
		public TerminalNode NIN() { return getToken(ZLExpressParser.NIN, 0); }
		public NinExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterNinExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitNinExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitNinExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends BooleanExpressionContext implements IScopeValue {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ZLExpressParser.AND, 0); }
		public AndExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InExpressionContext extends BooleanExpressionContext implements IScopeValue {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(ZLExpressParser.IN, 0); }
		public ConstantArrayContext constantArray() {
			return getRuleContext(ConstantArrayContext.class,0);
		}
		public InExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends BooleanExpressionContext implements IScopeValue {
		public TerminalNode NOT() { return getToken(ZLExpressParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareExpressionContext extends BooleanExpressionContext implements IScopeValue{
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public CompareExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExpressionContext extends BooleanExpressionContext implements IScopeValue {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(ZLExpressParser.OR, 0); }
		public OrExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new CompareExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(206);
				identifier();
				setState(207);
				compare();
				setState(208);
				constant();
				}
				break;
			case 2:
				{
				_localctx = new InExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				identifier();
				setState(211);
				match(IN);
				setState(212);
				constantArray();
				}
				break;
			case 3:
				{
				_localctx = new NinExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				identifier();
				setState(218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(215);
					match(NOT);
					setState(216);
					match(IN);
					}
					break;
				case NIN:
					{
					setState(217);
					match(NIN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(220);
				constantArray();
				}
				break;
			case 4:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(NOT);
				setState(223);
				booleanExpression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new AndExpressionContext(new BooleanExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(226);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(227);
						((AndExpressionContext)_localctx).operator = match(AND);
						setState(228);
						((AndExpressionContext)_localctx).right = booleanExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new OrExpressionContext(new BooleanExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(229);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(230);
						((OrExpressionContext)_localctx).operator = match(OR);
						setState(231);
						((OrExpressionContext)_localctx).right = booleanExpression(3);
						}
						break;
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantArrayContext extends ParserRuleContext implements IScopeValue{
		public Map<Object,Object> context;
		public TerminalNode LEFT_SQUARE_BRACKETS() { return getToken(ZLExpressParser.LEFT_SQUARE_BRACKETS, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode RIGHT_SQUARE_BRACKETS() { return getToken(ZLExpressParser.RIGHT_SQUARE_BRACKETS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ZLExpressParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ZLExpressParser.COMMA, i);
		}
		public ConstantArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterConstantArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitConstantArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitConstantArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantArrayContext constantArray() throws RecognitionException {
		ConstantArrayContext _localctx = new ConstantArrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constantArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(LEFT_SQUARE_BRACKETS);
			setState(238);
			constant();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(239);
				match(COMMA);
				setState(240);
				constant();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(RIGHT_SQUARE_BRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompareContext extends ParserRuleContext implements IScopeValue {
		public Map<Object,Object> context;
		public TerminalNode EQUALS() { return getToken(ZLExpressParser.EQUALS, 0); }
		public TerminalNode GT() { return getToken(ZLExpressParser.GT, 0); }
		public TerminalNode GE() { return getToken(ZLExpressParser.GE, 0); }
		public TerminalNode LT() { return getToken(ZLExpressParser.LT, 0); }
		public TerminalNode LE() { return getToken(ZLExpressParser.LE, 0); }
		public TerminalNode NE() { return getToken(ZLExpressParser.NE, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1016832L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext implements IScopeValue{
		public Map<Object,Object> context;
		public List<TerminalNode> IDENTIFIER() { return getTokens(ZLExpressParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ZLExpressParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(ZLExpressParser.DOT, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(ZLExpressParser.QUOTED_STRING, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(IDENTIFIER);
				setState(251);
				match(DOT);
				setState(252);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(QUOTED_STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext implements IScopeValue {
		public Map<Object,Object> context;
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
	 
		public NumContext() { }
		public void copyFrom(NumContext ctx) {
			super.copyFrom(ctx);
			this.context = ctx.context;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalConstantContext extends NumContext implements IScopeValue {
		public TerminalNode DECIMAL_VALUE() { return getToken(ZLExpressParser.DECIMAL_VALUE, 0); }
		public DecimalConstantContext(NumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterDecimalConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitDecimalConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitDecimalConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerConstantContext extends NumContext implements IScopeValue {
		public TerminalNode INTEGER_VALUE() { return getToken(ZLExpressParser.INTEGER_VALUE, 0); }
		public IntegerConstantContext(NumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitIntegerConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_num);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				_localctx = new IntegerConstantContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				_localctx = new DecimalConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(DECIMAL_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext implements IScopeValue {
		public Map<Object,Object> context;
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
			this.context = ctx.context;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextConstantContext extends ConstantContext {
		public List<TerminalNode> QUOTED_STRING() { return getTokens(ZLExpressParser.QUOTED_STRING); }
		public TerminalNode QUOTED_STRING(int i) {
			return getToken(ZLExpressParser.QUOTED_STRING, i);
		}
		public TextConstantContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterTextConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitTextConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitTextConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanConstantContext extends ConstantContext {
		public TerminalNode BOOLEAN_VALUE() { return getToken(ZLExpressParser.BOOLEAN_VALUE, 0); }
		public BooleanConstantContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterBooleanConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitBooleanConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumConstantContext extends ConstantContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public NumConstantContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterNumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitNumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitNumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constant);
		try {
			int _alt;
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				_localctx = new NumConstantContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				num();
				}
				break;
			case QUOTED_STRING:
				_localctx = new TextConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(262);
						match(QUOTED_STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(265); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case BOOLEAN_VALUE:
				_localctx = new BooleanConstantContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(BOOLEAN_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u010f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000"+
		"\f\u0000\u001f\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002;\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003I\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004k\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005p\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005v\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005|\b\u0005\u0005\u0005"+
		"~\b\u0005\n\u0005\f\u0005\u0081\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0086\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u008c\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0092\b\u0005\u0005\u0005\u0094\b\u0005\n\u0005\f\u0005"+
		"\u0097\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u009c\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a2"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a8"+
		"\b\u0005\u0005\u0005\u00aa\b\u0005\n\u0005\f\u0005\u00ad\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b2\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b8\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00be\b\u0005\u0005\u0005\u00c0"+
		"\b\u0005\n\u0005\f\u0005\u00c3\t\u0005\u0001\u0005\u0003\u0005\u00c6\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ca\b\u0005\u0003\u0005\u00cc"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00db\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00e1\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00e9\b\u0006\n"+
		"\u0006\f\u0006\u00ec\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00f2\b\u0007\n\u0007\f\u0007\u00f5\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0100\b\t\u0001\n\u0001\n\u0003\n\u0104\b\n\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u0108\b\u000b\u000b\u000b\f\u000b\u0109\u0001\u000b\u0003"+
		"\u000b\u010d\b\u000b\u0001\u000b\u0000\u0001\f\f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0002\u0001\u0000\u000b\f\u0002"+
		"\u0000\n\n\u000f\u0013\u0141\u0000\u001d\u0001\u0000\u0000\u0000\u0002"+
		"$\u0001\u0000\u0000\u0000\u0004:\u0001\u0000\u0000\u0000\u0006H\u0001"+
		"\u0000\u0000\u0000\bj\u0001\u0000\u0000\u0000\n\u00cb\u0001\u0000\u0000"+
		"\u0000\f\u00e0\u0001\u0000\u0000\u0000\u000e\u00ed\u0001\u0000\u0000\u0000"+
		"\u0010\u00f8\u0001\u0000\u0000\u0000\u0012\u00ff\u0001\u0000\u0000\u0000"+
		"\u0014\u0103\u0001\u0000\u0000\u0000\u0016\u010c\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0003\u0002\u0001\u0000\u0019\u001a\u0005\u0001\u0000\u0000"+
		"\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0018\u0001\u0000\u0000\u0000"+
		"\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0001\u0001\u0000\u0000\u0000"+
		"\u001f\u001d\u0001\u0000\u0000\u0000 %\u0003\f\u0006\u0000!%\u0003\u0006"+
		"\u0003\u0000\"%\u0003\n\u0005\u0000#%\u0003\u0004\u0002\u0000$ \u0001"+
		"\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000"+
		"$#\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&\'\u0005\b\u0000"+
		"\u0000\'(\u0003\n\u0005\u0000()\u0005\t\u0000\u0000);\u0001\u0000\u0000"+
		"\u0000*+\u0005\b\u0000\u0000+,\u0003\b\u0004\u0000,-\u0005\t\u0000\u0000"+
		"-;\u0001\u0000\u0000\u0000./\u0005\b\u0000\u0000/0\u0003\u0004\u0002\u0000"+
		"01\u0005\t\u0000\u00001;\u0001\u0000\u0000\u000023\u0005\b\u0000\u0000"+
		"34\u0003\f\u0006\u000045\u0005\t\u0000\u00005;\u0001\u0000\u0000\u0000"+
		"67\u0005\b\u0000\u000078\u0003\u0006\u0003\u000089\u0005\t\u0000\u0000"+
		"9;\u0001\u0000\u0000\u0000:&\u0001\u0000\u0000\u0000:*\u0001\u0000\u0000"+
		"\u0000:.\u0001\u0000\u0000\u0000:2\u0001\u0000\u0000\u0000:6\u0001\u0000"+
		"\u0000\u0000;\u0005\u0001\u0000\u0000\u0000<=\u0005\u001d\u0000\u0000"+
		"=>\u0005\u0002\u0000\u0000>I\u0003\u0016\u000b\u0000?@\u0005\u001d\u0000"+
		"\u0000@A\u0005\u0002\u0000\u0000AI\u0003\f\u0006\u0000BC\u0005\u001d\u0000"+
		"\u0000CD\u0005\u0002\u0000\u0000DI\u0003\n\u0005\u0000EF\u0005\u001d\u0000"+
		"\u0000FG\u0005\u0002\u0000\u0000GI\u0003\b\u0004\u0000H<\u0001\u0000\u0000"+
		"\u0000H?\u0001\u0000\u0000\u0000HB\u0001\u0000\u0000\u0000HE\u0001\u0000"+
		"\u0000\u0000I\u0007\u0001\u0000\u0000\u0000JK\u0005\b\u0000\u0000KL\u0003"+
		"\n\u0005\u0000LM\u0005\t\u0000\u0000Mk\u0001\u0000\u0000\u0000NO\u0005"+
		"\b\u0000\u0000OP\u0003\b\u0004\u0000PQ\u0005\f\u0000\u0000QR\u0003\b\u0004"+
		"\u0000RS\u0005\t\u0000\u0000Sk\u0001\u0000\u0000\u0000TU\u0005\b\u0000"+
		"\u0000UV\u0003\b\u0004\u0000VW\u0005\u000b\u0000\u0000WX\u0003\b\u0004"+
		"\u0000XY\u0005\t\u0000\u0000Yk\u0001\u0000\u0000\u0000Z[\u0005\b\u0000"+
		"\u0000[\\\u0003\b\u0004\u0000\\]\u0005\r\u0000\u0000]^\u0003\b\u0004\u0000"+
		"^_\u0005\t\u0000\u0000_k\u0001\u0000\u0000\u0000`a\u0005\b\u0000\u0000"+
		"ab\u0003\b\u0004\u0000bc\u0005\u000e\u0000\u0000cd\u0003\b\u0004\u0000"+
		"de\u0005\t\u0000\u0000ek\u0001\u0000\u0000\u0000fg\u0005\b\u0000\u0000"+
		"gh\u0003\b\u0004\u0000hi\u0005\t\u0000\u0000ik\u0001\u0000\u0000\u0000"+
		"jJ\u0001\u0000\u0000\u0000jN\u0001\u0000\u0000\u0000jT\u0001\u0000\u0000"+
		"\u0000jZ\u0001\u0000\u0000\u0000j`\u0001\u0000\u0000\u0000jf\u0001\u0000"+
		"\u0000\u0000k\t\u0001\u0000\u0000\u0000lp\u0005\u001d\u0000\u0000mp\u0003"+
		"\u0014\n\u0000np\u0003\b\u0004\u0000ol\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qu\u0005\f\u0000\u0000rv\u0005\u001d\u0000\u0000sv\u0003\u0014\n\u0000"+
		"tv\u0003\b\u0004\u0000ur\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"ut\u0001\u0000\u0000\u0000v\u007f\u0001\u0000\u0000\u0000w{\u0005\f\u0000"+
		"\u0000x|\u0005\u001d\u0000\u0000y|\u0003\u0014\n\u0000z|\u0003\b\u0004"+
		"\u0000{x\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000"+
		"\u0000\u0000|~\u0001\u0000\u0000\u0000}w\u0001\u0000\u0000\u0000~\u0081"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080\u00cc\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0086\u0005\u001d\u0000\u0000\u0083\u0086\u0003"+
		"\u0014\n\u0000\u0084\u0086\u0003\b\u0004\u0000\u0085\u0082\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u008b\u0005\u000b"+
		"\u0000\u0000\u0088\u008c\u0005\u001d\u0000\u0000\u0089\u008c\u0003\u0014"+
		"\n\u0000\u008a\u008c\u0003\b\u0004\u0000\u008b\u0088\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u0095\u0001\u0000\u0000\u0000\u008d\u0091\u0005\u000b\u0000"+
		"\u0000\u008e\u0092\u0005\u001d\u0000\u0000\u008f\u0092\u0003\u0014\n\u0000"+
		"\u0090\u0092\u0003\b\u0004\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0094\u0001\u0000\u0000\u0000\u0093\u008d\u0001\u0000\u0000\u0000\u0094"+
		"\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u00cc\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0098\u009c\u0005\u001d\u0000\u0000\u0099"+
		"\u009c\u0003\u0014\n\u0000\u009a\u009c\u0003\b\u0004\u0000\u009b\u0098"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u00a1"+
		"\u0005\r\u0000\u0000\u009e\u00a2\u0005\u001d\u0000\u0000\u009f\u00a2\u0003"+
		"\u0014\n\u0000\u00a0\u00a2\u0003\b\u0004\u0000\u00a1\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00ab\u0001\u0000\u0000\u0000\u00a3\u00a7\u0005\r\u0000"+
		"\u0000\u00a4\u00a8\u0005\u001d\u0000\u0000\u00a5\u00a8\u0003\u0014\n\u0000"+
		"\u00a6\u00a8\u0003\b\u0004\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u00cc\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b2\u0005\u001d\u0000\u0000\u00af"+
		"\u00b2\u0003\u0014\n\u0000\u00b0\u00b2\u0003\b\u0004\u0000\u00b1\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b7"+
		"\u0005\u000e\u0000\u0000\u00b4\u00b8\u0005\u001d\u0000\u0000\u00b5\u00b8"+
		"\u0003\u0014\n\u0000\u00b6\u00b8\u0003\b\u0004\u0000\u00b7\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00c1\u0001\u0000\u0000\u0000\u00b9\u00bd\u0005"+
		"\u000e\u0000\u0000\u00ba\u00be\u0005\u001d\u0000\u0000\u00bb\u00be\u0003"+
		"\u0014\n\u0000\u00bc\u00be\u0003\b\u0004\u0000\u00bd\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00b9\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00cc\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c6\u0007\u0000"+
		"\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00ca\u0005\u001d"+
		"\u0000\u0000\u00c8\u00ca\u0003\u0014\n\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cbo\u0001\u0000\u0000\u0000\u00cb\u0085\u0001\u0000\u0000\u0000"+
		"\u00cb\u009b\u0001\u0000\u0000\u0000\u00cb\u00b1\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c5\u0001\u0000\u0000\u0000\u00cc\u000b\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0006\u0006\uffff\uffff\u0000\u00ce\u00cf\u0003\u0012\t\u0000"+
		"\u00cf\u00d0\u0003\u0010\b\u0000\u00d0\u00d1\u0003\u0016\u000b\u0000\u00d1"+
		"\u00e1\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003\u0012\t\u0000\u00d3\u00d4"+
		"\u0005\u0016\u0000\u0000\u00d4\u00d5\u0003\u000e\u0007\u0000\u00d5\u00e1"+
		"\u0001\u0000\u0000\u0000\u00d6\u00da\u0003\u0012\t\u0000\u00d7\u00d8\u0005"+
		"\u0018\u0000\u0000\u00d8\u00db\u0005\u0016\u0000\u0000\u00d9\u00db\u0005"+
		"\u0017\u0000\u0000\u00da\u00d7\u0001\u0000\u0000\u0000\u00da\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003"+
		"\u000e\u0007\u0000\u00dd\u00e1\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"\u0018\u0000\u0000\u00df\u00e1\u0003\f\u0006\u0001\u00e0\u00cd\u0001\u0000"+
		"\u0000\u0000\u00e0\u00d2\u0001\u0000\u0000\u0000\u00e0\u00d6\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00ea\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\n\u0003\u0000\u0000\u00e3\u00e4\u0005\u0014\u0000"+
		"\u0000\u00e4\u00e9\u0003\f\u0006\u0004\u00e5\u00e6\n\u0002\u0000\u0000"+
		"\u00e6\u00e7\u0005\u0015\u0000\u0000\u00e7\u00e9\u0003\f\u0006\u0003\u00e8"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\r\u0001\u0000\u0000\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0006\u0000\u0000\u00ee\u00f3"+
		"\u0003\u0016\u000b\u0000\u00ef\u00f0\u0005\u0005\u0000\u0000\u00f0\u00f2"+
		"\u0003\u0016\u000b\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0007\u0000\u0000\u00f7\u000f"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0007\u0001\u0000\u0000\u00f9\u0011"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u001d\u0000\u0000\u00fb\u00fc"+
		"\u0005\u0004\u0000\u0000\u00fc\u0100\u0005\u001d\u0000\u0000\u00fd\u0100"+
		"\u0005\u001d\u0000\u0000\u00fe\u0100\u0005\u001a\u0000\u0000\u00ff\u00fa"+
		"\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u0013\u0001\u0000\u0000\u0000\u0101\u0104"+
		"\u0005\u001b\u0000\u0000\u0102\u0104\u0005\u001c\u0000\u0000\u0103\u0101"+
		"\u0001\u0000\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0015"+
		"\u0001\u0000\u0000\u0000\u0105\u010d\u0003\u0014\n\u0000\u0106\u0108\u0005"+
		"\u001a\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001"+
		"\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u010d\u0005"+
		"\u0019\u0000\u0000\u010c\u0105\u0001\u0000\u0000\u0000\u010c\u0107\u0001"+
		"\u0000\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0017\u0001"+
		"\u0000\u0000\u0000!\u001d$:Hjou{\u007f\u0085\u008b\u0091\u0095\u009b\u00a1"+
		"\u00a7\u00ab\u00b1\u00b7\u00bd\u00c1\u00c5\u00c9\u00cb\u00da\u00e0\u00e8"+
		"\u00ea\u00f3\u00ff\u0103\u0109\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}