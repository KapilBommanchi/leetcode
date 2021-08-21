import java.util.Stack;

public class Braces {
	private boolean isBracesOrderedAndCorrect(String str) {
		Stack<Character> stack = new Stack<Character>();

		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);

			if (c == '{')
				stack.push(c);

			if (c == '(')
				stack.push(c);

			if (c == '}')
				if (stack.empty())
					return false;
				else if (stack.peek() == '{')
					stack.pop();
				else
					return false;

			if (c == ')')
				if (stack.empty())
					return false;
				else if (stack.peek() == '(')
					stack.pop();
				else
					return false;
		}
		return stack.empty();
	}

	public static void main(String[] args) {
		Braces b = new Braces();
		System.out.println(b.isBracesOrderedAndCorrect("{(){}}"));
	}
}
