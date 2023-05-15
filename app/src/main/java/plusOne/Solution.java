package plusOne;

// 66. Plus One
// https://leetcode.com/problems/plus-one/

class Solution {
	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i] = (digits[i] + 1) % 10;
			if (digits[i] != 0) {
				return digits;
			}
		}

		if (digits[0] == 0) {
			int[] output = new int[digits.length + 1];
			output[0] = 1;
			for (int i = 0; i < digits.length; i++) {
				output[i + 1] = digits[i];
			}
			return output;
		}

		return new int[digits.length];
	}
}
