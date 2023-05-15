package searchInsert;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SearchInsertTest {

	@Test
	void example1() {
		int[] nums = new int[] { 1, 3, 5, 6 };
		int target = 5;
		int output = Solution.searchInsert(nums, target);
		int expectedOutput = 2;
		assertEquals(expectedOutput, output);
	}

	@Test
	void example2() {
		int[] nums = new int[] { 1, 3, 5, 6 };
		int target = 2;
		int output = Solution.searchInsert(nums, target);
		int expectedOutput = 1;
		assertEquals(expectedOutput, output);
	}

	@Test
	void example3() {
		int[] nums = new int[] { 1, 3, 5, 6 };
		int target = 7;
		int output = Solution.searchInsert(nums, target);
		int expectedOutput = 4;
		assertEquals(expectedOutput, output);
	}
}
