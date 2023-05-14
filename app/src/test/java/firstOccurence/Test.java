package firstOccurence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FirstOccurenceTest {

	@Test
	void example1() {
		String haystack = "sadbutsad";
		String needle = "sad";
		assertEquals(0, Solution.strStr(haystack, needle));
	}

	@Test
	void example2() {
		String haystack = "leetcode";
		String needle = "leeto";
		assertEquals(-1, Solution.strStr(haystack, needle));
	}
}
