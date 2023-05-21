package houseRobber;

// 198. House Robber
// https://leetcode.com/problems/house-robber/

class Solution {
	public static int rob(int[] nums) {
		if (nums.length == 0) return 0;
		int[] dp = new int[nums.length + 1];
		dp[0] = 0;
		dp[1] = nums[0];
		for(int i = 1; i < nums.length; i++){
			int val = nums[i];
			dp[i+1] = Math.max(dp[i],dp[i-1]+val);
		}
		return dp[nums.length];
	}
}
