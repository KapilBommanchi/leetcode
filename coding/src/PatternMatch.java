import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {
	public static boolean isIdentical(String str) {
		String regex = ".*([a-zA-Z0-9])\\1\\1\\1.*";
		// any char 4 times repeat in the string any place
		// String regex = ".*([a-zA-Z0-9]).*\\1.*\\1.*\\1.*";
		Pattern p = Pattern.compile(regex);
		if (str == null) {
			return false;
		}
		Matcher m = p.matcher(str);
		return m.matches();
	}

	public static void main(String[] args) {
		String str1 = "aa1111";
		// String str1 = "a1a1b1c1";
		System.out.println(isIdentical(str1));
	}
}
