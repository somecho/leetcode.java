package removeElement;

// https://leetcode.com/problems/remove-element/

class Solution {
	public static int removeElement(int[] nums, int val) {
		int i = 0;
		int count = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i]=nums[j];
				i++;
				count++;
			}
		}
		return count;
	}
}
