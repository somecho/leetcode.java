package canPlaceFlowers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CanPlaceFlowers {

	@Test
	void tests() {
		assertTrue(Solution.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 1));
		assertTrue(Solution.canPlaceFlowers(new int[] { 0, 0, 1, 0, 0 }, 1));
	}
}
