package tribonacci;

// 1137. N-th Tribonacci Number
// https://leetcode.com/problems/n-th-tribonacci-number/

class Solution {
	public static int tribonacci(int n) {
		int a = 0;
		int b = 1;
		int c = 1;
		int d = a + b + c;
		if (n < 1) {
			return a;
		}
		if (n < 3) {
			return b;
		}
		for (int i = 3; i < n; i++) {
			a = b;
			b = c;
			c = d;
			d = a + b + c;
		}
		return d;
	}
}
