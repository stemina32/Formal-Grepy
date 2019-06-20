import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.matcher;

//Some of this code is inspired by some princetown archives.
//I do not have a name to cite but www.cs.princetown.edu/courses/archive/spr04


public class Valid {
//will check for text/pattern
	public static void main(String[] args) {
		String pattern = args [0];
		String bloc = args [1];
		String regexp = args[];
		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher = pattern.matcher(text);
		System.out.prinln (text.matches(pattern));
		if (matcher.find())
			System.out.println(matcher.group);
	}
}

//Regex to NFA

public class NFA
//Start state
	int Start;
//Accept state
	int Accept;
//Number of states
	int S ;
//Regular Expression
	String REGEX = "";

public NFA 

//need to list all reachable states


//NFA to DFA


//Parse?
//Exceptions
