// Generated from E:/IdeaProject/ZLExpress/src/ZLExpress.g4 by ANTLR 4.13.2
package com.wl.zl;

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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

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
		RULE_expression = 0, RULE_assignExpression = 1, RULE_computeExpression = 2, 
		RULE_booleanExpression = 3, RULE_constantArray = 4, RULE_compare = 5, 
		RULE_identifier = 6, RULE_constant = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "assignExpression", "computeExpression", "booleanExpression", 
			"constantArray", "compare", "identifier", "constant"
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public List<AssignExpressionContext> assignExpression() {
			return getRuleContexts(AssignExpressionContext.class);
		}
		public AssignExpressionContext assignExpression(int i) {
			return getRuleContext(AssignExpressionContext.class,i);
		}
		public List<ComputeExpressionContext> computeExpression() {
			return getRuleContexts(ComputeExpressionContext.class);
		}
		public ComputeExpressionContext computeExpression(int i) {
			return getRuleContext(ComputeExpressionContext.class,i);
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
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 620757248L) != 0)) {
					{
					{
					setState(16);
					booleanExpression(0);
					setState(17);
					match(T__0);
					}
					}
					setState(23);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(24);
					assignExpression();
					setState(25);
					match(T__0);
					}
					}
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1040193536L) != 0)) {
					{
					{
					setState(32);
					computeExpression();
					setState(33);
					match(T__0);
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class AssignExpressionContext extends ParserRuleContext {
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
	 
		public AssignExpressionContext() { }
		public void copyFrom(AssignExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssigExpressionContext extends AssignExpressionContext {
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
		public AssigExpressionContext(AssignExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).enterAssigExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZLExpressListener ) ((ZLExpressListener)listener).exitAssigExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZLExpressVisitor ) return ((ZLExpressVisitor<? extends T>)visitor).visitAssigExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignExpression);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AssigExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(IDENTIFIER);
				setState(43);
				match(ASSIGN);
				setState(44);
				constant();
				}
				break;
			case 2:
				_localctx = new AssigExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(IDENTIFIER);
				setState(46);
				match(ASSIGN);
				setState(47);
				booleanExpression(0);
				}
				break;
			case 3:
				_localctx = new AssigExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(IDENTIFIER);
				setState(49);
				match(ASSIGN);
				setState(50);
				computeExpression();
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
	public static class ComputeExpressionContext extends ParserRuleContext {
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
	public static class PlusExpressionContext extends ComputeExpressionContext {
		public TerminalNode PLUS() { return getToken(ZLExpressParser.PLUS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ZLExpressParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ZLExpressParser.IDENTIFIER, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
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
	public static class MinusExpressionContext extends ComputeExpressionContext {
		public TerminalNode MINUS() { return getToken(ZLExpressParser.MINUS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ZLExpressParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ZLExpressParser.IDENTIFIER, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
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
	public static class DivExpressionContext extends ComputeExpressionContext {
		public TerminalNode DIV() { return getToken(ZLExpressParser.DIV, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ZLExpressParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ZLExpressParser.IDENTIFIER, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
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
	public static class MulExpressionContext extends ComputeExpressionContext {
		public TerminalNode MUL() { return getToken(ZLExpressParser.MUL, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ZLExpressParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ZLExpressParser.IDENTIFIER, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
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

	public final ComputeExpressionContext computeExpression() throws RecognitionException {
		ComputeExpressionContext _localctx = new ComputeExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_computeExpression);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new PlusExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(53);
					match(IDENTIFIER);
					}
					break;
				case MINUS:
				case PLUS:
				case BOOLEAN_VALUE:
				case QUOTED_STRING:
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(54);
					constant();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(57);
				match(PLUS);
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(58);
					match(IDENTIFIER);
					}
					break;
				case MINUS:
				case PLUS:
				case BOOLEAN_VALUE:
				case QUOTED_STRING:
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(59);
					constant();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new MinusExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(62);
					match(IDENTIFIER);
					}
					break;
				case MINUS:
				case PLUS:
				case BOOLEAN_VALUE:
				case QUOTED_STRING:
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(63);
					constant();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(66);
				match(MINUS);
				setState(69);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(67);
					match(IDENTIFIER);
					}
					break;
				case MINUS:
				case PLUS:
				case BOOLEAN_VALUE:
				case QUOTED_STRING:
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(68);
					constant();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				_localctx = new MulExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(71);
					match(IDENTIFIER);
					}
					break;
				case MINUS:
				case PLUS:
				case BOOLEAN_VALUE:
				case QUOTED_STRING:
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(72);
					constant();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75);
				match(MUL);
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(76);
					match(IDENTIFIER);
					}
					break;
				case MINUS:
				case PLUS:
				case BOOLEAN_VALUE:
				case QUOTED_STRING:
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(77);
					constant();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new DivExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(80);
					match(IDENTIFIER);
					}
					break;
				case MINUS:
				case PLUS:
				case BOOLEAN_VALUE:
				case QUOTED_STRING:
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(81);
					constant();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84);
				match(DIV);
				setState(87);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(85);
					match(IDENTIFIER);
					}
					break;
				case MINUS:
				case PLUS:
				case BOOLEAN_VALUE:
				case QUOTED_STRING:
				case INTEGER_VALUE:
				case DECIMAL_VALUE:
					{
					setState(86);
					constant();
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
	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
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
	public static class AndExpressionContext extends BooleanExpressionContext {
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
	public static class InExpressionContext extends BooleanExpressionContext {
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
	public static class NotExpressionContext extends BooleanExpressionContext {
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
	public static class CompareExpressionContext extends BooleanExpressionContext {
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
	public static class OrExpressionContext extends BooleanExpressionContext {
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
	@SuppressWarnings("CheckReturnValue")
	public static class GroupExpressionContext extends BooleanExpressionContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(ZLExpressParser.LEFT_PARENTHESIS, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(ZLExpressParser.RIGHT_PARENTHESIS, 0); }
		public GroupExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
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

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new CompareExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(92);
				identifier();
				setState(93);
				compare();
				setState(94);
				constant();
				}
				break;
			case 2:
				{
				_localctx = new InExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				identifier();
				setState(97);
				match(IN);
				setState(98);
				constantArray();
				}
				break;
			case 3:
				{
				_localctx = new NinExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				identifier();
				setState(104);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(101);
					match(NOT);
					setState(102);
					match(IN);
					}
					break;
				case NIN:
					{
					setState(103);
					match(NIN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(106);
				constantArray();
				}
				break;
			case 4:
				{
				_localctx = new GroupExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(LEFT_PARENTHESIS);
				setState(109);
				booleanExpression(0);
				setState(110);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 5:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(NOT);
				setState(113);
				booleanExpression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new AndExpressionContext(new BooleanExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(116);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(117);
						((AndExpressionContext)_localctx).operator = match(AND);
						setState(118);
						((AndExpressionContext)_localctx).right = booleanExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new OrExpressionContext(new BooleanExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120);
						((OrExpressionContext)_localctx).operator = match(OR);
						setState(121);
						((OrExpressionContext)_localctx).right = booleanExpression(4);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class ConstantArrayContext extends ParserRuleContext {
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
		enterRule(_localctx, 8, RULE_constantArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(LEFT_SQUARE_BRACKETS);
			setState(128);
			constant();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(129);
				match(COMMA);
				setState(130);
				constant();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
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
	public static class CompareContext extends ParserRuleContext {
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
		enterRule(_localctx, 10, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
	public static class IdentifierContext extends ParserRuleContext {
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
		enterRule(_localctx, 12, RULE_identifier);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(IDENTIFIER);
				setState(141);
				match(DOT);
				setState(142);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
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
	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalConstantContext extends ConstantContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(ZLExpressParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(ZLExpressParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(ZLExpressParser.PLUS, 0); }
		public DecimalConstantContext(ConstantContext ctx) { copyFrom(ctx); }
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
	public static class IntegerConstantContext extends ConstantContext {
		public TerminalNode INTEGER_VALUE() { return getToken(ZLExpressParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(ZLExpressParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(ZLExpressParser.PLUS, 0); }
		public IntegerConstantContext(ConstantContext ctx) { copyFrom(ctx); }
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

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant);
		int _la;
		try {
			int _alt;
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new IntegerConstantContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(147);
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

				setState(150);
				match(INTEGER_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(151);
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

				setState(154);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new TextConstantContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(156); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(155);
						match(QUOTED_STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(158); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				_localctx = new BooleanConstantContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(BOOLEAN_VALUE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00a4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000"+
		"\f\u0000\u0017\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u001c\b\u0000\n\u0000\f\u0000\u001f\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000\'\t\u0000\u0003\u0000)\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00014\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u00028\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002=\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002A\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002F\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002J\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002O\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002S\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002X\b\u0002\u0003\u0002Z\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003i\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003s\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003{\b\u0003\n\u0003\f\u0003~\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0084\b\u0004\n\u0004\f\u0004"+
		"\u0087\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0092\b\u0006"+
		"\u0001\u0007\u0003\u0007\u0095\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0099\b\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u009d\b\u0007\u000b"+
		"\u0007\f\u0007\u009e\u0001\u0007\u0003\u0007\u00a2\b\u0007\u0001\u0007"+
		"\u0000\u0001\u0006\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0002\u0002"+
		"\u0000\n\n\u000f\u0013\u0001\u0000\u000b\f\u00bd\u0000(\u0001\u0000\u0000"+
		"\u0000\u00023\u0001\u0000\u0000\u0000\u0004Y\u0001\u0000\u0000\u0000\u0006"+
		"r\u0001\u0000\u0000\u0000\b\u007f\u0001\u0000\u0000\u0000\n\u008a\u0001"+
		"\u0000\u0000\u0000\f\u0091\u0001\u0000\u0000\u0000\u000e\u00a1\u0001\u0000"+
		"\u0000\u0000\u0010\u0011\u0003\u0006\u0003\u0000\u0011\u0012\u0005\u0001"+
		"\u0000\u0000\u0012\u0014\u0001\u0000\u0000\u0000\u0013\u0010\u0001\u0000"+
		"\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016)\u0001\u0000\u0000"+
		"\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0002\u0001"+
		"\u0000\u0019\u001a\u0005\u0001\u0000\u0000\u001a\u001c\u0001\u0000\u0000"+
		"\u0000\u001b\u0018\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e)\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		" !\u0003\u0004\u0002\u0000!\"\u0005\u0001\u0000\u0000\"$\u0001\u0000\u0000"+
		"\u0000# \u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000(\u0015\u0001\u0000\u0000\u0000(\u001d\u0001\u0000\u0000"+
		"\u0000(%\u0001\u0000\u0000\u0000)\u0001\u0001\u0000\u0000\u0000*+\u0005"+
		"\u001d\u0000\u0000+,\u0005\u0002\u0000\u0000,4\u0003\u000e\u0007\u0000"+
		"-.\u0005\u001d\u0000\u0000./\u0005\u0002\u0000\u0000/4\u0003\u0006\u0003"+
		"\u000001\u0005\u001d\u0000\u000012\u0005\u0002\u0000\u000024\u0003\u0004"+
		"\u0002\u00003*\u0001\u0000\u0000\u00003-\u0001\u0000\u0000\u000030\u0001"+
		"\u0000\u0000\u00004\u0003\u0001\u0000\u0000\u000058\u0005\u001d\u0000"+
		"\u000068\u0003\u000e\u0007\u000075\u0001\u0000\u0000\u000076\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009<\u0005\f\u0000\u0000:=\u0005\u001d"+
		"\u0000\u0000;=\u0003\u000e\u0007\u0000<:\u0001\u0000\u0000\u0000<;\u0001"+
		"\u0000\u0000\u0000=Z\u0001\u0000\u0000\u0000>A\u0005\u001d\u0000\u0000"+
		"?A\u0003\u000e\u0007\u0000@>\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BE\u0005\u000b\u0000\u0000CF\u0005\u001d"+
		"\u0000\u0000DF\u0003\u000e\u0007\u0000EC\u0001\u0000\u0000\u0000ED\u0001"+
		"\u0000\u0000\u0000FZ\u0001\u0000\u0000\u0000GJ\u0005\u001d\u0000\u0000"+
		"HJ\u0003\u000e\u0007\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KN\u0005\r\u0000\u0000LO\u0005\u001d\u0000"+
		"\u0000MO\u0003\u000e\u0007\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000"+
		"\u0000\u0000OZ\u0001\u0000\u0000\u0000PS\u0005\u001d\u0000\u0000QS\u0003"+
		"\u000e\u0007\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TW\u0005\u000e\u0000\u0000UX\u0005\u001d\u0000"+
		"\u0000VX\u0003\u000e\u0007\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000XZ\u0001\u0000\u0000\u0000Y7\u0001\u0000\u0000\u0000Y@\u0001"+
		"\u0000\u0000\u0000YI\u0001\u0000\u0000\u0000YR\u0001\u0000\u0000\u0000"+
		"Z\u0005\u0001\u0000\u0000\u0000[\\\u0006\u0003\uffff\uffff\u0000\\]\u0003"+
		"\f\u0006\u0000]^\u0003\n\u0005\u0000^_\u0003\u000e\u0007\u0000_s\u0001"+
		"\u0000\u0000\u0000`a\u0003\f\u0006\u0000ab\u0005\u0016\u0000\u0000bc\u0003"+
		"\b\u0004\u0000cs\u0001\u0000\u0000\u0000dh\u0003\f\u0006\u0000ef\u0005"+
		"\u0018\u0000\u0000fi\u0005\u0016\u0000\u0000gi\u0005\u0017\u0000\u0000"+
		"he\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jk\u0003\b\u0004\u0000ks\u0001\u0000\u0000\u0000lm\u0005\b\u0000"+
		"\u0000mn\u0003\u0006\u0003\u0000no\u0005\t\u0000\u0000os\u0001\u0000\u0000"+
		"\u0000pq\u0005\u0018\u0000\u0000qs\u0003\u0006\u0003\u0001r[\u0001\u0000"+
		"\u0000\u0000r`\u0001\u0000\u0000\u0000rd\u0001\u0000\u0000\u0000rl\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000s|\u0001\u0000\u0000\u0000"+
		"tu\n\u0004\u0000\u0000uv\u0005\u0014\u0000\u0000v{\u0003\u0006\u0003\u0005"+
		"wx\n\u0003\u0000\u0000xy\u0005\u0015\u0000\u0000y{\u0003\u0006\u0003\u0004"+
		"zt\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000"+
		"\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0007\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0006\u0000"+
		"\u0000\u0080\u0085\u0003\u000e\u0007\u0000\u0081\u0082\u0005\u0005\u0000"+
		"\u0000\u0082\u0084\u0003\u000e\u0007\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0007\u0000"+
		"\u0000\u0089\t\u0001\u0000\u0000\u0000\u008a\u008b\u0007\u0000\u0000\u0000"+
		"\u008b\u000b\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u001d\u0000\u0000"+
		"\u008d\u008e\u0005\u0004\u0000\u0000\u008e\u0092\u0005\u001d\u0000\u0000"+
		"\u008f\u0092\u0005\u001d\u0000\u0000\u0090\u0092\u0005\u001a\u0000\u0000"+
		"\u0091\u008c\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0092\r\u0001\u0000\u0000\u0000\u0093"+
		"\u0095\u0007\u0001\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u00a2\u0005\u001b\u0000\u0000\u0097\u0099\u0007\u0001\u0000\u0000\u0098"+
		"\u0097\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u00a2\u0005\u001c\u0000\u0000\u009b"+
		"\u009d\u0005\u001a\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a2\u0005\u0019\u0000\u0000\u00a1\u0094\u0001\u0000\u0000\u0000\u00a1"+
		"\u0098\u0001\u0000\u0000\u0000\u00a1\u009c\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u000f\u0001\u0000\u0000\u0000\u0018"+
		"\u0015\u001d%(37<@EINRWYhrz|\u0085\u0091\u0094\u0098\u009e\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}