// Generated from c:/Users/trieu/XpathProject/.antlr/Project.g by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ProjectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, WS=37, DOC=38, ENDOC=39, 
		ID=40, FILENAME=41;
	public static final int
		RULE_xq = 0, RULE_forClause = 1, RULE_letClause = 2, RULE_whereClause = 3, 
		RULE_returnClause = 4, RULE_rt = 5, RULE_cond = 6, RULE_ap = 7, RULE_doc = 8, 
		RULE_rp = 9, RULE_pf = 10, RULE_stringConstant = 11, RULE_tagName = 12, 
		RULE_attrName = 13, RULE_startTag = 14, RULE_endTag = 15, RULE_filename = 16, 
		RULE_var = 17, RULE_comparisonString = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"xq", "forClause", "letClause", "whereClause", "returnClause", "rt", 
			"cond", "ap", "doc", "rp", "pf", "stringConstant", "tagName", "attrName", 
			"startTag", "endTag", "filename", "var", "comparisonString"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'/'", "'//'", "'{'", "'}'", "'for '", "'in'", 
			"', '", "'let '", "':='", "'where'", "'return'", "'='", "'eq'", "'=='", 
			"'is'", "'empty('", "'some '", "'satisfies'", "'and'", "'or'", "'not'", 
			"'*'", "'.'", "'..'", "'text()'", "'@'", "'['", "']'", "'<'", "'>'", 
			"'</'", "'$'", "'\"'", null, "'doc(\"'", "'\")'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WS", "DOC", "ENDOC", "ID", "FILENAME"
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
	public String getGrammarFileName() { return "Project.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProjectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescendXQContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public DescendXQContext(XqContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagXQContext extends XqContext {
		public StartTagContext startTag() {
			return getRuleContext(StartTagContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public EndTagContext endTag() {
			return getRuleContext(EndTagContext.class,0);
		}
		public TagXQContext(XqContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForXQContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ForXQContext(XqContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ApXQContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public ApXQContext(XqContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenXQContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ParenXQContext(XqContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetXQContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public LetXQContext(XqContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringXQContext extends XqContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public StringXQContext(XqContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaXQContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CommaXQContext(XqContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarXQContext extends XqContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarXQContext(XqContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildXQContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ChildXQContext(XqContext ctx) { copyFrom(ctx); }
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				{
				_localctx = new VarXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				var();
				}
				break;
			case DOC:
				{
				_localctx = new ApXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				ap();
				}
				break;
			case T__0:
				{
				_localctx = new ParenXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(T__0);
				setState(42);
				xq(0);
				setState(43);
				match(T__1);
				}
				break;
			case T__35:
				{
				_localctx = new StringXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				stringConstant();
				}
				break;
			case T__31:
				{
				_localctx = new TagXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				startTag();
				setState(47);
				match(T__5);
				setState(48);
				xq(0);
				setState(49);
				match(T__6);
				setState(50);
				endTag();
				}
				break;
			case T__7:
				{
				_localctx = new ForXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				forClause();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(53);
					letClause();
					}
				}

				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(56);
					whereClause();
					}
				}

				setState(59);
				returnClause();
				}
				break;
			case T__10:
				{
				_localctx = new LetXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				letClause();
				setState(62);
				xq(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new CommaXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(66);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(67);
						match(T__2);
						setState(68);
						xq(8);
						}
						break;
					case 2:
						{
						_localctx = new ChildXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(69);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(70);
						match(T__3);
						setState(71);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new DescendXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(72);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(73);
						match(T__4);
						setState(74);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class ForClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__7);
			setState(81);
			var();
			setState(82);
			match(T__8);
			setState(83);
			xq(0);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(84);
				match(T__9);
				setState(85);
				var();
				setState(86);
				match(T__8);
				setState(87);
				xq(0);
				}
				}
				setState(93);
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
	public static class LetClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__10);
			setState(95);
			var();
			setState(96);
			match(T__11);
			setState(97);
			xq(0);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(98);
				match(T__9);
				setState(99);
				var();
				setState(100);
				match(T__11);
				setState(101);
				xq(0);
				}
				}
				setState(107);
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
	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__12);
			setState(109);
			cond(0);
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
	public static class ReturnClauseContext extends ParserRuleContext {
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__13);
			setState(112);
			rt(0);
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
	public static class RtContext extends ParserRuleContext {
		public RtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rt; }
	 
		public RtContext() { }
		public void copyFrom(RtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagReturnContext extends RtContext {
		public StartTagContext startTag() {
			return getRuleContext(StartTagContext.class,0);
		}
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public EndTagContext endTag() {
			return getRuleContext(EndTagContext.class,0);
		}
		public TagReturnContext(RtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XqReturnContext extends RtContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqReturnContext(RtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaReturnContext extends RtContext {
		public List<RtContext> rt() {
			return getRuleContexts(RtContext.class);
		}
		public RtContext rt(int i) {
			return getRuleContext(RtContext.class,i);
		}
		public CommaReturnContext(RtContext ctx) { copyFrom(ctx); }
	}

	public final RtContext rt() throws RecognitionException {
		return rt(0);
	}

	private RtContext rt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RtContext _localctx = new RtContext(_ctx, _parentState);
		RtContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_rt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new XqReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(115);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new TagReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				startTag();
				setState(117);
				rt(0);
				setState(118);
				endTag();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CommaReturnContext(new RtContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_rt);
					setState(122);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(123);
					match(T__2);
					setState(124);
					rt(3);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualCondContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public EqualCondContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrCondContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public OrCondContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SatisfyCondContext extends CondContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public SatisfyCondContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyCondContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public EmptyCondContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SameCondContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public SameCondContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndCondContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public AndCondContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenCondContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ParenCondContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotCondContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public NotCondContext(CondContext ctx) { copyFrom(ctx); }
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new EqualCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(131);
				xq(0);
				setState(132);
				match(T__14);
				setState(133);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new EqualCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				xq(0);
				setState(136);
				match(T__15);
				setState(137);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new SameCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				xq(0);
				setState(140);
				match(T__16);
				setState(141);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new SameCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				xq(0);
				setState(144);
				match(T__17);
				setState(145);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new EmptyCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(T__18);
				setState(148);
				xq(0);
				setState(149);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new SatisfyCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(T__19);
				setState(152);
				var();
				setState(153);
				match(T__8);
				setState(154);
				xq(0);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(155);
					match(T__9);
					setState(156);
					var();
					setState(157);
					match(T__8);
					setState(158);
					xq(0);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				match(T__20);
				setState(166);
				cond(5);
				}
				break;
			case 7:
				{
				_localctx = new ParenCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(T__0);
				setState(169);
				cond(0);
				setState(170);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new NotCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(T__23);
				setState(173);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AndCondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(176);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(177);
						match(T__21);
						setState(178);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new OrCondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(179);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(180);
						match(T__22);
						setState(181);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildAPContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ChildAPContext(ApContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescendAPContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public DescendAPContext(ApContext ctx) { copyFrom(ctx); }
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ap);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ChildAPContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				doc();
				setState(188);
				match(T__3);
				setState(189);
				rp(0);
				}
				break;
			case 2:
				_localctx = new DescendAPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				doc();
				setState(192);
				match(T__4);
				setState(193);
				rp(0);
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
	public static class DocContext extends ParserRuleContext {
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
	 
		public DocContext() { }
		public void copyFrom(DocContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DocNameContext extends DocContext {
		public TerminalNode DOC() { return getToken(ProjectParser.DOC, 0); }
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public TerminalNode ENDOC() { return getToken(ProjectParser.ENDOC, 0); }
		public DocNameContext(DocContext ctx) { copyFrom(ctx); }
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_doc);
		try {
			_localctx = new DocNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(DOC);
			setState(198);
			filename();
			setState(199);
			match(ENDOC);
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
	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrRPContext extends RpContext {
		public AttrNameContext attrName() {
			return getRuleContext(AttrNameContext.class,0);
		}
		public AttrRPContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildRPContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public ChildRPContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterPathContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public PfContext pf() {
			return getRuleContext(PfContext.class,0);
		}
		public FilterPathContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextRPContext extends RpContext {
		public TextRPContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentRPContext extends RpContext {
		public ParentRPContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnionRPContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public UnionRPContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfRPContext extends RpContext {
		public SelfRPContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildrenRPContext extends RpContext {
		public ChildrenRPContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagRPContext extends RpContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TagRPContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescendRPContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public DescendRPContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenRPContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ParenRPContext(RpContext ctx) { copyFrom(ctx); }
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new TagRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(202);
				tagName();
				}
				break;
			case T__24:
				{
				_localctx = new ChildrenRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(T__24);
				}
				break;
			case T__25:
				{
				_localctx = new SelfRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(T__25);
				}
				break;
			case T__26:
				{
				_localctx = new ParentRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(T__26);
				}
				break;
			case T__27:
				{
				_localctx = new TextRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(T__27);
				}
				break;
			case T__28:
				{
				_localctx = new AttrRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(T__28);
				setState(208);
				attrName();
				}
				break;
			case T__0:
				{
				_localctx = new ParenRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(T__0);
				setState(210);
				rp(0);
				setState(211);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(229);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ChildRPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(215);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(216);
						match(T__3);
						setState(217);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new DescendRPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(218);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(219);
						match(T__4);
						setState(220);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new UnionRPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(221);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(222);
						match(T__2);
						setState(223);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new FilterPathContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(224);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(225);
						match(T__29);
						setState(226);
						pf(0);
						setState(227);
						match(T__30);
						}
						break;
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
	public static class PfContext extends ParserRuleContext {
		public PfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pf; }
	 
		public PfContext() { }
		public void copyFrom(PfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RpPFContext extends PfContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpPFContext(PfContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualsPFContext extends PfContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public EqualsPFContext(PfContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenPFContext extends PfContext {
		public PfContext pf() {
			return getRuleContext(PfContext.class,0);
		}
		public ParenPFContext(PfContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndPFContext extends PfContext {
		public List<PfContext> pf() {
			return getRuleContexts(PfContext.class);
		}
		public PfContext pf(int i) {
			return getRuleContext(PfContext.class,i);
		}
		public AndPFContext(PfContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringPFContext extends PfContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ComparisonStringContext comparisonString() {
			return getRuleContext(ComparisonStringContext.class,0);
		}
		public StringPFContext(PfContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SamePFContext extends PfContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public SamePFContext(PfContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotPFContext extends PfContext {
		public PfContext pf() {
			return getRuleContext(PfContext.class,0);
		}
		public NotPFContext(PfContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualPFContext extends PfContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public EqualPFContext(PfContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrPFContext extends PfContext {
		public List<PfContext> pf() {
			return getRuleContexts(PfContext.class);
		}
		public PfContext pf(int i) {
			return getRuleContext(PfContext.class,i);
		}
		public OrPFContext(PfContext ctx) { copyFrom(ctx); }
	}

	public final PfContext pf() throws RecognitionException {
		return pf(0);
	}

	private PfContext pf(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PfContext _localctx = new PfContext(_ctx, _parentState);
		PfContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_pf, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new RpPFContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(235);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new EqualsPFContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				rp(0);
				setState(237);
				match(T__14);
				setState(238);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new EqualPFContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				rp(0);
				setState(241);
				match(T__15);
				setState(242);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new SamePFContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				rp(0);
				setState(245);
				match(T__16);
				setState(246);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new SamePFContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				rp(0);
				setState(249);
				match(T__17);
				setState(250);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new StringPFContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				rp(0);
				setState(253);
				match(T__14);
				setState(254);
				comparisonString();
				}
				break;
			case 7:
				{
				_localctx = new ParenPFContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(T__0);
				setState(257);
				pf(0);
				setState(258);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new NotPFContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(T__23);
				setState(261);
				pf(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new AndPFContext(new PfContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_pf);
						setState(264);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(265);
						match(T__21);
						setState(266);
						pf(4);
						}
						break;
					case 2:
						{
						_localctx = new OrPFContext(new PfContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_pf);
						setState(267);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(268);
						match(T__22);
						setState(269);
						pf(3);
						}
						break;
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
	public static class StringConstantContext extends ParserRuleContext {
		public ComparisonStringContext comparisonString() {
			return getRuleContext(ComparisonStringContext.class,0);
		}
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			comparisonString();
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
	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProjectParser.ID, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ID);
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
	public static class AttrNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProjectParser.ID, 0); }
		public AttrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrName; }
	}

	public final AttrNameContext attrName() throws RecognitionException {
		AttrNameContext _localctx = new AttrNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attrName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ID);
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
	public static class StartTagContext extends ParserRuleContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public StartTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startTag; }
	}

	public final StartTagContext startTag() throws RecognitionException {
		StartTagContext _localctx = new StartTagContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_startTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__31);
			setState(282);
			tagName();
			setState(283);
			match(T__32);
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
	public static class EndTagContext extends ParserRuleContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public EndTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTag; }
	}

	public final EndTagContext endTag() throws RecognitionException {
		EndTagContext _localctx = new EndTagContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_endTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__33);
			setState(286);
			tagName();
			setState(287);
			match(T__32);
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
	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode FILENAME() { return getToken(ProjectParser.FILENAME, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(FILENAME);
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProjectParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__34);
			setState(292);
			match(ID);
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
	public static class ComparisonStringContext extends ParserRuleContext {
		public ComparisonStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonString; }
	}

	public final ComparisonStringContext comparisonString() throws RecognitionException {
		ComparisonStringContext _localctx = new ComparisonStringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comparisonString);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__35);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(295);
					matchWildcard();
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(301);
			match(T__35);
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
		case 0:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 5:
			return rt_sempred((RtContext)_localctx, predIndex);
		case 6:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 9:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 10:
			return pf_sempred((PfContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean rt_sempred(RtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 1);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean pf_sempred(PfContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u0130\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00007\b\u0000"+
		"\u0001\u0000\u0003\u0000:\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000A\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000O\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001Z\b\u0001\n\u0001\f\u0001]\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002h\b\u0002\n\u0002\f\u0002"+
		"k\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005y\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005~\b\u0005\n\u0005\f\u0005\u0081\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00a1"+
		"\b\u0006\n\u0006\f\u0006\u00a4\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00af\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00b7\b\u0006\n\u0006\f\u0006\u00ba"+
		"\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c4\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d6\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00e6\b\t\n\t\f\t\u00e9\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0107\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u010f\b\n\n\n\f\n\u0112\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u0129"+
		"\b\u0012\n\u0012\f\u0012\u012c\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u012a\u0005\u0000\n\f\u0012\u0014\u0013\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000"+
		"\u0000\u014a\u0000@\u0001\u0000\u0000\u0000\u0002P\u0001\u0000\u0000\u0000"+
		"\u0004^\u0001\u0000\u0000\u0000\u0006l\u0001\u0000\u0000\u0000\bo\u0001"+
		"\u0000\u0000\u0000\nx\u0001\u0000\u0000\u0000\f\u00ae\u0001\u0000\u0000"+
		"\u0000\u000e\u00c3\u0001\u0000\u0000\u0000\u0010\u00c5\u0001\u0000\u0000"+
		"\u0000\u0012\u00d5\u0001\u0000\u0000\u0000\u0014\u0106\u0001\u0000\u0000"+
		"\u0000\u0016\u0113\u0001\u0000\u0000\u0000\u0018\u0115\u0001\u0000\u0000"+
		"\u0000\u001a\u0117\u0001\u0000\u0000\u0000\u001c\u0119\u0001\u0000\u0000"+
		"\u0000\u001e\u011d\u0001\u0000\u0000\u0000 \u0121\u0001\u0000\u0000\u0000"+
		"\"\u0123\u0001\u0000\u0000\u0000$\u0126\u0001\u0000\u0000\u0000&\'\u0006"+
		"\u0000\uffff\uffff\u0000\'A\u0003\"\u0011\u0000(A\u0003\u000e\u0007\u0000"+
		")*\u0005\u0001\u0000\u0000*+\u0003\u0000\u0000\u0000+,\u0005\u0002\u0000"+
		"\u0000,A\u0001\u0000\u0000\u0000-A\u0003\u0016\u000b\u0000./\u0003\u001c"+
		"\u000e\u0000/0\u0005\u0006\u0000\u000001\u0003\u0000\u0000\u000012\u0005"+
		"\u0007\u0000\u000023\u0003\u001e\u000f\u00003A\u0001\u0000\u0000\u0000"+
		"46\u0003\u0002\u0001\u000057\u0003\u0004\u0002\u000065\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000079\u0001\u0000\u0000\u00008:\u0003\u0006"+
		"\u0003\u000098\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;<\u0003\b\u0004\u0000<A\u0001\u0000\u0000\u0000=>\u0003"+
		"\u0004\u0002\u0000>?\u0003\u0000\u0000\u0001?A\u0001\u0000\u0000\u0000"+
		"@&\u0001\u0000\u0000\u0000@(\u0001\u0000\u0000\u0000@)\u0001\u0000\u0000"+
		"\u0000@-\u0001\u0000\u0000\u0000@.\u0001\u0000\u0000\u0000@4\u0001\u0000"+
		"\u0000\u0000@=\u0001\u0000\u0000\u0000AM\u0001\u0000\u0000\u0000BC\n\u0007"+
		"\u0000\u0000CD\u0005\u0003\u0000\u0000DL\u0003\u0000\u0000\bEF\n\u0006"+
		"\u0000\u0000FG\u0005\u0004\u0000\u0000GL\u0003\u0012\t\u0000HI\n\u0005"+
		"\u0000\u0000IJ\u0005\u0005\u0000\u0000JL\u0003\u0012\t\u0000KB\u0001\u0000"+
		"\u0000\u0000KE\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000\u0000LO\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"N\u0001\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\b\u0000"+
		"\u0000QR\u0003\"\u0011\u0000RS\u0005\t\u0000\u0000S[\u0003\u0000\u0000"+
		"\u0000TU\u0005\n\u0000\u0000UV\u0003\"\u0011\u0000VW\u0005\t\u0000\u0000"+
		"WX\u0003\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YT\u0001\u0000\u0000"+
		"\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\\u0003\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^_\u0005\u000b\u0000\u0000_`\u0003\"\u0011\u0000`a\u0005\f\u0000\u0000"+
		"ai\u0003\u0000\u0000\u0000bc\u0005\n\u0000\u0000cd\u0003\"\u0011\u0000"+
		"de\u0005\f\u0000\u0000ef\u0003\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000"+
		"gb\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000j\u0005\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000lm\u0005\r\u0000\u0000mn\u0003\f\u0006\u0000n\u0007"+
		"\u0001\u0000\u0000\u0000op\u0005\u000e\u0000\u0000pq\u0003\n\u0005\u0000"+
		"q\t\u0001\u0000\u0000\u0000rs\u0006\u0005\uffff\uffff\u0000sy\u0003\u0000"+
		"\u0000\u0000tu\u0003\u001c\u000e\u0000uv\u0003\n\u0005\u0000vw\u0003\u001e"+
		"\u000f\u0000wy\u0001\u0000\u0000\u0000xr\u0001\u0000\u0000\u0000xt\u0001"+
		"\u0000\u0000\u0000y\u007f\u0001\u0000\u0000\u0000z{\n\u0002\u0000\u0000"+
		"{|\u0005\u0003\u0000\u0000|~\u0003\n\u0005\u0003}z\u0001\u0000\u0000\u0000"+
		"~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u000b\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0006\u0006\uffff\uffff\u0000\u0083"+
		"\u0084\u0003\u0000\u0000\u0000\u0084\u0085\u0005\u000f\u0000\u0000\u0085"+
		"\u0086\u0003\u0000\u0000\u0000\u0086\u00af\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0003\u0000\u0000\u0000\u0088\u0089\u0005\u0010\u0000\u0000\u0089"+
		"\u008a\u0003\u0000\u0000\u0000\u008a\u00af\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0003\u0000\u0000\u0000\u008c\u008d\u0005\u0011\u0000\u0000\u008d"+
		"\u008e\u0003\u0000\u0000\u0000\u008e\u00af\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0003\u0000\u0000\u0000\u0090\u0091\u0005\u0012\u0000\u0000\u0091"+
		"\u0092\u0003\u0000\u0000\u0000\u0092\u00af\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005\u0013\u0000\u0000\u0094\u0095\u0003\u0000\u0000\u0000\u0095"+
		"\u0096\u0005\u0002\u0000\u0000\u0096\u00af\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005\u0014\u0000\u0000\u0098\u0099\u0003\"\u0011\u0000\u0099\u009a"+
		"\u0005\t\u0000\u0000\u009a\u00a2\u0003\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\n\u0000\u0000\u009c\u009d\u0003\"\u0011\u0000\u009d\u009e\u0005\t\u0000"+
		"\u0000\u009e\u009f\u0003\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a0\u009b\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005\u0015\u0000\u0000\u00a6\u00a7\u0003\f\u0006\u0005"+
		"\u00a7\u00af\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0001\u0000\u0000"+
		"\u00a9\u00aa\u0003\f\u0006\u0000\u00aa\u00ab\u0005\u0002\u0000\u0000\u00ab"+
		"\u00af\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0018\u0000\u0000\u00ad"+
		"\u00af\u0003\f\u0006\u0001\u00ae\u0082\u0001\u0000\u0000\u0000\u00ae\u0087"+
		"\u0001\u0000\u0000\u0000\u00ae\u008b\u0001\u0000\u0000\u0000\u00ae\u008f"+
		"\u0001\u0000\u0000\u0000\u00ae\u0093\u0001\u0000\u0000\u0000\u00ae\u0097"+
		"\u0001\u0000\u0000\u0000\u00ae\u00a8\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00af\u00b8\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\n\u0003\u0000\u0000\u00b1\u00b2\u0005\u0016\u0000\u0000\u00b2\u00b7\u0003"+
		"\f\u0006\u0004\u00b3\u00b4\n\u0002\u0000\u0000\u00b4\u00b5\u0005\u0017"+
		"\u0000\u0000\u00b5\u00b7\u0003\f\u0006\u0003\u00b6\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\r\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0003\u0010\b\u0000\u00bc\u00bd\u0005\u0004\u0000\u0000\u00bd"+
		"\u00be\u0003\u0012\t\u0000\u00be\u00c4\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0003\u0010\b\u0000\u00c0\u00c1\u0005\u0005\u0000\u0000\u00c1\u00c2\u0003"+
		"\u0012\t\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00bb\u0001\u0000"+
		"\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c4\u000f\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0005&\u0000\u0000\u00c6\u00c7\u0003 \u0010\u0000"+
		"\u00c7\u00c8\u0005\'\u0000\u0000\u00c8\u0011\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0006\t\uffff\uffff\u0000\u00ca\u00d6\u0003\u0018\f\u0000\u00cb"+
		"\u00d6\u0005\u0019\u0000\u0000\u00cc\u00d6\u0005\u001a\u0000\u0000\u00cd"+
		"\u00d6\u0005\u001b\u0000\u0000\u00ce\u00d6\u0005\u001c\u0000\u0000\u00cf"+
		"\u00d0\u0005\u001d\u0000\u0000\u00d0\u00d6\u0003\u001a\r\u0000\u00d1\u00d2"+
		"\u0005\u0001\u0000\u0000\u00d2\u00d3\u0003\u0012\t\u0000\u00d3\u00d4\u0005"+
		"\u0002\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00c9\u0001"+
		"\u0000\u0000\u0000\u00d5\u00cb\u0001\u0000\u0000\u0000\u00d5\u00cc\u0001"+
		"\u0000\u0000\u0000\u00d5\u00cd\u0001\u0000\u0000\u0000\u00d5\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d5\u00cf\u0001\u0000\u0000\u0000\u00d5\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d6\u00e7\u0001\u0000\u0000\u0000\u00d7\u00d8\n\u0004"+
		"\u0000\u0000\u00d8\u00d9\u0005\u0004\u0000\u0000\u00d9\u00e6\u0003\u0012"+
		"\t\u0005\u00da\u00db\n\u0003\u0000\u0000\u00db\u00dc\u0005\u0005\u0000"+
		"\u0000\u00dc\u00e6\u0003\u0012\t\u0004\u00dd\u00de\n\u0001\u0000\u0000"+
		"\u00de\u00df\u0005\u0003\u0000\u0000\u00df\u00e6\u0003\u0012\t\u0002\u00e0"+
		"\u00e1\n\u0002\u0000\u0000\u00e1\u00e2\u0005\u001e\u0000\u0000\u00e2\u00e3"+
		"\u0003\u0014\n\u0000\u00e3\u00e4\u0005\u001f\u0000\u0000\u00e4\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e5\u00d7\u0001\u0000\u0000\u0000\u00e5\u00da\u0001"+
		"\u0000\u0000\u0000\u00e5\u00dd\u0001\u0000\u0000\u0000\u00e5\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u0013\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0006"+
		"\n\uffff\uffff\u0000\u00eb\u0107\u0003\u0012\t\u0000\u00ec\u00ed\u0003"+
		"\u0012\t\u0000\u00ed\u00ee\u0005\u000f\u0000\u0000\u00ee\u00ef\u0003\u0012"+
		"\t\u0000\u00ef\u0107\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003\u0012\t"+
		"\u0000\u00f1\u00f2\u0005\u0010\u0000\u0000\u00f2\u00f3\u0003\u0012\t\u0000"+
		"\u00f3\u0107\u0001\u0000\u0000\u0000\u00f4\u00f5\u0003\u0012\t\u0000\u00f5"+
		"\u00f6\u0005\u0011\u0000\u0000\u00f6\u00f7\u0003\u0012\t\u0000\u00f7\u0107"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0003\u0012\t\u0000\u00f9\u00fa\u0005"+
		"\u0012\u0000\u0000\u00fa\u00fb\u0003\u0012\t\u0000\u00fb\u0107\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0003\u0012\t\u0000\u00fd\u00fe\u0005\u000f\u0000"+
		"\u0000\u00fe\u00ff\u0003$\u0012\u0000\u00ff\u0107\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0005\u0001\u0000\u0000\u0101\u0102\u0003\u0014\n\u0000\u0102"+
		"\u0103\u0005\u0002\u0000\u0000\u0103\u0107\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0005\u0018\u0000\u0000\u0105\u0107\u0003\u0014\n\u0001\u0106\u00ea"+
		"\u0001\u0000\u0000\u0000\u0106\u00ec\u0001\u0000\u0000\u0000\u0106\u00f0"+
		"\u0001\u0000\u0000\u0000\u0106\u00f4\u0001\u0000\u0000\u0000\u0106\u00f8"+
		"\u0001\u0000\u0000\u0000\u0106\u00fc\u0001\u0000\u0000\u0000\u0106\u0100"+
		"\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0110"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\n\u0003\u0000\u0000\u0109\u010a\u0005"+
		"\u0016\u0000\u0000\u010a\u010f\u0003\u0014\n\u0004\u010b\u010c\n\u0002"+
		"\u0000\u0000\u010c\u010d\u0005\u0017\u0000\u0000\u010d\u010f\u0003\u0014"+
		"\n\u0003\u010e\u0108\u0001\u0000\u0000\u0000\u010e\u010b\u0001\u0000\u0000"+
		"\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0015\u0001\u0000\u0000"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0114\u0003$\u0012\u0000"+
		"\u0114\u0017\u0001\u0000\u0000\u0000\u0115\u0116\u0005(\u0000\u0000\u0116"+
		"\u0019\u0001\u0000\u0000\u0000\u0117\u0118\u0005(\u0000\u0000\u0118\u001b"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0005 \u0000\u0000\u011a\u011b\u0003"+
		"\u0018\f\u0000\u011b\u011c\u0005!\u0000\u0000\u011c\u001d\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0005\"\u0000\u0000\u011e\u011f\u0003\u0018\f"+
		"\u0000\u011f\u0120\u0005!\u0000\u0000\u0120\u001f\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0005)\u0000\u0000\u0122!\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0005#\u0000\u0000\u0124\u0125\u0005(\u0000\u0000\u0125#\u0001\u0000"+
		"\u0000\u0000\u0126\u012a\u0005$\u0000\u0000\u0127\u0129\t\u0000\u0000"+
		"\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000"+
		"\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0005$\u0000\u0000\u012e%\u0001\u0000\u0000\u0000\u0015"+
		"69@KM[ix\u007f\u00a2\u00ae\u00b6\u00b8\u00c3\u00d5\u00e5\u00e7\u0106\u010e"+
		"\u0110\u012a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}