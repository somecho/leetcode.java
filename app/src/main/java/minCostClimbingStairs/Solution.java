package minCostClimbingStairs;

// 746. Min Cost Climbing Stairs
// https://leetcode.com/problems/min-cost-climbing-stairs/

class Solution {
	public static int minCostClimbingStairs(int[] cost) {
		int[] dp = new int[cost.length + 1];
		dp[cost.length] = 0;

		for (int i = cost.length - 1; i > -1; i--) {
			int nexti = i + 1;
			int nextnexti = i + 2 > cost.length ? i + 1 : i + 2;
			dp[i] = cost[i] + Integer.min(dp[nexti], dp[nextnexti]);
		}

		return Integer.min(dp[0], dp[1]);
	}
}
