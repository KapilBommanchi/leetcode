public class StringShiftEquals {
	private boolean isConversionPossible(String input, String expected, int numTimes) {
		char[] inputCharArray = input.toCharArray();
		char[] expectedCharArray = expected.toCharArray();
		int diff = 0;

		for (int i = 0; i < input.length(); i++) {
			diff = (int) inputCharArray[i] - (int) expectedCharArray[i];
			if (diff == 0)
				continue;

			if (diff < 0)
				diff += 26;

			if (diff > 0) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;

	}

	public static void main(String[] args) {
	}
}