package kidsWithCandies;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class KidsWithCandies {

	@Test
	void example1() {
		int[] candies = new int[] { 2, 3, 5, 1, 3 };
		Boolean[] expected = new Boolean[] { true, true, true, false, true };
		int extraCandies = 3;
		List<Boolean> result = Solution.kidsWithCandies(candies, extraCandies);
		assertEquals(expected.length, result.size());
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result.get(i));
		}
	}

	@Test
	void example2() {
		int[] candies = new int[] { 4, 2, 1, 1, 2 };
		Boolean[] expected = new Boolean[] { true, false, false, false, false };
		int extraCandies = 1;
		List<Boolean> result = Solution.kidsWithCandies(candies, extraCandies);
		assertEquals(expected.length, result.size());
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result.get(i));
		}
	}

	@Test
	void example3() {
		int[] candies = new int[] { 12, 1, 12 };
		Boolean[] expected = new Boolean[] { true, false, true };
		int extraCandies = 10;
		List<Boolean> result = Solution.kidsWithCandies(candies, extraCandies);
		assertEquals(expected.length, result.size());
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result.get(i));
		}
	}

	@Test
	void allTrue() {
		int[] candies = new int[] { 10, 10, 10 };
		Boolean[] expected = new Boolean[] { true, true, true };
		int extraCandies = 10;
		List<Boolean> result = Solution.kidsWithCandies(candies, extraCandies);
		assertEquals(expected.length, result.size());
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result.get(i));
		}
	}

	@Test
	void allZero() {
		int[] candies = new int[] { 0, 0, 0 };
		Boolean[] expected = new Boolean[] { true, true, true };
		int extraCandies = 10;
		List<Boolean> result = Solution.kidsWithCandies(candies, extraCandies);
		assertEquals(expected.length, result.size());
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result.get(i));
		}
	}

	@Test
	void noKids() {
		int[] candies = new int[] {};
		Boolean[] expected = new Boolean[] {};
		int extraCandies = 10;
		List<Boolean> result = Solution.kidsWithCandies(candies, extraCandies);
		assertEquals(expected.length, result.size());
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result.get(i));
		}
	}
}
