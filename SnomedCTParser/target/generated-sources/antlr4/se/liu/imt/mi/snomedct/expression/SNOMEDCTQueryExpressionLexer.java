// Generated from se/liu/imt/mi/snomedct/expression/SNOMEDCTQueryExpression.g4 by ANTLR 4.5.3
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
public class SNOMEDCTQueryExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DESC=1, DESC_SELF=2, MINUS=3, DISJ=4, EQ_TO=5, SC_OF=6, LPARAN=7, RPARAN=8, 
		COLON=9, PLUS=10, COMMA=11, EQ=12, LCBRACKET=13, RCBRACKET=14, BLOCK_COMMENT=15, 
		EOL_COMMENT=16, NUMBER=17, STRING=18, TERM=19, SCTID=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DESC", "DESC_SELF", "MINUS", "DISJ", "EQ_TO", "SC_OF", "LPARAN", "RPARAN", 
		"COLON", "PLUS", "COMMA", "EQ", "LCBRACKET", "RCBRACKET", "BLOCK_COMMENT", 
		"EOL_COMMENT", "NUMBER", "STRING", "ESCAPE_CHAR", "TERM", "SCTID", "DIGIT", 
		"NONZERO", "NONWSNONPIPE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'<<'", "'MINUS'", "'OR'", "'==='", "'<<<'", "'('", "')'", 
		"':'", "'+'", "','", "'='", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DESC", "DESC_SELF", "MINUS", "DISJ", "EQ_TO", "SC_OF", "LPARAN", 
		"RPARAN", "COLON", "PLUS", "COMMA", "EQ", "LCBRACKET", "RCBRACKET", "BLOCK_COMMENT", 
		"EOL_COMMENT", "NUMBER", "STRING", "TERM", "SCTID", "WS"
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


	public SNOMEDCTQueryExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SNOMEDCTQueryExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u00cc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20`\n\20\f\20"+
		"\16\20c\13\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21n\n\21"+
		"\f\21\16\21q\13\21\3\21\3\21\3\22\3\22\5\22w\n\22\3\22\3\22\7\22{\n\22"+
		"\f\22\16\22~\13\22\3\22\3\22\7\22\u0082\n\22\f\22\16\22\u0085\13\22\5"+
		"\22\u0087\n\22\3\22\3\22\5\22\u008b\n\22\3\22\3\22\3\22\3\22\6\22\u0091"+
		"\n\22\r\22\16\22\u0092\5\22\u0095\n\22\3\23\3\23\3\23\7\23\u009a\n\23"+
		"\f\23\16\23\u009d\13\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00a5\n\24"+
		"\3\25\3\25\7\25\u00a9\n\25\f\25\16\25\u00ac\13\25\3\25\3\25\3\25\7\25"+
		"\u00b1\n\25\f\25\16\25\u00b4\13\25\3\25\3\25\3\26\5\26\u00b9\n\26\3\26"+
		"\3\26\3\26\7\26\u00be\n\26\f\26\16\26\u00c1\13\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\4a\u009b\2\33\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\25"+
		"+\26-\2/\2\61\2\63\27\3\2\6\4\2\f\f\17\17\4\2$$^^\6\2\13\f\16\17\"\"~"+
		"~\5\2\13\f\16\17\"\"\u00d9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\63\3\2"+
		"\2\2\3\65\3\2\2\2\5\67\3\2\2\2\7:\3\2\2\2\t@\3\2\2\2\13C\3\2\2\2\rG\3"+
		"\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31"+
		"U\3\2\2\2\33W\3\2\2\2\35Y\3\2\2\2\37[\3\2\2\2!i\3\2\2\2#\u0094\3\2\2\2"+
		"%\u0096\3\2\2\2\'\u00a4\3\2\2\2)\u00a6\3\2\2\2+\u00b8\3\2\2\2-\u00c2\3"+
		"\2\2\2/\u00c4\3\2\2\2\61\u00c6\3\2\2\2\63\u00c8\3\2\2\2\65\66\7>\2\2\66"+
		"\4\3\2\2\2\678\7>\2\289\7>\2\29\6\3\2\2\2:;\7O\2\2;<\7K\2\2<=\7P\2\2="+
		">\7W\2\2>?\7U\2\2?\b\3\2\2\2@A\7Q\2\2AB\7T\2\2B\n\3\2\2\2CD\7?\2\2DE\7"+
		"?\2\2EF\7?\2\2F\f\3\2\2\2GH\7>\2\2HI\7>\2\2IJ\7>\2\2J\16\3\2\2\2KL\7*"+
		"\2\2L\20\3\2\2\2MN\7+\2\2N\22\3\2\2\2OP\7<\2\2P\24\3\2\2\2QR\7-\2\2R\26"+
		"\3\2\2\2ST\7.\2\2T\30\3\2\2\2UV\7?\2\2V\32\3\2\2\2WX\7}\2\2X\34\3\2\2"+
		"\2YZ\7\177\2\2Z\36\3\2\2\2[\\\7\61\2\2\\]\7,\2\2]a\3\2\2\2^`\13\2\2\2"+
		"_^\3\2\2\2`c\3\2\2\2ab\3\2\2\2a_\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7,\2\2"+
		"ef\7\61\2\2fg\3\2\2\2gh\b\20\2\2h \3\2\2\2ij\7\61\2\2jk\7\61\2\2ko\3\2"+
		"\2\2ln\n\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2"+
		"\2\2rs\b\21\2\2s\"\3\2\2\2tv\7%\2\2uw\7/\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2"+
		"\2\2x|\5/\30\2y{\5-\27\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0086"+
		"\3\2\2\2~|\3\2\2\2\177\u0083\7\60\2\2\u0080\u0082\5-\27\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086\177\3\2\2\2\u0086\u0087\3\2\2"+
		"\2\u0087\u0095\3\2\2\2\u0088\u008a\7%\2\2\u0089\u008b\7/\2\2\u008a\u0089"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\62\2\2"+
		"\u008d\u008e\7\60\2\2\u008e\u0090\3\2\2\2\u008f\u0091\5-\27\2\u0090\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094t\3\2\2\2\u0094\u0088\3\2\2\2\u0095$\3\2\2\2\u0096"+
		"\u009b\7$\2\2\u0097\u009a\5\'\24\2\u0098\u009a\n\3\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u009c\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7$"+
		"\2\2\u009f&\3\2\2\2\u00a0\u00a1\7^\2\2\u00a1\u00a5\7$\2\2\u00a2\u00a3"+
		"\7^\2\2\u00a3\u00a5\7^\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"(\3\2\2\2\u00a6\u00aa\7~\2\2\u00a7\u00a9\7\"\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b2\5\61\31\2\u00ae\u00b1\7\"\2\2\u00af"+
		"\u00b1\5\61\31\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3"+
		"\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\7~\2\2\u00b6*\3\2\2\2\u00b7\u00b9\7/\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bf\5/"+
		"\30\2\u00bb\u00be\5-\27\2\u00bc\u00be\7/\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0,\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\4\62;\2\u00c3.\3\2"+
		"\2\2\u00c4\u00c5\4\63;\2\u00c5\60\3\2\2\2\u00c6\u00c7\n\4\2\2\u00c7\62"+
		"\3\2\2\2\u00c8\u00c9\t\5\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\32\2\2"+
		"\u00cb\64\3\2\2\2\25\2aov|\u0083\u0086\u008a\u0092\u0094\u0099\u009b\u00a4"+
		"\u00aa\u00b0\u00b2\u00b8\u00bd\u00bf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}