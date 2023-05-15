package plusOne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PlusOneTest {

	@Test
	void example1() {
		int[] digits = new int[] { 1, 2, 3 };
		int[] answer = new int[] { 1, 2, 4 };
		int[] output = Solution.plusOne(digits);
		for (int i = 0; i < answer.length; i++) {
			assertEquals(answer[i], output[i]);
		}
	}

	@Test
	void example2() {
		int[] digits = new int[] { 4, 3, 2, 1 };
		int[] answer = new int[] { 4, 3, 2, 2 };
		int[] output = Solution.plusOne(digits);
		for (int i = 0; i < answer.length; i++) {
			assertEquals(answer[i], output[i]);
		}
	}

	@Test
	void example3() {
		int[] digits = new int[] { 9 };
		int[] answer = new int[] { 1, 0 };
		int[] output = Solution.plusOne(digits);
		for (int i = 0; i < answer.length; i++) {
			assertEquals(answer[i], output[i]);
		}
	}
}
