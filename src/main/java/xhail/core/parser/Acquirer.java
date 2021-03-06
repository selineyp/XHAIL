/**
 * 
 */
package xhail.core.parser;

import java.io.InputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import xhail.core.Logger;
import xhail.core.entities.Values;
import xhail.core.parser.Parser.ParserErrorException;

/**
 * @author stefano
 *
 */
public class Acquirer {

	private static final String FOUND = "FOUND";

	private static final String OPTIMIZATION = "Optimization:";

	private static final String COST = "COST";

	private static final String OPTIMUM = "OPTIMUM";

	private static final String SATISFIABLE = "SATISFIABLE";

	private static final String UNKNOWN = "UNKNOWN";

	private static final String UNSATISFIABLE = "UNSATISFIABLE";

	public static Acquirer from(InputStream stream) {
		if (null == stream)
			throw new IllegalArgumentException("Illegal 'stream' argument in Acquirer.from(InputStream): " + stream);
		return new Acquirer(Tokeniser.from(stream));
	}

	private Set<Collection<String>> answers;

	private Set<String> atoms;

	private String token;

	private boolean optimal = false;

	private Tokeniser tokeniser;

	private Values values = new Values();

	private Values firstValues = null;
	
	private Acquirer(Tokeniser tokeniser) {
		if (null == tokeniser)
			throw new IllegalArgumentException("Illegal 'tokeniser' argument in Acquirer(Tokeniser): " + tokeniser);
		this.tokeniser = tokeniser;
		this.token = tokeniser.next();
	}

	private boolean isNumber(String token) {
		if (null == token || (token = token.trim()).isEmpty())
			return false;
		boolean result = true;
		for (int i = 0; result && i < token.length(); i++)
			result = Character.isDigit(token.charAt(i)) || token.charAt(i) == '@';
		return result;
	}

	public Map.Entry<Values, Collection<Collection<String>>> parse() {
		this.answers = new HashSet<>();
		try {
			if (UNKNOWN.equals(token))
				parseUNKNOWN();
			else if (UNSATISFIABLE.equals(token))
				parseUNSATISFIABLE();
			else
				parseAnswer();
			if (this.firstValues == null) {
				Logger.message(String.format("got no answer set (unsatisfiable)"));
			} else if (!optimal) {
				Logger.message(String.format("got end of input with best value %s and first value %s (suboptimal result)", this.values.toString(), this.firstValues.toString()));
			} else {
				Logger.message(String.format("got end of input with best value %s and first value %s (optimal result)", this.values.toString(), this.firstValues.toString()));
			}

			parseEOF();
		} catch (ParserErrorException e) {
			Logger.error(e.getMessage());
			// return null;
		}
		return new SimpleEntry<Values, Collection<Collection<String>>>(this.values, this.answers);
	}

	private static String cleanToken(String t) {
		if (t.length() == 0)
			return t;
		if (t.charAt(0) == '{')
			t = t.substring(1);
		if (t.length() == 0)
			return t;
		if (t.charAt(t.length()-1) == '}')
			t = t.substring(0,t.length()-1);
		if (t.length() == 0)
			return t;
		if (t.charAt(t.length()-1) == ',')
			t = t.substring(0,t.length()-1);
		return t;
	}

	private void parseAnswer() throws ParserErrorException {
		if (null == token)
			throw new ParserErrorException("parseAnswer: expected ATOM but EOF found");
//		if (FOUND.equals(token) || OPTIMIZATION.equals(token) || OPTIMUM.equals(token) || SATISFIABLE.equals(token) || UNKNOWN.equals(token)
//				|| UNSATISFIABLE.equals(token))
//			throw new ParserErrorException(String.format("expected ATOM but '%s' found", token));
		this.atoms = new HashSet<>();
		while (null != token && !FOUND.equals(token) && !COST.equals(token) && !OPTIMUM.equals(token) && !SATISFIABLE.equals(token)
				&& !UNKNOWN.equals(token) && !UNSATISFIABLE.equals(token) && !OPTIMIZATION.equals(token)) {
			if (!"{}".equals(token))
				atoms.add(cleanToken(token));
			token = tokeniser.next();
		}
		if( OPTIMIZATION.equals(token) ) {
			// clasp
			parseOPTIMIZATION();
			parseValues();
		} else {
			// wasp
			parseCOST();
			parseValues();
		}
	}

	private void parseEOF() throws ParserErrorException {
		if (null != token)
			throw new ParserErrorException("expected EOF but '" + token + "' found");
	}

	private void parseCOST() throws ParserErrorException {
		if (null == token)
			throw new ParserErrorException(String.format("expected '%s' but 'EOF' found", COST));
		if (!COST.equals(token))
			throw new ParserErrorException(String.format("expected '%s' but '%s' found", COST, token));
		token = tokeniser.next();
		// if this cost is a bound, skip it and expect a real cost (with value) 
		while ("LB:".equals(token) || "UB:".equals(token)) {
			token = tokeniser.next(); // skip LB / UB
			token = tokeniser.next(); // skip bound value
			if (!COST.equals(token))
				throw new ParserErrorException(String.format("expected '%s' but '%s' found in loop", COST, token));
			token = tokeniser.next();
		}
	}

	private void parseCOSTSHRINK() throws ParserErrorException {
		if (null == token)
			throw new ParserErrorException(String.format("parseCOSTSHRINK: expected '%s' but 'EOF' found", COST));
		if (!COST.equals(token))
			throw new ParserErrorException(String.format("expected '%s' but '%s' found", COST, token));
		token = tokeniser.next();
		if ("LB:".equals(token) || "UB:".equals(token)) {
			token = tokeniser.next(); // skip LB / UB
		}
		token = tokeniser.next(); // skip value
	}

	private void parseFOUND() throws ParserErrorException {
		if (null == token)
			throw new ParserErrorException(String.format("expected '%s' but 'EOF' found", FOUND));
		if (!FOUND.equals(token))
			throw new ParserErrorException(String.format("expected '%s' but '%s' found", FOUND, token));
		token = tokeniser.next();
	}

	private void parseNested() throws ParserErrorException {
		if (null == token)
			throw new ParserErrorException("parseNested: expected ATOM but EOF found");
//		if (FOUND.equals(token) || OPTIMIZATION.equals(token) || OPTIMUM.equals(token) || SATISFIABLE.equals(token) || UNKNOWN.equals(token)
//				|| UNSATISFIABLE.equals(token))
//			throw new ParserErrorException(String.format("expected ATOM but '%s' found", token));
		this.atoms = new HashSet<>();
		while (null != token && !FOUND.equals(token) && !COST.equals(token) && !OPTIMUM.equals(token) && !SATISFIABLE.equals(token)
				&& !UNKNOWN.equals(token) && !UNSATISFIABLE.equals(token) && !OPTIMIZATION.equals(token)) {
			atoms.add(cleanToken(token));
			token = tokeniser.next();
		}
		if( OPTIMIZATION.equals(token) ) {
			// clasp
			parseOPTIMIZATION();
			parseValues();
		} else {
			// wasp
			parseCOST();
			parseValues();
		}
	}

	private void parseOPTIMIZATION() throws ParserErrorException {
		if (null == token)
			throw new ParserErrorException(String.format("expected '%s' but 'EOF' found", OPTIMIZATION));
		if (!OPTIMIZATION.equals(token))
			throw new ParserErrorException(String.format("expected '%s' but '%s' found", OPTIMIZATION, token));
		token = tokeniser.next();
	}

	private void parseOPTIMUM() throws ParserErrorException {
		if (null == token)
			throw new ParserErrorException(String.format("parseOPTIMUM: expected '%s' but 'EOF' found", OPTIMUM));
		if (!OPTIMUM.equals(token))
			throw new ParserErrorException(String.format("parseOPTIMUM: expected '%s' but '%s' found", OPTIMUM, token));
		token = tokeniser.next();
		optimal = true;
	}

	private void parseSATISFIABLE() throws ParserErrorException {
		if (null == token)
			throw new ParserErrorException(String.format("parseSATISFIABLE: expected '%s' but 'EOF' found", SATISFIABLE));
		if (!SATISFIABLE.equals(token))
			throw new ParserErrorException(String.format("parseSATISFIABLE: expected '%s' but '%s' found", SATISFIABLE, token));
		token = tokeniser.next();
	}

	private void parseUNKNOWN() throws ParserErrorException {
		if (null == token)
			throw new ParserErrorException(String.format("parseUNKNOWN: expected '%s' but 'EOF' found", UNKNOWN));
		if (!UNKNOWN.equals(token))
			throw new ParserErrorException(String.format("parseUNKNOWN: expected '%s' but '%s' found", UNKNOWN, token));
		token = tokeniser.next();
	}

	private void parseUNSATISFIABLE() throws ParserErrorException {
		if (null == token)
			throw new ParserErrorException(String.format("expected '%s' but 'EOF' found", UNSATISFIABLE));
		if (!UNSATISFIABLE.equals(token))
			throw new ParserErrorException(String.format("expected '%s' but '%s' found", UNSATISFIABLE, token));
		token = tokeniser.next();
	}

	private void parseValues() throws ParserErrorException {
		if (null == token)
			throw new ParserErrorException("expected NUMBER but EOF found");
		if (!isNumber(token))
			throw new ParserErrorException(String.format("expected NUMBER but '%s' found", token));
		String values = "";
		while (null != token && isNumber(token)) {
			if (!values.isEmpty())
				values += " ";
			values += token;
			token = tokeniser.next();
		}
		Values found = new Values(values);
		int order = found.compareTo(this.values);
		if (order < 0) {
			answers.clear();
			this.values = found;
		}
		if( this.firstValues == null )
			this.firstValues = this.values;
		if (order <= 0)
			answers.add(atoms);
		while (COST.equals(token))
			parseCOSTSHRINK();
		if (token != null) {
			if (OPTIMUM.equals(token)) {
				parseOPTIMUM();
				if (FOUND.equals(token))
					parseFOUND();
			} else {
				parseNested();
			}
		}
	}

}

// vim:noet:
