import java.util.Scanner;
import java.util.Stack;

public class Postfix {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner in = new Scanner(System.in);
		String str = "";
		while (!(str = in.next()).equals("exit")) {
			if (isNum(str)) {
				int num = Integer.parseInt(str);
				stack.push(num);
			} else {
				int a = 0, b = 0;
				if (stack.size() >= 2) {
					a = stack.pop();
					b = stack.pop();
				} else {
					System.out.println("Insufficient number of elements in stack");
					return;
				}
				switch (str) {
				case "+":
					stack.push(a + b);
					break;
				case "-":
					stack.push(a - b);
					break;
				case "/":
					stack.push(a / b);
					break;
				case "*":
					stack.push(a * b);
					break;
				default:
					System.out.println("Invalid symbol added");
					return;
				}

			}
		}

		int stack_size = stack.size();
		for (int i = 0; i < stack_size; i++) {
			System.out.println(stack.pop());
		}
	}

	private static boolean isNum(String str) {
		try {
			int num = Integer.parseInt(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
