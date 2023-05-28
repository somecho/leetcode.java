package rotateArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RotateArray {

	@Test
	void example1() {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int[] expected = { 5, 6, 7, 1, 2, 3, 4 };
		Solution.rotate(nums, 3);
		for (int i = 0; i < nums.length; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}

	@Test
	void example2() {
		int[] nums = { -1, -100, 3, 99 };
		int[] expected = { 3, 99, -1, -100 };
		Solution.rotate(nums, 2);
		for (int i = 0; i < nums.length; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}

	@Test
	void empty() {
		int[] nums = {};
		int[] expected = {};
		Solution.rotate(nums, 2);
		for (int i = 0; i < nums.length; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}

	@Test
	void kGreaterThanN() {
		int[] nums = { 1, 2, 3, 4, 5 };
		int[] expected = { 5, 1, 2, 3, 4 };
		Solution.rotate(nums, 6);
		for (int i = 0; i < nums.length; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}
}
