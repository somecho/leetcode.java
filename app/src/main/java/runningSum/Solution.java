package runningSum;

// 1480. Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
	// O(n)
	public static int[] runningSum(int[] nums){
		int[] result = nums; // I don't want to modify the input
		for(int i =1; i < result.length;i++){
			result[i] = result[i] + result[i-1];
		}
		return result;
	}
}
