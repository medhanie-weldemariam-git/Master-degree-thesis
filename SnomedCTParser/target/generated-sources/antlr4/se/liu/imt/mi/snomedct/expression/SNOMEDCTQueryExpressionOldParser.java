// Generated from se/liu/imt/mi/snomedct/expression/SNOMEDCTQueryExpressionOld.g4 by ANTLR 4.5.3
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
public class SNOMEDCTQueryExpressionOldParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, EQ_TO=5, SC_OF=6, LPARAN=7, RPARAN=8, 
		COLON=9, PLUS=10, COMMA=11, EQ=12, LCBRACKET=13, RCBRACKET=14, BLOCK_COMMENT=15, 
		EOL_COMMENT=16, NUMBER=17, STRING=18, TERM=19, SCTID=20, WS=21;
	public static final int
		RULE_query = 0, RULE_querySet = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_expression = 4, RULE_definitionStatus = 5, RULE_subExpression = 6, 
		RULE_focusConcept = 7, RULE_conceptReference = 8, RULE_refinement = 9, 
		RULE_attributeGroup = 10, RULE_nonGroupedAttributeSet = 11, RULE_attributeSet = 12, 
		RULE_attribute = 13, RULE_attributeValue = 14, RULE_nestedExpression = 15;
	public static final String[] ruleNames = {
		"query", "querySet", "statements", "statement", "expression", "definitionStatus", 
		"subExpression", "focusConcept", "conceptReference", "refinement", "attributeGroup", 
		"nonGroupedAttributeSet", "attributeSet", "attribute", "attributeValue", 
		"nestedExpression"
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

	@Override
	public String getGrammarFileName() { return "SNOMEDCTQueryExpressionOld.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SNOMEDCTQueryExpressionOldParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QuerySetContext querySet() {
			return getRuleContext(QuerySetContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			setState(49);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(T__0);
				setState(33);
				match(LPARAN);
				setState(34);
				query();
				setState(35);
				match(RPARAN);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(T__1);
				setState(38);
				match(LPARAN);
				setState(39);
				query();
				setState(40);
				match(RPARAN);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(T__2);
				setState(43);
				match(LPARAN);
				setState(44);
				querySet();
				setState(45);
				match(RPARAN);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(T__3);
				}
				break;
			case EQ_TO:
			case SC_OF:
			case SCTID:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				expression();
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

	public static class QuerySetContext extends ParserRuleContext {
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public QuerySetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitQuerySet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySetContext querySet() throws RecognitionException {
		QuerySetContext _localctx = new QuerySetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_querySet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			query();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(52);
				match(COMMA);
				setState(53);
				query();
				}
				}
				setState(58);
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
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			statement();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPARAN) {
				{
				{
				setState(60);
				statement();
				}
				}
				setState(65);
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
		public List<TerminalNode> LPARAN() { return getTokens(SNOMEDCTQueryExpressionOldParser.LPARAN); }
		public TerminalNode LPARAN(int i) {
			return getToken(SNOMEDCTQueryExpressionOldParser.LPARAN, i);
		}
		public List<SubExpressionContext> subExpression() {
			return getRuleContexts(SubExpressionContext.class);
		}
		public SubExpressionContext subExpression(int i) {
			return getRuleContext(SubExpressionContext.class,i);
		}
		public List<TerminalNode> RPARAN() { return getTokens(SNOMEDCTQueryExpressionOldParser.RPARAN); }
		public TerminalNode RPARAN(int i) {
			return getToken(SNOMEDCTQueryExpressionOldParser.RPARAN, i);
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
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(LPARAN);
			setState(67);
			subExpression();
			setState(68);
			match(RPARAN);
			setState(69);
			definitionStatus();
			setState(70);
			match(LPARAN);
			setState(71);
			subExpression();
			setState(72);
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
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(78);
			switch (_input.LA(1)) {
			case EQ_TO:
			case SC_OF:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				definitionStatus();
				setState(75);
				subExpression();
				}
				break;
			case SCTID:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
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
		public TerminalNode EQ_TO() { return getToken(SNOMEDCTQueryExpressionOldParser.EQ_TO, 0); }
		public TerminalNode SC_OF() { return getToken(SNOMEDCTQueryExpressionOldParser.SC_OF, 0); }
		public DefinitionStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionStatus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitDefinitionStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionStatusContext definitionStatus() throws RecognitionException {
		DefinitionStatusContext _localctx = new DefinitionStatusContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definitionStatus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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
		public TerminalNode COLON() { return getToken(SNOMEDCTQueryExpressionOldParser.COLON, 0); }
		public RefinementContext refinement() {
			return getRuleContext(RefinementContext.class,0);
		}
		public SubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExpressionContext subExpression() throws RecognitionException {
		SubExpressionContext _localctx = new SubExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_subExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			focusConcept();
			setState(85);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(83);
				match(COLON);
				setState(84);
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
		public List<TerminalNode> PLUS() { return getTokens(SNOMEDCTQueryExpressionOldParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SNOMEDCTQueryExpressionOldParser.PLUS, i);
		}
		public FocusConceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_focusConcept; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitFocusConcept(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FocusConceptContext focusConcept() throws RecognitionException {
		FocusConceptContext _localctx = new FocusConceptContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_focusConcept);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			conceptReference();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(88);
				match(PLUS);
				setState(89);
				conceptReference();
				}
				}
				setState(94);
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
		public TerminalNode SCTID() { return getToken(SNOMEDCTQueryExpressionOldParser.SCTID, 0); }
		public TerminalNode TERM() { return getToken(SNOMEDCTQueryExpressionOldParser.TERM, 0); }
		public ConceptReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceptReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitConceptReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConceptReferenceContext conceptReference() throws RecognitionException {
		ConceptReferenceContext _localctx = new ConceptReferenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conceptReference);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(SCTID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(SCTID);
				setState(97);
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
		public List<TerminalNode> COMMA() { return getTokens(SNOMEDCTQueryExpressionOldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SNOMEDCTQueryExpressionOldParser.COMMA, i);
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
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitRefinement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefinementContext refinement() throws RecognitionException {
		RefinementContext _localctx = new RefinementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_refinement);
		try {
			int _alt;
			setState(116);
			switch (_input.LA(1)) {
			case SCTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				nonGroupedAttributeSet();
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(101);
						match(COMMA);
						setState(102);
						attributeGroup();
						}
						} 
					}
					setState(107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case LCBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				attributeGroup();
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(109);
						match(COMMA);
						setState(110);
						attributeGroup();
						}
						} 
					}
					setState(115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public TerminalNode LCBRACKET() { return getToken(SNOMEDCTQueryExpressionOldParser.LCBRACKET, 0); }
		public AttributeSetContext attributeSet() {
			return getRuleContext(AttributeSetContext.class,0);
		}
		public TerminalNode RCBRACKET() { return getToken(SNOMEDCTQueryExpressionOldParser.RCBRACKET, 0); }
		public AttributeGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitAttributeGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeGroupContext attributeGroup() throws RecognitionException {
		AttributeGroupContext _localctx = new AttributeGroupContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attributeGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(LCBRACKET);
			setState(119);
			attributeSet();
			setState(120);
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
		public List<TerminalNode> COMMA() { return getTokens(SNOMEDCTQueryExpressionOldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SNOMEDCTQueryExpressionOldParser.COMMA, i);
		}
		public NonGroupedAttributeSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonGroupedAttributeSet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitNonGroupedAttributeSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonGroupedAttributeSetContext nonGroupedAttributeSet() throws RecognitionException {
		NonGroupedAttributeSetContext _localctx = new NonGroupedAttributeSetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nonGroupedAttributeSet);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			attribute();
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					match(COMMA);
					setState(124);
					attribute();
					}
					} 
				}
				setState(129);
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
		public List<TerminalNode> COMMA() { return getTokens(SNOMEDCTQueryExpressionOldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SNOMEDCTQueryExpressionOldParser.COMMA, i);
		}
		public AttributeSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitAttributeSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSetContext attributeSet() throws RecognitionException {
		AttributeSetContext _localctx = new AttributeSetContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attributeSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			attribute();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131);
				match(COMMA);
				setState(132);
				attribute();
				}
				}
				setState(137);
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
		public TerminalNode EQ() { return getToken(SNOMEDCTQueryExpressionOldParser.EQ, 0); }
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
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((AttributeContext)_localctx).attributeType = conceptReference();
			setState(139);
			match(EQ);
			setState(140);
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
		public TerminalNode NUMBER() { return getToken(SNOMEDCTQueryExpressionOldParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SNOMEDCTQueryExpressionOldParser.STRING, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attributeValue);
		try {
			setState(146);
			switch (_input.LA(1)) {
			case SCTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				conceptReference();
				}
				break;
			case LPARAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				nestedExpression();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
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
		public TerminalNode LPARAN() { return getToken(SNOMEDCTQueryExpressionOldParser.LPARAN, 0); }
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public TerminalNode RPARAN() { return getToken(SNOMEDCTQueryExpressionOldParser.RPARAN, 0); }
		public NestedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNOMEDCTQueryExpressionOldVisitor ) return ((SNOMEDCTQueryExpressionOldVisitor<? extends T>)visitor).visitNestedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedExpressionContext nestedExpression() throws RecognitionException {
		NestedExpressionContext _localctx = new NestedExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nestedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(LPARAN);
			setState(149);
			subExpression();
			setState(150);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u009b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\64\n"+
		"\2\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\4\3\4\7\4@\n\4\f\4\16\4C\13\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6Q\n\6\3\7\3\7\3\b"+
		"\3\b\3\b\5\bX\n\b\3\t\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3\n\3\n\3\n\5\n"+
		"e\n\n\3\13\3\13\3\13\7\13j\n\13\f\13\16\13m\13\13\3\13\3\13\3\13\7\13"+
		"r\n\13\f\13\16\13u\13\13\5\13w\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u0080"+
		"\n\r\f\r\16\r\u0083\13\r\3\16\3\16\3\16\7\16\u0088\n\16\f\16\16\16\u008b"+
		"\13\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0095\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3"+
		"\3\2\7\b\u009c\2\63\3\2\2\2\4\65\3\2\2\2\6=\3\2\2\2\bD\3\2\2\2\nP\3\2"+
		"\2\2\fR\3\2\2\2\16T\3\2\2\2\20Y\3\2\2\2\22d\3\2\2\2\24v\3\2\2\2\26x\3"+
		"\2\2\2\30|\3\2\2\2\32\u0084\3\2\2\2\34\u008c\3\2\2\2\36\u0094\3\2\2\2"+
		" \u0096\3\2\2\2\"#\7\3\2\2#$\7\t\2\2$%\5\2\2\2%&\7\n\2\2&\64\3\2\2\2\'"+
		"(\7\4\2\2()\7\t\2\2)*\5\2\2\2*+\7\n\2\2+\64\3\2\2\2,-\7\5\2\2-.\7\t\2"+
		"\2./\5\4\3\2/\60\7\n\2\2\60\64\3\2\2\2\61\64\7\6\2\2\62\64\5\n\6\2\63"+
		"\"\3\2\2\2\63\'\3\2\2\2\63,\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\3\3"+
		"\2\2\2\65:\5\2\2\2\66\67\7\r\2\2\679\5\2\2\28\66\3\2\2\29<\3\2\2\2:8\3"+
		"\2\2\2:;\3\2\2\2;\5\3\2\2\2<:\3\2\2\2=A\5\b\5\2>@\5\b\5\2?>\3\2\2\2@C"+
		"\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\7\3\2\2\2CA\3\2\2\2DE\7\t\2\2EF\5\16\b\2"+
		"FG\7\n\2\2GH\5\f\7\2HI\7\t\2\2IJ\5\16\b\2JK\7\n\2\2K\t\3\2\2\2LM\5\f\7"+
		"\2MN\5\16\b\2NQ\3\2\2\2OQ\5\16\b\2PL\3\2\2\2PO\3\2\2\2Q\13\3\2\2\2RS\t"+
		"\2\2\2S\r\3\2\2\2TW\5\20\t\2UV\7\13\2\2VX\5\24\13\2WU\3\2\2\2WX\3\2\2"+
		"\2X\17\3\2\2\2Y^\5\22\n\2Z[\7\f\2\2[]\5\22\n\2\\Z\3\2\2\2]`\3\2\2\2^\\"+
		"\3\2\2\2^_\3\2\2\2_\21\3\2\2\2`^\3\2\2\2ae\7\26\2\2bc\7\26\2\2ce\7\25"+
		"\2\2da\3\2\2\2db\3\2\2\2e\23\3\2\2\2fk\5\30\r\2gh\7\r\2\2hj\5\26\f\2i"+
		"g\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lw\3\2\2\2mk\3\2\2\2ns\5\26\f\2"+
		"op\7\r\2\2pr\5\26\f\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2"+
		"\2us\3\2\2\2vf\3\2\2\2vn\3\2\2\2w\25\3\2\2\2xy\7\17\2\2yz\5\32\16\2z{"+
		"\7\20\2\2{\27\3\2\2\2|\u0081\5\34\17\2}~\7\r\2\2~\u0080\5\34\17\2\177"+
		"}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\31\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0089\5\34\17\2\u0085\u0086\7\r"+
		"\2\2\u0086\u0088\5\34\17\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\33\3\2\2\2\u008b\u0089\3\2\2"+
		"\2\u008c\u008d\5\22\n\2\u008d\u008e\7\16\2\2\u008e\u008f\5\36\20\2\u008f"+
		"\35\3\2\2\2\u0090\u0095\5\22\n\2\u0091\u0095\5 \21\2\u0092\u0095\7\23"+
		"\2\2\u0093\u0095\7\24\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\37\3\2\2\2\u0096\u0097\7\t\2"+
		"\2\u0097\u0098\5\16\b\2\u0098\u0099\7\n\2\2\u0099!\3\2\2\2\17\63:APW^"+
		"dksv\u0081\u0089\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}