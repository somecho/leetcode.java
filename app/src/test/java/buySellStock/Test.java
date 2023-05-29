package buySellStock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BuySellStock {

	@Test
	void tests() {
		assertEquals(5, Solution.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
		assertEquals(0, Solution.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
		assertEquals(0, Solution.maxProfit(new int[] {}));
		assertEquals(0, Solution.maxProfit(new int[] { 9, 9, 9, 9, 9 }));
		assertEquals(4, Solution.maxProfit(new int[] { 1, 2, 3, 4, 5 }));
	}
}
