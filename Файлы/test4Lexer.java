// Generated from test4.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class test4Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT=2, ADD=3, MOV=4, SUB=5, XCHG=6, REGISTER=7, ID=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "INT", "ADD", "MOV", "SUB", "XCHG", "REGISTER", "ID", "LETTER", 
			"DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'add'", "'mov'", "'sub'", "'xchg'", "'regiter'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INT", "ADD", "MOV", "SUB", "XCHG", "REGISTER", "ID", "WS"
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


	public test4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\td\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0004\u0001\u001b\b\u0001\u000b\u0001\f\u0001"+
		"\u001c\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0001\u0004\u0001#\b\u0001"+
		"\u000b\u0001\f\u0001$\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"*\b\u0001\u000b\u0001\f\u0001+\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u00011\b\u0001\u000b\u0001\f\u00012\u0001\u0001\u0001\u0001\u0003\u0001"+
		"7\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"U\b\u0007\n\u0007\f\u0007X\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0004\n_\b\n\u000b\n\f\n`\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\u0000\u0013\u0000\u0015\t\u0001\u0000\u0007\u0002\u0000DDdd\u0002"+
		"\u0000HHhh\u0004\u0000OOQQooqq\u0002\u0000BBbb\u0004\u0000$$?Z__az\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  l\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0001\u0017\u0001"+
		"\u0000\u0000\u0000\u00036\u0001\u0000\u0000\u0000\u00058\u0001\u0000\u0000"+
		"\u0000\u0007<\u0001\u0000\u0000\u0000\t@\u0001\u0000\u0000\u0000\u000b"+
		"D\u0001\u0000\u0000\u0000\rI\u0001\u0000\u0000\u0000\u000fQ\u0001\u0000"+
		"\u0000\u0000\u0011Y\u0001\u0000\u0000\u0000\u0013[\u0001\u0000\u0000\u0000"+
		"\u0015^\u0001\u0000\u0000\u0000\u0017\u0018\u0005,\u0000\u0000\u0018\u0002"+
		"\u0001\u0000\u0000\u0000\u0019\u001b\u0003\u0013\t\u0000\u001a\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001f\u0001"+
		"\u0000\u0000\u0000\u001e \u0007\u0000\u0000\u0000\u001f\u001e\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 7\u0001\u0000\u0000\u0000"+
		"!#\u0003\u0013\t\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&\'\u0007\u0001\u0000\u0000\'7\u0001\u0000\u0000\u0000(*\u0003"+
		"\u0013\t\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-.\u0007\u0002\u0000\u0000.7\u0001\u0000\u0000\u0000/1\u0003\u0013\t\u0000"+
		"0/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0007\u0003"+
		"\u0000\u000057\u0001\u0000\u0000\u00006\u001a\u0001\u0000\u0000\u0000"+
		"6\"\u0001\u0000\u0000\u00006)\u0001\u0000\u0000\u000060\u0001\u0000\u0000"+
		"\u00007\u0004\u0001\u0000\u0000\u000089\u0005a\u0000\u00009:\u0005d\u0000"+
		"\u0000:;\u0005d\u0000\u0000;\u0006\u0001\u0000\u0000\u0000<=\u0005m\u0000"+
		"\u0000=>\u0005o\u0000\u0000>?\u0005v\u0000\u0000?\b\u0001\u0000\u0000"+
		"\u0000@A\u0005s\u0000\u0000AB\u0005u\u0000\u0000BC\u0005b\u0000\u0000"+
		"C\n\u0001\u0000\u0000\u0000DE\u0005x\u0000\u0000EF\u0005c\u0000\u0000"+
		"FG\u0005h\u0000\u0000GH\u0005g\u0000\u0000H\f\u0001\u0000\u0000\u0000"+
		"IJ\u0005r\u0000\u0000JK\u0005e\u0000\u0000KL\u0005g\u0000\u0000LM\u0005"+
		"i\u0000\u0000MN\u0005t\u0000\u0000NO\u0005e\u0000\u0000OP\u0005r\u0000"+
		"\u0000P\u000e\u0001\u0000\u0000\u0000QV\u0003\u0011\b\u0000RU\u0003\u0011"+
		"\b\u0000SU\u0003\u0013\t\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000"+
		"\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000W\u0010\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000YZ\u0007\u0004\u0000\u0000Z\u0012\u0001\u0000\u0000\u0000[\\\u0007"+
		"\u0005\u0000\u0000\\\u0014\u0001\u0000\u0000\u0000]_\u0007\u0006\u0000"+
		"\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0006"+
		"\n\u0000\u0000c\u0016\u0001\u0000\u0000\u0000\n\u0000\u001c\u001f$+26"+
		"TV`\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}