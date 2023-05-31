package jumpGame;

// 55. Jump Game
// https://leetcode.com/problems/jump-game/description/

class Solution {
	public static boolean canJump(int[] nums) {
		boolean jumpable = true;
		int step = nums.length - 1;
		int i = nums.length - 2;
		while (i > -1) {
			if (nums[i] + i >= step) {
				jumpable = true;
				step = i;
			} else {
				jumpable = false;
			}
			i--;
		}
		return jumpable;
	}
}
