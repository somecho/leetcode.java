package longestCommonPrefix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {
	@Test
	void solutionTest() {
		assertEquals("fl", new Solution()
				.longestCommonPrefix(new String[] {
						"flower",
						"flow",
						"flight"
				}));
		assertEquals("", new Solution()
				.longestCommonPrefix(new String[] {
						"dog",
						"racecar",
						"moonlight"
				}));
		assertEquals("fff", new Solution()
				.longestCommonPrefix(new String[] {
						"fff",
						"ffff",
						"fffff"
				}));
	}
}
