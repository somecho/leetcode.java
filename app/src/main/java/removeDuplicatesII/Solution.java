package removeDuplicatesII;

// 80. Remove Duplicates from Sorted Array II
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii

class Solution {
	static int REMOVED = -11111;

	static void rearrange(int[] nums, int k) {
		for (int j = 0; j < k; j++) {
			if (nums[j] == REMOVED) {
				for (int ptr = j; ptr < nums.length - 1; ptr++) {
					nums[ptr] = nums[ptr + 1];
					nums[ptr + 1] = REMOVED;
					j = 0;
				}
			}
		}
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length < 3) {
			return nums.length;
		}
		int cur = REMOVED;
		int count = 0;
		int duplicates = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != cur) {
				cur = nums[i];
				count = 0;
			}
			count++;
			if (count > 2) {
				nums[i] = REMOVED;
				duplicates++;
			}
		}
		rearrange(nums, nums.length - duplicates);

		return nums.length - duplicates;
	}
}
