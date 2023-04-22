package problems.twosum;

import java.util.Arrays;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i == j) {
					continue;
				}
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		Arrays.sort(result);
		System.out.println(result[0]);
		System.out.println(result[1]);
		return result;
	}
}
