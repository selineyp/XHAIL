// Generated from Grammar.g4 by ANTLR 4.2.2

package ac.bristol.bragaglia.xhail.parsers.clasp3;

/**
 * @author stefano
 *
 */
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, BACKSLASH=24, 
		COLON=25, COMMA=26, DOT=27, DOTDOT=28, SLASH=29, PAREN_LEFT=30, PAREN_RIGHT=31, 
		SPACE=32, DRIVE=33, IDENTIFIER=34, INTEGER=35, FLOAT=36, LETTER=37, NEWLINE=38, 
		QUOTED=39, STRING=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'s'", "'s)'", "'CPU Time     : '", "'s Unsat: '", "'SATISFIABLE'", "'Reading from stdin'", 
		"'Reading from '", "'Solving...'", "'Calls        : '", "'s 1st Model: '", 
		"'Models       : '", "'Answer: '", "'Time         : '", "'OPTIMUM FOUND'", 
		"'Optimization : '", "'  Optimum    : no'", "'clasp version 3.'", "'  Optimal    : '", 
		"'  Optimum    : yes'", "'UNKNOWN'", "'UNSATISFIABLE'", "'s (Solving: '", 
		"'Optimization: '", "'\\'", "':'", "','", "'.'", "'..'", "'/'", "'('", 
		"')'", "' '", "DRIVE", "IDENTIFIER", "INTEGER", "FLOAT", "LETTER", "NEWLINE", 
		"QUOTED", "STRING"
	};
	public static final String[] ruleNames = {
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "BACKSLASH", "COLON", 
		"COMMA", "DOT", "DOTDOT", "SLASH", "PAREN_LEFT", "PAREN_RIGHT", "SPACE", 
		"DRIVE", "IDENTIFIER", "INTEGER", "FLOAT", "LETTER", "NEWLINE", "QUOTED", 
		"STRING", "DIGIT", "ESCAPE", "FOLLOW", "LOWER", "NONZERO", "UNDERSCORE", 
		"UPPER"
	};


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u0208\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\5\"\u01ab\n\"\3\"\3\"\5\"\u01af\n\"\3#\3#\7#\u01b3\n#\f#\16#\u01b6\13"+
		"#\3$\6$\u01b9\n$\r$\16$\u01ba\3%\6%\u01be\n%\r%\16%\u01bf\3%\3%\6%\u01c4"+
		"\n%\r%\16%\u01c5\3&\3&\3&\3&\5&\u01cc\n&\3\'\5\'\u01cf\n\'\3\'\3\'\3("+
		"\3(\3(\6(\u01d6\n(\r(\16(\u01d7\3(\3(\3)\3)\3)\6)\u01df\n)\r)\16)\u01e0"+
		"\3)\3)\3*\3*\5*\u01e7\n*\3+\3+\3+\3+\5+\u01ed\n+\3+\5+\u01f0\n+\3+\3+"+
		"\3+\3+\3+\3+\3+\5+\u01f9\n+\3,\3,\3,\3,\5,\u01ff\n,\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\4\u01d7\u01e0\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W\2Y\2[\2]"+
		"\2_\2\3\2\r\4\2))^^\4\2$$^^\3\2\62\62\b\2$$^^ddppttvv\3\2\62\65\3\2\62"+
		"9\5\2\62;CHch\3\2c|\3\2\63;\3\2aa\3\2C\\\u0216\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7f\3\2\2\2\tv"+
		"\3\2\2\2\13\u0080\3\2\2\2\r\u008c\3\2\2\2\17\u009f\3\2\2\2\21\u00ad\3"+
		"\2\2\2\23\u00b8\3\2\2\2\25\u00c8\3\2\2\2\27\u00d6\3\2\2\2\31\u00e6\3\2"+
		"\2\2\33\u00ef\3\2\2\2\35\u00ff\3\2\2\2\37\u010d\3\2\2\2!\u011d\3\2\2\2"+
		"#\u012f\3\2\2\2%\u0140\3\2\2\2\'\u0150\3\2\2\2)\u0163\3\2\2\2+\u016b\3"+
		"\2\2\2-\u0179\3\2\2\2/\u0186\3\2\2\2\61\u0195\3\2\2\2\63\u0197\3\2\2\2"+
		"\65\u0199\3\2\2\2\67\u019b\3\2\2\29\u019d\3\2\2\2;\u01a0\3\2\2\2=\u01a2"+
		"\3\2\2\2?\u01a4\3\2\2\2A\u01a6\3\2\2\2C\u01aa\3\2\2\2E\u01b0\3\2\2\2G"+
		"\u01b8\3\2\2\2I\u01bd\3\2\2\2K\u01cb\3\2\2\2M\u01ce\3\2\2\2O\u01d2\3\2"+
		"\2\2Q\u01db\3\2\2\2S\u01e6\3\2\2\2U\u01f8\3\2\2\2W\u01fe\3\2\2\2Y\u0200"+
		"\3\2\2\2[\u0202\3\2\2\2]\u0204\3\2\2\2_\u0206\3\2\2\2ab\7u\2\2b\4\3\2"+
		"\2\2cd\7u\2\2de\7+\2\2e\6\3\2\2\2fg\7E\2\2gh\7R\2\2hi\7W\2\2ij\7\"\2\2"+
		"jk\7V\2\2kl\7k\2\2lm\7o\2\2mn\7g\2\2no\7\"\2\2op\7\"\2\2pq\7\"\2\2qr\7"+
		"\"\2\2rs\7\"\2\2st\7<\2\2tu\7\"\2\2u\b\3\2\2\2vw\7u\2\2wx\7\"\2\2xy\7"+
		"W\2\2yz\7p\2\2z{\7u\2\2{|\7c\2\2|}\7v\2\2}~\7<\2\2~\177\7\"\2\2\177\n"+
		"\3\2\2\2\u0080\u0081\7U\2\2\u0081\u0082\7C\2\2\u0082\u0083\7V\2\2\u0083"+
		"\u0084\7K\2\2\u0084\u0085\7U\2\2\u0085\u0086\7H\2\2\u0086\u0087\7K\2\2"+
		"\u0087\u0088\7C\2\2\u0088\u0089\7D\2\2\u0089\u008a\7N\2\2\u008a\u008b"+
		"\7G\2\2\u008b\f\3\2\2\2\u008c\u008d\7T\2\2\u008d\u008e\7g\2\2\u008e\u008f"+
		"\7c\2\2\u008f\u0090\7f\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2\u0092"+
		"\u0093\7i\2\2\u0093\u0094\7\"\2\2\u0094\u0095\7h\2\2\u0095\u0096\7t\2"+
		"\2\u0096\u0097\7q\2\2\u0097\u0098\7o\2\2\u0098\u0099\7\"\2\2\u0099\u009a"+
		"\7u\2\2\u009a\u009b\7v\2\2\u009b\u009c\7f\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7p\2\2\u009e\16\3\2\2\2\u009f\u00a0\7T\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		"\u00a2\7c\2\2\u00a2\u00a3\7f\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2"+
		"\u00a5\u00a6\7i\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9"+
		"\7t\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7o\2\2\u00ab\u00ac\7\"\2\2\u00ac"+
		"\20\3\2\2\2\u00ad\u00ae\7U\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7n\2\2\u00b0"+
		"\u00b1\7x\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7i\2\2"+
		"\u00b4\u00b5\7\60\2\2\u00b5\u00b6\7\60\2\2\u00b6\u00b7\7\60\2\2\u00b7"+
		"\22\3\2\2\2\u00b8\u00b9\7E\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7n\2\2\u00bb"+
		"\u00bc\7n\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7\"\2\2\u00be\u00bf\7\"\2"+
		"\2\u00bf\u00c0\7\"\2\2\u00c0\u00c1\7\"\2\2\u00c1\u00c2\7\"\2\2\u00c2\u00c3"+
		"\7\"\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\7\"\2\2\u00c5\u00c6\7<\2\2\u00c6"+
		"\u00c7\7\"\2\2\u00c7\24\3\2\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7\"\2\2"+
		"\u00ca\u00cb\7\63\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce"+
		"\7\"\2\2\u00ce\u00cf\7O\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7f\2\2\u00d1"+
		"\u00d2\7g\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7<\2\2\u00d4\u00d5\7\"\2"+
		"\2\u00d5\26\3\2\2\2\u00d6\u00d7\7O\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9"+
		"\7f\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7u\2\2\u00dc"+
		"\u00dd\7\"\2\2\u00dd\u00de\7\"\2\2\u00de\u00df\7\"\2\2\u00df\u00e0\7\""+
		"\2\2\u00e0\u00e1\7\"\2\2\u00e1\u00e2\7\"\2\2\u00e2\u00e3\7\"\2\2\u00e3"+
		"\u00e4\7<\2\2\u00e4\u00e5\7\"\2\2\u00e5\30\3\2\2\2\u00e6\u00e7\7C\2\2"+
		"\u00e7\u00e8\7p\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7y\2\2\u00ea\u00eb"+
		"\7g\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7<\2\2\u00ed\u00ee\7\"\2\2\u00ee"+
		"\32\3\2\2\2\u00ef\u00f0\7V\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7o\2\2\u00f2"+
		"\u00f3\7g\2\2\u00f3\u00f4\7\"\2\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6\7\""+
		"\2\2\u00f6\u00f7\7\"\2\2\u00f7\u00f8\7\"\2\2\u00f8\u00f9\7\"\2\2\u00f9"+
		"\u00fa\7\"\2\2\u00fa\u00fb\7\"\2\2\u00fb\u00fc\7\"\2\2\u00fc\u00fd\7<"+
		"\2\2\u00fd\u00fe\7\"\2\2\u00fe\34\3\2\2\2\u00ff\u0100\7Q\2\2\u0100\u0101"+
		"\7R\2\2\u0101\u0102\7V\2\2\u0102\u0103\7K\2\2\u0103\u0104\7O\2\2\u0104"+
		"\u0105\7W\2\2\u0105\u0106\7O\2\2\u0106\u0107\7\"\2\2\u0107\u0108\7H\2"+
		"\2\u0108\u0109\7Q\2\2\u0109\u010a\7W\2\2\u010a\u010b\7P\2\2\u010b\u010c"+
		"\7F\2\2\u010c\36\3\2\2\2\u010d\u010e\7Q\2\2\u010e\u010f\7r\2\2\u010f\u0110"+
		"\7v\2\2\u0110\u0111\7k\2\2\u0111\u0112\7o\2\2\u0112\u0113\7k\2\2\u0113"+
		"\u0114\7|\2\2\u0114\u0115\7c\2\2\u0115\u0116\7v\2\2\u0116\u0117\7k\2\2"+
		"\u0117\u0118\7q\2\2\u0118\u0119\7p\2\2\u0119\u011a\7\"\2\2\u011a\u011b"+
		"\7<\2\2\u011b\u011c\7\"\2\2\u011c \3\2\2\2\u011d\u011e\7\"\2\2\u011e\u011f"+
		"\7\"\2\2\u011f\u0120\7Q\2\2\u0120\u0121\7r\2\2\u0121\u0122\7v\2\2\u0122"+
		"\u0123\7k\2\2\u0123\u0124\7o\2\2\u0124\u0125\7w\2\2\u0125\u0126\7o\2\2"+
		"\u0126\u0127\7\"\2\2\u0127\u0128\7\"\2\2\u0128\u0129\7\"\2\2\u0129\u012a"+
		"\7\"\2\2\u012a\u012b\7<\2\2\u012b\u012c\7\"\2\2\u012c\u012d\7p\2\2\u012d"+
		"\u012e\7q\2\2\u012e\"\3\2\2\2\u012f\u0130\7e\2\2\u0130\u0131\7n\2\2\u0131"+
		"\u0132\7c\2\2\u0132\u0133\7u\2\2\u0133\u0134\7r\2\2\u0134\u0135\7\"\2"+
		"\2\u0135\u0136\7x\2\2\u0136\u0137\7g\2\2\u0137\u0138\7t\2\2\u0138\u0139"+
		"\7u\2\2\u0139\u013a\7k\2\2\u013a\u013b\7q\2\2\u013b\u013c\7p\2\2\u013c"+
		"\u013d\7\"\2\2\u013d\u013e\7\65\2\2\u013e\u013f\7\60\2\2\u013f$\3\2\2"+
		"\2\u0140\u0141\7\"\2\2\u0141\u0142\7\"\2\2\u0142\u0143\7Q\2\2\u0143\u0144"+
		"\7r\2\2\u0144\u0145\7v\2\2\u0145\u0146\7k\2\2\u0146\u0147\7o\2\2\u0147"+
		"\u0148\7c\2\2\u0148\u0149\7n\2\2\u0149\u014a\7\"\2\2\u014a\u014b\7\"\2"+
		"\2\u014b\u014c\7\"\2\2\u014c\u014d\7\"\2\2\u014d\u014e\7<\2\2\u014e\u014f"+
		"\7\"\2\2\u014f&\3\2\2\2\u0150\u0151\7\"\2\2\u0151\u0152\7\"\2\2\u0152"+
		"\u0153\7Q\2\2\u0153\u0154\7r\2\2\u0154\u0155\7v\2\2\u0155\u0156\7k\2\2"+
		"\u0156\u0157\7o\2\2\u0157\u0158\7w\2\2\u0158\u0159\7o\2\2\u0159\u015a"+
		"\7\"\2\2\u015a\u015b\7\"\2\2\u015b\u015c\7\"\2\2\u015c\u015d\7\"\2\2\u015d"+
		"\u015e\7<\2\2\u015e\u015f\7\"\2\2\u015f\u0160\7{\2\2\u0160\u0161\7g\2"+
		"\2\u0161\u0162\7u\2\2\u0162(\3\2\2\2\u0163\u0164\7W\2\2\u0164\u0165\7"+
		"P\2\2\u0165\u0166\7M\2\2\u0166\u0167\7P\2\2\u0167\u0168\7Q\2\2\u0168\u0169"+
		"\7Y\2\2\u0169\u016a\7P\2\2\u016a*\3\2\2\2\u016b\u016c\7W\2\2\u016c\u016d"+
		"\7P\2\2\u016d\u016e\7U\2\2\u016e\u016f\7C\2\2\u016f\u0170\7V\2\2\u0170"+
		"\u0171\7K\2\2\u0171\u0172\7U\2\2\u0172\u0173\7H\2\2\u0173\u0174\7K\2\2"+
		"\u0174\u0175\7C\2\2\u0175\u0176\7D\2\2\u0176\u0177\7N\2\2\u0177\u0178"+
		"\7G\2\2\u0178,\3\2\2\2\u0179\u017a\7u\2\2\u017a\u017b\7\"\2\2\u017b\u017c"+
		"\7*\2\2\u017c\u017d\7U\2\2\u017d\u017e\7q\2\2\u017e\u017f\7n\2\2\u017f"+
		"\u0180\7x\2\2\u0180\u0181\7k\2\2\u0181\u0182\7p\2\2\u0182\u0183\7i\2\2"+
		"\u0183\u0184\7<\2\2\u0184\u0185\7\"\2\2\u0185.\3\2\2\2\u0186\u0187\7Q"+
		"\2\2\u0187\u0188\7r\2\2\u0188\u0189\7v\2\2\u0189\u018a\7k\2\2\u018a\u018b"+
		"\7o\2\2\u018b\u018c\7k\2\2\u018c\u018d\7|\2\2\u018d\u018e\7c\2\2\u018e"+
		"\u018f\7v\2\2\u018f\u0190\7k\2\2\u0190\u0191\7q\2\2\u0191\u0192\7p\2\2"+
		"\u0192\u0193\7<\2\2\u0193\u0194\7\"\2\2\u0194\60\3\2\2\2\u0195\u0196\7"+
		"^\2\2\u0196\62\3\2\2\2\u0197\u0198\7<\2\2\u0198\64\3\2\2\2\u0199\u019a"+
		"\7.\2\2\u019a\66\3\2\2\2\u019b\u019c\7\60\2\2\u019c8\3\2\2\2\u019d\u019e"+
		"\7\60\2\2\u019e\u019f\7\60\2\2\u019f:\3\2\2\2\u01a0\u01a1\7\61\2\2\u01a1"+
		"<\3\2\2\2\u01a2\u01a3\7*\2\2\u01a3>\3\2\2\2\u01a4\u01a5\7+\2\2\u01a5@"+
		"\3\2\2\2\u01a6\u01a7\7\"\2\2\u01a7B\3\2\2\2\u01a8\u01ab\5Y-\2\u01a9\u01ab"+
		"\5_\60\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ae\5\63\32\2\u01ad\u01af\5\61\31\2\u01ae\u01ad\3\2\2\2\u01ae\u01af"+
		"\3\2\2\2\u01afD\3\2\2\2\u01b0\u01b4\5Y-\2\u01b1\u01b3\5W,\2\u01b2\u01b1"+
		"\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"F\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b9\5S*\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bbH\3\2\2\2"+
		"\u01bc\u01be\5S*\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\5\67\34\2"+
		"\u01c2\u01c4\5S*\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c3"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6J\3\2\2\2\u01c7\u01cc\5Y-\2\u01c8\u01cc"+
		"\5_\60\2\u01c9\u01cc\5S*\2\u01ca\u01cc\5A!\2\u01cb\u01c7\3\2\2\2\u01cb"+
		"\u01c8\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01ccL\3\2\2\2"+
		"\u01cd\u01cf\7\17\2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01d1\7\f\2\2\u01d1N\3\2\2\2\u01d2\u01d5\7)\2\2\u01d3\u01d6"+
		"\n\2\2\2\u01d4\u01d6\5U+\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01da\7)\2\2\u01daP\3\2\2\2\u01db\u01de\7$\2\2\u01dc\u01df"+
		"\n\3\2\2\u01dd\u01df\5U+\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2\u01e3\7$\2\2\u01e3R\3\2\2\2\u01e4\u01e7\t\4\2\2\u01e5\u01e7"+
		"\5[.\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7T\3\2\2\2\u01e8\u01e9"+
		"\7^\2\2\u01e9\u01f9\t\5\2\2\u01ea\u01ec\7^\2\2\u01eb\u01ed\t\6\2\2\u01ec"+
		"\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01f0\t\7"+
		"\2\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f9\t\7\2\2\u01f2\u01f3\7^\2\2\u01f3\u01f4\7w\2\2\u01f4\u01f5\t\b\2"+
		"\2\u01f5\u01f6\t\b\2\2\u01f6\u01f7\t\b\2\2\u01f7\u01f9\t\b\2\2\u01f8\u01e8"+
		"\3\2\2\2\u01f8\u01ea\3\2\2\2\u01f8\u01f2\3\2\2\2\u01f9V\3\2\2\2\u01fa"+
		"\u01ff\5Y-\2\u01fb\u01ff\5_\60\2\u01fc\u01ff\5S*\2\u01fd\u01ff\5]/\2\u01fe"+
		"\u01fa\3\2\2\2\u01fe\u01fb\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2"+
		"\2\2\u01ffX\3\2\2\2\u0200\u0201\t\t\2\2\u0201Z\3\2\2\2\u0202\u0203\t\n"+
		"\2\2\u0203\\\3\2\2\2\u0204\u0205\t\13\2\2\u0205^\3\2\2\2\u0206\u0207\t"+
		"\f\2\2\u0207`\3\2\2\2\24\2\u01aa\u01ae\u01b4\u01ba\u01bf\u01c5\u01cb\u01ce"+
		"\u01d5\u01d7\u01de\u01e0\u01e6\u01ec\u01ef\u01f8\u01fe\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}