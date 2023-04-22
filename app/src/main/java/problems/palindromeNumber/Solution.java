package problems.palindromeNumber;

public class Solution {
	public boolean isPalindrome(int x) {
		String y = String.valueOf(x);
		int len = y.length();
		int halfLen = len/2;
		for (int i = 0; i < halfLen; i++) {
			if (y.charAt(i) != y.charAt(len - (i + 1))) {
				return false;
			}
		}
		return true;
	}
}
