package strings;

import java.util.Scanner;

public class ReverseWordsInString {

	public char[] reverseString(char cStr[], int start, int end) {
		while (start < end) {
			char temp = cStr[start];
			cStr[start] = cStr[end];
			cStr[end] = temp;

			start++;
			end--;
		}

		return cStr;
	}

	public String reverseAllWords(char cStr[]) {
		int i = 0;
		int len = cStr.length;

		// reverse the entire string: "eulb si yks ehT"
		cStr = reverseString(cStr, 0, len - 1);
		System.out.println("initial reversed string = " + new String(cStr));

		// get location of spaces in string
		int start = 0, end = 0;
		for (i = 0; i < len; i++) {
			if (cStr[i] == ' ') {
				end = i;
				cStr = reverseString(cStr, start, end - 1);
				start = end + 1;
			}
		}

		// Perform reverse operations for last word
		cStr = reverseString(cStr, start, len - 1);

		return new String(cStr);
	}

	public static void main(String[] args) {
		// The sky is blue
		ReverseWordsInString r = new ReverseWordsInString();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string = ");
		String str = in.nextLine();
		str = str.trim();
		char cStr[] = str.toCharArray();

		if (cStr.length == 0) {
			System.out.println("Invalid String entered");
			return;
		}
		String output = r.reverseAllWords(cStr);
		System.out.println("Reversed words in string = " + output);
		// blue is sky The
	}

}
