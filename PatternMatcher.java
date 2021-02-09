package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		Matcher m=Pattern.compile("a").matcher("sachin");
		while(m.find())
		{
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}

	}

}
