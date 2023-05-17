package climbingStairs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ClimbingStairsTests {

	@Test
	void example1() {
		assertEquals(1, Solution.climbStairs(1));
	}

	@Test
	void example2() {
	assertEquals(2, Solution.climbStairs(2));
	}

	@Test
	void example3() {
	assertEquals(3, Solution.climbStairs(3));
	}

	@Test
	void example4() {
	assertEquals(5, Solution.climbStairs(4));
	}
}
