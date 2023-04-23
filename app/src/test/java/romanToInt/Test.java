package romanToInt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class romanToIntTest {
	@Test
	void solutionTest(){
		assertEquals(3, new Solution().romanToInt("III"));
		assertEquals(58, new Solution().romanToInt("LVIII"));
		assertEquals(1994, new Solution().romanToInt("MCMXCIV"));
	}
}
