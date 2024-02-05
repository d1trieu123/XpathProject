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
		LETTER=1, DIGIT=2, WS=3, DOC=4, ENDOC=5, SLASH=6, TWO_SLASH=7, EQU=8, 
		TWO_EQU=9, EQ=10, IS=11, AND=12, OR=13, NOT=14, QUOTE=15, TEXT=16, OPENPAREN=17, 
		CLOSEPAREN=18, COMMA=19, OPENBRACKET=20, CLOSEBRACKET=21, STAR=22, PERIOD=23, 
		TWO_PERIOD=24, TAG_NAME=25, FILENAME=26, ATSIGN=27, AXES=28;
	public static final int
		RULE_xpath = 0, RULE_absolutePath = 1, RULE_relativePath = 2, RULE_pathFilter = 3, 
		RULE_tagName = 4, RULE_fileName = 5, RULE_is = 6, RULE_and = 7, RULE_or = 8, 
		RULE_not = 9, RULE_comparisonString = 10, RULE_comparisonNumber = 11, 
		RULE_attributeName = 12, RULE_axisSpecifier = 13, RULE_descendOrSelf = 14, 
		RULE_childNode = 15, RULE_equals = 16, RULE_twoEquals = 17, RULE_all = 18, 
		RULE_self = 19, RULE_parent = 20, RULE_text = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"xpath", "absolutePath", "relativePath", "pathFilter", "tagName", "fileName", 
			"is", "and", "or", "not", "comparisonString", "comparisonNumber", "attributeName", 
			"axisSpecifier", "descendOrSelf", "childNode", "equals", "twoEquals", 
			"all", "self", "parent", "text"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'doc(\"'", "'\")'", null, null, "'='", "'=='", 
			"'eq'", "'is'", "'and'", "'or'", "'not'", "'\"'", "'text()'", "'('", 
			"')'", "','", "'['", "']'", "'*'", "'.'", "'..'", null, null, "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LETTER", "DIGIT", "WS", "DOC", "ENDOC", "SLASH", "TWO_SLASH", 
			"EQU", "TWO_EQU", "EQ", "IS", "AND", "OR", "NOT", "QUOTE", "TEXT", "OPENPAREN", 
			"CLOSEPAREN", "COMMA", "OPENBRACKET", "CLOSEBRACKET", "STAR", "PERIOD", 
			"TWO_PERIOD", "TAG_NAME", "FILENAME", "ATSIGN", "AXES"
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
	public static class XpathContext extends ParserRuleContext {
		public AbsolutePathContext absolutePath() {
			return getRuleContext(AbsolutePathContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ProjectParser.EOF, 0); }
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public XpathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xpath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterXpath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitXpath(this);
		}
	}

	public final XpathContext xpath() throws RecognitionException {
		XpathContext _localctx = new XpathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_xpath);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOC:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				absolutePath();
				setState(45);
				match(EOF);
				}
				break;
			case TEXT:
			case OPENPAREN:
			case STAR:
			case PERIOD:
			case TWO_PERIOD:
			case TAG_NAME:
			case ATSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				relativePath(0);
				setState(48);
				match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AbsolutePathContext extends ParserRuleContext {
		public TerminalNode DOC() { return getToken(ProjectParser.DOC, 0); }
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode ENDOC() { return getToken(ProjectParser.ENDOC, 0); }
		public ChildNodeContext childNode() {
			return getRuleContext(ChildNodeContext.class,0);
		}
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public DescendOrSelfContext descendOrSelf() {
			return getRuleContext(DescendOrSelfContext.class,0);
		}
		public AbsolutePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absolutePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterAbsolutePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitAbsolutePath(this);
		}
	}

	public final AbsolutePathContext absolutePath() throws RecognitionException {
		AbsolutePathContext _localctx = new AbsolutePathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_absolutePath);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(DOC);
				setState(53);
				fileName();
				setState(54);
				match(ENDOC);
				setState(55);
				childNode();
				setState(56);
				relativePath(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(DOC);
				setState(59);
				fileName();
				setState(60);
				match(ENDOC);
				setState(61);
				descendOrSelf();
				setState(62);
				relativePath(0);
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
	public static class RelativePathContext extends ParserRuleContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
		}
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public ParentContext parent() {
			return getRuleContext(ParentContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TerminalNode ATSIGN() { return getToken(ProjectParser.ATSIGN, 0); }
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(ProjectParser.OPENPAREN, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public TerminalNode CLOSEPAREN() { return getToken(ProjectParser.CLOSEPAREN, 0); }
		public ChildNodeContext childNode() {
			return getRuleContext(ChildNodeContext.class,0);
		}
		public DescendOrSelfContext descendOrSelf() {
			return getRuleContext(DescendOrSelfContext.class,0);
		}
		public TerminalNode OPENBRACKET() { return getToken(ProjectParser.OPENBRACKET, 0); }
		public PathFilterContext pathFilter() {
			return getRuleContext(PathFilterContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(ProjectParser.CLOSEBRACKET, 0); }
		public RelativePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterRelativePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitRelativePath(this);
		}
	}

	public final RelativePathContext relativePath() throws RecognitionException {
		return relativePath(0);
	}

	private RelativePathContext relativePath(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelativePathContext _localctx = new RelativePathContext(_ctx, _parentState);
		RelativePathContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_relativePath, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_NAME:
				{
				setState(67);
				tagName();
				}
				break;
			case STAR:
				{
				setState(68);
				all();
				}
				break;
			case PERIOD:
				{
				setState(69);
				self();
				}
				break;
			case TWO_PERIOD:
				{
				setState(70);
				parent();
				}
				break;
			case TEXT:
				{
				setState(71);
				text();
				}
				break;
			case ATSIGN:
				{
				setState(72);
				match(ATSIGN);
				setState(73);
				attributeName();
				}
				break;
			case OPENPAREN:
				{
				setState(74);
				match(OPENPAREN);
				setState(75);
				relativePath(0);
				setState(76);
				match(CLOSEPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(80);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(81);
						childNode();
						setState(82);
						relativePath(5);
						}
						break;
					case 2:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(84);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(85);
						descendOrSelf();
						setState(86);
						relativePath(4);
						}
						break;
					case 3:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(88);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(89);
						match(CLOSEPAREN);
						setState(90);
						relativePath(2);
						}
						break;
					case 4:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(91);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(92);
						match(OPENBRACKET);
						setState(93);
						pathFilter(0);
						setState(94);
						match(CLOSEBRACKET);
						}
						break;
					}
					} 
				}
				setState(100);
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
	public static class PathFilterContext extends ParserRuleContext {
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public TwoEqualsContext twoEquals() {
			return getRuleContext(TwoEqualsContext.class,0);
		}
		public IsContext is() {
			return getRuleContext(IsContext.class,0);
		}
		public ComparisonStringContext comparisonString() {
			return getRuleContext(ComparisonStringContext.class,0);
		}
		public ComparisonNumberContext comparisonNumber() {
			return getRuleContext(ComparisonNumberContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(ProjectParser.OPENPAREN, 0); }
		public List<PathFilterContext> pathFilter() {
			return getRuleContexts(PathFilterContext.class);
		}
		public PathFilterContext pathFilter(int i) {
			return getRuleContext(PathFilterContext.class,i);
		}
		public TerminalNode CLOSEPAREN() { return getToken(ProjectParser.CLOSEPAREN, 0); }
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public PathFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterPathFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitPathFilter(this);
		}
	}

	public final PathFilterContext pathFilter() throws RecognitionException {
		return pathFilter(0);
	}

	private PathFilterContext pathFilter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PathFilterContext _localctx = new PathFilterContext(_ctx, _parentState);
		PathFilterContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_pathFilter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(102);
				relativePath(0);
				}
				break;
			case 2:
				{
				setState(103);
				relativePath(0);
				setState(104);
				equals();
				setState(105);
				relativePath(0);
				}
				break;
			case 3:
				{
				setState(107);
				relativePath(0);
				setState(108);
				twoEquals();
				setState(109);
				relativePath(0);
				}
				break;
			case 4:
				{
				setState(111);
				relativePath(0);
				setState(112);
				is();
				setState(113);
				relativePath(0);
				}
				break;
			case 5:
				{
				setState(115);
				relativePath(0);
				setState(116);
				equals();
				setState(119);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUOTE:
					{
					setState(117);
					comparisonString();
					}
					break;
				case DIGIT:
					{
					setState(118);
					comparisonNumber();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				{
				setState(121);
				match(OPENPAREN);
				setState(122);
				pathFilter(0);
				setState(123);
				match(CLOSEPAREN);
				}
				break;
			case 7:
				{
				setState(125);
				not();
				setState(126);
				pathFilter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new PathFilterContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pathFilter);
						setState(130);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(131);
						and();
						setState(132);
						pathFilter(4);
						}
						break;
					case 2:
						{
						_localctx = new PathFilterContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pathFilter);
						setState(134);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(135);
						or();
						setState(136);
						pathFilter(3);
						}
						break;
					}
					} 
				}
				setState(142);
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
	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(ProjectParser.TAG_NAME, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitTagName(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(TAG_NAME);
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
	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode FILENAME() { return getToken(ProjectParser.FILENAME, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitFileName(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
	public static class IsContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(ProjectParser.IS, 0); }
		public IsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitIs(this);
		}
	}

	public final IsContext is() throws RecognitionException {
		IsContext _localctx = new IsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_is);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IS);
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
	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ProjectParser.AND, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(AND);
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
	public static class OrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(ProjectParser.OR, 0); }
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(OR);
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
	public static class NotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ProjectParser.NOT, 0); }
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(NOT);
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
		public List<TerminalNode> QUOTE() { return getTokens(ProjectParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(ProjectParser.QUOTE, i);
		}
		public ComparisonStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterComparisonString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitComparisonString(this);
		}
	}

	public final ComparisonStringContext comparisonString() throws RecognitionException {
		ComparisonStringContext _localctx = new ComparisonStringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparisonString);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(QUOTE);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(156);
					matchWildcard();
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(162);
			match(QUOTE);
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
	public static class ComparisonNumberContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ProjectParser.DIGIT, 0); }
		public ComparisonNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterComparisonNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitComparisonNumber(this);
		}
	}

	public final ComparisonNumberContext comparisonNumber() throws RecognitionException {
		ComparisonNumberContext _localctx = new ComparisonNumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparisonNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(DIGIT);
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
	public static class AttributeNameContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(ProjectParser.TAG_NAME, 0); }
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitAttributeName(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(TAG_NAME);
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
	public static class AxisSpecifierContext extends ParserRuleContext {
		public TerminalNode AXES() { return getToken(ProjectParser.AXES, 0); }
		public AxisSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axisSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterAxisSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitAxisSpecifier(this);
		}
	}

	public final AxisSpecifierContext axisSpecifier() throws RecognitionException {
		AxisSpecifierContext _localctx = new AxisSpecifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_axisSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(AXES);
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
	public static class DescendOrSelfContext extends ParserRuleContext {
		public TerminalNode TWO_SLASH() { return getToken(ProjectParser.TWO_SLASH, 0); }
		public DescendOrSelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descendOrSelf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterDescendOrSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitDescendOrSelf(this);
		}
	}

	public final DescendOrSelfContext descendOrSelf() throws RecognitionException {
		DescendOrSelfContext _localctx = new DescendOrSelfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_descendOrSelf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(TWO_SLASH);
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
	public static class ChildNodeContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(ProjectParser.SLASH, 0); }
		public ChildNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterChildNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitChildNode(this);
		}
	}

	public final ChildNodeContext childNode() throws RecognitionException {
		ChildNodeContext _localctx = new ChildNodeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_childNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(SLASH);
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
	public static class EqualsContext extends ParserRuleContext {
		public TerminalNode EQU() { return getToken(ProjectParser.EQU, 0); }
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitEquals(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(EQU);
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
	public static class TwoEqualsContext extends ParserRuleContext {
		public TerminalNode TWO_EQU() { return getToken(ProjectParser.TWO_EQU, 0); }
		public TwoEqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoEquals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterTwoEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitTwoEquals(this);
		}
	}

	public final TwoEqualsContext twoEquals() throws RecognitionException {
		TwoEqualsContext _localctx = new TwoEqualsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_twoEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(TWO_EQU);
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
	public static class AllContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(ProjectParser.STAR, 0); }
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitAll(this);
		}
	}

	public final AllContext all() throws RecognitionException {
		AllContext _localctx = new AllContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(STAR);
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
	public static class SelfContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(ProjectParser.PERIOD, 0); }
		public SelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitSelf(this);
		}
	}

	public final SelfContext self() throws RecognitionException {
		SelfContext _localctx = new SelfContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_self);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(PERIOD);
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
	public static class ParentContext extends ParserRuleContext {
		public TerminalNode TWO_PERIOD() { return getToken(ProjectParser.TWO_PERIOD, 0); }
		public ParentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitParent(this);
		}
	}

	public final ParentContext parent() throws RecognitionException {
		ParentContext _localctx = new ParentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(TWO_PERIOD);
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
	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(ProjectParser.TEXT, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(TEXT);
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
		case 2:
			return relativePath_sempred((RelativePathContext)_localctx, predIndex);
		case 3:
			return pathFilter_sempred((PathFilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean relativePath_sempred(RelativePathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean pathFilter_sempred(PathFilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u00bb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u00003\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001A\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002O\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002a\b"+
		"\u0002\n\u0002\f\u0002d\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003x\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0081\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u008b\b\u0003\n"+
		"\u0003\f\u0003\u008e\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u009e\b\n\n\n\f\n\u00a1\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u009f\u0002"+
		"\u0004\u0006\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0000\u00ba\u00002\u0001\u0000"+
		"\u0000\u0000\u0002@\u0001\u0000\u0000\u0000\u0004N\u0001\u0000\u0000\u0000"+
		"\u0006\u0080\u0001\u0000\u0000\u0000\b\u008f\u0001\u0000\u0000\u0000\n"+
		"\u0091\u0001\u0000\u0000\u0000\f\u0093\u0001\u0000\u0000\u0000\u000e\u0095"+
		"\u0001\u0000\u0000\u0000\u0010\u0097\u0001\u0000\u0000\u0000\u0012\u0099"+
		"\u0001\u0000\u0000\u0000\u0014\u009b\u0001\u0000\u0000\u0000\u0016\u00a4"+
		"\u0001\u0000\u0000\u0000\u0018\u00a6\u0001\u0000\u0000\u0000\u001a\u00a8"+
		"\u0001\u0000\u0000\u0000\u001c\u00aa\u0001\u0000\u0000\u0000\u001e\u00ac"+
		"\u0001\u0000\u0000\u0000 \u00ae\u0001\u0000\u0000\u0000\"\u00b0\u0001"+
		"\u0000\u0000\u0000$\u00b2\u0001\u0000\u0000\u0000&\u00b4\u0001\u0000\u0000"+
		"\u0000(\u00b6\u0001\u0000\u0000\u0000*\u00b8\u0001\u0000\u0000\u0000,"+
		"-\u0003\u0002\u0001\u0000-.\u0005\u0000\u0000\u0001.3\u0001\u0000\u0000"+
		"\u0000/0\u0003\u0004\u0002\u000001\u0005\u0000\u0000\u000113\u0001\u0000"+
		"\u0000\u00002,\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u00003\u0001"+
		"\u0001\u0000\u0000\u000045\u0005\u0004\u0000\u000056\u0003\n\u0005\u0000"+
		"67\u0005\u0005\u0000\u000078\u0003\u001e\u000f\u000089\u0003\u0004\u0002"+
		"\u00009A\u0001\u0000\u0000\u0000:;\u0005\u0004\u0000\u0000;<\u0003\n\u0005"+
		"\u0000<=\u0005\u0005\u0000\u0000=>\u0003\u001c\u000e\u0000>?\u0003\u0004"+
		"\u0002\u0000?A\u0001\u0000\u0000\u0000@4\u0001\u0000\u0000\u0000@:\u0001"+
		"\u0000\u0000\u0000A\u0003\u0001\u0000\u0000\u0000BC\u0006\u0002\uffff"+
		"\uffff\u0000CO\u0003\b\u0004\u0000DO\u0003$\u0012\u0000EO\u0003&\u0013"+
		"\u0000FO\u0003(\u0014\u0000GO\u0003*\u0015\u0000HI\u0005\u001b\u0000\u0000"+
		"IO\u0003\u0018\f\u0000JK\u0005\u0011\u0000\u0000KL\u0003\u0004\u0002\u0000"+
		"LM\u0005\u0012\u0000\u0000MO\u0001\u0000\u0000\u0000NB\u0001\u0000\u0000"+
		"\u0000ND\u0001\u0000\u0000\u0000NE\u0001\u0000\u0000\u0000NF\u0001\u0000"+
		"\u0000\u0000NG\u0001\u0000\u0000\u0000NH\u0001\u0000\u0000\u0000NJ\u0001"+
		"\u0000\u0000\u0000Ob\u0001\u0000\u0000\u0000PQ\n\u0004\u0000\u0000QR\u0003"+
		"\u001e\u000f\u0000RS\u0003\u0004\u0002\u0005Sa\u0001\u0000\u0000\u0000"+
		"TU\n\u0003\u0000\u0000UV\u0003\u001c\u000e\u0000VW\u0003\u0004\u0002\u0004"+
		"Wa\u0001\u0000\u0000\u0000XY\n\u0001\u0000\u0000YZ\u0005\u0012\u0000\u0000"+
		"Za\u0003\u0004\u0002\u0002[\\\n\u0002\u0000\u0000\\]\u0005\u0014\u0000"+
		"\u0000]^\u0003\u0006\u0003\u0000^_\u0005\u0015\u0000\u0000_a\u0001\u0000"+
		"\u0000\u0000`P\u0001\u0000\u0000\u0000`T\u0001\u0000\u0000\u0000`X\u0001"+
		"\u0000\u0000\u0000`[\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u0005\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0006\u0003\uffff\uffff\u0000"+
		"f\u0081\u0003\u0004\u0002\u0000gh\u0003\u0004\u0002\u0000hi\u0003 \u0010"+
		"\u0000ij\u0003\u0004\u0002\u0000j\u0081\u0001\u0000\u0000\u0000kl\u0003"+
		"\u0004\u0002\u0000lm\u0003\"\u0011\u0000mn\u0003\u0004\u0002\u0000n\u0081"+
		"\u0001\u0000\u0000\u0000op\u0003\u0004\u0002\u0000pq\u0003\f\u0006\u0000"+
		"qr\u0003\u0004\u0002\u0000r\u0081\u0001\u0000\u0000\u0000st\u0003\u0004"+
		"\u0002\u0000tw\u0003 \u0010\u0000ux\u0003\u0014\n\u0000vx\u0003\u0016"+
		"\u000b\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x\u0081"+
		"\u0001\u0000\u0000\u0000yz\u0005\u0011\u0000\u0000z{\u0003\u0006\u0003"+
		"\u0000{|\u0005\u0012\u0000\u0000|\u0081\u0001\u0000\u0000\u0000}~\u0003"+
		"\u0012\t\u0000~\u007f\u0003\u0006\u0003\u0001\u007f\u0081\u0001\u0000"+
		"\u0000\u0000\u0080e\u0001\u0000\u0000\u0000\u0080g\u0001\u0000\u0000\u0000"+
		"\u0080k\u0001\u0000\u0000\u0000\u0080o\u0001\u0000\u0000\u0000\u0080s"+
		"\u0001\u0000\u0000\u0000\u0080y\u0001\u0000\u0000\u0000\u0080}\u0001\u0000"+
		"\u0000\u0000\u0081\u008c\u0001\u0000\u0000\u0000\u0082\u0083\n\u0003\u0000"+
		"\u0000\u0083\u0084\u0003\u000e\u0007\u0000\u0084\u0085\u0003\u0006\u0003"+
		"\u0004\u0085\u008b\u0001\u0000\u0000\u0000\u0086\u0087\n\u0002\u0000\u0000"+
		"\u0087\u0088\u0003\u0010\b\u0000\u0088\u0089\u0003\u0006\u0003\u0003\u0089"+
		"\u008b\u0001\u0000\u0000\u0000\u008a\u0082\u0001\u0000\u0000\u0000\u008a"+
		"\u0086\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u0007\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\u0019\u0000\u0000\u0090\t\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005\u001a\u0000\u0000\u0092\u000b\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005\u000b\u0000\u0000\u0094\r\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\f\u0000\u0000\u0096\u000f\u0001\u0000\u0000\u0000\u0097\u0098\u0005\r"+
		"\u0000\u0000\u0098\u0011\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u000e"+
		"\u0000\u0000\u009a\u0013\u0001\u0000\u0000\u0000\u009b\u009f\u0005\u000f"+
		"\u0000\u0000\u009c\u009e\t\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u000f\u0000"+
		"\u0000\u00a3\u0015\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0002\u0000"+
		"\u0000\u00a5\u0017\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0019\u0000"+
		"\u0000\u00a7\u0019\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u001c\u0000"+
		"\u0000\u00a9\u001b\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0007\u0000"+
		"\u0000\u00ab\u001d\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0006\u0000"+
		"\u0000\u00ad\u001f\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\b\u0000\u0000"+
		"\u00af!\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\t\u0000\u0000\u00b1"+
		"#\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0016\u0000\u0000\u00b3%\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005\u0017\u0000\u0000\u00b5\'\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005\u0018\u0000\u0000\u00b7)\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0005\u0010\u0000\u0000\u00b9+\u0001\u0000\u0000\u0000"+
		"\n2@N`bw\u0080\u008a\u008c\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}