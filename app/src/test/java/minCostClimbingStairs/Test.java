package minCostClimbingStairs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinCostClimbingStairsTest {

	@Test
	void example1() {
		int[] cost = new int[] { 10, 15, 20 };
		int expected = 15;
		assertEquals(expected, Solution.minCostClimbingStairs(cost));
	}

	@Test
	void example2() {
		int[] cost = new int[] { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int expected = 6;
		assertEquals(expected, Solution.minCostClimbingStairs(cost));
	}

}
