package removeDuplicates;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

	void run(int[] nums, int[] expected) {
		int k = Solution.removeDuplicates(nums);
		assertEquals(expected.length, k);
		for (int i = 0; i < k; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}

	@Test
	void test() {
		{
			int[] nums = new int[] { 1, 1, 2 };
			int[] expected = new int[] { 1, 2 };
			run(nums, expected);
		}
		{
			int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
			int[] expected = new int[] { 0, 1, 2, 3, 4 };
			run(nums, expected);
		}
	}
}
