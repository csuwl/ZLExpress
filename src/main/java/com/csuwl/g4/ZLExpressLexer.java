// Generated from E:/IdeaProject/ZLExpress/src/ZLExpress.g4 by ANTLR 4.13.2
package com.csuwl.g4;

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
		RETURN=35, IMPORT=36, NEW=37, AS=38, IF=39, ELSE=40, FOR=41, BREAK=42, 
		CONTINUE=43, LIKE=44, AGODAY=45, RECENTDAY=46, BOOLEAN_VALUE=47, QUOTED_STRING=48, 
		INTEGER_VALUE=49, DECIMAL_VALUE=50, IDENTIFIER=51, WS=52;
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
			"NEW", "AS", "IF", "ELSE", "FOR", "BREAK", "CONTINUE", "LIKE", "AGODAY", 
			"RECENTDAY", "BOOLEAN_VALUE", "QUOTED_STRING", "INTEGER_VALUE", "DECIMAL_VALUE", 
			"IDENTIFIER", "DECIMAL_DIGITS", "DIGIT", "LETTER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", null, "'.'", "','", "'['", "']'", "'('", "')'", "'=='", 
			"'-'", "'+'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'!='", null, 
			null, null, null, null, "'def'", null, null, null, null, null, null, 
			null, "'{'", "'}'", "'return'", "'import'", "'new'", "'as'", "'if'", 
			"'else'", "'for'", "'break'", "'continue'", "'like'"
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
			"RETURN", "IMPORT", "NEW", "AS", "IF", "ELSE", "FOR", "BREAK", "CONTINUE", 
			"LIKE", "AGODAY", "RECENTDAY", "BOOLEAN_VALUE", "QUOTED_STRING", "INTEGER_VALUE", 
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
		"\u0004\u00004\u01e9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002|\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00aa\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00b2\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00b8\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00c0\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00c8\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u00da\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00e2\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u00f0\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u00fe\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0108\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0119\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u0125\b\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001("+
		"\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u0173\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u0191\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u01a5\b.\u0001/\u0001/\u0001/\u0001/\u0005/\u01ab\b/\n/\f/\u01ae\t/"+
		"\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u01b5\b/\n/\f/\u01b8\t/\u0001"+
		"/\u0003/\u01bb\b/\u00010\u00040\u01be\b0\u000b0\f0\u01bf\u00011\u0001"+
		"1\u00012\u00012\u00012\u00042\u01c7\b2\u000b2\f2\u01c8\u00013\u00043\u01cc"+
		"\b3\u000b3\f3\u01cd\u00013\u00013\u00053\u01d2\b3\n3\f3\u01d5\t3\u0001"+
		"3\u00013\u00043\u01d9\b3\u000b3\f3\u01da\u00033\u01dd\b3\u00014\u0001"+
		"4\u00015\u00015\u00016\u00046\u01e4\b6\u000b6\f6\u01e5\u00016\u00016\u0000"+
		"\u00007\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\""+
		"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g\u0000i\u0000k\u0000m4\u0001\u0000"+
		"\u0005\u0002\u0000\'\'\\\\\u0002\u0000\"\"\\\\\u0001\u000009\u0002\u0000"+
		"AZaz\u0003\u0000\t\n\r\r  \u020a\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I"+
		"\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000"+
		"\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000"+
		"\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W"+
		"\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000"+
		"\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000"+
		"\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e"+
		"\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0001o\u0001\u0000"+
		"\u0000\u0000\u0003q\u0001\u0000\u0000\u0000\u0005{\u0001\u0000\u0000\u0000"+
		"\u0007}\u0001\u0000\u0000\u0000\t\u007f\u0001\u0000\u0000\u0000\u000b"+
		"\u0081\u0001\u0000\u0000\u0000\r\u0083\u0001\u0000\u0000\u0000\u000f\u0085"+
		"\u0001\u0000\u0000\u0000\u0011\u0087\u0001\u0000\u0000\u0000\u0013\u0089"+
		"\u0001\u0000\u0000\u0000\u0015\u008c\u0001\u0000\u0000\u0000\u0017\u008e"+
		"\u0001\u0000\u0000\u0000\u0019\u0090\u0001\u0000\u0000\u0000\u001b\u0092"+
		"\u0001\u0000\u0000\u0000\u001d\u0094\u0001\u0000\u0000\u0000\u001f\u0096"+
		"\u0001\u0000\u0000\u0000!\u0099\u0001\u0000\u0000\u0000#\u009b\u0001\u0000"+
		"\u0000\u0000%\u009e\u0001\u0000\u0000\u0000\'\u00a9\u0001\u0000\u0000"+
		"\u0000)\u00b1\u0001\u0000\u0000\u0000+\u00b7\u0001\u0000\u0000\u0000-"+
		"\u00bf\u0001\u0000\u0000\u0000/\u00c7\u0001\u0000\u0000\u00001\u00c9\u0001"+
		"\u0000\u0000\u00003\u00d9\u0001\u0000\u0000\u00005\u00e1\u0001\u0000\u0000"+
		"\u00007\u00ef\u0001\u0000\u0000\u00009\u00fd\u0001\u0000\u0000\u0000;"+
		"\u0107\u0001\u0000\u0000\u0000=\u0118\u0001\u0000\u0000\u0000?\u0124\u0001"+
		"\u0000\u0000\u0000A\u0126\u0001\u0000\u0000\u0000C\u0128\u0001\u0000\u0000"+
		"\u0000E\u012a\u0001\u0000\u0000\u0000G\u0131\u0001\u0000\u0000\u0000I"+
		"\u0138\u0001\u0000\u0000\u0000K\u013c\u0001\u0000\u0000\u0000M\u013f\u0001"+
		"\u0000\u0000\u0000O\u0142\u0001\u0000\u0000\u0000Q\u0147\u0001\u0000\u0000"+
		"\u0000S\u014b\u0001\u0000\u0000\u0000U\u0151\u0001\u0000\u0000\u0000W"+
		"\u015a\u0001\u0000\u0000\u0000Y\u0172\u0001\u0000\u0000\u0000[\u0190\u0001"+
		"\u0000\u0000\u0000]\u01a4\u0001\u0000\u0000\u0000_\u01ba\u0001\u0000\u0000"+
		"\u0000a\u01bd\u0001\u0000\u0000\u0000c\u01c1\u0001\u0000\u0000\u0000e"+
		"\u01c6\u0001\u0000\u0000\u0000g\u01dc\u0001\u0000\u0000\u0000i\u01de\u0001"+
		"\u0000\u0000\u0000k\u01e0\u0001\u0000\u0000\u0000m\u01e3\u0001\u0000\u0000"+
		"\u0000op\u0005;\u0000\u0000p\u0002\u0001\u0000\u0000\u0000qr\u0005=\u0000"+
		"\u0000r\u0004\u0001\u0000\u0000\u0000st\u0005n\u0000\u0000tu\u0005u\u0000"+
		"\u0000uv\u0005l\u0000\u0000v|\u0005l\u0000\u0000wx\u0005N\u0000\u0000"+
		"xy\u0005U\u0000\u0000yz\u0005L\u0000\u0000z|\u0005L\u0000\u0000{s\u0001"+
		"\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000|\u0006\u0001\u0000\u0000"+
		"\u0000}~\u0005.\u0000\u0000~\b\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		",\u0000\u0000\u0080\n\u0001\u0000\u0000\u0000\u0081\u0082\u0005[\u0000"+
		"\u0000\u0082\f\u0001\u0000\u0000\u0000\u0083\u0084\u0005]\u0000\u0000"+
		"\u0084\u000e\u0001\u0000\u0000\u0000\u0085\u0086\u0005(\u0000\u0000\u0086"+
		"\u0010\u0001\u0000\u0000\u0000\u0087\u0088\u0005)\u0000\u0000\u0088\u0012"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005=\u0000\u0000\u008a\u008b\u0005"+
		"=\u0000\u0000\u008b\u0014\u0001\u0000\u0000\u0000\u008c\u008d\u0005-\u0000"+
		"\u0000\u008d\u0016\u0001\u0000\u0000\u0000\u008e\u008f\u0005+\u0000\u0000"+
		"\u008f\u0018\u0001\u0000\u0000\u0000\u0090\u0091\u0005*\u0000\u0000\u0091"+
		"\u001a\u0001\u0000\u0000\u0000\u0092\u0093\u0005/\u0000\u0000\u0093\u001c"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005>\u0000\u0000\u0095\u001e\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005>\u0000\u0000\u0097\u0098\u0005=\u0000"+
		"\u0000\u0098 \u0001\u0000\u0000\u0000\u0099\u009a\u0005<\u0000\u0000\u009a"+
		"\"\u0001\u0000\u0000\u0000\u009b\u009c\u0005<\u0000\u0000\u009c\u009d"+
		"\u0005=\u0000\u0000\u009d$\u0001\u0000\u0000\u0000\u009e\u009f\u0005!"+
		"\u0000\u0000\u009f\u00a0\u0005=\u0000\u0000\u00a0&\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0005A\u0000\u0000\u00a2\u00a3\u0005N\u0000\u0000\u00a3\u00aa"+
		"\u0005D\u0000\u0000\u00a4\u00a5\u0005a\u0000\u0000\u00a5\u00a6\u0005n"+
		"\u0000\u0000\u00a6\u00aa\u0005d\u0000\u0000\u00a7\u00a8\u0005&\u0000\u0000"+
		"\u00a8\u00aa\u0005&\u0000\u0000\u00a9\u00a1\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa"+
		"(\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005O\u0000\u0000\u00ac\u00b2\u0005"+
		"R\u0000\u0000\u00ad\u00ae\u0005o\u0000\u0000\u00ae\u00b2\u0005r\u0000"+
		"\u0000\u00af\u00b0\u0005|\u0000\u0000\u00b0\u00b2\u0005|\u0000\u0000\u00b1"+
		"\u00ab\u0001\u0000\u0000\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b2*\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0005I\u0000\u0000\u00b4\u00b8\u0005N\u0000\u0000\u00b5\u00b6\u0005i"+
		"\u0000\u0000\u00b6\u00b8\u0005n\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8,\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0005N\u0000\u0000\u00ba\u00bb\u0005I\u0000\u0000\u00bb\u00c0"+
		"\u0005N\u0000\u0000\u00bc\u00bd\u0005n\u0000\u0000\u00bd\u00be\u0005i"+
		"\u0000\u0000\u00be\u00c0\u0005n\u0000\u0000\u00bf\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bc\u0001\u0000\u0000\u0000\u00c0.\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0005N\u0000\u0000\u00c2\u00c3\u0005O\u0000\u0000\u00c3\u00c8"+
		"\u0005T\u0000\u0000\u00c4\u00c5\u0005n\u0000\u0000\u00c5\u00c6\u0005o"+
		"\u0000\u0000\u00c6\u00c8\u0005t\u0000\u0000\u00c7\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c80\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005d\u0000\u0000\u00ca\u00cb\u0005e\u0000\u0000\u00cb\u00cc"+
		"\u0005f\u0000\u0000\u00cc2\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005f"+
		"\u0000\u0000\u00ce\u00cf\u0005u\u0000\u0000\u00cf\u00d0\u0005n\u0000\u0000"+
		"\u00d0\u00da\u0005c\u0000\u0000\u00d1\u00d2\u0005f\u0000\u0000\u00d2\u00d3"+
		"\u0005u\u0000\u0000\u00d3\u00d4\u0005n\u0000\u0000\u00d4\u00d5\u0005c"+
		"\u0000\u0000\u00d5\u00d6\u0005t\u0000\u0000\u00d6\u00d7\u0005i\u0000\u0000"+
		"\u00d7\u00d8\u0005o\u0000\u0000\u00d8\u00da\u0005n\u0000\u0000\u00d9\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d1\u0001\u0000\u0000\u0000\u00da4\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0005I\u0000\u0000\u00dc\u00dd\u0005n\u0000"+
		"\u0000\u00dd\u00e2\u0005t\u0000\u0000\u00de\u00df\u0005i\u0000\u0000\u00df"+
		"\u00e0\u0005n\u0000\u0000\u00e0\u00e2\u0005t\u0000\u0000\u00e1\u00db\u0001"+
		"\u0000\u0000\u0000\u00e1\u00de\u0001\u0000\u0000\u0000\u00e26\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0005D\u0000\u0000\u00e4\u00e5\u0005o\u0000\u0000"+
		"\u00e5\u00e6\u0005u\u0000\u0000\u00e6\u00e7\u0005b\u0000\u0000\u00e7\u00e8"+
		"\u0005l\u0000\u0000\u00e8\u00f0\u0005e\u0000\u0000\u00e9\u00ea\u0005d"+
		"\u0000\u0000\u00ea\u00eb\u0005o\u0000\u0000\u00eb\u00ec\u0005u\u0000\u0000"+
		"\u00ec\u00ed\u0005b\u0000\u0000\u00ed\u00ee\u0005l\u0000\u0000\u00ee\u00f0"+
		"\u0005e\u0000\u0000\u00ef\u00e3\u0001\u0000\u0000\u0000\u00ef\u00e9\u0001"+
		"\u0000\u0000\u0000\u00f08\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005S\u0000"+
		"\u0000\u00f2\u00f3\u0005t\u0000\u0000\u00f3\u00f4\u0005r\u0000\u0000\u00f4"+
		"\u00f5\u0005i\u0000\u0000\u00f5\u00f6\u0005n\u0000\u0000\u00f6\u00fe\u0005"+
		"g\u0000\u0000\u00f7\u00f8\u0005s\u0000\u0000\u00f8\u00f9\u0005t\u0000"+
		"\u0000\u00f9\u00fa\u0005r\u0000\u0000\u00fa\u00fb\u0005i\u0000\u0000\u00fb"+
		"\u00fc\u0005n\u0000\u0000\u00fc\u00fe\u0005g\u0000\u0000\u00fd\u00f1\u0001"+
		"\u0000\u0000\u0000\u00fd\u00f7\u0001\u0000\u0000\u0000\u00fe:\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0005V\u0000\u0000\u0100\u0101\u0005o\u0000\u0000"+
		"\u0101\u0102\u0005i\u0000\u0000\u0102\u0108\u0005d\u0000\u0000\u0103\u0104"+
		"\u0005v\u0000\u0000\u0104\u0105\u0005o\u0000\u0000\u0105\u0106\u0005i"+
		"\u0000\u0000\u0106\u0108\u0005d\u0000\u0000\u0107\u00ff\u0001\u0000\u0000"+
		"\u0000\u0107\u0103\u0001\u0000\u0000\u0000\u0108<\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0005B\u0000\u0000\u010a\u010b\u0005o\u0000\u0000\u010b\u010c"+
		"\u0005o\u0000\u0000\u010c\u0119\u0005l\u0000\u0000\u010d\u010e\u0005b"+
		"\u0000\u0000\u010e\u010f\u0005o\u0000\u0000\u010f\u0110\u0005o\u0000\u0000"+
		"\u0110\u0119\u0005l\u0000\u0000\u0111\u0112\u0005b\u0000\u0000\u0112\u0113"+
		"\u0005o\u0000\u0000\u0113\u0114\u0005o\u0000\u0000\u0114\u0115\u0005l"+
		"\u0000\u0000\u0115\u0116\u0005e\u0000\u0000\u0116\u0117\u0005a\u0000\u0000"+
		"\u0117\u0119\u0005n\u0000\u0000\u0118\u0109\u0001\u0000\u0000\u0000\u0118"+
		"\u010d\u0001\u0000\u0000\u0000\u0118\u0111\u0001\u0000\u0000\u0000\u0119"+
		">\u0001\u0000\u0000\u0000\u011a\u011b\u0005A\u0000\u0000\u011b\u011c\u0005"+
		"r\u0000\u0000\u011c\u011d\u0005r\u0000\u0000\u011d\u011e\u0005a\u0000"+
		"\u0000\u011e\u0125\u0005y\u0000\u0000\u011f\u0120\u0005a\u0000\u0000\u0120"+
		"\u0121\u0005r\u0000\u0000\u0121\u0122\u0005r\u0000\u0000\u0122\u0123\u0005"+
		"a\u0000\u0000\u0123\u0125\u0005y\u0000\u0000\u0124\u011a\u0001\u0000\u0000"+
		"\u0000\u0124\u011f\u0001\u0000\u0000\u0000\u0125@\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0005{\u0000\u0000\u0127B\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0005}\u0000\u0000\u0129D\u0001\u0000\u0000\u0000\u012a\u012b\u0005r"+
		"\u0000\u0000\u012b\u012c\u0005e\u0000\u0000\u012c\u012d\u0005t\u0000\u0000"+
		"\u012d\u012e\u0005u\u0000\u0000\u012e\u012f\u0005r\u0000\u0000\u012f\u0130"+
		"\u0005n\u0000\u0000\u0130F\u0001\u0000\u0000\u0000\u0131\u0132\u0005i"+
		"\u0000\u0000\u0132\u0133\u0005m\u0000\u0000\u0133\u0134\u0005p\u0000\u0000"+
		"\u0134\u0135\u0005o\u0000\u0000\u0135\u0136\u0005r\u0000\u0000\u0136\u0137"+
		"\u0005t\u0000\u0000\u0137H\u0001\u0000\u0000\u0000\u0138\u0139\u0005n"+
		"\u0000\u0000\u0139\u013a\u0005e\u0000\u0000\u013a\u013b\u0005w\u0000\u0000"+
		"\u013bJ\u0001\u0000\u0000\u0000\u013c\u013d\u0005a\u0000\u0000\u013d\u013e"+
		"\u0005s\u0000\u0000\u013eL\u0001\u0000\u0000\u0000\u013f\u0140\u0005i"+
		"\u0000\u0000\u0140\u0141\u0005f\u0000\u0000\u0141N\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0005e\u0000\u0000\u0143\u0144\u0005l\u0000\u0000\u0144\u0145"+
		"\u0005s\u0000\u0000\u0145\u0146\u0005e\u0000\u0000\u0146P\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0005f\u0000\u0000\u0148\u0149\u0005o\u0000\u0000"+
		"\u0149\u014a\u0005r\u0000\u0000\u014aR\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0005b\u0000\u0000\u014c\u014d\u0005r\u0000\u0000\u014d\u014e\u0005e"+
		"\u0000\u0000\u014e\u014f\u0005a\u0000\u0000\u014f\u0150\u0005k\u0000\u0000"+
		"\u0150T\u0001\u0000\u0000\u0000\u0151\u0152\u0005c\u0000\u0000\u0152\u0153"+
		"\u0005o\u0000\u0000\u0153\u0154\u0005n\u0000\u0000\u0154\u0155\u0005t"+
		"\u0000\u0000\u0155\u0156\u0005i\u0000\u0000\u0156\u0157\u0005n\u0000\u0000"+
		"\u0157\u0158\u0005u\u0000\u0000\u0158\u0159\u0005e\u0000\u0000\u0159V"+
		"\u0001\u0000\u0000\u0000\u015a\u015b\u0005l\u0000\u0000\u015b\u015c\u0005"+
		"i\u0000\u0000\u015c\u015d\u0005k\u0000\u0000\u015d\u015e\u0005e\u0000"+
		"\u0000\u015eX\u0001\u0000\u0000\u0000\u015f\u0160\u0005a\u0000\u0000\u0160"+
		"\u0161\u0005g\u0000\u0000\u0161\u0162\u0005o\u0000\u0000\u0162\u0163\u0005"+
		"D\u0000\u0000\u0163\u0164\u0005a\u0000\u0000\u0164\u0173\u0005y\u0000"+
		"\u0000\u0165\u0166\u0005A\u0000\u0000\u0166\u0167\u0005g\u0000\u0000\u0167"+
		"\u0168\u0005o\u0000\u0000\u0168\u0169\u0005D\u0000\u0000\u0169\u016a\u0005"+
		"a\u0000\u0000\u016a\u0173\u0005y\u0000\u0000\u016b\u016c\u0005a\u0000"+
		"\u0000\u016c\u016d\u0005g\u0000\u0000\u016d\u016e\u0005o\u0000\u0000\u016e"+
		"\u016f\u0005_\u0000\u0000\u016f\u0170\u0005d\u0000\u0000\u0170\u0171\u0005"+
		"a\u0000\u0000\u0171\u0173\u0005y\u0000\u0000\u0172\u015f\u0001\u0000\u0000"+
		"\u0000\u0172\u0165\u0001\u0000\u0000\u0000\u0172\u016b\u0001\u0000\u0000"+
		"\u0000\u0173Z\u0001\u0000\u0000\u0000\u0174\u0175\u0005r\u0000\u0000\u0175"+
		"\u0176\u0005e\u0000\u0000\u0176\u0177\u0005c\u0000\u0000\u0177\u0178\u0005"+
		"e\u0000\u0000\u0178\u0179\u0005n\u0000\u0000\u0179\u017a\u0005t\u0000"+
		"\u0000\u017a\u017b\u0005D\u0000\u0000\u017b\u017c\u0005a\u0000\u0000\u017c"+
		"\u0191\u0005y\u0000\u0000\u017d\u017e\u0005R\u0000\u0000\u017e\u017f\u0005"+
		"e\u0000\u0000\u017f\u0180\u0005c\u0000\u0000\u0180\u0181\u0005e\u0000"+
		"\u0000\u0181\u0182\u0005n\u0000\u0000\u0182\u0183\u0005t\u0000\u0000\u0183"+
		"\u0184\u0005D\u0000\u0000\u0184\u0185\u0005a\u0000\u0000\u0185\u0191\u0005"+
		"y\u0000\u0000\u0186\u0187\u0005r\u0000\u0000\u0187\u0188\u0005e\u0000"+
		"\u0000\u0188\u0189\u0005c\u0000\u0000\u0189\u018a\u0005e\u0000\u0000\u018a"+
		"\u018b\u0005n\u0000\u0000\u018b\u018c\u0005t\u0000\u0000\u018c\u018d\u0005"+
		"_\u0000\u0000\u018d\u018e\u0005d\u0000\u0000\u018e\u018f\u0005a\u0000"+
		"\u0000\u018f\u0191\u0005y\u0000\u0000\u0190\u0174\u0001\u0000\u0000\u0000"+
		"\u0190\u017d\u0001\u0000\u0000\u0000\u0190\u0186\u0001\u0000\u0000\u0000"+
		"\u0191\\\u0001\u0000\u0000\u0000\u0192\u0193\u0005T\u0000\u0000\u0193"+
		"\u0194\u0005R\u0000\u0000\u0194\u0195\u0005U\u0000\u0000\u0195\u01a5\u0005"+
		"E\u0000\u0000\u0196\u0197\u0005t\u0000\u0000\u0197\u0198\u0005r\u0000"+
		"\u0000\u0198\u0199\u0005u\u0000\u0000\u0199\u01a5\u0005e\u0000\u0000\u019a"+
		"\u019b\u0005F\u0000\u0000\u019b\u019c\u0005A\u0000\u0000\u019c\u019d\u0005"+
		"L\u0000\u0000\u019d\u019e\u0005S\u0000\u0000\u019e\u01a5\u0005E\u0000"+
		"\u0000\u019f\u01a0\u0005f\u0000\u0000\u01a0\u01a1\u0005a\u0000\u0000\u01a1"+
		"\u01a2\u0005l\u0000\u0000\u01a2\u01a3\u0005s\u0000\u0000\u01a3\u01a5\u0005"+
		"e\u0000\u0000\u01a4\u0192\u0001\u0000\u0000\u0000\u01a4\u0196\u0001\u0000"+
		"\u0000\u0000\u01a4\u019a\u0001\u0000\u0000\u0000\u01a4\u019f\u0001\u0000"+
		"\u0000\u0000\u01a5^\u0001\u0000\u0000\u0000\u01a6\u01ac\u0005\'\u0000"+
		"\u0000\u01a7\u01ab\b\u0000\u0000\u0000\u01a8\u01a9\u0005\\\u0000\u0000"+
		"\u01a9\u01ab\t\u0000\u0000\u0000\u01aa\u01a7\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad"+
		"\u01af\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af"+
		"\u01bb\u0005\'\u0000\u0000\u01b0\u01b6\u0005\"\u0000\u0000\u01b1\u01b5"+
		"\b\u0001\u0000\u0000\u01b2\u01b3\u0005\\\u0000\u0000\u01b3\u01b5\t\u0000"+
		"\u0000\u0000\u01b4\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bb\u0005\"\u0000"+
		"\u0000\u01ba\u01a6\u0001\u0000\u0000\u0000\u01ba\u01b0\u0001\u0000\u0000"+
		"\u0000\u01bb`\u0001\u0000\u0000\u0000\u01bc\u01be\u0003i4\u0000\u01bd"+
		"\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0"+
		"b\u0001\u0000\u0000\u0000\u01c1\u01c2\u0003g3\u0000\u01c2d\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c7\u0003k5\u0000\u01c4\u01c7\u0003i4\u0000\u01c5"+
		"\u01c7\u0005_\u0000\u0000\u01c6\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u0001\u0000\u0000\u0000\u01c9f\u0001\u0000\u0000\u0000\u01ca\u01cc\u0003"+
		"i4\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d3\u0005.\u0000\u0000"+
		"\u01d0\u01d2\u0003i4\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d4\u01dd\u0001\u0000\u0000\u0000\u01d5\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d8\u0005.\u0000\u0000\u01d7\u01d9\u0003"+
		"i4\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000"+
		"\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000"+
		"\u0000\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc\u01cb\u0001\u0000\u0000"+
		"\u0000\u01dc\u01d6\u0001\u0000\u0000\u0000\u01ddh\u0001\u0000\u0000\u0000"+
		"\u01de\u01df\u0007\u0002\u0000\u0000\u01dfj\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0007\u0003\u0000\u0000\u01e1l\u0001\u0000\u0000\u0000\u01e2\u01e4"+
		"\u0007\u0004\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u00066\u0000\u0000\u01e8n\u0001\u0000\u0000\u0000\u001e\u0000{\u00a9"+
		"\u00b1\u00b7\u00bf\u00c7\u00d9\u00e1\u00ef\u00fd\u0107\u0118\u0124\u0172"+
		"\u0190\u01a4\u01aa\u01ac\u01b4\u01b6\u01ba\u01bf\u01c6\u01c8\u01cd\u01d3"+
		"\u01da\u01dc\u01e5\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}