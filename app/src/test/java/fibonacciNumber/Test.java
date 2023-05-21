package fibonacciNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciNumberTest {

	@Test
	void test(){
		assertEquals(1, Solution.fib(2));
		assertEquals(2, Solution.fib(3));
		assertEquals(3, Solution.fib(4));
		assertEquals(5, Solution.fib(5));
		assertEquals(8, Solution.fib(6));
		assertEquals(13, Solution.fib(7));
	}
}

