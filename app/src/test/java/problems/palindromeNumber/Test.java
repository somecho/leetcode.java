package problems.palindromeNumber;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromeNumberTest {
	@Test
	void solutionTest() {
		assertTrue(new Solution().isPalindrome(121));
		assertFalse(new Solution().isPalindrome(-121));
	}

}
