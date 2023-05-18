package maximumWealth;

// 1672. Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/

import java.util.Arrays;

class Solution {
	// time complexity: O(n)
	public static int maximumWealth(int[][] accounts) {
		return Arrays.stream(accounts)
				.map(customer -> Arrays.stream(customer).sum())
				.mapToInt(Integer::intValue)
				.max()
				.getAsInt();
	}
}
