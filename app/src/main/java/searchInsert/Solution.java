package searchInsert;

// 35. Search Insert Position
// https://leetcode.com/problems/search-insert-position/

class Solution {
	public static int searchInsert(int[] nums, int target){
		int c = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] ==  target){
				return i;
			}
			if(target > nums[i]){
				c++;
			}
		}
		return c;
	}
}
