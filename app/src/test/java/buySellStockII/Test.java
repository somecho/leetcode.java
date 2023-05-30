package buySellStockII;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BuySellStockII {
	@Test
	void tests() {
		assertEquals(7, Solution.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
		assertEquals(4, Solution.maxProfit(new int[] { 1, 2, 3, 4, 5 }));
		assertEquals(0, Solution.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
		assertEquals(3, Solution.maxProfit(new int[] { 1, 2, 1, 2, 1, 2 }));
		assertEquals(0, Solution.maxProfit(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }));
	}
}
