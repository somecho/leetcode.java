package buySellStockII;

// 122. Best Time to Buy and Sell Stock II
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

class Solution {
	public static int maxProfit(int[] prices) {
		int profit = 0;
		boolean holding = false;
		int cur = -1;
		for (int i = 0; i < prices.length; i++) {
			int prev = i - 1 < 0 ? prices[i] : prices[i - 1];
			int next = i + 1 == prices.length ? prices[i] : prices[i + 1];
			boolean isPeak = prev <= prices[i] && prices[i] >= next;
			boolean isValley = prev >= prices[i] && prices[i] <= next;
			if (!holding && isValley) {
				holding = true;
				cur = prices[i];
			}
			if (holding && isPeak) {
				holding = false;
				profit += prices[i] - cur;
			}
		}
		return profit;
	}
}
