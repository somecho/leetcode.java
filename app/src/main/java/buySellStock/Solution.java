package buySellStock;

// 121. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution {
	public static int maxProfit(int[] prices) {
		int profit = 0;
		int cheapest = 11111;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < cheapest) {
				cheapest = prices[i];
			}
			int difference = prices[i] - cheapest;
			if (difference > profit) {
				profit = difference;
			}
		}
		return profit;
	}
}


