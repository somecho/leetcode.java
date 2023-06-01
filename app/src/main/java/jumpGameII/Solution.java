package jumpGameII;

// 45. Jump Game II
// https://leetcode.com/problems/jump-game-ii/description/

class Solution {
	public static int jump(int[] nums) {
		int jumps = 0, curr = 0, reach = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			reach = Math.max(reach, i + nums[i]);
			if (i == curr) {
				jumps++;
				curr = reach;
				if (curr >= nums.length - 1) {
					return jumps;
				}
			}
		}
		return jumps;
	}
}
