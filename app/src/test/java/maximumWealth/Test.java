package maximumWealth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaximumWealthTest {

	@Test
	void example1() {
		int[][] accounts = new int[][] {
				{ 1, 2, 3 },
				{ 3, 2, 1 }
		};
		assertEquals(6, Solution.maximumWealth(accounts));
	}

	@Test
	void example2() {
		int[][] accounts = new int[][] {
				{ 1, 5 },
				{ 7, 3 },
				{ 3, 5 },
		};
		assertEquals(10, Solution.maximumWealth(accounts));
	}

}
