package deleteAndEarn;

// 740. Delete and Earn
// https://leetcode.com/problems/delete-and-earn/

class Solution {
	public static int deleteAndEarn(int[] nums) {
		int[] freq = new int[10_001];
		for (int i = 0; i < nums.length; i++) {
			freq[nums[i]]++;
		}

		for (int i = 1; i < freq.length; i++) {
			int i1 = i - 1 < 1 ? 0 : freq[i - 1];
			int i2 = i - 2 < 1 ? 0 : freq[i - 2];
			freq[i] = Integer.max(
					i2 + (i * freq[i]),
					i1);
		}

		return Integer.max(freq[freq.length - 1], freq[freq.length - 2]);
	}
}
