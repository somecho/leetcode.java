package deleteAndEarn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DeleteAndEarn {

	@Test
	void example1() {
		int[] nums = new int[] { 3, 4, 2 };
		assertEquals(6, Solution.deleteAndEarn(nums));
	}

	@Test
	void example2() {
		int[] nums = new int[] { 2, 2, 3, 3, 3, 4 };
		assertEquals(9, Solution.deleteAndEarn(nums));
	}

	@Test
	void testcase10() {
		int[] nums = new int[] { 1 };
		assertEquals(1, Solution.deleteAndEarn(nums));
	}
}
