// Generated from Xhail.g4 by ANTLR 4.2.2

package ac.bristol.bragaglia.xhail.parsers.xhail;

/**
 * @author stefano
 *
 */
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XhailParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AGGR_AVG=1, AGGR_COUNT=2, AGGR_EVEN=3, AGGR_MAX=4, AGGR_MIN=5, AGGR_ODD=6, 
		AGGR_SUM=7, ARITH_ABS=8, ARITH_DIVIDE=9, ARITH_MODULUS=10, ARITH_POWER=11, 
		BIT_AND=12, BIT_NOT=13, BIT_OR=14, BIT_XOR=15, COMP_EQ=16, COMP_GE=17, 
		COMP_GT=18, COMP_LE=19, COMP_LT=20, COMP_NE=21, DIR_COMPUTE=22, DIR_CONST=23, 
		DIR_DOMAIN=24, DIR_EXAMPLE=25, DIR_EXTERNAL=26, DIR_HIDE=27, DIR_MAXIMIZE=28, 
		DIR_MINIMIZE=29, DIR_MODEB=30, DIR_MODEH=31, DIR_SHOW=32, ASTERISK=33, 
		ASTERISKS=34, ASSIGN=35, AT=36, BACKSLASH=37, BAR=38, COLON=39, COMMA=40, 
		CURLY_LEFT=41, CURLY_RIGHT=42, DOT=43, DOTS=44, EQUALS=45, HASH=46, IF=47, 
		MINUS=48, NOT=49, PAREN_LEFT=50, PAREN_RIGHT=51, SEMICOLON=52, PLUS=53, 
		SEMICOLONS=54, SLASH=55, SQUARE_LEFT=56, SQUARE_RIGHT=57, INFIMUM=58, 
		SUPREMUM=59, ALL=60, COMMENT_INLINE=61, COMMENT_MULTI=62, IDENTIFIER=63, 
		INTEGER=64, STRING=65, VARIABLE=66, WHITESPACES=67;
	public static final String[] tokenNames = {
		"<INVALID>", "'#avg'", "'#count'", "'#even'", "'#max'", "'#min'", "'#odd'", 
		"'#sum'", "'#abs'", "'#div'", "'#mod'", "'#pow'", "'&'", "'~'", "'?'", 
		"'^'", "'=='", "'>='", "'>'", "'<='", "'<'", "'!='", "'#compute'", "'#const'", 
		"'#domain'", "'#example'", "'#external'", "'#hide'", "DIR_MAXIMIZE", "DIR_MINIMIZE", 
		"'#modeb'", "'#modeh'", "'#show'", "'*'", "'**'", "':='", "'@'", "'\\'", 
		"'|'", "':'", "','", "'{'", "'}'", "'.'", "'..'", "'='", "'$'", "':-'", 
		"'-'", "'not'", "'('", "')'", "';'", "'+'", "';;'", "'/'", "'['", "']'", 
		"'#infimum'", "'#supremum'", "'all'", "COMMENT_INLINE", "COMMENT_MULTI", 
		"IDENTIFIER", "INTEGER", "STRING", "VARIABLE", "WHITESPACES"
	};
	public static final int
		RULE_program = 0, RULE_directive = 1, RULE_compute = 2, RULE_constant = 3, 
		RULE_domain = 4, RULE_example = 5, RULE_external = 6, RULE_hide = 7, RULE_maximize = 8, 
		RULE_modeBody = 9, RULE_modeHead = 10, RULE_signature = 11, RULE_keyList = 12, 
		RULE_key = 13, RULE_minimize = 14, RULE_show = 15, RULE_groundAtom = 16, 
		RULE_groundTerm = 17, RULE_bound = 18, RULE_bounds = 19, RULE_weight = 20, 
		RULE_priority = 21, RULE_clause = 22, RULE_head = 23, RULE_body = 24, 
		RULE_literal = 25, RULE_predicate = 26, RULE_aggregate = 27, RULE_aggregatew = 28, 
		RULE_group = 29, RULE_atomList = 30, RULE_atom = 31, RULE_interval = 32, 
		RULE_pooling = 33, RULE_number = 34;
	public static final String[] ruleNames = {
		"program", "directive", "compute", "constant", "domain", "example", "external", 
		"hide", "maximize", "modeBody", "modeHead", "signature", "keyList", "key", 
		"minimize", "show", "groundAtom", "groundTerm", "bound", "bounds", "weight", 
		"priority", "clause", "head", "body", "literal", "predicate", "aggregate", 
		"aggregatew", "group", "atomList", "atom", "interval", "pooling", "number"
	};

	@Override
	public String getGrammarFileName() { return "Xhail.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XhailParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(XhailParser.DOT); }
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public TerminalNode EOF() { return getToken(XhailParser.EOF, 0); }
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public TerminalNode DOT(int i) {
			return getToken(XhailParser.DOT, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AGGR_AVG) | (1L << AGGR_COUNT) | (1L << AGGR_EVEN) | (1L << AGGR_MAX) | (1L << AGGR_MIN) | (1L << AGGR_ODD) | (1L << AGGR_SUM) | (1L << ARITH_ABS) | (1L << ARITH_DIVIDE) | (1L << ARITH_MODULUS) | (1L << ARITH_POWER) | (1L << BIT_NOT) | (1L << DIR_COMPUTE) | (1L << DIR_CONST) | (1L << DIR_DOMAIN) | (1L << DIR_EXAMPLE) | (1L << DIR_EXTERNAL) | (1L << DIR_HIDE) | (1L << DIR_MAXIMIZE) | (1L << DIR_MINIMIZE) | (1L << DIR_MODEB) | (1L << DIR_MODEH) | (1L << DIR_SHOW) | (1L << BAR) | (1L << CURLY_LEFT) | (1L << DOT) | (1L << IF) | (1L << MINUS) | (1L << SQUARE_LEFT) | (1L << INFIMUM) | (1L << SUPREMUM) | (1L << IDENTIFIER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INTEGER - 64)) | (1L << (STRING - 64)) | (1L << (VARIABLE - 64)))) != 0)) {
				{
				setState(73);
				switch (_input.LA(1)) {
				case DIR_COMPUTE:
				case DIR_CONST:
				case DIR_DOMAIN:
				case DIR_EXAMPLE:
				case DIR_EXTERNAL:
				case DIR_HIDE:
				case DIR_MAXIMIZE:
				case DIR_MINIMIZE:
				case DIR_MODEB:
				case DIR_MODEH:
				case DIR_SHOW:
					{
					setState(70); directive();
					}
					break;
				case AGGR_AVG:
				case AGGR_COUNT:
				case AGGR_EVEN:
				case AGGR_MAX:
				case AGGR_MIN:
				case AGGR_ODD:
				case AGGR_SUM:
				case ARITH_ABS:
				case ARITH_DIVIDE:
				case ARITH_MODULUS:
				case ARITH_POWER:
				case BIT_NOT:
				case BAR:
				case CURLY_LEFT:
				case IF:
				case MINUS:
				case SQUARE_LEFT:
				case INFIMUM:
				case SUPREMUM:
				case IDENTIFIER:
				case INTEGER:
				case STRING:
				case VARIABLE:
					{
					setState(71); clause();
					}
					break;
				case DOT:
					{
					setState(72); match(DOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78); match(EOF);
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

	public static class DirectiveContext extends ParserRuleContext {
		public ModeHeadContext modeHead() {
			return getRuleContext(ModeHeadContext.class,0);
		}
		public MinimizeContext minimize() {
			return getRuleContext(MinimizeContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExampleContext example() {
			return getRuleContext(ExampleContext.class,0);
		}
		public ExternalContext external() {
			return getRuleContext(ExternalContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public ComputeContext compute() {
			return getRuleContext(ComputeContext.class,0);
		}
		public DomainContext domain() {
			return getRuleContext(DomainContext.class,0);
		}
		public HideContext hide() {
			return getRuleContext(HideContext.class,0);
		}
		public ModeBodyContext modeBody() {
			return getRuleContext(ModeBodyContext.class,0);
		}
		public MaximizeContext maximize() {
			return getRuleContext(MaximizeContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitDirective(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_directive);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case DIR_COMPUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(80); compute();
				}
				break;
			case DIR_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(81); constant();
				}
				break;
			case DIR_DOMAIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(82); domain();
				}
				break;
			case DIR_EXAMPLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(83); example();
				}
				break;
			case DIR_EXTERNAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(84); external();
				}
				break;
			case DIR_HIDE:
				enterOuterAlt(_localctx, 6);
				{
				setState(85); hide();
				}
				break;
			case DIR_MAXIMIZE:
				enterOuterAlt(_localctx, 7);
				{
				setState(86); maximize();
				}
				break;
			case DIR_MINIMIZE:
				enterOuterAlt(_localctx, 8);
				{
				setState(87); minimize();
				}
				break;
			case DIR_MODEB:
				enterOuterAlt(_localctx, 9);
				{
				setState(88); modeBody();
				}
				break;
			case DIR_MODEH:
				enterOuterAlt(_localctx, 10);
				{
				setState(89); modeHead();
				}
				break;
			case DIR_SHOW:
				enterOuterAlt(_localctx, 11);
				{
				setState(90); show();
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

	public static class ComputeContext extends ParserRuleContext {
		public TerminalNode CURLY_LEFT() { return getToken(XhailParser.CURLY_LEFT, 0); }
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public TerminalNode DIR_COMPUTE() { return getToken(XhailParser.DIR_COMPUTE, 0); }
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode INTEGER() { return getToken(XhailParser.INTEGER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(XhailParser.COMMA); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public TerminalNode CURLY_RIGHT() { return getToken(XhailParser.CURLY_RIGHT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(XhailParser.COMMA, i);
		}
		public ComputeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterCompute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitCompute(this);
		}
	}

	public final ComputeContext compute() throws RecognitionException {
		ComputeContext _localctx = new ComputeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(DIR_COMPUTE);
			setState(95);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(94); match(INTEGER);
				}
			}

			setState(97); match(CURLY_LEFT);
			setState(98); literal();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(99); match(COMMA);
				setState(100); literal();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106); match(CURLY_RIGHT);
			setState(107); match(DOT);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(XhailParser.EQUALS, 0); }
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public TerminalNode DIR_CONST() { return getToken(XhailParser.DIR_CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(XhailParser.IDENTIFIER, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(DIR_CONST);
			setState(110); match(IDENTIFIER);
			setState(111); match(EQUALS);
			setState(112); groundAtom();
			setState(113); match(DOT);
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

	public static class DomainContext extends ParserRuleContext {
		public TerminalNode DIR_DOMAIN() { return getToken(XhailParser.DIR_DOMAIN, 0); }
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public DomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterDomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitDomain(this);
		}
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_domain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(DIR_DOMAIN);
			setState(116); groundAtom();
			setState(117); match(DOT);
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

	public static class ExampleContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(XhailParser.NOT, 0); }
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public PriorityContext priority() {
			return getRuleContext(PriorityContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public TerminalNode DIR_EXAMPLE() { return getToken(XhailParser.DIR_EXAMPLE, 0); }
		public ExampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_example; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterExample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitExample(this);
		}
	}

	public final ExampleContext example() throws RecognitionException {
		ExampleContext _localctx = new ExampleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_example);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(DIR_EXAMPLE);
			setState(121);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(120); match(NOT);
				}
			}

			setState(123); groundAtom();
			setState(125);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(124); weight();
				}
			}

			setState(128);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(127); priority();
				}
			}

			setState(130); match(DOT);
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

	public static class ExternalContext extends ParserRuleContext {
		public TerminalNode DIR_EXTERNAL() { return getToken(XhailParser.DIR_EXTERNAL, 0); }
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public TerminalNode INTEGER() { return getToken(XhailParser.INTEGER, 0); }
		public TerminalNode SLASH() { return getToken(XhailParser.SLASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(XhailParser.IDENTIFIER, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ExternalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterExternal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitExternal(this);
		}
	}

	public final ExternalContext external() throws RecognitionException {
		ExternalContext _localctx = new ExternalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_external);
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); match(DIR_EXTERNAL);
				setState(133); match(IDENTIFIER);
				setState(134); match(SLASH);
				setState(135); match(INTEGER);
				setState(136); match(DOT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); match(DIR_EXTERNAL);
				setState(138); predicate();
				setState(139); match(DOT);
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

	public static class HideContext extends ParserRuleContext {
		public HideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hide; }
	 
		public HideContext() { }
		public void copyFrom(HideContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HideAllContext extends HideContext {
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public TerminalNode DIR_HIDE() { return getToken(XhailParser.DIR_HIDE, 0); }
		public HideAllContext(HideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterHideAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitHideAll(this);
		}
	}
	public static class HideExplicitContext extends HideContext {
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public TerminalNode DIR_HIDE() { return getToken(XhailParser.DIR_HIDE, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(XhailParser.PAREN_LEFT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(XhailParser.COMMA); }
		public List<TerminalNode> VARIABLE() { return getTokens(XhailParser.VARIABLE); }
		public TerminalNode IDENTIFIER() { return getToken(XhailParser.IDENTIFIER, 0); }
		public TerminalNode VARIABLE(int i) {
			return getToken(XhailParser.VARIABLE, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(XhailParser.COMMA, i);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(XhailParser.PAREN_RIGHT, 0); }
		public HideExplicitContext(HideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterHideExplicit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitHideExplicit(this);
		}
	}
	public static class HideImplicitContext extends HideContext {
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public TerminalNode DIR_HIDE() { return getToken(XhailParser.DIR_HIDE, 0); }
		public TerminalNode INTEGER() { return getToken(XhailParser.INTEGER, 0); }
		public TerminalNode SLASH() { return getToken(XhailParser.SLASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(XhailParser.IDENTIFIER, 0); }
		public HideImplicitContext(HideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterHideImplicit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitHideImplicit(this);
		}
	}

	public final HideContext hide() throws RecognitionException {
		HideContext _localctx = new HideContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_hide);
		int _la;
		try {
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new HideAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143); match(DIR_HIDE);
				setState(144); match(DOT);
				}
				break;

			case 2:
				_localctx = new HideImplicitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145); match(DIR_HIDE);
				setState(146); match(IDENTIFIER);
				setState(147); match(SLASH);
				setState(148); match(INTEGER);
				setState(149); match(DOT);
				}
				break;

			case 3:
				_localctx = new HideExplicitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150); match(DIR_HIDE);
				setState(151); match(IDENTIFIER);
				setState(152); match(PAREN_LEFT);
				setState(153); match(VARIABLE);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(154); match(COMMA);
					setState(155); match(VARIABLE);
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161); match(PAREN_RIGHT);
				setState(162); match(DOT);
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

	public static class MaximizeContext extends ParserRuleContext {
		public TerminalNode CURLY_LEFT() { return getToken(XhailParser.CURLY_LEFT, 0); }
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode SQUARE_RIGHT() { return getToken(XhailParser.SQUARE_RIGHT, 0); }
		public WeightContext weight(int i) {
			return getRuleContext(WeightContext.class,i);
		}
		public List<WeightContext> weight() {
			return getRuleContexts(WeightContext.class);
		}
		public TerminalNode DIR_MAXIMIZE() { return getToken(XhailParser.DIR_MAXIMIZE, 0); }
		public TerminalNode SQUARE_LEFT() { return getToken(XhailParser.SQUARE_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(XhailParser.CURLY_RIGHT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(XhailParser.COMMA, i);
		}
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public PriorityContext priority(int i) {
			return getRuleContext(PriorityContext.class,i);
		}
		public List<PriorityContext> priority() {
			return getRuleContexts(PriorityContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(XhailParser.COMMA); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public MaximizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maximize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterMaximize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitMaximize(this);
		}
	}

	public final MaximizeContext maximize() throws RecognitionException {
		MaximizeContext _localctx = new MaximizeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_maximize);
		int _la;
		try {
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165); match(DIR_MAXIMIZE);
				setState(166); match(SQUARE_LEFT);
				setState(167); literal();
				setState(169);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(168); weight();
					}
				}

				setState(172);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(171); priority();
					}
				}

				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(174); match(COMMA);
					setState(175); literal();
					setState(177);
					_la = _input.LA(1);
					if (_la==EQUALS) {
						{
						setState(176); weight();
						}
					}

					setState(180);
					_la = _input.LA(1);
					if (_la==AT) {
						{
						setState(179); priority();
						}
					}

					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187); match(SQUARE_RIGHT);
				setState(188); match(DOT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); match(DIR_MAXIMIZE);
				setState(191); match(CURLY_LEFT);
				setState(192); literal();
				setState(194);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(193); priority();
					}
				}

				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(196); match(COMMA);
					setState(197); literal();
					setState(199);
					_la = _input.LA(1);
					if (_la==AT) {
						{
						setState(198); priority();
						}
					}

					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206); match(CURLY_RIGHT);
				setState(207); match(DOT);
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

	public static class ModeBodyContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(XhailParser.NOT, 0); }
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public PriorityContext priority() {
			return getRuleContext(PriorityContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode DIR_MODEB() { return getToken(XhailParser.DIR_MODEB, 0); }
		public BoundContext bound() {
			return getRuleContext(BoundContext.class,0);
		}
		public ModeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterModeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitModeBody(this);
		}
	}

	public final ModeBodyContext modeBody() throws RecognitionException {
		ModeBodyContext _localctx = new ModeBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(DIR_MODEB);
			setState(213);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(212); match(NOT);
				}
			}

			setState(215); signature();
			setState(217);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(216); bound();
				}
			}

			setState(220);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(219); weight();
				}
			}

			setState(223);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(222); priority();
				}
			}

			setState(225); match(DOT);
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

	public static class ModeHeadContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public TerminalNode DIR_MODEH() { return getToken(XhailParser.DIR_MODEH, 0); }
		public PriorityContext priority() {
			return getRuleContext(PriorityContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BoundsContext bounds() {
			return getRuleContext(BoundsContext.class,0);
		}
		public ModeHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterModeHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitModeHead(this);
		}
	}

	public final ModeHeadContext modeHead() throws RecognitionException {
		ModeHeadContext _localctx = new ModeHeadContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_modeHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); match(DIR_MODEH);
			setState(228); signature();
			setState(230);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(229); bounds();
				}
			}

			setState(233);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(232); weight();
				}
			}

			setState(236);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(235); priority();
				}
			}

			setState(238); match(DOT);
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

	public static class SignatureContext extends ParserRuleContext {
		public KeyListContext keyList() {
			return getRuleContext(KeyListContext.class,0);
		}
		public TerminalNode PAREN_LEFT() { return getToken(XhailParser.PAREN_LEFT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(XhailParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_RIGHT() { return getToken(XhailParser.PAREN_RIGHT, 0); }
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitSignature(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); match(IDENTIFIER);
			setState(241); match(PAREN_LEFT);
			setState(242); keyList();
			setState(243); match(PAREN_RIGHT);
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

	public static class KeyListContext extends ParserRuleContext {
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(XhailParser.COMMA); }
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(XhailParser.COMMA, i);
		}
		public KeyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterKeyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitKeyList(this);
		}
	}

	public final KeyListContext keyList() throws RecognitionException {
		KeyListContext _localctx = new KeyListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_keyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); key();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(246); match(COMMA);
				setState(247); key();
				}
				}
				setState(252);
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

	public static class KeyContext extends ParserRuleContext {
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
	 
		public KeyContext() { }
		public void copyFrom(KeyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KeySignatureContext extends KeyContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public KeySignatureContext(KeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterKeySignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitKeySignature(this);
		}
	}
	public static class KeyConstantContext extends KeyContext {
		public TerminalNode IDENTIFIER() { return getToken(XhailParser.IDENTIFIER, 0); }
		public TerminalNode HASH() { return getToken(XhailParser.HASH, 0); }
		public KeyConstantContext(KeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterKeyConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitKeyConstant(this);
		}
	}
	public static class KeyInputContext extends KeyContext {
		public TerminalNode PLUS() { return getToken(XhailParser.PLUS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(XhailParser.IDENTIFIER, 0); }
		public KeyInputContext(KeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterKeyInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitKeyInput(this);
		}
	}
	public static class KeyOutputContext extends KeyContext {
		public TerminalNode MINUS() { return getToken(XhailParser.MINUS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(XhailParser.IDENTIFIER, 0); }
		public KeyOutputContext(KeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterKeyOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitKeyOutput(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_key);
		try {
			setState(260);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new KeyInputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253); match(PLUS);
				setState(254); match(IDENTIFIER);
				}
				break;
			case MINUS:
				_localctx = new KeyOutputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(255); match(MINUS);
				setState(256); match(IDENTIFIER);
				}
				break;
			case HASH:
				_localctx = new KeyConstantContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(257); match(HASH);
				setState(258); match(IDENTIFIER);
				}
				break;
			case IDENTIFIER:
				_localctx = new KeySignatureContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(259); signature();
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

	public static class MinimizeContext extends ParserRuleContext {
		public TerminalNode CURLY_LEFT() { return getToken(XhailParser.CURLY_LEFT, 0); }
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode SQUARE_RIGHT() { return getToken(XhailParser.SQUARE_RIGHT, 0); }
		public WeightContext weight(int i) {
			return getRuleContext(WeightContext.class,i);
		}
		public List<WeightContext> weight() {
			return getRuleContexts(WeightContext.class);
		}
		public TerminalNode SQUARE_LEFT() { return getToken(XhailParser.SQUARE_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(XhailParser.CURLY_RIGHT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(XhailParser.COMMA, i);
		}
		public TerminalNode DIR_MINIMIZE() { return getToken(XhailParser.DIR_MINIMIZE, 0); }
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public PriorityContext priority(int i) {
			return getRuleContext(PriorityContext.class,i);
		}
		public List<PriorityContext> priority() {
			return getRuleContexts(PriorityContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(XhailParser.COMMA); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public MinimizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minimize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterMinimize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitMinimize(this);
		}
	}

	public final MinimizeContext minimize() throws RecognitionException {
		MinimizeContext _localctx = new MinimizeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_minimize);
		int _la;
		try {
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262); match(DIR_MINIMIZE);
				setState(263); match(SQUARE_LEFT);
				setState(264); literal();
				setState(266);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(265); weight();
					}
				}

				setState(269);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(268); priority();
					}
				}

				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(271); match(COMMA);
					setState(272); literal();
					setState(274);
					_la = _input.LA(1);
					if (_la==EQUALS) {
						{
						setState(273); weight();
						}
					}

					setState(277);
					_la = _input.LA(1);
					if (_la==AT) {
						{
						setState(276); priority();
						}
					}

					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284); match(SQUARE_RIGHT);
				setState(285); match(DOT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287); match(DIR_MINIMIZE);
				setState(288); match(CURLY_LEFT);
				setState(289); literal();
				setState(291);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(290); priority();
					}
				}

				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(293); match(COMMA);
					setState(294); literal();
					setState(296);
					_la = _input.LA(1);
					if (_la==AT) {
						{
						setState(295); priority();
						}
					}

					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(303); match(CURLY_RIGHT);
				setState(304); match(DOT);
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

	public static class ShowContext extends ParserRuleContext {
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	 
		public ShowContext() { }
		public void copyFrom(ShowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowAllContext extends ShowContext {
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public TerminalNode DIR_SHOW() { return getToken(XhailParser.DIR_SHOW, 0); }
		public ShowAllContext(ShowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterShowAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitShowAll(this);
		}
	}
	public static class ShowImplicitContext extends ShowContext {
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public TerminalNode INTEGER() { return getToken(XhailParser.INTEGER, 0); }
		public TerminalNode SLASH() { return getToken(XhailParser.SLASH, 0); }
		public TerminalNode DIR_SHOW() { return getToken(XhailParser.DIR_SHOW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(XhailParser.IDENTIFIER, 0); }
		public ShowImplicitContext(ShowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterShowImplicit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitShowImplicit(this);
		}
	}
	public static class ShowExplicitContext extends ShowContext {
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(XhailParser.PAREN_LEFT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(XhailParser.COMMA); }
		public TerminalNode DIR_SHOW() { return getToken(XhailParser.DIR_SHOW, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(XhailParser.VARIABLE); }
		public TerminalNode IDENTIFIER() { return getToken(XhailParser.IDENTIFIER, 0); }
		public TerminalNode VARIABLE(int i) {
			return getToken(XhailParser.VARIABLE, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(XhailParser.COMMA, i);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(XhailParser.PAREN_RIGHT, 0); }
		public ShowExplicitContext(ShowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterShowExplicit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitShowExplicit(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_show);
		int _la;
		try {
			setState(328);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new ShowAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(308); match(DIR_SHOW);
				setState(309); match(DOT);
				}
				break;

			case 2:
				_localctx = new ShowImplicitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(310); match(DIR_SHOW);
				setState(311); match(IDENTIFIER);
				setState(312); match(SLASH);
				setState(313); match(INTEGER);
				setState(314); match(DOT);
				}
				break;

			case 3:
				_localctx = new ShowExplicitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(315); match(DIR_SHOW);
				setState(316); match(IDENTIFIER);
				setState(317); match(PAREN_LEFT);
				setState(318); match(VARIABLE);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(319); match(COMMA);
					setState(320); match(VARIABLE);
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(326); match(PAREN_RIGHT);
				setState(327); match(DOT);
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

	public static class GroundAtomContext extends ParserRuleContext {
		public GroundAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groundAtom; }
	 
		public GroundAtomContext() { }
		public void copyFrom(GroundAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GroundIntegerContext extends GroundAtomContext {
		public TerminalNode INTEGER() { return getToken(XhailParser.INTEGER, 0); }
		public GroundIntegerContext(GroundAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundInteger(this);
		}
	}
	public static class GroundVariableContext extends GroundAtomContext {
		public TerminalNode VARIABLE() { return getToken(XhailParser.VARIABLE, 0); }
		public GroundVariableContext(GroundAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundVariable(this);
		}
	}
	public static class GroundPredicateContext extends GroundAtomContext {
		public GroundTermContext groundTerm(int i) {
			return getRuleContext(GroundTermContext.class,i);
		}
		public TerminalNode PAREN_LEFT() { return getToken(XhailParser.PAREN_LEFT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(XhailParser.COMMA); }
		public TerminalNode IDENTIFIER() { return getToken(XhailParser.IDENTIFIER, 0); }
		public List<GroundTermContext> groundTerm() {
			return getRuleContexts(GroundTermContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(XhailParser.COMMA, i);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(XhailParser.PAREN_RIGHT, 0); }
		public GroundPredicateContext(GroundAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundPredicate(this);
		}
	}
	public static class GroundStringContext extends GroundAtomContext {
		public TerminalNode STRING() { return getToken(XhailParser.STRING, 0); }
		public GroundStringContext(GroundAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundString(this);
		}
	}

	public final GroundAtomContext groundAtom() throws RecognitionException {
		GroundAtomContext _localctx = new GroundAtomContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_groundAtom);
		int _la;
		try {
			setState(347);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new GroundIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(330); match(INTEGER);
				}
				break;
			case STRING:
				_localctx = new GroundStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(331); match(STRING);
				}
				break;
			case VARIABLE:
				_localctx = new GroundVariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(332); match(VARIABLE);
				}
				break;
			case IDENTIFIER:
				_localctx = new GroundPredicateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(333); match(IDENTIFIER);
				setState(345);
				_la = _input.LA(1);
				if (_la==PAREN_LEFT) {
					{
					setState(334); match(PAREN_LEFT);
					setState(335); groundTerm();
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(336); match(COMMA);
						setState(337); groundTerm();
						}
						}
						setState(342);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(343); match(PAREN_RIGHT);
					}
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

	public static class GroundTermContext extends ParserRuleContext {
		public GroundTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groundTerm; }
	 
		public GroundTermContext() { }
		public void copyFrom(GroundTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GroundIntervalContext extends GroundTermContext {
		public List<TerminalNode> INTEGER() { return getTokens(XhailParser.INTEGER); }
		public TerminalNode DOTS() { return getToken(XhailParser.DOTS, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(XhailParser.IDENTIFIER, i);
		}
		public TerminalNode INTEGER(int i) {
			return getToken(XhailParser.INTEGER, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(XhailParser.VARIABLE); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(XhailParser.IDENTIFIER); }
		public TerminalNode VARIABLE(int i) {
			return getToken(XhailParser.VARIABLE, i);
		}
		public GroundIntervalContext(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundInterval(this);
		}
	}
	public static class GroundMinus1Context extends GroundTermContext {
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(XhailParser.MINUS, 0); }
		public GroundMinus1Context(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundMinus1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundMinus1(this);
		}
	}
	public static class GroundMinus2Context extends GroundTermContext {
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(XhailParser.MINUS, 0); }
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public GroundMinus2Context(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundMinus2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundMinus2(this);
		}
	}
	public static class GroundTimesContext extends GroundTermContext {
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(XhailParser.ASTERISK, 0); }
		public GroundTimesContext(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundTimes(this);
		}
	}
	public static class GroundAndContext extends GroundTermContext {
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public TerminalNode BIT_AND() { return getToken(XhailParser.BIT_AND, 0); }
		public GroundAndContext(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundAnd(this);
		}
	}
	public static class GroundXorContext extends GroundTermContext {
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public TerminalNode BIT_XOR() { return getToken(XhailParser.BIT_XOR, 0); }
		public GroundXorContext(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundXor(this);
		}
	}
	public static class GroundLessEqualsContext extends GroundTermContext {
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public TerminalNode COMP_LE() { return getToken(XhailParser.COMP_LE, 0); }
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public GroundLessEqualsContext(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundLessEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundLessEquals(this);
		}
	}
	public static class GroundPower1Context extends GroundTermContext {
		public TerminalNode ASTERISKS() { return getToken(XhailParser.ASTERISKS, 0); }
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public GroundPower1Context(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundPower1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundPower1(this);
		}
	}
	public static class GroundAbsolute2Context extends GroundTermContext {
		public TerminalNode PAREN_LEFT() { return getToken(XhailParser.PAREN_LEFT, 0); }
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public TerminalNode ARITH_ABS() { return getToken(XhailParser.ARITH_ABS, 0); }
		public TerminalNode PAREN_RIGHT() { return getToken(XhailParser.PAREN_RIGHT, 0); }
		public GroundAbsolute2Context(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundAbsolute2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundAbsolute2(this);
		}
	}
	public static class GroundNotContext extends GroundTermContext {
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public TerminalNode BIT_NOT() { return getToken(XhailParser.BIT_NOT, 0); }
		public GroundNotContext(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundNot(this);
		}
	}
	public static class GroundAbsolute1Context extends GroundTermContext {
		public List<TerminalNode> BAR() { return getTokens(XhailParser.BAR); }
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public TerminalNode BAR(int i) {
			return getToken(XhailParser.BAR, i);
		}
		public GroundAbsolute1Context(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundAbsolute1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundAbsolute1(this);
		}
	}
	public static class GroundPower3Context extends GroundTermContext {
		public TerminalNode ARITH_POWER() { return getToken(XhailParser.ARITH_POWER, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(XhailParser.PAREN_LEFT, 0); }
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(XhailParser.COMMA, 0); }
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(XhailParser.PAREN_RIGHT, 0); }
		public GroundPower3Context(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundPower3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundPower3(this);
		}
	}
	public static class GroundPower2Context extends GroundTermContext {
		public TerminalNode ARITH_POWER() { return getToken(XhailParser.ARITH_POWER, 0); }
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public GroundPower2Context(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundPower2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundPower2(this);
		}
	}
	public static class GroundNotEqualsContext extends GroundTermContext {
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public TerminalNode COMP_NE() { return getToken(XhailParser.COMP_NE, 0); }
		public GroundNotEqualsContext(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundNotEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundNotEquals(this);
		}
	}
	public static class GroundEqualsContext extends GroundTermContext {
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public TerminalNode COMP_EQ() { return getToken(XhailParser.COMP_EQ, 0); }
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public GroundEqualsContext(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundEquals(this);
		}
	}
	public static class GroundOrContext extends GroundTermContext {
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public TerminalNode BIT_OR() { return getToken(XhailParser.BIT_OR, 0); }
		public GroundOrContext(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundOr(this);
		}
	}
	public static class GroundModulus1Context extends GroundTermContext {
		public TerminalNode BACKSLASH() { return getToken(XhailParser.BACKSLASH, 0); }
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public GroundModulus1Context(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundModulus1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundModulus1(this);
		}
	}
	public static class GroundModulus2Context extends GroundTermContext {
		public TerminalNode ARITH_MODULUS() { return getToken(XhailParser.ARITH_MODULUS, 0); }
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public GroundModulus2Context(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundModulus2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundModulus2(this);
		}
	}
	public static class GroundPoolingContext extends GroundTermContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(XhailParser.SEMICOLON); }
		public List<GroundAtomContext> groundAtom() {
			return getRuleContexts(GroundAtomContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(XhailParser.SEMICOLON, i);
		}
		public GroundAtomContext groundAtom(int i) {
			return getRuleContext(GroundAtomContext.class,i);
		}
		public GroundPoolingContext(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundPooling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundPooling(this);
		}
	}
	public static class GroundModulus3Context extends GroundTermContext {
		public TerminalNode ARITH_MODULUS() { return getToken(XhailParser.ARITH_MODULUS, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(XhailParser.PAREN_LEFT, 0); }
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(XhailParser.COMMA, 0); }
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(XhailParser.PAREN_RIGHT, 0); }
		public GroundModulus3Context(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundModulus3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundModulus3(this);
		}
	}
	public static class GroundLessContext extends GroundTermContext {
		public TerminalNode COMP_LT() { return getToken(XhailParser.COMP_LT, 0); }
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public GroundLessContext(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundLess(this);
		}
	}
	public static class GroundPlusContext extends GroundTermContext {
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(XhailParser.PLUS, 0); }
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public GroundPlusContext(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundPlus(this);
		}
	}
	public static class GroundGreaterEqualsContext extends GroundTermContext {
		public TerminalNode COMP_GE() { return getToken(XhailParser.COMP_GE, 0); }
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public GroundGreaterEqualsContext(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundGreaterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundGreaterEquals(this);
		}
	}
	public static class GroundAssign1Context extends GroundTermContext {
		public TerminalNode ASSIGN() { return getToken(XhailParser.ASSIGN, 0); }
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public GroundAssign1Context(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundAssign1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundAssign1(this);
		}
	}
	public static class GroundGreaterContext extends GroundTermContext {
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public TerminalNode COMP_GT() { return getToken(XhailParser.COMP_GT, 0); }
		public GroundGreaterContext(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundGreater(this);
		}
	}
	public static class GroundDivide2Context extends GroundTermContext {
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public TerminalNode ARITH_DIVIDE() { return getToken(XhailParser.ARITH_DIVIDE, 0); }
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public GroundDivide2Context(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundDivide2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundDivide2(this);
		}
	}
	public static class GroundDivide3Context extends GroundTermContext {
		public TerminalNode PAREN_LEFT() { return getToken(XhailParser.PAREN_LEFT, 0); }
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(XhailParser.COMMA, 0); }
		public TerminalNode ARITH_DIVIDE() { return getToken(XhailParser.ARITH_DIVIDE, 0); }
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(XhailParser.PAREN_RIGHT, 0); }
		public GroundDivide3Context(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundDivide3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundDivide3(this);
		}
	}
	public static class GroundAssign2Context extends GroundTermContext {
		public TerminalNode EQUALS() { return getToken(XhailParser.EQUALS, 0); }
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public GroundAssign2Context(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundAssign2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundAssign2(this);
		}
	}
	public static class GroundDivide1Context extends GroundTermContext {
		public GroundAtomContext groundAtom() {
			return getRuleContext(GroundAtomContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(XhailParser.SLASH, 0); }
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public GroundDivide1Context(GroundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroundDivide1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroundDivide1(this);
		}
	}

	public final GroundTermContext groundTerm() throws RecognitionException {
		GroundTermContext _localctx = new GroundTermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_groundTerm);
		int _la;
		try {
			setState(474);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new GroundAssign1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(349); groundAtom();
				setState(350); match(ASSIGN);
				setState(351); groundTerm();
				}
				break;

			case 2:
				_localctx = new GroundAssign2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(353); groundAtom();
				setState(354); match(EQUALS);
				setState(355); groundTerm();
				}
				break;

			case 3:
				_localctx = new GroundAndContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(357); groundAtom();
				setState(358); match(BIT_AND);
				setState(359); groundTerm();
				}
				break;

			case 4:
				_localctx = new GroundNotContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(361); match(BIT_NOT);
				setState(362); groundAtom();
				}
				break;

			case 5:
				_localctx = new GroundOrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(363); groundAtom();
				setState(364); match(BIT_OR);
				setState(365); groundTerm();
				}
				break;

			case 6:
				_localctx = new GroundXorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(367); groundAtom();
				setState(368); match(BIT_XOR);
				setState(369); groundTerm();
				}
				break;

			case 7:
				_localctx = new GroundEqualsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(371); groundAtom();
				setState(372); match(COMP_EQ);
				setState(373); groundTerm();
				}
				break;

			case 8:
				_localctx = new GroundGreaterEqualsContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(375); groundAtom();
				setState(376); match(COMP_GE);
				setState(377); groundTerm();
				}
				break;

			case 9:
				_localctx = new GroundGreaterContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(379); groundAtom();
				setState(380); match(COMP_GT);
				setState(381); groundTerm();
				}
				break;

			case 10:
				_localctx = new GroundLessEqualsContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(383); groundAtom();
				setState(384); match(COMP_LE);
				setState(385); groundTerm();
				}
				break;

			case 11:
				_localctx = new GroundLessContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(387); groundAtom();
				setState(388); match(COMP_LT);
				setState(389); groundTerm();
				}
				break;

			case 12:
				_localctx = new GroundNotEqualsContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(391); groundAtom();
				setState(392); match(COMP_NE);
				setState(393); groundTerm();
				}
				break;

			case 13:
				_localctx = new GroundPlusContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(395); groundAtom();
				setState(396); match(PLUS);
				setState(397); groundTerm();
				}
				break;

			case 14:
				_localctx = new GroundMinus1Context(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(399); match(MINUS);
				setState(400); groundAtom();
				}
				break;

			case 15:
				_localctx = new GroundMinus2Context(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(401); groundAtom();
				setState(402); match(MINUS);
				setState(403); groundTerm();
				}
				break;

			case 16:
				_localctx = new GroundTimesContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(405); groundAtom();
				setState(406); match(ASTERISK);
				setState(407); groundTerm();
				}
				break;

			case 17:
				_localctx = new GroundDivide1Context(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(409); groundAtom();
				setState(410); match(SLASH);
				setState(411); groundTerm();
				}
				break;

			case 18:
				_localctx = new GroundDivide2Context(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(413); groundAtom();
				setState(414); match(ARITH_DIVIDE);
				setState(415); groundTerm();
				}
				break;

			case 19:
				_localctx = new GroundDivide3Context(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(417); match(ARITH_DIVIDE);
				setState(418); match(PAREN_LEFT);
				setState(419); groundAtom();
				setState(420); match(COMMA);
				setState(421); groundTerm();
				setState(422); match(PAREN_RIGHT);
				}
				break;

			case 20:
				_localctx = new GroundModulus1Context(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(424); groundAtom();
				setState(425); match(BACKSLASH);
				setState(426); groundTerm();
				}
				break;

			case 21:
				_localctx = new GroundModulus2Context(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(428); groundAtom();
				setState(429); match(ARITH_MODULUS);
				setState(430); groundTerm();
				}
				break;

			case 22:
				_localctx = new GroundModulus3Context(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(432); match(ARITH_MODULUS);
				setState(433); match(PAREN_LEFT);
				setState(434); groundAtom();
				setState(435); match(COMMA);
				setState(436); groundTerm();
				setState(437); match(PAREN_RIGHT);
				}
				break;

			case 23:
				_localctx = new GroundAbsolute1Context(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(439); match(BAR);
				setState(440); groundAtom();
				setState(441); match(BAR);
				}
				break;

			case 24:
				_localctx = new GroundAbsolute2Context(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(443); match(ARITH_ABS);
				setState(444); match(PAREN_LEFT);
				setState(445); groundAtom();
				setState(446); match(PAREN_RIGHT);
				}
				break;

			case 25:
				_localctx = new GroundPower1Context(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(448); groundAtom();
				setState(449); match(ASTERISKS);
				setState(450); groundTerm();
				}
				break;

			case 26:
				_localctx = new GroundPower2Context(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(452); groundAtom();
				setState(453); match(ARITH_POWER);
				setState(454); groundTerm();
				}
				break;

			case 27:
				_localctx = new GroundPower3Context(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(456); match(ARITH_POWER);
				setState(457); match(PAREN_LEFT);
				setState(458); groundAtom();
				setState(459); match(COMMA);
				setState(460); groundTerm();
				setState(461); match(PAREN_RIGHT);
				}
				break;

			case 28:
				_localctx = new GroundPoolingContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(463); groundAtom();
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(464); match(SEMICOLON);
					setState(465); groundAtom();
					}
					}
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 29:
				_localctx = new GroundIntervalContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(471);
				_la = _input.LA(1);
				if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (IDENTIFIER - 63)) | (1L << (INTEGER - 63)) | (1L << (VARIABLE - 63)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(472); match(DOTS);
				setState(473);
				_la = _input.LA(1);
				if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (IDENTIFIER - 63)) | (1L << (INTEGER - 63)) | (1L << (VARIABLE - 63)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class BoundContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(XhailParser.INTEGER, 0); }
		public TerminalNode COLON() { return getToken(XhailParser.COLON, 0); }
		public BoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitBound(this);
		}
	}

	public final BoundContext bound() throws RecognitionException {
		BoundContext _localctx = new BoundContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476); match(COLON);
			setState(477); match(INTEGER);
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

	public static class BoundsContext extends ParserRuleContext {
		public BoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bounds; }
	 
		public BoundsContext() { }
		public void copyFrom(BoundsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoundSingleContext extends BoundsContext {
		public TerminalNode INTEGER() { return getToken(XhailParser.INTEGER, 0); }
		public TerminalNode COLON() { return getToken(XhailParser.COLON, 0); }
		public BoundSingleContext(BoundsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterBoundSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitBoundSingle(this);
		}
	}
	public static class BoundsAllContext extends BoundsContext {
		public TerminalNode COLON() { return getToken(XhailParser.COLON, 0); }
		public TerminalNode ALL() { return getToken(XhailParser.ALL, 0); }
		public BoundsAllContext(BoundsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterBoundsAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitBoundsAll(this);
		}
	}
	public static class BoundsBothContext extends BoundsContext {
		public List<TerminalNode> INTEGER() { return getTokens(XhailParser.INTEGER); }
		public TerminalNode COLON() { return getToken(XhailParser.COLON, 0); }
		public TerminalNode MINUS() { return getToken(XhailParser.MINUS, 0); }
		public TerminalNode INTEGER(int i) {
			return getToken(XhailParser.INTEGER, i);
		}
		public BoundsBothContext(BoundsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterBoundsBoth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitBoundsBoth(this);
		}
	}

	public final BoundsContext bounds() throws RecognitionException {
		BoundsContext _localctx = new BoundsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bounds);
		try {
			setState(487);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new BoundsAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(479); match(COLON);
				setState(480); match(ALL);
				}
				break;

			case 2:
				_localctx = new BoundSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(481); match(COLON);
				setState(482); match(INTEGER);
				}
				break;

			case 3:
				_localctx = new BoundsBothContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(483); match(COLON);
				setState(484); match(INTEGER);
				setState(485); match(MINUS);
				setState(486); match(INTEGER);
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

	public static class WeightContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(XhailParser.EQUALS, 0); }
		public TerminalNode INTEGER() { return getToken(XhailParser.INTEGER, 0); }
		public WeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterWeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitWeight(this);
		}
	}

	public final WeightContext weight() throws RecognitionException {
		WeightContext _localctx = new WeightContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_weight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489); match(EQUALS);
			setState(490); match(INTEGER);
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

	public static class PriorityContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(XhailParser.AT, 0); }
		public TerminalNode INTEGER() { return getToken(XhailParser.INTEGER, 0); }
		public PriorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterPriority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitPriority(this);
		}
	}

	public final PriorityContext priority() throws RecognitionException {
		PriorityContext _localctx = new PriorityContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_priority);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492); match(AT);
			setState(493); match(INTEGER);
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

	public static class ClauseContext extends ParserRuleContext {
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
	 
		public ClauseContext() { }
		public void copyFrom(ClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstraintClauseContext extends ClauseContext {
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public TerminalNode IF() { return getToken(XhailParser.IF, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ConstraintClauseContext(ClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterConstraintClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitConstraintClause(this);
		}
	}
	public static class FactClauseContext extends ClauseContext {
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public FactClauseContext(ClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterFactClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitFactClause(this);
		}
	}
	public static class FullClauseContext extends ClauseContext {
		public TerminalNode DOT() { return getToken(XhailParser.DOT, 0); }
		public TerminalNode IF() { return getToken(XhailParser.IF, 0); }
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FullClauseContext(ClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterFullClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitFullClause(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_clause);
		try {
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new FactClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(495); head();
				setState(496); match(DOT);
				}
				break;

			case 2:
				_localctx = new FullClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(498); head();
				setState(499); match(IF);
				setState(500); body();
				setState(501); match(DOT);
				}
				break;

			case 3:
				_localctx = new ConstraintClauseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(503); match(IF);
				setState(504); body();
				setState(505); match(DOT);
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

	public static class HeadContext extends ParserRuleContext {
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> BAR() { return getTokens(XhailParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(XhailParser.BAR, i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509); atom();
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(510); match(BAR);
				setState(511); atom();
				}
				}
				setState(516);
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

	public static class BodyContext extends ParserRuleContext {
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XhailParser.COMMA); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(XhailParser.COMMA, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); literal();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(518); match(COMMA);
				setState(519); literal();
				}
				}
				setState(524);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(XhailParser.NOT, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(525); match(NOT);
				}
			}

			setState(528); atom();
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

	public static class PredicateContext extends ParserRuleContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(XhailParser.INTEGER, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(XhailParser.PAREN_LEFT, 0); }
		public TerminalNode COLON(int i) {
			return getToken(XhailParser.COLON, i);
		}
		public AggregatewContext aggregatew() {
			return getRuleContext(AggregatewContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(XhailParser.COLON); }
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(XhailParser.VARIABLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(XhailParser.IDENTIFIER, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(XhailParser.PAREN_RIGHT, 0); }
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_predicate);
		int _la;
		try {
			int _alt;
			setState(548);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530); aggregate();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531); aggregatew();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(532); match(VARIABLE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(533); match(INTEGER);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(534); match(IDENTIFIER);
				setState(539);
				_la = _input.LA(1);
				if (_la==PAREN_LEFT) {
					{
					setState(535); match(PAREN_LEFT);
					setState(536); group();
					setState(537); match(PAREN_RIGHT);
					}
				}

				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(541); match(COLON);
						setState(542); predicate();
						}
						} 
					}
					setState(547);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class AggregateContext extends ParserRuleContext {
		public TerminalNode CURLY_LEFT() { return getToken(XhailParser.CURLY_LEFT, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XhailParser.COMMA); }
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public TerminalNode AGGR_COUNT() { return getToken(XhailParser.AGGR_COUNT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(XhailParser.CURLY_RIGHT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(XhailParser.COMMA, i);
		}
		public TerminalNode AGGR_EVEN() { return getToken(XhailParser.AGGR_EVEN, 0); }
		public TerminalNode AGGR_ODD() { return getToken(XhailParser.AGGR_ODD, 0); }
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitAggregate(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aggregate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (IDENTIFIER - 63)) | (1L << (INTEGER - 63)) | (1L << (VARIABLE - 63)))) != 0)) {
				{
				setState(550); number();
				}
			}

			setState(554);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AGGR_COUNT) | (1L << AGGR_EVEN) | (1L << AGGR_ODD))) != 0)) {
				{
				setState(553);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AGGR_COUNT) | (1L << AGGR_EVEN) | (1L << AGGR_ODD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(556); match(CURLY_LEFT);
			setState(557); literal();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(558); match(COMMA);
				setState(559); literal();
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(565); match(CURLY_RIGHT);
			setState(567);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (IDENTIFIER - 63)) | (1L << (INTEGER - 63)) | (1L << (VARIABLE - 63)))) != 0)) {
				{
				setState(566); number();
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

	public static class AggregatewContext extends ParserRuleContext {
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode SQUARE_RIGHT() { return getToken(XhailParser.SQUARE_RIGHT, 0); }
		public WeightContext weight(int i) {
			return getRuleContext(WeightContext.class,i);
		}
		public List<WeightContext> weight() {
			return getRuleContexts(WeightContext.class);
		}
		public TerminalNode SQUARE_LEFT() { return getToken(XhailParser.SQUARE_LEFT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(XhailParser.COMMA, i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public TerminalNode AGGR_SUM() { return getToken(XhailParser.AGGR_SUM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(XhailParser.COMMA); }
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public TerminalNode AGGR_MIN() { return getToken(XhailParser.AGGR_MIN, 0); }
		public TerminalNode AGGR_AVG() { return getToken(XhailParser.AGGR_AVG, 0); }
		public TerminalNode AGGR_MAX() { return getToken(XhailParser.AGGR_MAX, 0); }
		public AggregatewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregatew; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterAggregatew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitAggregatew(this);
		}
	}

	public final AggregatewContext aggregatew() throws RecognitionException {
		AggregatewContext _localctx = new AggregatewContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_aggregatew);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (IDENTIFIER - 63)) | (1L << (INTEGER - 63)) | (1L << (VARIABLE - 63)))) != 0)) {
				{
				setState(569); number();
				}
			}

			setState(573);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AGGR_AVG) | (1L << AGGR_MAX) | (1L << AGGR_MIN) | (1L << AGGR_SUM))) != 0)) {
				{
				setState(572);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AGGR_AVG) | (1L << AGGR_MAX) | (1L << AGGR_MIN) | (1L << AGGR_SUM))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(575); match(SQUARE_LEFT);
			setState(576); literal();
			setState(578);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(577); weight();
				}
			}

			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(580); match(COMMA);
				setState(581); literal();
				setState(583);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(582); weight();
					}
				}

				}
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(590); match(SQUARE_RIGHT);
			setState(592);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (IDENTIFIER - 63)) | (1L << (INTEGER - 63)) | (1L << (VARIABLE - 63)))) != 0)) {
				{
				setState(591); number();
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

	public static class GroupContext extends ParserRuleContext {
		public AtomListContext atomList(int i) {
			return getRuleContext(AtomListContext.class,i);
		}
		public List<AtomListContext> atomList() {
			return getRuleContexts(AtomListContext.class);
		}
		public TerminalNode SEMICOLONS(int i) {
			return getToken(XhailParser.SEMICOLONS, i);
		}
		public List<TerminalNode> SEMICOLONS() { return getTokens(XhailParser.SEMICOLONS); }
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitGroup(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594); atomList();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLONS) {
				{
				{
				setState(595); match(SEMICOLONS);
				setState(596); atomList();
				}
				}
				setState(601);
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

	public static class AtomListContext extends ParserRuleContext {
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XhailParser.COMMA); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(XhailParser.COMMA, i);
		}
		public AtomListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterAtomList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitAtomList(this);
		}
	}

	public final AtomListContext atomList() throws RecognitionException {
		AtomListContext _localctx = new AtomListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_atomList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602); atom();
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(603); match(COMMA);
				setState(604); atom();
				}
				}
				setState(609);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode BACKSLASH() { return getToken(XhailParser.BACKSLASH, 0); }
		public TerminalNode INTEGER() { return getToken(XhailParser.INTEGER, 0); }
		public TerminalNode ASTERISKS() { return getToken(XhailParser.ASTERISKS, 0); }
		public TerminalNode BAR(int i) {
			return getToken(XhailParser.BAR, i);
		}
		public TerminalNode ARITH_DIVIDE() { return getToken(XhailParser.ARITH_DIVIDE, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode BIT_NOT() { return getToken(XhailParser.BIT_NOT, 0); }
		public TerminalNode BIT_AND() { return getToken(XhailParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(XhailParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(XhailParser.BIT_XOR, 0); }
		public TerminalNode ASTERISK() { return getToken(XhailParser.ASTERISK, 0); }
		public TerminalNode COMP_LT() { return getToken(XhailParser.COMP_LT, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public TerminalNode EQUALS() { return getToken(XhailParser.EQUALS, 0); }
		public TerminalNode COMMA() { return getToken(XhailParser.COMMA, 0); }
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode ARITH_MODULUS() { return getToken(XhailParser.ARITH_MODULUS, 0); }
		public TerminalNode ARITH_POWER() { return getToken(XhailParser.ARITH_POWER, 0); }
		public TerminalNode STRING() { return getToken(XhailParser.STRING, 0); }
		public TerminalNode COMP_LE() { return getToken(XhailParser.COMP_LE, 0); }
		public TerminalNode ARITH_ABS() { return getToken(XhailParser.ARITH_ABS, 0); }
		public PoolingContext pooling() {
			return getRuleContext(PoolingContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(XhailParser.PAREN_RIGHT, 0); }
		public TerminalNode ASSIGN() { return getToken(XhailParser.ASSIGN, 0); }
		public List<TerminalNode> BAR() { return getTokens(XhailParser.BAR); }
		public TerminalNode COMP_GE() { return getToken(XhailParser.COMP_GE, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(XhailParser.PAREN_LEFT, 0); }
		public TerminalNode COMP_EQ() { return getToken(XhailParser.COMP_EQ, 0); }
		public TerminalNode SLASH() { return getToken(XhailParser.SLASH, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(XhailParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(XhailParser.PLUS, 0); }
		public TerminalNode VARIABLE() { return getToken(XhailParser.VARIABLE, 0); }
		public TerminalNode SUPREMUM() { return getToken(XhailParser.SUPREMUM, 0); }
		public TerminalNode COMP_GT() { return getToken(XhailParser.COMP_GT, 0); }
		public TerminalNode INFIMUM() { return getToken(XhailParser.INFIMUM, 0); }
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public TerminalNode COMP_NE() { return getToken(XhailParser.COMP_NE, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_atom);
		try {
			setState(732);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(610); match(INTEGER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611); match(SUPREMUM);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(612); match(INFIMUM);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(613); match(STRING);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(614); match(VARIABLE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(615); predicate();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(616); interval();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(617); pooling();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(618); number();
				setState(619); match(ASSIGN);
				setState(620); predicate();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(622); number();
				setState(623); match(EQUALS);
				setState(624); predicate();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(626); number();
				setState(627); match(BIT_AND);
				setState(628); number();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(630); number();
				setState(631); match(BIT_OR);
				setState(632); number();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(634); number();
				setState(635); match(BIT_XOR);
				setState(636); number();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(638); predicate();
				setState(639); match(COMP_EQ);
				setState(640); predicate();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(642); predicate();
				setState(643); match(COMP_GE);
				setState(644); predicate();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(646); predicate();
				setState(647); match(COMP_GT);
				setState(648); predicate();
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(650); predicate();
				setState(651); match(COMP_LE);
				setState(652); predicate();
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(654); predicate();
				setState(655); match(COMP_LT);
				setState(656); predicate();
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(658); predicate();
				setState(659); match(COMP_NE);
				setState(660); predicate();
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(662); match(BAR);
				setState(663); number();
				setState(664); match(BAR);
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(666); match(ARITH_ABS);
				setState(667); match(PAREN_LEFT);
				setState(668); number();
				setState(669); match(PAREN_RIGHT);
				}
				break;

			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(671); number();
				setState(672); match(MINUS);
				setState(673); number();
				}
				break;

			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(675); number();
				setState(676); match(SLASH);
				setState(677); number();
				}
				break;

			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(679); number();
				setState(680); match(ARITH_DIVIDE);
				setState(681); number();
				}
				break;

			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(683); match(ARITH_DIVIDE);
				setState(684); match(PAREN_LEFT);
				setState(685); number();
				setState(686); match(COMMA);
				setState(687); number();
				setState(688); match(PAREN_RIGHT);
				}
				break;

			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(690); number();
				setState(691); match(BACKSLASH);
				setState(692); number();
				}
				break;

			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(694); number();
				setState(695); match(ARITH_MODULUS);
				setState(696); number();
				}
				break;

			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(698); match(ARITH_MODULUS);
				setState(699); match(PAREN_LEFT);
				setState(700); number();
				setState(701); match(COMMA);
				setState(702); number();
				setState(703); match(PAREN_RIGHT);
				}
				break;

			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(705); number();
				setState(706); match(PLUS);
				setState(707); number();
				}
				break;

			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(709); number();
				setState(710); match(ASTERISK);
				setState(711); number();
				}
				break;

			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(713); number();
				setState(714); match(ASTERISKS);
				setState(715); number();
				}
				break;

			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(717); number();
				setState(718); match(ARITH_POWER);
				setState(719); number();
				}
				break;

			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(721); match(ARITH_POWER);
				setState(722); match(PAREN_LEFT);
				setState(723); number();
				setState(724); match(COMMA);
				setState(725); number();
				setState(726); match(PAREN_RIGHT);
				}
				break;

			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(728); match(BIT_NOT);
				setState(729); number();
				}
				break;

			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(730); match(MINUS);
				setState(731); number();
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

	public static class IntervalContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public TerminalNode DOTS() { return getToken(XhailParser.DOTS, 0); }
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitInterval(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734); number();
			setState(735); match(DOTS);
			setState(736); number();
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

	public static class PoolingContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(XhailParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(XhailParser.SEMICOLON, i);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PoolingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pooling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterPooling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitPooling(this);
		}
	}

	public final PoolingContext pooling() throws RecognitionException {
		PoolingContext _localctx = new PoolingContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_pooling);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738); predicate();
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(739); match(SEMICOLON);
				setState(740); predicate();
				}
				}
				setState(745);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(XhailParser.INTEGER, 0); }
		public TerminalNode VARIABLE() { return getToken(XhailParser.VARIABLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(XhailParser.IDENTIFIER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XhailListener ) ((XhailListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (IDENTIFIER - 63)) | (1L << (INTEGER - 63)) | (1L << (VARIABLE - 63)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u02ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3^\n\3\3\4\3\4\5\4b\n\4\3"+
		"\4\3\4\3\4\3\4\7\4h\n\4\f\4\16\4k\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7|\n\7\3\7\3\7\5\7\u0080\n\7\3\7\5\7\u0083"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0090\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009f\n\t\f\t\16\t\u00a2"+
		"\13\t\3\t\3\t\5\t\u00a6\n\t\3\n\3\n\3\n\3\n\5\n\u00ac\n\n\3\n\5\n\u00af"+
		"\n\n\3\n\3\n\3\n\5\n\u00b4\n\n\3\n\5\n\u00b7\n\n\7\n\u00b9\n\n\f\n\16"+
		"\n\u00bc\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c5\n\n\3\n\3\n\3\n\5"+
		"\n\u00ca\n\n\7\n\u00cc\n\n\f\n\16\n\u00cf\13\n\3\n\3\n\3\n\5\n\u00d4\n"+
		"\n\3\13\3\13\5\13\u00d8\n\13\3\13\3\13\5\13\u00dc\n\13\3\13\5\13\u00df"+
		"\n\13\3\13\5\13\u00e2\n\13\3\13\3\13\3\f\3\f\3\f\5\f\u00e9\n\f\3\f\5\f"+
		"\u00ec\n\f\3\f\5\f\u00ef\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\7\16\u00fb\n\16\f\16\16\16\u00fe\13\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0107\n\17\3\20\3\20\3\20\3\20\5\20\u010d\n\20\3\20\5\20\u0110"+
		"\n\20\3\20\3\20\3\20\5\20\u0115\n\20\3\20\5\20\u0118\n\20\7\20\u011a\n"+
		"\20\f\20\16\20\u011d\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0126"+
		"\n\20\3\20\3\20\3\20\5\20\u012b\n\20\7\20\u012d\n\20\f\20\16\20\u0130"+
		"\13\20\3\20\3\20\3\20\5\20\u0135\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0144\n\21\f\21\16\21\u0147\13"+
		"\21\3\21\3\21\5\21\u014b\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u0155\n\22\f\22\16\22\u0158\13\22\3\22\3\22\5\22\u015c\n\22\5\22"+
		"\u015e\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01d5\n\23\f\23\16\23\u01d8\13"+
		"\23\3\23\3\23\3\23\5\23\u01dd\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u01ea\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01fe\n\30"+
		"\3\31\3\31\3\31\7\31\u0203\n\31\f\31\16\31\u0206\13\31\3\32\3\32\3\32"+
		"\7\32\u020b\n\32\f\32\16\32\u020e\13\32\3\33\5\33\u0211\n\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u021e\n\34\3\34\3\34"+
		"\7\34\u0222\n\34\f\34\16\34\u0225\13\34\5\34\u0227\n\34\3\35\5\35\u022a"+
		"\n\35\3\35\5\35\u022d\n\35\3\35\3\35\3\35\3\35\7\35\u0233\n\35\f\35\16"+
		"\35\u0236\13\35\3\35\3\35\5\35\u023a\n\35\3\36\5\36\u023d\n\36\3\36\5"+
		"\36\u0240\n\36\3\36\3\36\3\36\5\36\u0245\n\36\3\36\3\36\3\36\5\36\u024a"+
		"\n\36\7\36\u024c\n\36\f\36\16\36\u024f\13\36\3\36\3\36\5\36\u0253\n\36"+
		"\3\37\3\37\3\37\7\37\u0258\n\37\f\37\16\37\u025b\13\37\3 \3 \3 \7 \u0260"+
		"\n \f \16 \u0263\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u02df\n!\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\7#\u02e8\n#\f#\16#\u02eb\13#\3$\3$\3$\2\2%\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\5\4\2ABDD\4\2\4\5\b"+
		"\b\5\2\3\3\6\7\t\t\u035f\2M\3\2\2\2\4]\3\2\2\2\6_\3\2\2\2\bo\3\2\2\2\n"+
		"u\3\2\2\2\fy\3\2\2\2\16\u008f\3\2\2\2\20\u00a5\3\2\2\2\22\u00d3\3\2\2"+
		"\2\24\u00d5\3\2\2\2\26\u00e5\3\2\2\2\30\u00f2\3\2\2\2\32\u00f7\3\2\2\2"+
		"\34\u0106\3\2\2\2\36\u0134\3\2\2\2 \u014a\3\2\2\2\"\u015d\3\2\2\2$\u01dc"+
		"\3\2\2\2&\u01de\3\2\2\2(\u01e9\3\2\2\2*\u01eb\3\2\2\2,\u01ee\3\2\2\2."+
		"\u01fd\3\2\2\2\60\u01ff\3\2\2\2\62\u0207\3\2\2\2\64\u0210\3\2\2\2\66\u0226"+
		"\3\2\2\28\u0229\3\2\2\2:\u023c\3\2\2\2<\u0254\3\2\2\2>\u025c\3\2\2\2@"+
		"\u02de\3\2\2\2B\u02e0\3\2\2\2D\u02e4\3\2\2\2F\u02ec\3\2\2\2HL\5\4\3\2"+
		"IL\5.\30\2JL\7-\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\2\2\3Q\3\3\2\2\2R^\5\6\4\2S^\5\b\5"+
		"\2T^\5\n\6\2U^\5\f\7\2V^\5\16\b\2W^\5\20\t\2X^\5\22\n\2Y^\5\36\20\2Z^"+
		"\5\24\13\2[^\5\26\f\2\\^\5 \21\2]R\3\2\2\2]S\3\2\2\2]T\3\2\2\2]U\3\2\2"+
		"\2]V\3\2\2\2]W\3\2\2\2]X\3\2\2\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2"+
		"\2\2^\5\3\2\2\2_a\7\30\2\2`b\7B\2\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7"+
		"+\2\2di\5\64\33\2ef\7*\2\2fh\5\64\33\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2i"+
		"j\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7,\2\2mn\7-\2\2n\7\3\2\2\2op\7\31\2\2"+
		"pq\7A\2\2qr\7/\2\2rs\5\"\22\2st\7-\2\2t\t\3\2\2\2uv\7\32\2\2vw\5\"\22"+
		"\2wx\7-\2\2x\13\3\2\2\2y{\7\33\2\2z|\7\63\2\2{z\3\2\2\2{|\3\2\2\2|}\3"+
		"\2\2\2}\177\5\"\22\2~\u0080\5*\26\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0082\3\2\2\2\u0081\u0083\5,\27\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7-\2\2\u0085\r\3\2\2\2\u0086\u0087"+
		"\7\34\2\2\u0087\u0088\7A\2\2\u0088\u0089\79\2\2\u0089\u008a\7B\2\2\u008a"+
		"\u0090\7-\2\2\u008b\u008c\7\34\2\2\u008c\u008d\5\66\34\2\u008d\u008e\7"+
		"-\2\2\u008e\u0090\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u008b\3\2\2\2\u0090"+
		"\17\3\2\2\2\u0091\u0092\7\35\2\2\u0092\u00a6\7-\2\2\u0093\u0094\7\35\2"+
		"\2\u0094\u0095\7A\2\2\u0095\u0096\79\2\2\u0096\u0097\7B\2\2\u0097\u00a6"+
		"\7-\2\2\u0098\u0099\7\35\2\2\u0099\u009a\7A\2\2\u009a\u009b\7\64\2\2\u009b"+
		"\u00a0\7D\2\2\u009c\u009d\7*\2\2\u009d\u009f\7D\2\2\u009e\u009c\3\2\2"+
		"\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\65\2\2\u00a4\u00a6\7-\2\2\u00a5"+
		"\u0091\3\2\2\2\u00a5\u0093\3\2\2\2\u00a5\u0098\3\2\2\2\u00a6\21\3\2\2"+
		"\2\u00a7\u00a8\7\36\2\2\u00a8\u00a9\7:\2\2\u00a9\u00ab\5\64\33\2\u00aa"+
		"\u00ac\5*\26\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2"+
		"\2\2\u00ad\u00af\5,\27\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00ba\3\2\2\2\u00b0\u00b1\7*\2\2\u00b1\u00b3\5\64\33\2\u00b2\u00b4\5"+
		"*\26\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b7\5,\27\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u00b0\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7;"+
		"\2\2\u00be\u00bf\7-\2\2\u00bf\u00d4\3\2\2\2\u00c0\u00c1\7\36\2\2\u00c1"+
		"\u00c2\7+\2\2\u00c2\u00c4\5\64\33\2\u00c3\u00c5\5,\27\2\u00c4\u00c3\3"+
		"\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00cd\3\2\2\2\u00c6\u00c7\7*\2\2\u00c7"+
		"\u00c9\5\64\33\2\u00c8\u00ca\5,\27\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3"+
		"\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00d1\7,\2\2\u00d1\u00d2\7-\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00a7"+
		"\3\2\2\2\u00d3\u00c0\3\2\2\2\u00d4\23\3\2\2\2\u00d5\u00d7\7 \2\2\u00d6"+
		"\u00d8\7\63\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3"+
		"\2\2\2\u00d9\u00db\5\30\r\2\u00da\u00dc\5&\24\2\u00db\u00da\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00df\5*\26\2\u00de\u00dd\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00e2\5,\27\2\u00e1"+
		"\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7-"+
		"\2\2\u00e4\25\3\2\2\2\u00e5\u00e6\7!\2\2\u00e6\u00e8\5\30\r\2\u00e7\u00e9"+
		"\5(\25\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00ec\5*\26\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00ef\5,\27\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f1\7-\2\2\u00f1\27\3\2\2\2\u00f2\u00f3\7A\2\2"+
		"\u00f3\u00f4\7\64\2\2\u00f4\u00f5\5\32\16\2\u00f5\u00f6\7\65\2\2\u00f6"+
		"\31\3\2\2\2\u00f7\u00fc\5\34\17\2\u00f8\u00f9\7*\2\2\u00f9\u00fb\5\34"+
		"\17\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\33\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7\67\2"+
		"\2\u0100\u0107\7A\2\2\u0101\u0102\7\62\2\2\u0102\u0107\7A\2\2\u0103\u0104"+
		"\7\60\2\2\u0104\u0107\7A\2\2\u0105\u0107\5\30\r\2\u0106\u00ff\3\2\2\2"+
		"\u0106\u0101\3\2\2\2\u0106\u0103\3\2\2\2\u0106\u0105\3\2\2\2\u0107\35"+
		"\3\2\2\2\u0108\u0109\7\37\2\2\u0109\u010a\7:\2\2\u010a\u010c\5\64\33\2"+
		"\u010b\u010d\5*\26\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f"+
		"\3\2\2\2\u010e\u0110\5,\27\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u011b\3\2\2\2\u0111\u0112\7*\2\2\u0112\u0114\5\64\33\2\u0113\u0115\5"+
		"*\26\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0118\5,\27\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2"+
		"\2\2\u0119\u0111\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7;"+
		"\2\2\u011f\u0120\7-\2\2\u0120\u0135\3\2\2\2\u0121\u0122\7\37\2\2\u0122"+
		"\u0123\7+\2\2\u0123\u0125\5\64\33\2\u0124\u0126\5,\27\2\u0125\u0124\3"+
		"\2\2\2\u0125\u0126\3\2\2\2\u0126\u012e\3\2\2\2\u0127\u0128\7*\2\2\u0128"+
		"\u012a\5\64\33\2\u0129\u012b\5,\27\2\u012a\u0129\3\2\2\2\u012a\u012b\3"+
		"\2\2\2\u012b\u012d\3\2\2\2\u012c\u0127\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0131\u0132\7,\2\2\u0132\u0133\7-\2\2\u0133\u0135\3\2\2\2\u0134\u0108"+
		"\3\2\2\2\u0134\u0121\3\2\2\2\u0135\37\3\2\2\2\u0136\u0137\7\"\2\2\u0137"+
		"\u014b\7-\2\2\u0138\u0139\7\"\2\2\u0139\u013a\7A\2\2\u013a\u013b\79\2"+
		"\2\u013b\u013c\7B\2\2\u013c\u014b\7-\2\2\u013d\u013e\7\"\2\2\u013e\u013f"+
		"\7A\2\2\u013f\u0140\7\64\2\2\u0140\u0145\7D\2\2\u0141\u0142\7*\2\2\u0142"+
		"\u0144\7D\2\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u0149\7\65\2\2\u0149\u014b\7-\2\2\u014a\u0136\3\2\2\2\u014a\u0138\3\2"+
		"\2\2\u014a\u013d\3\2\2\2\u014b!\3\2\2\2\u014c\u015e\7B\2\2\u014d\u015e"+
		"\7C\2\2\u014e\u015e\7D\2\2\u014f\u015b\7A\2\2\u0150\u0151\7\64\2\2\u0151"+
		"\u0156\5$\23\2\u0152\u0153\7*\2\2\u0153\u0155\5$\23\2\u0154\u0152\3\2"+
		"\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7\65\2\2\u015a\u015c\3"+
		"\2\2\2\u015b\u0150\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u014c\3\2\2\2\u015d\u014d\3\2\2\2\u015d\u014e\3\2\2\2\u015d\u014f\3\2"+
		"\2\2\u015e#\3\2\2\2\u015f\u0160\5\"\22\2\u0160\u0161\7%\2\2\u0161\u0162"+
		"\5$\23\2\u0162\u01dd\3\2\2\2\u0163\u0164\5\"\22\2\u0164\u0165\7/\2\2\u0165"+
		"\u0166\5$\23\2\u0166\u01dd\3\2\2\2\u0167\u0168\5\"\22\2\u0168\u0169\7"+
		"\16\2\2\u0169\u016a\5$\23\2\u016a\u01dd\3\2\2\2\u016b\u016c\7\17\2\2\u016c"+
		"\u01dd\5\"\22\2\u016d\u016e\5\"\22\2\u016e\u016f\7\20\2\2\u016f\u0170"+
		"\5$\23\2\u0170\u01dd\3\2\2\2\u0171\u0172\5\"\22\2\u0172\u0173\7\21\2\2"+
		"\u0173\u0174\5$\23\2\u0174\u01dd\3\2\2\2\u0175\u0176\5\"\22\2\u0176\u0177"+
		"\7\22\2\2\u0177\u0178\5$\23\2\u0178\u01dd\3\2\2\2\u0179\u017a\5\"\22\2"+
		"\u017a\u017b\7\23\2\2\u017b\u017c\5$\23\2\u017c\u01dd\3\2\2\2\u017d\u017e"+
		"\5\"\22\2\u017e\u017f\7\24\2\2\u017f\u0180\5$\23\2\u0180\u01dd\3\2\2\2"+
		"\u0181\u0182\5\"\22\2\u0182\u0183\7\25\2\2\u0183\u0184\5$\23\2\u0184\u01dd"+
		"\3\2\2\2\u0185\u0186\5\"\22\2\u0186\u0187\7\26\2\2\u0187\u0188\5$\23\2"+
		"\u0188\u01dd\3\2\2\2\u0189\u018a\5\"\22\2\u018a\u018b\7\27\2\2\u018b\u018c"+
		"\5$\23\2\u018c\u01dd\3\2\2\2\u018d\u018e\5\"\22\2\u018e\u018f\7\67\2\2"+
		"\u018f\u0190\5$\23\2\u0190\u01dd\3\2\2\2\u0191\u0192\7\62\2\2\u0192\u01dd"+
		"\5\"\22\2\u0193\u0194\5\"\22\2\u0194\u0195\7\62\2\2\u0195\u0196\5$\23"+
		"\2\u0196\u01dd\3\2\2\2\u0197\u0198\5\"\22\2\u0198\u0199\7#\2\2\u0199\u019a"+
		"\5$\23\2\u019a\u01dd\3\2\2\2\u019b\u019c\5\"\22\2\u019c\u019d\79\2\2\u019d"+
		"\u019e\5$\23\2\u019e\u01dd\3\2\2\2\u019f\u01a0\5\"\22\2\u01a0\u01a1\7"+
		"\13\2\2\u01a1\u01a2\5$\23\2\u01a2\u01dd\3\2\2\2\u01a3\u01a4\7\13\2\2\u01a4"+
		"\u01a5\7\64\2\2\u01a5\u01a6\5\"\22\2\u01a6\u01a7\7*\2\2\u01a7\u01a8\5"+
		"$\23\2\u01a8\u01a9\7\65\2\2\u01a9\u01dd\3\2\2\2\u01aa\u01ab\5\"\22\2\u01ab"+
		"\u01ac\7\'\2\2\u01ac\u01ad\5$\23\2\u01ad\u01dd\3\2\2\2\u01ae\u01af\5\""+
		"\22\2\u01af\u01b0\7\f\2\2\u01b0\u01b1\5$\23\2\u01b1\u01dd\3\2\2\2\u01b2"+
		"\u01b3\7\f\2\2\u01b3\u01b4\7\64\2\2\u01b4\u01b5\5\"\22\2\u01b5\u01b6\7"+
		"*\2\2\u01b6\u01b7\5$\23\2\u01b7\u01b8\7\65\2\2\u01b8\u01dd\3\2\2\2\u01b9"+
		"\u01ba\7(\2\2\u01ba\u01bb\5\"\22\2\u01bb\u01bc\7(\2\2\u01bc\u01dd\3\2"+
		"\2\2\u01bd\u01be\7\n\2\2\u01be\u01bf\7\64\2\2\u01bf\u01c0\5\"\22\2\u01c0"+
		"\u01c1\7\65\2\2\u01c1\u01dd\3\2\2\2\u01c2\u01c3\5\"\22\2\u01c3\u01c4\7"+
		"$\2\2\u01c4\u01c5\5$\23\2\u01c5\u01dd\3\2\2\2\u01c6\u01c7\5\"\22\2\u01c7"+
		"\u01c8\7\r\2\2\u01c8\u01c9\5$\23\2\u01c9\u01dd\3\2\2\2\u01ca\u01cb\7\r"+
		"\2\2\u01cb\u01cc\7\64\2\2\u01cc\u01cd\5\"\22\2\u01cd\u01ce\7*\2\2\u01ce"+
		"\u01cf\5$\23\2\u01cf\u01d0\7\65\2\2\u01d0\u01dd\3\2\2\2\u01d1\u01d6\5"+
		"\"\22\2\u01d2\u01d3\7\66\2\2\u01d3\u01d5\5\"\22\2\u01d4\u01d2\3\2\2\2"+
		"\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01dd"+
		"\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\t\2\2\2\u01da\u01db\7.\2\2\u01db"+
		"\u01dd\t\2\2\2\u01dc\u015f\3\2\2\2\u01dc\u0163\3\2\2\2\u01dc\u0167\3\2"+
		"\2\2\u01dc\u016b\3\2\2\2\u01dc\u016d\3\2\2\2\u01dc\u0171\3\2\2\2\u01dc"+
		"\u0175\3\2\2\2\u01dc\u0179\3\2\2\2\u01dc\u017d\3\2\2\2\u01dc\u0181\3\2"+
		"\2\2\u01dc\u0185\3\2\2\2\u01dc\u0189\3\2\2\2\u01dc\u018d\3\2\2\2\u01dc"+
		"\u0191\3\2\2\2\u01dc\u0193\3\2\2\2\u01dc\u0197\3\2\2\2\u01dc\u019b\3\2"+
		"\2\2\u01dc\u019f\3\2\2\2\u01dc\u01a3\3\2\2\2\u01dc\u01aa\3\2\2\2\u01dc"+
		"\u01ae\3\2\2\2\u01dc\u01b2\3\2\2\2\u01dc\u01b9\3\2\2\2\u01dc\u01bd\3\2"+
		"\2\2\u01dc\u01c2\3\2\2\2\u01dc\u01c6\3\2\2\2\u01dc\u01ca\3\2\2\2\u01dc"+
		"\u01d1\3\2\2\2\u01dc\u01d9\3\2\2\2\u01dd%\3\2\2\2\u01de\u01df\7)\2\2\u01df"+
		"\u01e0\7B\2\2\u01e0\'\3\2\2\2\u01e1\u01e2\7)\2\2\u01e2\u01ea\7>\2\2\u01e3"+
		"\u01e4\7)\2\2\u01e4\u01ea\7B\2\2\u01e5\u01e6\7)\2\2\u01e6\u01e7\7B\2\2"+
		"\u01e7\u01e8\7\62\2\2\u01e8\u01ea\7B\2\2\u01e9\u01e1\3\2\2\2\u01e9\u01e3"+
		"\3\2\2\2\u01e9\u01e5\3\2\2\2\u01ea)\3\2\2\2\u01eb\u01ec\7/\2\2\u01ec\u01ed"+
		"\7B\2\2\u01ed+\3\2\2\2\u01ee\u01ef\7&\2\2\u01ef\u01f0\7B\2\2\u01f0-\3"+
		"\2\2\2\u01f1\u01f2\5\60\31\2\u01f2\u01f3\7-\2\2\u01f3\u01fe\3\2\2\2\u01f4"+
		"\u01f5\5\60\31\2\u01f5\u01f6\7\61\2\2\u01f6\u01f7\5\62\32\2\u01f7\u01f8"+
		"\7-\2\2\u01f8\u01fe\3\2\2\2\u01f9\u01fa\7\61\2\2\u01fa\u01fb\5\62\32\2"+
		"\u01fb\u01fc\7-\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01f1\3\2\2\2\u01fd\u01f4"+
		"\3\2\2\2\u01fd\u01f9\3\2\2\2\u01fe/\3\2\2\2\u01ff\u0204\5@!\2\u0200\u0201"+
		"\7(\2\2\u0201\u0203\5@!\2\u0202\u0200\3\2\2\2\u0203\u0206\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\61\3\2\2\2\u0206\u0204\3\2\2"+
		"\2\u0207\u020c\5\64\33\2\u0208\u0209\7*\2\2\u0209\u020b\5\64\33\2\u020a"+
		"\u0208\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2"+
		"\2\2\u020d\63\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\7\63\2\2\u0210\u020f"+
		"\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\5@!\2\u0213"+
		"\65\3\2\2\2\u0214\u0227\58\35\2\u0215\u0227\5:\36\2\u0216\u0227\7D\2\2"+
		"\u0217\u0227\7B\2\2\u0218\u021d\7A\2\2\u0219\u021a\7\64\2\2\u021a\u021b"+
		"\5<\37\2\u021b\u021c\7\65\2\2\u021c\u021e\3\2\2\2\u021d\u0219\3\2\2\2"+
		"\u021d\u021e\3\2\2\2\u021e\u0223\3\2\2\2\u021f\u0220\7)\2\2\u0220\u0222"+
		"\5\66\34\2\u0221\u021f\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2"+
		"\u0223\u0224\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0214"+
		"\3\2\2\2\u0226\u0215\3\2\2\2\u0226\u0216\3\2\2\2\u0226\u0217\3\2\2\2\u0226"+
		"\u0218\3\2\2\2\u0227\67\3\2\2\2\u0228\u022a\5F$\2\u0229\u0228\3\2\2\2"+
		"\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u022d\t\3\2\2\u022c\u022b"+
		"\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\7+\2\2\u022f"+
		"\u0234\5\64\33\2\u0230\u0231\7*\2\2\u0231\u0233\5\64\33\2\u0232\u0230"+
		"\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0237\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u0239\7,\2\2\u0238\u023a\5F$"+
		"\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a9\3\2\2\2\u023b\u023d"+
		"\5F$\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\3\2\2\2\u023e"+
		"\u0240\t\4\2\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2"+
		"\2\2\u0241\u0242\7:\2\2\u0242\u0244\5\64\33\2\u0243\u0245\5*\26\2\u0244"+
		"\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u024d\3\2\2\2\u0246\u0247\7*"+
		"\2\2\u0247\u0249\5\64\33\2\u0248\u024a\5*\26\2\u0249\u0248\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0246\3\2\2\2\u024c\u024f\3\2"+
		"\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\3\2\2\2\u024f"+
		"\u024d\3\2\2\2\u0250\u0252\7;\2\2\u0251\u0253\5F$\2\u0252\u0251\3\2\2"+
		"\2\u0252\u0253\3\2\2\2\u0253;\3\2\2\2\u0254\u0259\5> \2\u0255\u0256\7"+
		"8\2\2\u0256\u0258\5> \2\u0257\u0255\3\2\2\2\u0258\u025b\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a=\3\2\2\2\u025b\u0259\3\2\2\2"+
		"\u025c\u0261\5@!\2\u025d\u025e\7*\2\2\u025e\u0260\5@!\2\u025f\u025d\3"+
		"\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"?\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u02df\7B\2\2\u0265\u02df\7=\2\2\u0266"+
		"\u02df\7<\2\2\u0267\u02df\7C\2\2\u0268\u02df\7D\2\2\u0269\u02df\5\66\34"+
		"\2\u026a\u02df\5B\"\2\u026b\u02df\5D#\2\u026c\u026d\5F$\2\u026d\u026e"+
		"\7%\2\2\u026e\u026f\5\66\34\2\u026f\u02df\3\2\2\2\u0270\u0271\5F$\2\u0271"+
		"\u0272\7/\2\2\u0272\u0273\5\66\34\2\u0273\u02df\3\2\2\2\u0274\u0275\5"+
		"F$\2\u0275\u0276\7\16\2\2\u0276\u0277\5F$\2\u0277\u02df\3\2\2\2\u0278"+
		"\u0279\5F$\2\u0279\u027a\7\20\2\2\u027a\u027b\5F$\2\u027b\u02df\3\2\2"+
		"\2\u027c\u027d\5F$\2\u027d\u027e\7\21\2\2\u027e\u027f\5F$\2\u027f\u02df"+
		"\3\2\2\2\u0280\u0281\5\66\34\2\u0281\u0282\7\22\2\2\u0282\u0283\5\66\34"+
		"\2\u0283\u02df\3\2\2\2\u0284\u0285\5\66\34\2\u0285\u0286\7\23\2\2\u0286"+
		"\u0287\5\66\34\2\u0287\u02df\3\2\2\2\u0288\u0289\5\66\34\2\u0289\u028a"+
		"\7\24\2\2\u028a\u028b\5\66\34\2\u028b\u02df\3\2\2\2\u028c\u028d\5\66\34"+
		"\2\u028d\u028e\7\25\2\2\u028e\u028f\5\66\34\2\u028f\u02df\3\2\2\2\u0290"+
		"\u0291\5\66\34\2\u0291\u0292\7\26\2\2\u0292\u0293\5\66\34\2\u0293\u02df"+
		"\3\2\2\2\u0294\u0295\5\66\34\2\u0295\u0296\7\27\2\2\u0296\u0297\5\66\34"+
		"\2\u0297\u02df\3\2\2\2\u0298\u0299\7(\2\2\u0299\u029a\5F$\2\u029a\u029b"+
		"\7(\2\2\u029b\u02df\3\2\2\2\u029c\u029d\7\n\2\2\u029d\u029e\7\64\2\2\u029e"+
		"\u029f\5F$\2\u029f\u02a0\7\65\2\2\u02a0\u02df\3\2\2\2\u02a1\u02a2\5F$"+
		"\2\u02a2\u02a3\7\62\2\2\u02a3\u02a4\5F$\2\u02a4\u02df\3\2\2\2\u02a5\u02a6"+
		"\5F$\2\u02a6\u02a7\79\2\2\u02a7\u02a8\5F$\2\u02a8\u02df\3\2\2\2\u02a9"+
		"\u02aa\5F$\2\u02aa\u02ab\7\13\2\2\u02ab\u02ac\5F$\2\u02ac\u02df\3\2\2"+
		"\2\u02ad\u02ae\7\13\2\2\u02ae\u02af\7\64\2\2\u02af\u02b0\5F$\2\u02b0\u02b1"+
		"\7*\2\2\u02b1\u02b2\5F$\2\u02b2\u02b3\7\65\2\2\u02b3\u02df\3\2\2\2\u02b4"+
		"\u02b5\5F$\2\u02b5\u02b6\7\'\2\2\u02b6\u02b7\5F$\2\u02b7\u02df\3\2\2\2"+
		"\u02b8\u02b9\5F$\2\u02b9\u02ba\7\f\2\2\u02ba\u02bb\5F$\2\u02bb\u02df\3"+
		"\2\2\2\u02bc\u02bd\7\f\2\2\u02bd\u02be\7\64\2\2\u02be\u02bf\5F$\2\u02bf"+
		"\u02c0\7*\2\2\u02c0\u02c1\5F$\2\u02c1\u02c2\7\65\2\2\u02c2\u02df\3\2\2"+
		"\2\u02c3\u02c4\5F$\2\u02c4\u02c5\7\67\2\2\u02c5\u02c6\5F$\2\u02c6\u02df"+
		"\3\2\2\2\u02c7\u02c8\5F$\2\u02c8\u02c9\7#\2\2\u02c9\u02ca\5F$\2\u02ca"+
		"\u02df\3\2\2\2\u02cb\u02cc\5F$\2\u02cc\u02cd\7$\2\2\u02cd\u02ce\5F$\2"+
		"\u02ce\u02df\3\2\2\2\u02cf\u02d0\5F$\2\u02d0\u02d1\7\r\2\2\u02d1\u02d2"+
		"\5F$\2\u02d2\u02df\3\2\2\2\u02d3\u02d4\7\r\2\2\u02d4\u02d5\7\64\2\2\u02d5"+
		"\u02d6\5F$\2\u02d6\u02d7\7*\2\2\u02d7\u02d8\5F$\2\u02d8\u02d9\7\65\2\2"+
		"\u02d9\u02df\3\2\2\2\u02da\u02db\7\17\2\2\u02db\u02df\5F$\2\u02dc\u02dd"+
		"\7\62\2\2\u02dd\u02df\5F$\2\u02de\u0264\3\2\2\2\u02de\u0265\3\2\2\2\u02de"+
		"\u0266\3\2\2\2\u02de\u0267\3\2\2\2\u02de\u0268\3\2\2\2\u02de\u0269\3\2"+
		"\2\2\u02de\u026a\3\2\2\2\u02de\u026b\3\2\2\2\u02de\u026c\3\2\2\2\u02de"+
		"\u0270\3\2\2\2\u02de\u0274\3\2\2\2\u02de\u0278\3\2\2\2\u02de\u027c\3\2"+
		"\2\2\u02de\u0280\3\2\2\2\u02de\u0284\3\2\2\2\u02de\u0288\3\2\2\2\u02de"+
		"\u028c\3\2\2\2\u02de\u0290\3\2\2\2\u02de\u0294\3\2\2\2\u02de\u0298\3\2"+
		"\2\2\u02de\u029c\3\2\2\2\u02de\u02a1\3\2\2\2\u02de\u02a5\3\2\2\2\u02de"+
		"\u02a9\3\2\2\2\u02de\u02ad\3\2\2\2\u02de\u02b4\3\2\2\2\u02de\u02b8\3\2"+
		"\2\2\u02de\u02bc\3\2\2\2\u02de\u02c3\3\2\2\2\u02de\u02c7\3\2\2\2\u02de"+
		"\u02cb\3\2\2\2\u02de\u02cf\3\2\2\2\u02de\u02d3\3\2\2\2\u02de\u02da\3\2"+
		"\2\2\u02de\u02dc\3\2\2\2\u02dfA\3\2\2\2\u02e0\u02e1\5F$\2\u02e1\u02e2"+
		"\7.\2\2\u02e2\u02e3\5F$\2\u02e3C\3\2\2\2\u02e4\u02e9\5\66\34\2\u02e5\u02e6"+
		"\7\66\2\2\u02e6\u02e8\5\66\34\2\u02e7\u02e5\3\2\2\2\u02e8\u02eb\3\2\2"+
		"\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02eaE\3\2\2\2\u02eb\u02e9"+
		"\3\2\2\2\u02ec\u02ed\t\2\2\2\u02edG\3\2\2\2EKM]ai{\177\u0082\u008f\u00a0"+
		"\u00a5\u00ab\u00ae\u00b3\u00b6\u00ba\u00c4\u00c9\u00cd\u00d3\u00d7\u00db"+
		"\u00de\u00e1\u00e8\u00eb\u00ee\u00fc\u0106\u010c\u010f\u0114\u0117\u011b"+
		"\u0125\u012a\u012e\u0134\u0145\u014a\u0156\u015b\u015d\u01d6\u01dc\u01e9"+
		"\u01fd\u0204\u020c\u0210\u021d\u0223\u0226\u0229\u022c\u0234\u0239\u023c"+
		"\u023f\u0244\u0249\u024d\u0252\u0259\u0261\u02de\u02e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}