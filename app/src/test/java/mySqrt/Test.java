package mySqrt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MySqrtTest {
	@Test
	void sqrtOf4is2() {
		assertEquals(2, Solution.mySqrt(4));
	}

	@Test
	void sqrtOf8is2() {
		assertEquals(2, Solution.mySqrt(8));
	}

	@Test
	void sqrtOf90is9() {
		assertEquals(9, Solution.mySqrt(90));
	}

	@Test
	void usecase15() {
		int x = 2147395600;
		assertEquals(46340, Solution.mySqrt(x));
	}
}
