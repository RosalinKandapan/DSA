package leetcode;

public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
		String reverse = "";
		boolean palindrome = false;
		String sL = s.toLowerCase();
		String str1 = sL.replaceAll("[^a-zA-Z0-9]", "");
		int slength = str1.length();
		for (int i = slength - 1; i >= 0; i--) {
			reverse = reverse + str1.charAt(i);
		}
		if (str1.equals(reverse)) {
			System.out.println("palindrome");
			palindrome = true;
		}
		return palindrome;
	}

	public static void main(String[] args) {
		String s = "a%Ba";
		isPalindrome(s);

	}

}
