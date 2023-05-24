package greatestCommonDivisorStrings;

// 1071. Greatest Common Divisor of Strings
// https://leetcode.com/problems/greatest-common-divisor-of-strings/

class Solution {
	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static String gcdOfStrings(String str1, String str2) {
		if (str1.isEmpty() || str2.isEmpty()) {
			return "";
		}
		if (!(str1 + str2).equals(str2 + str1)) {
			return "";
		}
		int gcd = gcd(str1.length(), str2.length());
		return str1.substring(0, gcd);
	}
}
