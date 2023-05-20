package ransomNote;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RansomNoteTest {

	@Test
	void b_cannotConstruct_a(){
		assertFalse(Solution.canConstruct("a","b"));
	}

	@Test
	void ab_cannotConstruct_aa(){
		assertFalse(Solution.canConstruct("aa","ab"));
	}

	@Test
	void aab_canConstruct_aa(){
		assertTrue(Solution.canConstruct("aa","aab"));
	}

	@Test
	void acdc_canConstruct_cc(){
		assertTrue(Solution.canConstruct("cc","acdc"));
	}

	@Test
	void abcd_canConstruct_empty(){
		assertTrue(Solution.canConstruct("","abcd"));
	}

	@Test
	void empty_cannotConstruct_zz(){
		assertFalse(Solution.canConstruct("zz",""));
	}

}
