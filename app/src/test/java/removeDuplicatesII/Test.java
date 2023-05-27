package removeDuplicatesII;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesII {

	void criteria(int[] nums, int[] expected, int expectedK) {
		int k = Solution.removeDuplicates(nums);
		assertEquals(expectedK, k);
		for (int i = 0; i < nums.length; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}

	@Test
	void example1() {
		int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
		int[] expected = new int[] { 1, 1, 2, 2, 3, 3 };
		criteria(nums, expected, 5);
	}

	@Test
	void example2() {
		int[] nums = new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
		int[] expected = new int[] { 0, 0, 1, 1, 2, 3, 3, 3, 3 };
		criteria(nums, expected, 7);
	}

	@Test
	void arrayN2() {
		int[] nums = new int[] { 1, 2 };
		int[] expected = new int[] { 1, 2 };
		criteria(nums, expected, 2);
	}

	@Test
	void arrayN3() {
		int[] nums = new int[] { 0, 1, 1 };
		int[] expected = new int[] { 0, 1, 1 };
		criteria(nums, expected, 3);
	}

	@Test
	void arrayN3B() {
		int[] nums = new int[] { 1, 1, 1 };
		int[] expected = new int[] { 1, 1, 1 };
		criteria(nums, expected, 2);
	}

	@Test
	void nonAdjaccentArray() {
		int[] nums = new int[] { 0, 0, 0, 5, 5, 5, 9, 9, 9 };
		int[] expected = new int[] { 0, 0, 5, 5, 9, 9, 9, 9, 9 };
		criteria(nums, expected, 6);
	}
}
