/**
 * �* convert Integer to Roman value. �* I = 1, V=5, X=10, L=50, C=100, D=500,
 * M=1000 �* �* 400 = CD (if highest value goes to right position, then it
 * subtracts. i.e. D-C (500-100)). �* 600 = DC (if highest value goes to left
 * position, then it subtracts. i.e. D+C (500+100)). �* �* @author
 * kapil.bommanchi �* �
 */
public class IntToRoman {
	public String getRomanValue(int num) {
		// 0-9
		String[] units = new String[] { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		// 10 - 90
		String[] tens = new String[] { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		// 100 - 900
		String[] hundreds = new String[] { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		// 1000 - 3000
		String[] thousands = new String[] { "", "M", "MM", "MMM" };

		return thousands[num / 1000] + hundreds[(num % 1000) / 100] + tens[(num % 100) / 10] + units[(num % 10)];
	}

	public static void main(String[] args) {
		IntToRoman intToRoman = new IntToRoman();

		System.out.println(intToRoman.getRomanValue(8));
		System.out.println(intToRoman.getRomanValue(10));
		System.out.println(intToRoman.getRomanValue(440));
		System.out.println(intToRoman.getRomanValue(60));
	}
}