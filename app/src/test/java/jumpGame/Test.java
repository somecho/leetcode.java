package jumpGame;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class JumpGame {

	@Test
	void tests() {
		assertTrue(Solution.canJump(new int[] { 2, 3, 1, 1, 4 }));
		assertTrue(Solution.canJump(new int[] { 3, 2, 1, 0 }));
		assertTrue(Solution.canJump(new int[] { 1 }));
		assertTrue(Solution.canJump(new int[] { 2, 0 }));
		assertTrue(Solution.canJump(new int[] { 2, 5, 0, 0 }));

		assertFalse(Solution.canJump(new int[] { 3, 2, 1, 0, 4 }));
	}
}
