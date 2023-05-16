package addBinary;

// 67. Add Binary
// https://leetcode.com/problems/add-binary/

// I hate string manipulation problems T.T
// This solution is so inelegant, with the multiple
// if branches.

class Solution {
	static String padZero(String s, int numZeros) {
		for (int i = 0; i < numZeros; i++) {
			s = "0" + s;
		}
		return s;
	}

	public static String addBinary(String a, String b) {
		if (a.length() > b.length()) {
			b = padZero(b, a.length() - b.length());
		} else {
			a = padZero(a, b.length() - a.length());
		}

		String result = "";
		String accum = "0";
		for (int i = a.length() - 1; i >= 0; i--) {
			char x = a.charAt(i);
			char y = b.charAt(i);

			if (x != y) {
				if (accum == "0") {
					result = "1" + result;
				}
				if (accum == "1") {
					result = "0" + result;
				}
				continue;
			}

			if (x == '0' && y == '0') {
				result = accum + result;
				accum = "0";
				continue;
			}

			if( accum == "0"){
				accum = "1";
				result = "0" + result;
				continue;
			} else {
				result = "1" + result;
				continue;
			}
		}
		if (accum == "1") {
			result = "1" + result;
		}

		return result;
	}
}
