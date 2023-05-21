package tribonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TribonacciTest {
	@Test
	void test(){
		assertEquals(4, Solution.tribonacci(4));
		assertEquals(1389537, Solution.tribonacci(25));
		assertEquals(1132436852,Solution.tribonacci(36));
	}
}
