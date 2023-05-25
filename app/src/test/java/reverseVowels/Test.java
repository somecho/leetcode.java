package reverseVowels;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseVowels {

	@Test
	void tests() {
		assertEquals("holle", Solution.reverseVowels("hello"));
		assertEquals("leotcede", Solution.reverseVowels("leetcode"));
		assertEquals("", Solution.reverseVowels(""));
		assertEquals("rhythm", Solution.reverseVowels("rhythm"));
		assertEquals("ueue", Solution.reverseVowels("eueu"));
	}
}
