package twoSum;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class TwoSumTest {
	@Test
	void solutionTest() {
		int[] nums = new int[]{2,7,11,15};
		int target = 9;
		int[] answer = new int[]{0,1};
		assertArrayEquals(new Solution().twoSum(nums,target),answer);
	}
}
