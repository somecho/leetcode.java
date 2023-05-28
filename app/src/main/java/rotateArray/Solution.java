package rotateArray;

// 189. Rotate Array
// https://leetcode.com/problems/rotate-array/description/

class Solution {
	public static void rotate(int[] nums, int k) {
		int[] temp = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int j = (i + k) % nums.length;
			temp[j] = nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = temp[i];
		}
	}
}
