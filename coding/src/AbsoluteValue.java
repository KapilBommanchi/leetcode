/**
 * �* Absolute value is nothing but the distance from "0".
 */
public class AbsoluteValue {
	public static void main(String[] args) {
		int[] arrayInt = { -10, -2, 6, 2, 3 };
		int postiveMin = 0;
		int negativeMax = 0;
		for (int i = 0; i < arrayInt.length; i++) {
			if (arrayInt[i] >= 0) {
				if (postiveMin == 0)
					postiveMin = arrayInt[i];
				postiveMin = Math.min(postiveMin, arrayInt[i]);
			} else {
				if (negativeMax == 0)
					negativeMax = arrayInt[i];
				negativeMax = Math.max(negativeMax, arrayInt[i]);
			}
		}
		int finalValue = (postiveMin <= Math.abs(negativeMax)) ? postiveMin : negativeMax;

		System.out.println("nearest value is:: " + finalValue);
	}

}