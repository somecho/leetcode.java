package lengthLastWord;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LengthLastWordTest {

	@Test
	void example1(){
		String input = "Hello World";
		int correct = 5;
		int output = Solution.lengthOfLastWord(input);
		assertEquals(correct, output);
	}

	@Test
	void example2(){
		String input = "  fly me  to  the moon  ";
		int correct = 4;
		int output = Solution.lengthOfLastWord(input);
		assertEquals(correct, output);
	}

	@Test
	void example3(){
		String input = "luffy is still joyboy";
		int correct = 6;
		int output = Solution.lengthOfLastWord(input);
		assertEquals(correct, output);
	}
}
