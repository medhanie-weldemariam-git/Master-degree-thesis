// Generated from se/liu/imt/mi/snomedct/expression/SNOMEDCTExpression.g4 by ANTLR 4.5.3
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
public class SNOMEDCTExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQ_TO=1, SC_OF=2, LPARAN=3, RPARAN=4, COLON=5, PLUS=6, COMMA=7, EQ=8, 
		LCBRACKET=9, RCBRACKET=10, BLOCK_COMMENT=11, EOL_COMMENT=12, NUMBER=13, 
		STRING=14, TERM=15, SCTID=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"EQ_TO", "SC_OF", "LPARAN", "RPARAN", "COLON", "PLUS", "COMMA", "EQ", 
		"LCBRACKET", "RCBRACKET", "BLOCK_COMMENT", "EOL_COMMENT", "NUMBER", "STRING", 
		"ESCAPE_CHAR", "TERM", "SCTID", "DIGIT", "NONZERO", "NONWSNONPIPE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'==='", "'<<<'", "'('", "')'", "':'", "'+'", "','", "'='", "'{'", 
		"'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EQ_TO", "SC_OF", "LPARAN", "RPARAN", "COLON", "PLUS", "COMMA", 
		"EQ", "LCBRACKET", "RCBRACKET", "BLOCK_COMMENT", "EOL_COMMENT", "NUMBER", 
		"STRING", "TERM", "SCTID", "WS"
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


	public SNOMEDCTExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SNOMEDCTExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u00b6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\7\fJ\n\f\f\f\16\fM\13\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\7\rX\n\r\f\r\16\r[\13\r\3\r\3\r\3\16\3\16\5\16a\n\16\3\16"+
		"\3\16\7\16e\n\16\f\16\16\16h\13\16\3\16\3\16\7\16l\n\16\f\16\16\16o\13"+
		"\16\5\16q\n\16\3\16\3\16\5\16u\n\16\3\16\3\16\3\16\3\16\6\16{\n\16\r\16"+
		"\16\16|\5\16\177\n\16\3\17\3\17\3\17\7\17\u0084\n\17\f\17\16\17\u0087"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u008f\n\20\3\21\3\21\7\21\u0093"+
		"\n\21\f\21\16\21\u0096\13\21\3\21\3\21\3\21\7\21\u009b\n\21\f\21\16\21"+
		"\u009e\13\21\3\21\3\21\3\22\5\22\u00a3\n\22\3\22\3\22\3\22\7\22\u00a8"+
		"\n\22\f\22\16\22\u00ab\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\4K\u0085\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\2!\21#\22%\2\'\2)\2+\23\3\2\6\4\2\f\f\17\17\4"+
		"\2$$^^\6\2\13\f\16\17\"\"~~\5\2\13\f\16\17\"\"\u00c3\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\61\3"+
		"\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21"+
		"?\3\2\2\2\23A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31S\3\2\2\2\33~\3\2\2\2"+
		"\35\u0080\3\2\2\2\37\u008e\3\2\2\2!\u0090\3\2\2\2#\u00a2\3\2\2\2%\u00ac"+
		"\3\2\2\2\'\u00ae\3\2\2\2)\u00b0\3\2\2\2+\u00b2\3\2\2\2-.\7?\2\2./\7?\2"+
		"\2/\60\7?\2\2\60\4\3\2\2\2\61\62\7>\2\2\62\63\7>\2\2\63\64\7>\2\2\64\6"+
		"\3\2\2\2\65\66\7*\2\2\66\b\3\2\2\2\678\7+\2\28\n\3\2\2\29:\7<\2\2:\f\3"+
		"\2\2\2;<\7-\2\2<\16\3\2\2\2=>\7.\2\2>\20\3\2\2\2?@\7?\2\2@\22\3\2\2\2"+
		"AB\7}\2\2B\24\3\2\2\2CD\7\177\2\2D\26\3\2\2\2EF\7\61\2\2FG\7,\2\2GK\3"+
		"\2\2\2HJ\13\2\2\2IH\3\2\2\2JM\3\2\2\2KL\3\2\2\2KI\3\2\2\2LN\3\2\2\2MK"+
		"\3\2\2\2NO\7,\2\2OP\7\61\2\2PQ\3\2\2\2QR\b\f\2\2R\30\3\2\2\2ST\7\61\2"+
		"\2TU\7\61\2\2UY\3\2\2\2VX\n\2\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2"+
		"\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\b\r\2\2]\32\3\2\2\2^`\7%\2\2_a\7/\2\2`_\3"+
		"\2\2\2`a\3\2\2\2ab\3\2\2\2bf\5\'\24\2ce\5%\23\2dc\3\2\2\2eh\3\2\2\2fd"+
		"\3\2\2\2fg\3\2\2\2gp\3\2\2\2hf\3\2\2\2im\7\60\2\2jl\5%\23\2kj\3\2\2\2"+
		"lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nq\3\2\2\2om\3\2\2\2pi\3\2\2\2pq\3\2\2\2"+
		"q\177\3\2\2\2rt\7%\2\2su\7/\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\62\2"+
		"\2wx\7\60\2\2xz\3\2\2\2y{\5%\23\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}\177\3\2\2\2~^\3\2\2\2~r\3\2\2\2\177\34\3\2\2\2\u0080\u0085\7$\2"+
		"\2\u0081\u0084\5\37\20\2\u0082\u0084\n\3\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0086\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7$\2\2\u0089"+
		"\36\3\2\2\2\u008a\u008b\7^\2\2\u008b\u008f\7$\2\2\u008c\u008d\7^\2\2\u008d"+
		"\u008f\7^\2\2\u008e\u008a\3\2\2\2\u008e\u008c\3\2\2\2\u008f \3\2\2\2\u0090"+
		"\u0094\7~\2\2\u0091\u0093\7\"\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u009c\5)\25\2\u0098\u009b\7\"\2\2\u0099\u009b\5)"+
		"\25\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a0\7~\2\2\u00a0\"\3\2\2\2\u00a1\u00a3\7/\2\2\u00a2\u00a1"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a9\5\'\24\2"+
		"\u00a5\u00a8\5%\23\2\u00a6\u00a8\7/\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"$\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\4\62;\2\u00ad&\3\2\2\2\u00ae"+
		"\u00af\4\63;\2\u00af(\3\2\2\2\u00b0\u00b1\n\4\2\2\u00b1*\3\2\2\2\u00b2"+
		"\u00b3\t\5\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\26\2\2\u00b5,\3\2\2\2"+
		"\25\2KY`fmpt|~\u0083\u0085\u008e\u0094\u009a\u009c\u00a2\u00a7\u00a9\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}