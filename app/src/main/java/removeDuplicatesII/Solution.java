package removeDuplicatesII;

// 80. Remove Duplicates from Sorted Array II
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii

class Solution {
	public static int removeDuplicates(int[] nums) {
		int count = 0;
		for (int n : nums) {
			if (count < 2 || n > nums[count - 2]) {
				nums[count] = n;
				count++;
			}
		}
		return count;
	}
}
