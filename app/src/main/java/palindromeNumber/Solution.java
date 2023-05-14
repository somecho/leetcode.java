package palindromeNumber;

// 9. Palindrome Number
// https://leetcode.com/problems/palindrome-number/

public class Solution {
	public boolean isPalindrome(int x) {
		String y = String.valueOf(x);
		int len = y.length();
		int halfLen = len/2;
		if (x < 0) return false;
		for (int i = 0; i < halfLen; i++) {
			if (y.charAt(i) != y.charAt(len - (i + 1))) {
				return false;
			}
		}
		return true;
	}
}
