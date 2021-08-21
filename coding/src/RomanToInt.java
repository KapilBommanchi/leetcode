import java.util.HashMap;
import java.util.Map;

/**
 * convert Roman to Int value. I = 1, V=5, X=10, L=50, C=100, D=500, M=1000
 *
 * III=3, IV=4, LX=60
 *
 * @author kapil.bommanchi
 *
 */
public class RomanToInt {
	public static Integer getIntValue(String romanStr) {
		int result = 0;
		Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		for (int i = 0; i < romanStr.length(); i++) {
			if (i > 0 && romanMap.get(romanStr.charAt(i)) > romanMap.get(romanStr.charAt(i - 1))) {
				result += romanMap.get(romanStr.charAt(i)) - 2 * romanMap.get(romanStr.charAt(i - 1));
			} else {
				result += romanMap.get(romanStr.charAt(i));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(getIntValue("XC"));
		System.out.println(getIntValue("LV"));
	}

}