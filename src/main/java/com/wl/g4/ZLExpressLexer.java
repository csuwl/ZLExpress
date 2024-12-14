// Generated from /Users/wl/IdeaProjects/ZLExpress/src/ZLExpress.g4 by ANTLR 4.13.2
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

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ZLExpressLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ASSIGN=2, NULL=3, DOT=4, COMMA=5, LEFT_SQUARE_BRACKETS=6, RIGHT_SQUARE_BRACKETS=7, 
		LEFT_PARENTHESIS=8, RIGHT_PARENTHESIS=9, EQUALS=10, MINUS=11, PLUS=12, 
		MUL=13, DIV=14, GT=15, GE=16, LT=17, LE=18, NE=19, AND=20, OR=21, IN=22, 
		NIN=23, NOT=24, DEF=25, FUNCTION=26, INT_TYPE=27, DOUBLE_TYPE=28, STRING_TYPE=29, 
		VOID_TYPE=30, BOOL_TYPE=31, ARRAY_TYPE=32, BLOCK_LEFT=33, BLOCK_RIGHT=34, 
		RETURN=35, IMPORT=36, NEW=37, AS=38, IF=39, FOR=40, BREAK=41, CONTINUE=42, 
		BOOLEAN_VALUE=43, QUOTED_STRING=44, INTEGER_VALUE=45, DECIMAL_VALUE=46, 
		IDENTIFIER=47, WS=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ASSIGN", "NULL", "DOT", "COMMA", "LEFT_SQUARE_BRACKETS", "RIGHT_SQUARE_BRACKETS", 
			"LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "EQUALS", "MINUS", "PLUS", "MUL", 
			"DIV", "GT", "GE", "LT", "LE", "NE", "AND", "OR", "IN", "NIN", "NOT", 
			"DEF", "FUNCTION", "INT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", "VOID_TYPE", 
			"BOOL_TYPE", "ARRAY_TYPE", "BLOCK_LEFT", "BLOCK_RIGHT", "RETURN", "IMPORT", 
			"NEW", "AS", "IF", "FOR", "BREAK", "CONTINUE", "BOOLEAN_VALUE", "QUOTED_STRING", 
			"INTEGER_VALUE", "DECIMAL_VALUE", "IDENTIFIER", "DECIMAL_DIGITS", "DIGIT", 
			"LETTER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", null, "'.'", "','", "'['", "']'", "'('", "')'", "'=='", 
			"'-'", "'+'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'!='", null, 
			null, null, null, null, "'def'", null, null, null, null, null, null, 
			null, "'{'", "'}'", "'return'", "'import'", "'new'", "'as'", "'if'", 
			"'for'", "'break'", "'continue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ASSIGN", "NULL", "DOT", "COMMA", "LEFT_SQUARE_BRACKETS", 
			"RIGHT_SQUARE_BRACKETS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "EQUALS", 
			"MINUS", "PLUS", "MUL", "DIV", "GT", "GE", "LT", "LE", "NE", "AND", "OR", 
			"IN", "NIN", "NOT", "DEF", "FUNCTION", "INT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", 
			"VOID_TYPE", "BOOL_TYPE", "ARRAY_TYPE", "BLOCK_LEFT", "BLOCK_RIGHT", 
			"RETURN", "IMPORT", "NEW", "AS", "IF", "FOR", "BREAK", "CONTINUE", "BOOLEAN_VALUE", 
			"QUOTED_STRING", "INTEGER_VALUE", "DECIMAL_VALUE", "IDENTIFIER", "WS"
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


	public ZLExpressLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ZLExpress.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u00000\u01a4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002t\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00a2\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00aa\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u00b0\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u00b8\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00c0\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00d2\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u00da\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u00e8\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u00f6\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0100\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0111\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u011d\b\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u0160\b*\u0001+\u0001+\u0001+\u0001+\u0005+\u0166\b+\n+\f+\u0169\t+"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u0170\b+\n+\f+\u0173\t+\u0001"+
		"+\u0003+\u0176\b+\u0001,\u0004,\u0179\b,\u000b,\f,\u017a\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0004.\u0182\b.\u000b.\f.\u0183\u0001/\u0004/\u0187"+
		"\b/\u000b/\f/\u0188\u0001/\u0001/\u0005/\u018d\b/\n/\f/\u0190\t/\u0001"+
		"/\u0001/\u0004/\u0194\b/\u000b/\f/\u0195\u0003/\u0198\b/\u00010\u0001"+
		"0\u00011\u00011\u00012\u00042\u019f\b2\u000b2\f2\u01a0\u00012\u00012\u0000"+
		"\u00003\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\""+
		"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\u0000a\u0000c\u0000e0\u0001\u0000\u0005\u0002"+
		"\u0000\'\'\\\\\u0002\u0000\"\"\\\\\u0001\u000009\u0002\u0000AZaz\u0003"+
		"\u0000\t\n\r\r  \u01c1\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001"+
		"\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000"+
		"\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000"+
		"E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001"+
		"\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000"+
		"\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000"+
		"S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001"+
		"\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000"+
		"\u0000\u0000]\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0001"+
		"g\u0001\u0000\u0000\u0000\u0003i\u0001\u0000\u0000\u0000\u0005s\u0001"+
		"\u0000\u0000\u0000\u0007u\u0001\u0000\u0000\u0000\tw\u0001\u0000\u0000"+
		"\u0000\u000by\u0001\u0000\u0000\u0000\r{\u0001\u0000\u0000\u0000\u000f"+
		"}\u0001\u0000\u0000\u0000\u0011\u007f\u0001\u0000\u0000\u0000\u0013\u0081"+
		"\u0001\u0000\u0000\u0000\u0015\u0084\u0001\u0000\u0000\u0000\u0017\u0086"+
		"\u0001\u0000\u0000\u0000\u0019\u0088\u0001\u0000\u0000\u0000\u001b\u008a"+
		"\u0001\u0000\u0000\u0000\u001d\u008c\u0001\u0000\u0000\u0000\u001f\u008e"+
		"\u0001\u0000\u0000\u0000!\u0091\u0001\u0000\u0000\u0000#\u0093\u0001\u0000"+
		"\u0000\u0000%\u0096\u0001\u0000\u0000\u0000\'\u00a1\u0001\u0000\u0000"+
		"\u0000)\u00a9\u0001\u0000\u0000\u0000+\u00af\u0001\u0000\u0000\u0000-"+
		"\u00b7\u0001\u0000\u0000\u0000/\u00bf\u0001\u0000\u0000\u00001\u00c1\u0001"+
		"\u0000\u0000\u00003\u00d1\u0001\u0000\u0000\u00005\u00d9\u0001\u0000\u0000"+
		"\u00007\u00e7\u0001\u0000\u0000\u00009\u00f5\u0001\u0000\u0000\u0000;"+
		"\u00ff\u0001\u0000\u0000\u0000=\u0110\u0001\u0000\u0000\u0000?\u011c\u0001"+
		"\u0000\u0000\u0000A\u011e\u0001\u0000\u0000\u0000C\u0120\u0001\u0000\u0000"+
		"\u0000E\u0122\u0001\u0000\u0000\u0000G\u0129\u0001\u0000\u0000\u0000I"+
		"\u0130\u0001\u0000\u0000\u0000K\u0134\u0001\u0000\u0000\u0000M\u0137\u0001"+
		"\u0000\u0000\u0000O\u013a\u0001\u0000\u0000\u0000Q\u013e\u0001\u0000\u0000"+
		"\u0000S\u0144\u0001\u0000\u0000\u0000U\u015f\u0001\u0000\u0000\u0000W"+
		"\u0175\u0001\u0000\u0000\u0000Y\u0178\u0001\u0000\u0000\u0000[\u017c\u0001"+
		"\u0000\u0000\u0000]\u0181\u0001\u0000\u0000\u0000_\u0197\u0001\u0000\u0000"+
		"\u0000a\u0199\u0001\u0000\u0000\u0000c\u019b\u0001\u0000\u0000\u0000e"+
		"\u019e\u0001\u0000\u0000\u0000gh\u0005;\u0000\u0000h\u0002\u0001\u0000"+
		"\u0000\u0000ij\u0005=\u0000\u0000j\u0004\u0001\u0000\u0000\u0000kl\u0005"+
		"n\u0000\u0000lm\u0005u\u0000\u0000mn\u0005l\u0000\u0000nt\u0005l\u0000"+
		"\u0000op\u0005N\u0000\u0000pq\u0005U\u0000\u0000qr\u0005L\u0000\u0000"+
		"rt\u0005L\u0000\u0000sk\u0001\u0000\u0000\u0000so\u0001\u0000\u0000\u0000"+
		"t\u0006\u0001\u0000\u0000\u0000uv\u0005.\u0000\u0000v\b\u0001\u0000\u0000"+
		"\u0000wx\u0005,\u0000\u0000x\n\u0001\u0000\u0000\u0000yz\u0005[\u0000"+
		"\u0000z\f\u0001\u0000\u0000\u0000{|\u0005]\u0000\u0000|\u000e\u0001\u0000"+
		"\u0000\u0000}~\u0005(\u0000\u0000~\u0010\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005)\u0000\u0000\u0080\u0012\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005=\u0000\u0000\u0082\u0083\u0005=\u0000\u0000\u0083\u0014\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005-\u0000\u0000\u0085\u0016\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005+\u0000\u0000\u0087\u0018\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0005*\u0000\u0000\u0089\u001a\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005/\u0000\u0000\u008b\u001c\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005>\u0000\u0000\u008d\u001e\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		">\u0000\u0000\u008f\u0090\u0005=\u0000\u0000\u0090 \u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005<\u0000\u0000\u0092\"\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005<\u0000\u0000\u0094\u0095\u0005=\u0000\u0000\u0095$"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005!\u0000\u0000\u0097\u0098\u0005"+
		"=\u0000\u0000\u0098&\u0001\u0000\u0000\u0000\u0099\u009a\u0005A\u0000"+
		"\u0000\u009a\u009b\u0005N\u0000\u0000\u009b\u00a2\u0005D\u0000\u0000\u009c"+
		"\u009d\u0005a\u0000\u0000\u009d\u009e\u0005n\u0000\u0000\u009e\u00a2\u0005"+
		"d\u0000\u0000\u009f\u00a0\u0005&\u0000\u0000\u00a0\u00a2\u0005&\u0000"+
		"\u0000\u00a1\u0099\u0001\u0000\u0000\u0000\u00a1\u009c\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2(\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0005O\u0000\u0000\u00a4\u00aa\u0005R\u0000\u0000\u00a5\u00a6"+
		"\u0005o\u0000\u0000\u00a6\u00aa\u0005r\u0000\u0000\u00a7\u00a8\u0005|"+
		"\u0000\u0000\u00a8\u00aa\u0005|\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa*\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005I\u0000\u0000\u00ac"+
		"\u00b0\u0005N\u0000\u0000\u00ad\u00ae\u0005i\u0000\u0000\u00ae\u00b0\u0005"+
		"n\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0,\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005N\u0000\u0000"+
		"\u00b2\u00b3\u0005I\u0000\u0000\u00b3\u00b8\u0005N\u0000\u0000\u00b4\u00b5"+
		"\u0005n\u0000\u0000\u00b5\u00b6\u0005i\u0000\u0000\u00b6\u00b8\u0005n"+
		"\u0000\u0000\u00b7\u00b1\u0001\u0000\u0000\u0000\u00b7\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b8.\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005N\u0000\u0000"+
		"\u00ba\u00bb\u0005O\u0000\u0000\u00bb\u00c0\u0005T\u0000\u0000\u00bc\u00bd"+
		"\u0005n\u0000\u0000\u00bd\u00be\u0005o\u0000\u0000\u00be\u00c0\u0005t"+
		"\u0000\u0000\u00bf\u00b9\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001\u0000"+
		"\u0000\u0000\u00c00\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005d\u0000\u0000"+
		"\u00c2\u00c3\u0005e\u0000\u0000\u00c3\u00c4\u0005f\u0000\u0000\u00c42"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005f\u0000\u0000\u00c6\u00c7\u0005"+
		"u\u0000\u0000\u00c7\u00c8\u0005n\u0000\u0000\u00c8\u00d2\u0005c\u0000"+
		"\u0000\u00c9\u00ca\u0005f\u0000\u0000\u00ca\u00cb\u0005u\u0000\u0000\u00cb"+
		"\u00cc\u0005n\u0000\u0000\u00cc\u00cd\u0005c\u0000\u0000\u00cd\u00ce\u0005"+
		"t\u0000\u0000\u00ce\u00cf\u0005i\u0000\u0000\u00cf\u00d0\u0005o\u0000"+
		"\u0000\u00d0\u00d2\u0005n\u0000\u0000\u00d1\u00c5\u0001\u0000\u0000\u0000"+
		"\u00d1\u00c9\u0001\u0000\u0000\u0000\u00d24\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0005I\u0000\u0000\u00d4\u00d5\u0005n\u0000\u0000\u00d5\u00da\u0005"+
		"t\u0000\u0000\u00d6\u00d7\u0005i\u0000\u0000\u00d7\u00d8\u0005n\u0000"+
		"\u0000\u00d8\u00da\u0005t\u0000\u0000\u00d9\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d6\u0001\u0000\u0000\u0000\u00da6\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0005D\u0000\u0000\u00dc\u00dd\u0005o\u0000\u0000\u00dd\u00de\u0005"+
		"u\u0000\u0000\u00de\u00df\u0005b\u0000\u0000\u00df\u00e0\u0005l\u0000"+
		"\u0000\u00e0\u00e8\u0005e\u0000\u0000\u00e1\u00e2\u0005d\u0000\u0000\u00e2"+
		"\u00e3\u0005o\u0000\u0000\u00e3\u00e4\u0005u\u0000\u0000\u00e4\u00e5\u0005"+
		"b\u0000\u0000\u00e5\u00e6\u0005l\u0000\u0000\u00e6\u00e8\u0005e\u0000"+
		"\u0000\u00e7\u00db\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e88\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005S\u0000\u0000\u00ea"+
		"\u00eb\u0005t\u0000\u0000\u00eb\u00ec\u0005r\u0000\u0000\u00ec\u00ed\u0005"+
		"i\u0000\u0000\u00ed\u00ee\u0005n\u0000\u0000\u00ee\u00f6\u0005g\u0000"+
		"\u0000\u00ef\u00f0\u0005s\u0000\u0000\u00f0\u00f1\u0005t\u0000\u0000\u00f1"+
		"\u00f2\u0005r\u0000\u0000\u00f2\u00f3\u0005i\u0000\u0000\u00f3\u00f4\u0005"+
		"n\u0000\u0000\u00f4\u00f6\u0005g\u0000\u0000\u00f5\u00e9\u0001\u0000\u0000"+
		"\u0000\u00f5\u00ef\u0001\u0000\u0000\u0000\u00f6:\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0005V\u0000\u0000\u00f8\u00f9\u0005o\u0000\u0000\u00f9\u00fa"+
		"\u0005i\u0000\u0000\u00fa\u0100\u0005d\u0000\u0000\u00fb\u00fc\u0005v"+
		"\u0000\u0000\u00fc\u00fd\u0005o\u0000\u0000\u00fd\u00fe\u0005i\u0000\u0000"+
		"\u00fe\u0100\u0005d\u0000\u0000\u00ff\u00f7\u0001\u0000\u0000\u0000\u00ff"+
		"\u00fb\u0001\u0000\u0000\u0000\u0100<\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0005B\u0000\u0000\u0102\u0103\u0005o\u0000\u0000\u0103\u0104\u0005o"+
		"\u0000\u0000\u0104\u0111\u0005l\u0000\u0000\u0105\u0106\u0005b\u0000\u0000"+
		"\u0106\u0107\u0005o\u0000\u0000\u0107\u0108\u0005o\u0000\u0000\u0108\u0111"+
		"\u0005l\u0000\u0000\u0109\u010a\u0005b\u0000\u0000\u010a\u010b\u0005o"+
		"\u0000\u0000\u010b\u010c\u0005o\u0000\u0000\u010c\u010d\u0005l\u0000\u0000"+
		"\u010d\u010e\u0005e\u0000\u0000\u010e\u010f\u0005a\u0000\u0000\u010f\u0111"+
		"\u0005n\u0000\u0000\u0110\u0101\u0001\u0000\u0000\u0000\u0110\u0105\u0001"+
		"\u0000\u0000\u0000\u0110\u0109\u0001\u0000\u0000\u0000\u0111>\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0005A\u0000\u0000\u0113\u0114\u0005r\u0000\u0000"+
		"\u0114\u0115\u0005r\u0000\u0000\u0115\u0116\u0005a\u0000\u0000\u0116\u011d"+
		"\u0005y\u0000\u0000\u0117\u0118\u0005a\u0000\u0000\u0118\u0119\u0005r"+
		"\u0000\u0000\u0119\u011a\u0005r\u0000\u0000\u011a\u011b\u0005a\u0000\u0000"+
		"\u011b\u011d\u0005y\u0000\u0000\u011c\u0112\u0001\u0000\u0000\u0000\u011c"+
		"\u0117\u0001\u0000\u0000\u0000\u011d@\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0005{\u0000\u0000\u011fB\u0001\u0000\u0000\u0000\u0120\u0121\u0005}"+
		"\u0000\u0000\u0121D\u0001\u0000\u0000\u0000\u0122\u0123\u0005r\u0000\u0000"+
		"\u0123\u0124\u0005e\u0000\u0000\u0124\u0125\u0005t\u0000\u0000\u0125\u0126"+
		"\u0005u\u0000\u0000\u0126\u0127\u0005r\u0000\u0000\u0127\u0128\u0005n"+
		"\u0000\u0000\u0128F\u0001\u0000\u0000\u0000\u0129\u012a\u0005i\u0000\u0000"+
		"\u012a\u012b\u0005m\u0000\u0000\u012b\u012c\u0005p\u0000\u0000\u012c\u012d"+
		"\u0005o\u0000\u0000\u012d\u012e\u0005r\u0000\u0000\u012e\u012f\u0005t"+
		"\u0000\u0000\u012fH\u0001\u0000\u0000\u0000\u0130\u0131\u0005n\u0000\u0000"+
		"\u0131\u0132\u0005e\u0000\u0000\u0132\u0133\u0005w\u0000\u0000\u0133J"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0005a\u0000\u0000\u0135\u0136\u0005"+
		"s\u0000\u0000\u0136L\u0001\u0000\u0000\u0000\u0137\u0138\u0005i\u0000"+
		"\u0000\u0138\u0139\u0005f\u0000\u0000\u0139N\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0005f\u0000\u0000\u013b\u013c\u0005o\u0000\u0000\u013c\u013d\u0005"+
		"r\u0000\u0000\u013dP\u0001\u0000\u0000\u0000\u013e\u013f\u0005b\u0000"+
		"\u0000\u013f\u0140\u0005r\u0000\u0000\u0140\u0141\u0005e\u0000\u0000\u0141"+
		"\u0142\u0005a\u0000\u0000\u0142\u0143\u0005k\u0000\u0000\u0143R\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0005c\u0000\u0000\u0145\u0146\u0005o\u0000"+
		"\u0000\u0146\u0147\u0005n\u0000\u0000\u0147\u0148\u0005t\u0000\u0000\u0148"+
		"\u0149\u0005i\u0000\u0000\u0149\u014a\u0005n\u0000\u0000\u014a\u014b\u0005"+
		"u\u0000\u0000\u014b\u014c\u0005e\u0000\u0000\u014cT\u0001\u0000\u0000"+
		"\u0000\u014d\u014e\u0005T\u0000\u0000\u014e\u014f\u0005R\u0000\u0000\u014f"+
		"\u0150\u0005U\u0000\u0000\u0150\u0160\u0005E\u0000\u0000\u0151\u0152\u0005"+
		"t\u0000\u0000\u0152\u0153\u0005r\u0000\u0000\u0153\u0154\u0005u\u0000"+
		"\u0000\u0154\u0160\u0005e\u0000\u0000\u0155\u0156\u0005F\u0000\u0000\u0156"+
		"\u0157\u0005A\u0000\u0000\u0157\u0158\u0005L\u0000\u0000\u0158\u0159\u0005"+
		"S\u0000\u0000\u0159\u0160\u0005E\u0000\u0000\u015a\u015b\u0005f\u0000"+
		"\u0000\u015b\u015c\u0005a\u0000\u0000\u015c\u015d\u0005l\u0000\u0000\u015d"+
		"\u015e\u0005s\u0000\u0000\u015e\u0160\u0005e\u0000\u0000\u015f\u014d\u0001"+
		"\u0000\u0000\u0000\u015f\u0151\u0001\u0000\u0000\u0000\u015f\u0155\u0001"+
		"\u0000\u0000\u0000\u015f\u015a\u0001\u0000\u0000\u0000\u0160V\u0001\u0000"+
		"\u0000\u0000\u0161\u0167\u0005\'\u0000\u0000\u0162\u0166\b\u0000\u0000"+
		"\u0000\u0163\u0164\u0005\\\u0000\u0000\u0164\u0166\t\u0000\u0000\u0000"+
		"\u0165\u0162\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000"+
		"\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000"+
		"\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u0176\u0005\'\u0000\u0000\u016b"+
		"\u0171\u0005\"\u0000\u0000\u016c\u0170\b\u0001\u0000\u0000\u016d\u016e"+
		"\u0005\\\u0000\u0000\u016e\u0170\t\u0000\u0000\u0000\u016f\u016c\u0001"+
		"\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u0173\u0001"+
		"\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001"+
		"\u0000\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0171\u0001"+
		"\u0000\u0000\u0000\u0174\u0176\u0005\"\u0000\u0000\u0175\u0161\u0001\u0000"+
		"\u0000\u0000\u0175\u016b\u0001\u0000\u0000\u0000\u0176X\u0001\u0000\u0000"+
		"\u0000\u0177\u0179\u0003a0\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a"+
		"\u017b\u0001\u0000\u0000\u0000\u017bZ\u0001\u0000\u0000\u0000\u017c\u017d"+
		"\u0003_/\u0000\u017d\\\u0001\u0000\u0000\u0000\u017e\u0182\u0003c1\u0000"+
		"\u017f\u0182\u0003a0\u0000\u0180\u0182\u0005_\u0000\u0000\u0181\u017e"+
		"\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0180"+
		"\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0181"+
		"\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184^\u0001"+
		"\u0000\u0000\u0000\u0185\u0187\u0003a0\u0000\u0186\u0185\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000"+
		"\u0000\u018a\u018e\u0005.\u0000\u0000\u018b\u018d\u0003a0\u0000\u018c"+
		"\u018b\u0001\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e"+
		"\u018c\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f"+
		"\u0198\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191"+
		"\u0193\u0005.\u0000\u0000\u0192\u0194\u0003a0\u0000\u0193\u0192\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0193\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0198\u0001"+
		"\u0000\u0000\u0000\u0197\u0186\u0001\u0000\u0000\u0000\u0197\u0191\u0001"+
		"\u0000\u0000\u0000\u0198`\u0001\u0000\u0000\u0000\u0199\u019a\u0007\u0002"+
		"\u0000\u0000\u019ab\u0001\u0000\u0000\u0000\u019b\u019c\u0007\u0003\u0000"+
		"\u0000\u019cd\u0001\u0000\u0000\u0000\u019d\u019f\u0007\u0004\u0000\u0000"+
		"\u019e\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u00062\u0000\u0000\u01a3"+
		"f\u0001\u0000\u0000\u0000\u001c\u0000s\u00a1\u00a9\u00af\u00b7\u00bf\u00d1"+
		"\u00d9\u00e7\u00f5\u00ff\u0110\u011c\u015f\u0165\u0167\u016f\u0171\u0175"+
		"\u017a\u0181\u0183\u0188\u018e\u0195\u0197\u01a0\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}