package runningSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RunningSumTest {
	@Test
	void example1() {
		int[] nums = new int[] { 1, 2, 3, 4 };
		int[] expected = new int[] { 1, 3, 6, 10 };
		int[] output = Solution.runningSum(nums);
		for (int i = 0; i < output.length; i++) {
			assertEquals(expected[i], output[i]);
		}
	}

	@Test
	void example2() {
		int[] nums = new int[] { 1, 1, 1, 1, 1};
		int[] expected = new int[] { 1, 2, 3, 4, 5 };
		int[] output = Solution.runningSum(nums);
		for (int i = 0; i < output.length; i++) {
			assertEquals(expected[i], output[i]);
		}
	}
}
