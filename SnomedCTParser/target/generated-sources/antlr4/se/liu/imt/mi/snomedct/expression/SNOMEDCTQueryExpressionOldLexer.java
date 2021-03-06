// Generated from se/liu/imt/mi/snomedct/expression/SNOMEDCTQueryExpressionOld.g4 by ANTLR 4.5.3
package se.liu.imt.mi.snomedct.expression;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SNOMEDCTQueryExpressionOldLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, EQ_TO=5, SC_OF=6, LPARAN=7, RPARAN=8, 
		COLON=9, PLUS=10, COMMA=11, EQ=12, LCBRACKET=13, RCBRACKET=14, BLOCK_COMMENT=15, 
		EOL_COMMENT=16, NUMBER=17, STRING=18, TERM=19, SCTID=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "EQ_TO", "SC_OF", "LPARAN", "RPARAN", 
		"COLON", "PLUS", "COMMA", "EQ", "LCBRACKET", "RCBRACKET", "BLOCK_COMMENT", 
		"EOL_COMMENT", "NUMBER", "STRING", "ESCAPE_CHAR", "TERM", "SCTID", "DIGIT", 
		"NONZERO", "NONWSNONPIPE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Descendants'", "'DescendantsAndSelf'", "'Union'", "'All'", "'==='", 
		"'<<<'", "'('", "')'", "':'", "'+'", "','", "'='", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "EQ_TO", "SC_OF", "LPARAN", "RPARAN", "COLON", 
		"PLUS", "COMMA", "EQ", "LCBRACKET", "RCBRACKET", "BLOCK_COMMENT", "EOL_COMMENT", 
		"NUMBER", "STRING", "TERM", "SCTID", "WS"
	};
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


	public SNOMEDCTQueryExpressionOldLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SNOMEDCTQueryExpressionOld.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u00e7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\7\20{\n\20\f\20\16\20~\13\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\7\21\u0089\n\21\f\21\16\21\u008c\13\21\3"+
		"\21\3\21\3\22\3\22\5\22\u0092\n\22\3\22\3\22\7\22\u0096\n\22\f\22\16\22"+
		"\u0099\13\22\3\22\3\22\7\22\u009d\n\22\f\22\16\22\u00a0\13\22\5\22\u00a2"+
		"\n\22\3\22\3\22\5\22\u00a6\n\22\3\22\3\22\3\22\3\22\6\22\u00ac\n\22\r"+
		"\22\16\22\u00ad\5\22\u00b0\n\22\3\23\3\23\3\23\7\23\u00b5\n\23\f\23\16"+
		"\23\u00b8\13\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00c0\n\24\3\25\3\25"+
		"\7\25\u00c4\n\25\f\25\16\25\u00c7\13\25\3\25\3\25\3\25\7\25\u00cc\n\25"+
		"\f\25\16\25\u00cf\13\25\3\25\3\25\3\26\5\26\u00d4\n\26\3\26\3\26\3\26"+
		"\7\26\u00d9\n\26\f\26\16\26\u00dc\13\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\4|\u00b6\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\25+\26-\2/\2"+
		"\61\2\63\27\3\2\6\4\2\f\f\17\17\4\2$$^^\6\2\13\f\16\17\"\"~~\5\2\13\f"+
		"\16\17\"\"\u00f4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\63\3\2\2\2\3\65"+
		"\3\2\2\2\5A\3\2\2\2\7T\3\2\2\2\tZ\3\2\2\2\13^\3\2\2\2\rb\3\2\2\2\17f\3"+
		"\2\2\2\21h\3\2\2\2\23j\3\2\2\2\25l\3\2\2\2\27n\3\2\2\2\31p\3\2\2\2\33"+
		"r\3\2\2\2\35t\3\2\2\2\37v\3\2\2\2!\u0084\3\2\2\2#\u00af\3\2\2\2%\u00b1"+
		"\3\2\2\2\'\u00bf\3\2\2\2)\u00c1\3\2\2\2+\u00d3\3\2\2\2-\u00dd\3\2\2\2"+
		"/\u00df\3\2\2\2\61\u00e1\3\2\2\2\63\u00e3\3\2\2\2\65\66\7F\2\2\66\67\7"+
		"g\2\2\678\7u\2\289\7e\2\29:\7g\2\2:;\7p\2\2;<\7f\2\2<=\7c\2\2=>\7p\2\2"+
		">?\7v\2\2?@\7u\2\2@\4\3\2\2\2AB\7F\2\2BC\7g\2\2CD\7u\2\2DE\7e\2\2EF\7"+
		"g\2\2FG\7p\2\2GH\7f\2\2HI\7c\2\2IJ\7p\2\2JK\7v\2\2KL\7u\2\2LM\7C\2\2M"+
		"N\7p\2\2NO\7f\2\2OP\7U\2\2PQ\7g\2\2QR\7n\2\2RS\7h\2\2S\6\3\2\2\2TU\7W"+
		"\2\2UV\7p\2\2VW\7k\2\2WX\7q\2\2XY\7p\2\2Y\b\3\2\2\2Z[\7C\2\2[\\\7n\2\2"+
		"\\]\7n\2\2]\n\3\2\2\2^_\7?\2\2_`\7?\2\2`a\7?\2\2a\f\3\2\2\2bc\7>\2\2c"+
		"d\7>\2\2de\7>\2\2e\16\3\2\2\2fg\7*\2\2g\20\3\2\2\2hi\7+\2\2i\22\3\2\2"+
		"\2jk\7<\2\2k\24\3\2\2\2lm\7-\2\2m\26\3\2\2\2no\7.\2\2o\30\3\2\2\2pq\7"+
		"?\2\2q\32\3\2\2\2rs\7}\2\2s\34\3\2\2\2tu\7\177\2\2u\36\3\2\2\2vw\7\61"+
		"\2\2wx\7,\2\2x|\3\2\2\2y{\13\2\2\2zy\3\2\2\2{~\3\2\2\2|}\3\2\2\2|z\3\2"+
		"\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7,\2\2\u0080\u0081\7\61\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\b\20\2\2\u0083 \3\2\2\2\u0084\u0085\7\61\2"+
		"\2\u0085\u0086\7\61\2\2\u0086\u008a\3\2\2\2\u0087\u0089\n\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\b\21\2\2\u008e"+
		"\"\3\2\2\2\u008f\u0091\7%\2\2\u0090\u0092\7/\2\2\u0091\u0090\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0097\5/\30\2\u0094\u0096\5-"+
		"\27\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u00a1\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009e\7\60"+
		"\2\2\u009b\u009d\5-\27\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u009a\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00b0\3\2\2\2\u00a3"+
		"\u00a5\7%\2\2\u00a4\u00a6\7/\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2"+
		"\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\62\2\2\u00a8\u00a9\7\60\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00ac\5-\27\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u008f\3\2\2\2\u00af\u00a3\3\2\2\2\u00b0$\3\2\2\2\u00b1\u00b6\7$\2\2\u00b2"+
		"\u00b5\5\'\24\2\u00b3\u00b5\n\3\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3"+
		"\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7$\2\2\u00ba&\3\2\2\2\u00bb"+
		"\u00bc\7^\2\2\u00bc\u00c0\7$\2\2\u00bd\u00be\7^\2\2\u00be\u00c0\7^\2\2"+
		"\u00bf\u00bb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0(\3\2\2\2\u00c1\u00c5\7"+
		"~\2\2\u00c2\u00c4\7\"\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00cd\5\61\31\2\u00c9\u00cc\7\"\2\2\u00ca\u00cc\5\61\31\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d1\7~\2\2\u00d1*\3\2\2\2\u00d2\u00d4\7/\2\2\u00d3\u00d2\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00da\5/\30\2\u00d6\u00d9\5-"+
		"\27\2\u00d7\u00d9\7/\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db,\3\2\2\2"+
		"\u00dc\u00da\3\2\2\2\u00dd\u00de\4\62;\2\u00de.\3\2\2\2\u00df\u00e0\4"+
		"\63;\2\u00e0\60\3\2\2\2\u00e1\u00e2\n\4\2\2\u00e2\62\3\2\2\2\u00e3\u00e4"+
		"\t\5\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b\32\2\2\u00e6\64\3\2\2\2\25"+
		"\2|\u008a\u0091\u0097\u009e\u00a1\u00a5\u00ad\u00af\u00b4\u00b6\u00bf"+
		"\u00c5\u00cb\u00cd\u00d3\u00d8\u00da\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}