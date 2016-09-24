/* Find the number of sequential occurrence of characters in a string. */

import java.util.Scanner;

public class RunLengthEncoding {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = "";
		while (true) {
			S = in.nextLine();
			if (S.length() > 0) {
				break;
			}
		}
		char c = S.charAt(0);
		int i, count = 0;
		StringBuffer sb = new StringBuffer();
		for (i = 0; i < S.length(); i++) {
			if (c == S.charAt(i)) {
				count++;
			} else {
				sb.append(c + "(" + count + ") - ");
				c = S.charAt(i);
				i--;
				count = 0;
			}
		}
		sb.append(c + "(" + count + ")");
		System.out.println(sb);
	}
}
