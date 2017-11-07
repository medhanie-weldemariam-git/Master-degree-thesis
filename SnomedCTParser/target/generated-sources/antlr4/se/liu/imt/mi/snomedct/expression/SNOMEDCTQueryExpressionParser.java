// Generated from se/liu/imt/mi/snomedct/expression/SNOMEDCTQueryExpression.g4 by ANTLR 4.5.3
package se.liu.imt.mi.snomedct.expression;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SNOMEDCTQueryExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DESC=1, DESC_SELF=2, MINUS=3, DISJ=4, EQ_TO=5, SC_OF=6, LPARAN=7, RPARAN=8, 
		COLON=9, PLUS=10, COMMA=11, EQ=12, LCBRACKET=13, RCBRACKET=14, BLOCK_COMMENT=15, 
		EOL_COMMENT=16, NUMBER=17, STRING=18, TERM=19, SCTID=20, WS=21;
	public static final int
		RULE_unaryConstraintOp = 0, RULE_binaryConstraintOp = 1, RULE_query = 2, 
		RULE_subQuery = 3, RULE_statements = 4, RULE_statement = 5, RULE_expression = 6, 
		RULE_definitionStatus = 7, RULE_subExpression = 8, RULE_focusConcept = 9, 
		RULE_conceptReference = 10, RULE_refinement = 11, RULE_attributeGroup = 12, 
		RULE_nonGroupedAttributeSet = 13, RULE_attributeSet = 14, RULE_attribute = 15, 
		RULE_attributeValue = 16, RULE_nestedExpression = 17;
	public static final String[] ruleNames = {
		"unaryConstraintOp", "binaryConstraintOp", "query", "subQuery", "statements", 
		"statement", "expression", "definitionStatus", "subExpression", "focusConcept", 
		"conceptReference", "refinement", "attributeGroup", "nonGroupedAttributeSet", 
		"attributeSet", "attribute", "attributeValue", "nestedExpression"
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

	@Override
	public String getGrammarFileName() { return "SNOMEDCTQueryExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SNOMEDCTQueryExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class UnaryConstraintOpContext extends ParserRuleContext {
		public TerminalNode DESC() { return getToken(SNOMEDCTQueryExpressionParser.DESC, 0); }
		public TerminalNode DESC_SELF() { return getToken(SNOMEDCTQueryExpressionParser.DESC_SELF, 0); }
		public UnaryConstraintOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryConstraintOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitUnaryConstraintOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryConstraintOpContext unaryConstraintOp() throws RecognitionException {
		UnaryConstraintOpContext _localctx = new UnaryConstraintOpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_unaryConstraintOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !(_la==DESC || _la==DESC_SELF) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class BinaryConstraintOpContext extends ParserRuleContext {
		public TerminalNode DISJ() { return getToken(SNOMEDCTQueryExpressionParser.DISJ, 0); }
		public TerminalNode MINUS() { return getToken(SNOMEDCTQueryExpressionParser.MINUS, 0); }
		public BinaryConstraintOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryConstraintOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitBinaryConstraintOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryConstraintOpContext binaryConstraintOp() throws RecognitionException {
		BinaryConstraintOpContext _localctx = new BinaryConstraintOpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_binaryConstraintOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==DISJ) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class QueryContext extends ParserRuleContext {
		public SubQueryContext subQuery() {
			return getRuleContext(SubQueryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SNOMEDCTQueryExpressionParser.EOF, 0); }
		public BinaryConstraintOpContext binaryConstraintOp() {
			return getRuleContext(BinaryConstraintOpContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			subQuery();
			setState(44);
			_la = _input.LA(1);
			if (_la==MINUS || _la==DISJ) {
				{
				setState(41);
				binaryConstraintOp();
				setState(42);
				query();
				}
			}

			setState(46);
			match(EOF);
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

	public static class SubQueryContext extends ParserRuleContext {
		public UnaryConstraintOpContext unaryConstraintOp() {
			return getRuleContext(UnaryConstraintOpContext.class,0);
		}
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public SubQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subQuery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitSubQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubQueryContext subQuery() throws RecognitionException {
		SubQueryContext _localctx = new SubQueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subQuery);
		try {
			setState(52);
			switch (_input.LA(1)) {
			case DESC:
			case DESC_SELF:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				unaryConstraintOp();
				setState(49);
				subExpression();
				}
				break;
			case SCTID:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				subExpression();
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			statement();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPARAN) {
				{
				{
				setState(55);
				statement();
				}
				}
				setState(60);
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

	public static class StatementContext extends ParserRuleContext {
		public List<TerminalNode> LPARAN() { return getTokens(SNOMEDCTQueryExpressionParser.LPARAN); }
		public TerminalNode LPARAN(int i) {
			return getToken(SNOMEDCTQueryExpressionParser.LPARAN, i);
		}
		public List<SubExpressionContext> subExpression() {
			return getRuleContexts(SubExpressionContext.class);
		}
		public SubExpressionContext subExpression(int i) {
			return getRuleContext(SubExpressionContext.class,i);
		}
		public List<TerminalNode> RPARAN() { return getTokens(SNOMEDCTQueryExpressionParser.RPARAN); }
		public TerminalNode RPARAN(int i) {
			return getToken(SNOMEDCTQueryExpressionParser.RPARAN, i);
		}
		public DefinitionStatusContext definitionStatus() {
			return getRuleContext(DefinitionStatusContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(LPARAN);
			setState(62);
			subExpression();
			setState(63);
			match(RPARAN);
			setState(64);
			definitionStatus();
			setState(65);
			match(LPARAN);
			setState(66);
			subExpression();
			setState(67);
			match(RPARAN);
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

	public static class ExpressionContext extends ParserRuleContext {
		public DefinitionStatusContext definitionStatus() {
			return getRuleContext(DefinitionStatusContext.class,0);
		}
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(73);
			switch (_input.LA(1)) {
			case EQ_TO:
			case SC_OF:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				definitionStatus();
				setState(70);
				subExpression();
				}
				break;
			case SCTID:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				subExpression();
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

	public static class DefinitionStatusContext extends ParserRuleContext {
		public TerminalNode EQ_TO() { return getToken(SNOMEDCTQueryExpressionParser.EQ_TO, 0); }
		public TerminalNode SC_OF() { return getToken(SNOMEDCTQueryExpressionParser.SC_OF, 0); }
		public DefinitionStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionStatus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitDefinitionStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionStatusContext definitionStatus() throws RecognitionException {
		DefinitionStatusContext _localctx = new DefinitionStatusContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_definitionStatus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==EQ_TO || _la==SC_OF) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class SubExpressionContext extends ParserRuleContext {
		public FocusConceptContext focusConcept() {
			return getRuleContext(FocusConceptContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SNOMEDCTQueryExpressionParser.COLON, 0); }
		public RefinementContext refinement() {
			return getRuleContext(RefinementContext.class,0);
		}
		public SubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExpressionContext subExpression() throws RecognitionException {
		SubExpressionContext _localctx = new SubExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			focusConcept();
			setState(80);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(78);
				match(COLON);
				setState(79);
				refinement();
				}
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

	public static class FocusConceptContext extends ParserRuleContext {
		public List<ConceptReferenceContext> conceptReference() {
			return getRuleContexts(ConceptReferenceContext.class);
		}
		public ConceptReferenceContext conceptReference(int i) {
			return getRuleContext(ConceptReferenceContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SNOMEDCTQueryExpressionParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SNOMEDCTQueryExpressionParser.PLUS, i);
		}
		public FocusConceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_focusConcept; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitFocusConcept(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FocusConceptContext focusConcept() throws RecognitionException {
		FocusConceptContext _localctx = new FocusConceptContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_focusConcept);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			conceptReference();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(83);
				match(PLUS);
				setState(84);
				conceptReference();
				}
				}
				setState(89);
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

	public static class ConceptReferenceContext extends ParserRuleContext {
		public TerminalNode SCTID() { return getToken(SNOMEDCTQueryExpressionParser.SCTID, 0); }
		public TerminalNode TERM() { return getToken(SNOMEDCTQueryExpressionParser.TERM, 0); }
		public ConceptReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceptReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitConceptReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConceptReferenceContext conceptReference() throws RecognitionException {
		ConceptReferenceContext _localctx = new ConceptReferenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conceptReference);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(SCTID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(SCTID);
				setState(92);
				match(TERM);
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

	public static class RefinementContext extends ParserRuleContext {
		public NonGroupedAttributeSetContext nonGroupedAttributeSet() {
			return getRuleContext(NonGroupedAttributeSetContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SNOMEDCTQueryExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SNOMEDCTQueryExpressionParser.COMMA, i);
		}
		public List<AttributeGroupContext> attributeGroup() {
			return getRuleContexts(AttributeGroupContext.class);
		}
		public AttributeGroupContext attributeGroup(int i) {
			return getRuleContext(AttributeGroupContext.class,i);
		}
		public RefinementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refinement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitRefinement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefinementContext refinement() throws RecognitionException {
		RefinementContext _localctx = new RefinementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_refinement);
		int _la;
		try {
			setState(111);
			switch (_input.LA(1)) {
			case SCTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				nonGroupedAttributeSet();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(96);
					match(COMMA);
					setState(97);
					attributeGroup();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LCBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				attributeGroup();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(104);
					match(COMMA);
					setState(105);
					attributeGroup();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class AttributeGroupContext extends ParserRuleContext {
		public TerminalNode LCBRACKET() { return getToken(SNOMEDCTQueryExpressionParser.LCBRACKET, 0); }
		public AttributeSetContext attributeSet() {
			return getRuleContext(AttributeSetContext.class,0);
		}
		public TerminalNode RCBRACKET() { return getToken(SNOMEDCTQueryExpressionParser.RCBRACKET, 0); }
		public AttributeGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitAttributeGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeGroupContext attributeGroup() throws RecognitionException {
		AttributeGroupContext _localctx = new AttributeGroupContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attributeGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(LCBRACKET);
			setState(114);
			attributeSet();
			setState(115);
			match(RCBRACKET);
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

	public static class NonGroupedAttributeSetContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SNOMEDCTQueryExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SNOMEDCTQueryExpressionParser.COMMA, i);
		}
		public NonGroupedAttributeSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonGroupedAttributeSet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitNonGroupedAttributeSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonGroupedAttributeSetContext nonGroupedAttributeSet() throws RecognitionException {
		NonGroupedAttributeSetContext _localctx = new NonGroupedAttributeSetContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nonGroupedAttributeSet);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			attribute();
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118);
					match(COMMA);
					setState(119);
					attribute();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class AttributeSetContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SNOMEDCTQueryExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SNOMEDCTQueryExpressionParser.COMMA, i);
		}
		public AttributeSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitAttributeSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSetContext attributeSet() throws RecognitionException {
		AttributeSetContext _localctx = new AttributeSetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attributeSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			attribute();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(126);
				match(COMMA);
				setState(127);
				attribute();
				}
				}
				setState(132);
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

	public static class AttributeContext extends ParserRuleContext {
		public ConceptReferenceContext attributeType;
		public TerminalNode EQ() { return getToken(SNOMEDCTQueryExpressionParser.EQ, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public ConceptReferenceContext conceptReference() {
			return getRuleContext(ConceptReferenceContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((AttributeContext)_localctx).attributeType = conceptReference();
			setState(134);
			match(EQ);
			setState(135);
			attributeValue();
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

	public static class AttributeValueContext extends ParserRuleContext {
		public ConceptReferenceContext conceptReference() {
			return getRuleContext(ConceptReferenceContext.class,0);
		}
		public NestedExpressionContext nestedExpression() {
			return getRuleContext(NestedExpressionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(SNOMEDCTQueryExpressionParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SNOMEDCTQueryExpressionParser.STRING, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attributeValue);
		try {
			setState(141);
			switch (_input.LA(1)) {
			case SCTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				conceptReference();
				}
				break;
			case LPARAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				nestedExpression();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(STRING);
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

	public static class NestedExpressionContext extends ParserRuleContext {
		public TerminalNode LPARAN() { return getToken(SNOMEDCTQueryExpressionParser.LPARAN, 0); }
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public TerminalNode RPARAN() { return getToken(SNOMEDCTQueryExpressionParser.RPARAN, 0); }
		public NestedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionVisitor ) return ((SNOMEDCTQueryExpressionVisitor<? extends T>)visitor).visitNestedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedExpressionContext nestedExpression() throws RecognitionException {
		NestedExpressionContext _localctx = new NestedExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nestedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(LPARAN);
			setState(144);
			subExpression();
			setState(145);
			match(RPARAN);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\5\5\67\n\5\3\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bL\n\b\3\t\3\t\3\n\3\n\3\n\5\nS\n\n\3\13"+
		"\3\13\3\13\7\13X\n\13\f\13\16\13[\13\13\3\f\3\f\3\f\5\f`\n\f\3\r\3\r\3"+
		"\r\7\re\n\r\f\r\16\rh\13\r\3\r\3\r\3\r\7\rm\n\r\f\r\16\rp\13\r\5\rr\n"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17{\n\17\f\17\16\17~\13\17\3\20"+
		"\3\20\3\20\7\20\u0083\n\20\f\20\16\20\u0086\13\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\5\22\u0090\n\22\3\23\3\23\3\23\3\23\3\23\2\2\24\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\3\2\3\4\3\2\5\6\3\2\7\b"+
		"\u0092\2&\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\b\66\3\2\2\2\n8\3\2\2\2\f?\3\2"+
		"\2\2\16K\3\2\2\2\20M\3\2\2\2\22O\3\2\2\2\24T\3\2\2\2\26_\3\2\2\2\30q\3"+
		"\2\2\2\32s\3\2\2\2\34w\3\2\2\2\36\177\3\2\2\2 \u0087\3\2\2\2\"\u008f\3"+
		"\2\2\2$\u0091\3\2\2\2&\'\t\2\2\2\'\3\3\2\2\2()\t\3\2\2)\5\3\2\2\2*.\5"+
		"\b\5\2+,\5\4\3\2,-\5\6\4\2-/\3\2\2\2.+\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60"+
		"\61\7\2\2\3\61\7\3\2\2\2\62\63\5\2\2\2\63\64\5\22\n\2\64\67\3\2\2\2\65"+
		"\67\5\22\n\2\66\62\3\2\2\2\66\65\3\2\2\2\67\t\3\2\2\28<\5\f\7\29;\5\f"+
		"\7\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\13\3\2\2\2><\3\2\2\2?@\7"+
		"\t\2\2@A\5\22\n\2AB\7\n\2\2BC\5\20\t\2CD\7\t\2\2DE\5\22\n\2EF\7\n\2\2"+
		"F\r\3\2\2\2GH\5\20\t\2HI\5\22\n\2IL\3\2\2\2JL\5\22\n\2KG\3\2\2\2KJ\3\2"+
		"\2\2L\17\3\2\2\2MN\t\4\2\2N\21\3\2\2\2OR\5\24\13\2PQ\7\13\2\2QS\5\30\r"+
		"\2RP\3\2\2\2RS\3\2\2\2S\23\3\2\2\2TY\5\26\f\2UV\7\f\2\2VX\5\26\f\2WU\3"+
		"\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\25\3\2\2\2[Y\3\2\2\2\\`\7\26\2\2"+
		"]^\7\26\2\2^`\7\25\2\2_\\\3\2\2\2_]\3\2\2\2`\27\3\2\2\2af\5\34\17\2bc"+
		"\7\r\2\2ce\5\32\16\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gr\3\2\2\2"+
		"hf\3\2\2\2in\5\32\16\2jk\7\r\2\2km\5\32\16\2lj\3\2\2\2mp\3\2\2\2nl\3\2"+
		"\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qa\3\2\2\2qi\3\2\2\2r\31\3\2\2\2st\7"+
		"\17\2\2tu\5\36\20\2uv\7\20\2\2v\33\3\2\2\2w|\5 \21\2xy\7\r\2\2y{\5 \21"+
		"\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\35\3\2\2\2~|\3\2\2\2\177\u0084"+
		"\5 \21\2\u0080\u0081\7\r\2\2\u0081\u0083\5 \21\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\37\3\2\2"+
		"\2\u0086\u0084\3\2\2\2\u0087\u0088\5\26\f\2\u0088\u0089\7\16\2\2\u0089"+
		"\u008a\5\"\22\2\u008a!\3\2\2\2\u008b\u0090\5\26\f\2\u008c\u0090\5$\23"+
		"\2\u008d\u0090\7\23\2\2\u008e\u0090\7\24\2\2\u008f\u008b\3\2\2\2\u008f"+
		"\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090#\3\2\2\2"+
		"\u0091\u0092\7\t\2\2\u0092\u0093\5\22\n\2\u0093\u0094\7\n\2\2\u0094%\3"+
		"\2\2\2\17.\66<KRY_fnq|\u0084\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}