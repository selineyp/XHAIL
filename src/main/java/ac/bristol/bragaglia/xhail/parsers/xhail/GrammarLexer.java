// Generated from Grammar.g4 by ANTLR 4.2.2

package ac.bristol.bragaglia.xhail.parsers.xhail;

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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'#avg'", "'#count'", "'#even'", "'#max'", "'#min'", "'#odd'", "'#sum'", 
		"'#abs'", "'#div'", "'#mod'", "'#pow'", "'&'", "'~'", "'?'", "'^'", "'=='", 
		"'>='", "'>'", "'<='", "'<'", "'!='", "'#compute'", "'#const'", "'#domain'", 
		"'#example'", "'#external'", "'#hide'", "DIR_MAXIMIZE", "DIR_MINIMIZE", 
		"'#modeb'", "'#modeh'", "'#show'", "'*'", "'**'", "':='", "'@'", "'\\'", 
		"'|'", "':'", "','", "'{'", "'}'", "'.'", "'..'", "'='", "'$'", "':-'", 
		"'-'", "'not'", "'('", "')'", "';'", "'+'", "';;'", "'/'", "'['", "']'", 
		"'#infimum'", "'#supremum'", "'all'", "COMMENT_INLINE", "COMMENT_MULTI", 
		"IDENTIFIER", "INTEGER", "STRING", "VARIABLE", "WHITESPACES"
	};
	public static final String[] ruleNames = {
		"AGGR_AVG", "AGGR_COUNT", "AGGR_EVEN", "AGGR_MAX", "AGGR_MIN", "AGGR_ODD", 
		"AGGR_SUM", "ARITH_ABS", "ARITH_DIVIDE", "ARITH_MODULUS", "ARITH_POWER", 
		"BIT_AND", "BIT_NOT", "BIT_OR", "BIT_XOR", "COMP_EQ", "COMP_GE", "COMP_GT", 
		"COMP_LE", "COMP_LT", "COMP_NE", "DIR_COMPUTE", "DIR_CONST", "DIR_DOMAIN", 
		"DIR_EXAMPLE", "DIR_EXTERNAL", "DIR_HIDE", "DIR_MAXIMIZE", "DIR_MINIMIZE", 
		"DIR_MODEB", "DIR_MODEH", "DIR_SHOW", "ASTERISK", "ASTERISKS", "ASSIGN", 
		"AT", "BACKSLASH", "BAR", "COLON", "COMMA", "CURLY_LEFT", "CURLY_RIGHT", 
		"DOT", "DOTS", "EQUALS", "HASH", "IF", "MINUS", "NOT", "PAREN_LEFT", "PAREN_RIGHT", 
		"SEMICOLON", "PLUS", "SEMICOLONS", "SLASH", "SQUARE_LEFT", "SQUARE_RIGHT", 
		"INFIMUM", "SUPREMUM", "ALL", "COMMENT_INLINE", "COMMENT_MULTI", "IDENTIFIER", 
		"INTEGER", "STRING", "VARIABLE", "WHITESPACES", "DIGIT", "ESCAPE", "FOLLOWUP", 
		"LOWERCASE", "NONZERO", "UPPERCASE", "UNDERSCORE"
	};

	 
	 	public static final int HIDDEN = 1;
	 

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2E\u0207\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u012d\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0141\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-"+
		"\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>"+
		"\3>\7>\u01a9\n>\f>\16>\u01ac\13>\3>\3>\3?\3?\3?\3?\7?\u01b4\n?\f?\16?"+
		"\u01b7\13?\3?\3?\3?\3?\3?\3@\3@\7@\u01c0\n@\f@\16@\u01c3\13@\3A\6A\u01c6"+
		"\nA\rA\16A\u01c7\3B\3B\3B\6B\u01cd\nB\rB\16B\u01ce\3B\3B\3C\3C\5C\u01d5"+
		"\nC\3C\7C\u01d8\nC\fC\16C\u01db\13C\3D\6D\u01de\nD\rD\16D\u01df\3D\3D"+
		"\3E\3E\5E\u01e6\nE\3F\3F\3F\3F\5F\u01ec\nF\3F\5F\u01ef\nF\3F\3F\3F\3F"+
		"\3F\3F\3F\5F\u01f8\nF\3G\3G\3G\3G\5G\u01fe\nG\3H\3H\3I\3I\3J\3J\3K\3K"+
		"\4\u01b5\u01ce\2L\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\3\2\r\3\2\f\f\4\2$"+
		"$^^\5\2\13\f\17\17\"\"\3\2\62\62\b\2$$^^ddppttvv\3\2\62\65\3\2\629\5\2"+
		"\62;CHch\3\2c|\3\2\63;\3\2C\\\u0212\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\3\u0097"+
		"\3\2\2\2\5\u009c\3\2\2\2\7\u00a3\3\2\2\2\t\u00a9\3\2\2\2\13\u00ae\3\2"+
		"\2\2\r\u00b3\3\2\2\2\17\u00b8\3\2\2\2\21\u00bd\3\2\2\2\23\u00c2\3\2\2"+
		"\2\25\u00c7\3\2\2\2\27\u00cc\3\2\2\2\31\u00d1\3\2\2\2\33\u00d3\3\2\2\2"+
		"\35\u00d5\3\2\2\2\37\u00d7\3\2\2\2!\u00d9\3\2\2\2#\u00dc\3\2\2\2%\u00df"+
		"\3\2\2\2\'\u00e1\3\2\2\2)\u00e4\3\2\2\2+\u00e6\3\2\2\2-\u00e9\3\2\2\2"+
		"/\u00f2\3\2\2\2\61\u00f9\3\2\2\2\63\u0101\3\2\2\2\65\u010a\3\2\2\2\67"+
		"\u0114\3\2\2\29\u012c\3\2\2\2;\u0140\3\2\2\2=\u0142\3\2\2\2?\u0149\3\2"+
		"\2\2A\u0150\3\2\2\2C\u0156\3\2\2\2E\u0158\3\2\2\2G\u015b\3\2\2\2I\u015e"+
		"\3\2\2\2K\u0160\3\2\2\2M\u0162\3\2\2\2O\u0164\3\2\2\2Q\u0166\3\2\2\2S"+
		"\u0168\3\2\2\2U\u016a\3\2\2\2W\u016c\3\2\2\2Y\u016e\3\2\2\2[\u0171\3\2"+
		"\2\2]\u0173\3\2\2\2_\u0175\3\2\2\2a\u0178\3\2\2\2c\u017a\3\2\2\2e\u017e"+
		"\3\2\2\2g\u0180\3\2\2\2i\u0182\3\2\2\2k\u0184\3\2\2\2m\u0186\3\2\2\2o"+
		"\u0189\3\2\2\2q\u018b\3\2\2\2s\u018d\3\2\2\2u\u018f\3\2\2\2w\u0198\3\2"+
		"\2\2y\u01a2\3\2\2\2{\u01a6\3\2\2\2}\u01af\3\2\2\2\177\u01bd\3\2\2\2\u0081"+
		"\u01c5\3\2\2\2\u0083\u01c9\3\2\2\2\u0085\u01d4\3\2\2\2\u0087\u01dd\3\2"+
		"\2\2\u0089\u01e5\3\2\2\2\u008b\u01f7\3\2\2\2\u008d\u01fd\3\2\2\2\u008f"+
		"\u01ff\3\2\2\2\u0091\u0201\3\2\2\2\u0093\u0203\3\2\2\2\u0095\u0205\3\2"+
		"\2\2\u0097\u0098\7%\2\2\u0098\u0099\7c\2\2\u0099\u009a\7x\2\2\u009a\u009b"+
		"\7i\2\2\u009b\4\3\2\2\2\u009c\u009d\7%\2\2\u009d\u009e\7e\2\2\u009e\u009f"+
		"\7q\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2"+
		"\6\3\2\2\2\u00a3\u00a4\7%\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7x\2\2\u00a6"+
		"\u00a7\7g\2\2\u00a7\u00a8\7p\2\2\u00a8\b\3\2\2\2\u00a9\u00aa\7%\2\2\u00aa"+
		"\u00ab\7o\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7z\2\2\u00ad\n\3\2\2\2\u00ae"+
		"\u00af\7%\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2"+
		"\u00b2\f\3\2\2\2\u00b3\u00b4\7%\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7f"+
		"\2\2\u00b6\u00b7\7f\2\2\u00b7\16\3\2\2\2\u00b8\u00b9\7%\2\2\u00b9\u00ba"+
		"\7u\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7o\2\2\u00bc\20\3\2\2\2\u00bd\u00be"+
		"\7%\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7d\2\2\u00c0\u00c1\7u\2\2\u00c1"+
		"\22\3\2\2\2\u00c2\u00c3\7%\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7x\2\2\u00c6\24\3\2\2\2\u00c7\u00c8\7%\2\2\u00c8\u00c9\7o\2\2\u00c9"+
		"\u00ca\7q\2\2\u00ca\u00cb\7f\2\2\u00cb\26\3\2\2\2\u00cc\u00cd\7%\2\2\u00cd"+
		"\u00ce\7r\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7y\2\2\u00d0\30\3\2\2\2\u00d1"+
		"\u00d2\7(\2\2\u00d2\32\3\2\2\2\u00d3\u00d4\7\u0080\2\2\u00d4\34\3\2\2"+
		"\2\u00d5\u00d6\7A\2\2\u00d6\36\3\2\2\2\u00d7\u00d8\7`\2\2\u00d8 \3\2\2"+
		"\2\u00d9\u00da\7?\2\2\u00da\u00db\7?\2\2\u00db\"\3\2\2\2\u00dc\u00dd\7"+
		"@\2\2\u00dd\u00de\7?\2\2\u00de$\3\2\2\2\u00df\u00e0\7@\2\2\u00e0&\3\2"+
		"\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\7?\2\2\u00e3(\3\2\2\2\u00e4\u00e5"+
		"\7>\2\2\u00e5*\3\2\2\2\u00e6\u00e7\7#\2\2\u00e7\u00e8\7?\2\2\u00e8,\3"+
		"\2\2\2\u00e9\u00ea\7%\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7q\2\2\u00ec"+
		"\u00ed\7o\2\2\u00ed\u00ee\7r\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7v\2\2"+
		"\u00f0\u00f1\7g\2\2\u00f1.\3\2\2\2\u00f2\u00f3\7%\2\2\u00f3\u00f4\7e\2"+
		"\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8"+
		"\7v\2\2\u00f8\60\3\2\2\2\u00f9\u00fa\7%\2\2\u00fa\u00fb\7f\2\2\u00fb\u00fc"+
		"\7q\2\2\u00fc\u00fd\7o\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7k\2\2\u00ff"+
		"\u0100\7p\2\2\u0100\62\3\2\2\2\u0101\u0102\7%\2\2\u0102\u0103\7g\2\2\u0103"+
		"\u0104\7z\2\2\u0104\u0105\7c\2\2\u0105\u0106\7o\2\2\u0106\u0107\7r\2\2"+
		"\u0107\u0108\7n\2\2\u0108\u0109\7g\2\2\u0109\64\3\2\2\2\u010a\u010b\7"+
		"%\2\2\u010b\u010c\7g\2\2\u010c\u010d\7z\2\2\u010d\u010e\7v\2\2\u010e\u010f"+
		"\7g\2\2\u010f\u0110\7t\2\2\u0110\u0111\7p\2\2\u0111\u0112\7c\2\2\u0112"+
		"\u0113\7n\2\2\u0113\66\3\2\2\2\u0114\u0115\7%\2\2\u0115\u0116\7j\2\2\u0116"+
		"\u0117\7k\2\2\u0117\u0118\7f\2\2\u0118\u0119\7g\2\2\u01198\3\2\2\2\u011a"+
		"\u011b\7%\2\2\u011b\u011c\7o\2\2\u011c\u011d\7c\2\2\u011d\u011e\7z\2\2"+
		"\u011e\u011f\7k\2\2\u011f\u0120\7o\2\2\u0120\u0121\7k\2\2\u0121\u0122"+
		"\7|\2\2\u0122\u012d\7g\2\2\u0123\u0124\7%\2\2\u0124\u0125\7o\2\2\u0125"+
		"\u0126\7c\2\2\u0126\u0127\7z\2\2\u0127\u0128\7k\2\2\u0128\u0129\7o\2\2"+
		"\u0129\u012a\7k\2\2\u012a\u012b\7u\2\2\u012b\u012d\7g\2\2\u012c\u011a"+
		"\3\2\2\2\u012c\u0123\3\2\2\2\u012d:\3\2\2\2\u012e\u012f\7%\2\2\u012f\u0130"+
		"\7o\2\2\u0130\u0131\7k\2\2\u0131\u0132\7p\2\2\u0132\u0133\7k\2\2\u0133"+
		"\u0134\7o\2\2\u0134\u0135\7k\2\2\u0135\u0136\7|\2\2\u0136\u0141\7g\2\2"+
		"\u0137\u0138\7%\2\2\u0138\u0139\7o\2\2\u0139\u013a\7k\2\2\u013a\u013b"+
		"\7p\2\2\u013b\u013c\7k\2\2\u013c\u013d\7o\2\2\u013d\u013e\7k\2\2\u013e"+
		"\u013f\7u\2\2\u013f\u0141\7g\2\2\u0140\u012e\3\2\2\2\u0140\u0137\3\2\2"+
		"\2\u0141<\3\2\2\2\u0142\u0143\7%\2\2\u0143\u0144\7o\2\2\u0144\u0145\7"+
		"q\2\2\u0145\u0146\7f\2\2\u0146\u0147\7g\2\2\u0147\u0148\7d\2\2\u0148>"+
		"\3\2\2\2\u0149\u014a\7%\2\2\u014a\u014b\7o\2\2\u014b\u014c\7q\2\2\u014c"+
		"\u014d\7f\2\2\u014d\u014e\7g\2\2\u014e\u014f\7j\2\2\u014f@\3\2\2\2\u0150"+
		"\u0151\7%\2\2\u0151\u0152\7u\2\2\u0152\u0153\7j\2\2\u0153\u0154\7q\2\2"+
		"\u0154\u0155\7y\2\2\u0155B\3\2\2\2\u0156\u0157\7,\2\2\u0157D\3\2\2\2\u0158"+
		"\u0159\7,\2\2\u0159\u015a\7,\2\2\u015aF\3\2\2\2\u015b\u015c\7<\2\2\u015c"+
		"\u015d\7?\2\2\u015dH\3\2\2\2\u015e\u015f\7B\2\2\u015fJ\3\2\2\2\u0160\u0161"+
		"\7^\2\2\u0161L\3\2\2\2\u0162\u0163\7~\2\2\u0163N\3\2\2\2\u0164\u0165\7"+
		"<\2\2\u0165P\3\2\2\2\u0166\u0167\7.\2\2\u0167R\3\2\2\2\u0168\u0169\7}"+
		"\2\2\u0169T\3\2\2\2\u016a\u016b\7\177\2\2\u016bV\3\2\2\2\u016c\u016d\7"+
		"\60\2\2\u016dX\3\2\2\2\u016e\u016f\7\60\2\2\u016f\u0170\7\60\2\2\u0170"+
		"Z\3\2\2\2\u0171\u0172\7?\2\2\u0172\\\3\2\2\2\u0173\u0174\7&\2\2\u0174"+
		"^\3\2\2\2\u0175\u0176\7<\2\2\u0176\u0177\7/\2\2\u0177`\3\2\2\2\u0178\u0179"+
		"\7/\2\2\u0179b\3\2\2\2\u017a\u017b\7p\2\2\u017b\u017c\7q\2\2\u017c\u017d"+
		"\7v\2\2\u017dd\3\2\2\2\u017e\u017f\7*\2\2\u017ff\3\2\2\2\u0180\u0181\7"+
		"+\2\2\u0181h\3\2\2\2\u0182\u0183\7=\2\2\u0183j\3\2\2\2\u0184\u0185\7-"+
		"\2\2\u0185l\3\2\2\2\u0186\u0187\7=\2\2\u0187\u0188\7=\2\2\u0188n\3\2\2"+
		"\2\u0189\u018a\7\61\2\2\u018ap\3\2\2\2\u018b\u018c\7]\2\2\u018cr\3\2\2"+
		"\2\u018d\u018e\7_\2\2\u018et\3\2\2\2\u018f\u0190\7%\2\2\u0190\u0191\7"+
		"k\2\2\u0191\u0192\7p\2\2\u0192\u0193\7h\2\2\u0193\u0194\7k\2\2\u0194\u0195"+
		"\7o\2\2\u0195\u0196\7w\2\2\u0196\u0197\7o\2\2\u0197v\3\2\2\2\u0198\u0199"+
		"\7%\2\2\u0199\u019a\7u\2\2\u019a\u019b\7w\2\2\u019b\u019c\7r\2\2\u019c"+
		"\u019d\7t\2\2\u019d\u019e\7g\2\2\u019e\u019f\7o\2\2\u019f\u01a0\7w\2\2"+
		"\u01a0\u01a1\7o\2\2\u01a1x\3\2\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7n\2"+
		"\2\u01a4\u01a5\7n\2\2\u01a5z\3\2\2\2\u01a6\u01aa\7\'\2\2\u01a7\u01a9\n"+
		"\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\b>"+
		"\2\2\u01ae|\3\2\2\2\u01af\u01b0\7\'\2\2\u01b0\u01b1\7,\2\2\u01b1\u01b5"+
		"\3\2\2\2\u01b2\u01b4\13\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2"+
		"\u01b5\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5"+
		"\3\2\2\2\u01b8\u01b9\7,\2\2\u01b9\u01ba\7\'\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bc\b?\2\2\u01bc~\3\2\2\2\u01bd\u01c1\5\u008fH\2\u01be\u01c0\5\u008d"+
		"G\2\u01bf\u01be\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u0080\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c6\5\u0089"+
		"E\2\u01c5\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u0082\3\2\2\2\u01c9\u01cc\7$\2\2\u01ca\u01cd\n\3"+
		"\2\2\u01cb\u01cd\5\u008bF\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d1\7$\2\2\u01d1\u0084\3\2\2\2\u01d2\u01d5\5\u0093J\2\u01d3"+
		"\u01d5\5\u0095K\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d9"+
		"\3\2\2\2\u01d6\u01d8\5\u008dG\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2"+
		"\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u0086\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01dc\u01de\t\4\2\2\u01dd\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\bD"+
		"\3\2\u01e2\u0088\3\2\2\2\u01e3\u01e6\t\5\2\2\u01e4\u01e6\5\u0091I\2\u01e5"+
		"\u01e3\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e6\u008a\3\2\2\2\u01e7\u01e8\7^"+
		"\2\2\u01e8\u01f8\t\6\2\2\u01e9\u01eb\7^\2\2\u01ea\u01ec\t\7\2\2\u01eb"+
		"\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01ef\t\b"+
		"\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f8\t\b\2\2\u01f1\u01f2\7^\2\2\u01f2\u01f3\7w\2\2\u01f3\u01f4\t\t\2"+
		"\2\u01f4\u01f5\t\t\2\2\u01f5\u01f6\t\t\2\2\u01f6\u01f8\t\t\2\2\u01f7\u01e7"+
		"\3\2\2\2\u01f7\u01e9\3\2\2\2\u01f7\u01f1\3\2\2\2\u01f8\u008c\3\2\2\2\u01f9"+
		"\u01fe\5\u008fH\2\u01fa\u01fe\5\u0093J\2\u01fb\u01fe\5\u0089E\2\u01fc"+
		"\u01fe\5\u0095K\2\u01fd\u01f9\3\2\2\2\u01fd\u01fa\3\2\2\2\u01fd\u01fb"+
		"\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u008e\3\2\2\2\u01ff\u0200\t\n\2\2\u0200"+
		"\u0090\3\2\2\2\u0201\u0202\t\13\2\2\u0202\u0092\3\2\2\2\u0203\u0204\t"+
		"\f\2\2\u0204\u0094\3\2\2\2\u0205\u0206\7a\2\2\u0206\u0096\3\2\2\2\23\2"+
		"\u012c\u0140\u01aa\u01b5\u01c1\u01c7\u01cc\u01ce\u01d4\u01d9\u01df\u01e5"+
		"\u01eb\u01ee\u01f7\u01fd\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}