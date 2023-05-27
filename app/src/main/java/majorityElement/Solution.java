package majorityElement;

// 169. Majority Element
// https://leetcode.com/problems/majority-element

import java.util.HashSet;
import java.util.Random;

class Solution {
	public static int majorityElement(int[] nums) {
		HashSet<Integer> tried = new HashSet<>();
		int count = 0;
		Boolean candidateFound = false;
		int candidate = 0;

		while (true) {

			while (!candidateFound) {
				int c = nums[new Random().nextInt(nums.length)];
				if (!tried.contains(c)) {
					count = 0;
					candidate = c;
					candidateFound = true;
					tried.add(c);
				}
			}

			for (int n : nums) {
				if (n == candidate) {
					count++;
				}
			}
			if (count > (nums.length / 2)) {
				return candidate;
			} else {
				candidateFound = false;
			}

		}

	}
}
