package jumpGameII;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JumpGameII {

	@Test
	void tests() {
		assertEquals(2, Solution.jump(new int[] { 2, 3, 1, 1, 4 }));
		assertEquals(2, Solution.jump(new int[] { 2, 3, 0, 1, 4 }));
		assertEquals(3, Solution.jump(new int[] { 1, 2, 1, 1, 1 }));
		assertEquals(2, Solution.jump(new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 0 }));
		assertEquals(2, Solution.jump(new int[] { 1, 2, 3 }));
		assertEquals(3, Solution.jump(new int[] { 1, 2, 3, 4, 5 }));
	}

}
