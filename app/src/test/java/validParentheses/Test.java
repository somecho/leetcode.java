package validParentheses;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class ValidParenthesesTest {
	@Test
	void solutionTest(){
		assertTrue(new Solution().isValid("()"));
		assertTrue(new Solution().isValid("()[]{}"));
		assertTrue(new Solution().isValid("([{}])"));
		assertTrue(new Solution().isValid("(()[()([]{()()})]{})"));
		assertFalse(new Solution().isValid("((())"));
		assertFalse(new Solution().isValid("))))"));
		assertTrue(new Solution().isValid(""));
		assertFalse(new Solution().isValid("(("));
	}
}
