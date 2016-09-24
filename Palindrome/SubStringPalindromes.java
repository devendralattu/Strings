
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubStringPalindromes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String palS = "";
		char charArr[] = str.toCharArray();
		int length = charArr.length;

		Map<String, String> palMap = new HashMap<String, String>();
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				palS = palS + charArr[j];
				if (!palMap.containsKey(palS))
					if (isPalindrome(palS)) {
						palMap.put(palS, "");
					}
			}
			palS = "";
		}

		for (String s : palMap.keySet()) {
			System.out.println(s);
		}
		System.out.println("TOTAL = " + palMap.size());
	}

	private static boolean isPalindrome(String palS) {

		int palLen = palS.length();
		boolean condition = true;
		for (int i = 0; i < palLen; i++) {
			if (palS.charAt(i) != palS.charAt(palLen - 1 - i)) {
				condition = false;
				break;
			}
		}
		if (condition) {
			return true;
		} else {
			return false;
		}
	}
}
