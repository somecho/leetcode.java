package addBinary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddBinaryTest {

	@Test
	void example1() {
		String a = "11";
		String b = "1";
		String expected = "100";
		String output = Solution.addBinary(a, b);
		assertEquals(expected, output);
	}

	@Test
	void example2() {
		String a = "1010";
		String b = "1011";
		String expected = "10101";
		String output = Solution.addBinary(a, b);
		assertEquals(expected, output);
	}

	@Test
	void example3() {
		String a = "11";
		String b = "11";
		String expected = "110";
		String output = Solution.addBinary(a, b);
		assertEquals(expected, output);
	}

}
