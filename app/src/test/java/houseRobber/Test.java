package houseRobber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HouseRobberTest {

	@Test
	void example1() {
		int[] nums = new int[] { 1, 2, 3, 1 };
		int expected = 4;
		assertEquals(expected, Solution.rob(nums));
	}

	@Test
	void example2() {
		int[] nums = new int[] { 2, 7, 9, 3, 1 };
		int expected = 12;
		assertEquals(expected, Solution.rob(nums));
	}

	@Test
	void example3() {
		int[] nums = new int[] { 2, 1, 1, 2 };
		int expected = 4;
		assertEquals(expected, Solution.rob(nums));
	}
}
