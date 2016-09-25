package strings;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

	private boolean isbalanced(char[] c) {

		Stack<Character> stack = new Stack<Character>();
		for (char ch : c) {
			if (isStart(ch)) {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else if (isCounterMatch(stack.peek(), ch)) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}

	private boolean isCounterMatch(char sVal, char ch) {
		if ((sVal == '(' && ch == ')') || (sVal == '{' && ch == '}') || (sVal == '[' && ch == ']')) {
			return true;
		}
		return false;
	}

	private boolean isStart(char ch) {
		if (ch == '(' || ch == '{' || ch == '[') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string = ");
		String str = in.nextLine();
		char[] c = str.toCharArray();

		BalancedParanthesis bp = new BalancedParanthesis();
		boolean check = bp.isbalanced(c);
		System.out.println("Answer:" + check);

	}

}
