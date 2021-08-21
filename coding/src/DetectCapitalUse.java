import java.util.function.Predicate;

/**
 * �* Detect capital in a word and return true/false. �* �* Correct case - AAAA,
 * aaaa, Aaaaa. �* Wrong case - AaAAa, aAAAAA �* �* @author kapil.bommanchi �* �
 */
public class DetectCapitalUse {
	public static boolean detectCapitalUse(String word) {
		word = word.trim();
		if (word.length() < 1)
			return Boolean.TRUE;
		// solves above case i.e. (Aaaaa, aaaaaa)
		Predicate<Character> correctCase = Character::isLowerCase;
		// solves above case i.e. (AAAAAA)
		if (word.length() > 1 && Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
			correctCase = Character::isUpperCase;
		}

		// starts from second letter of word
		for (int i = 1; i < word.length(); i++) {
			if (!correctCase.test(word.charAt(i)))
				return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	public static void main(String[] args) {
		System.out.println(detectCapitalUse("kapil"));
		System.out.println(detectCapitalUse("KAPIL"));
		System.out.println(detectCapitalUse("KApiL"));
		System.out.println(detectCapitalUse("kapiL"));
		System.out.println(detectCapitalUse("KAPIl"));
		System.out.println(detectCapitalUse("K � "));
	}
}