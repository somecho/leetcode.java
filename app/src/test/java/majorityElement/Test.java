package majorityElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MajorityElement {

	@Test
	void tests() {
		assertEquals(3, Solution.majorityElement(new int[] { 3, 2, 3 }));
		assertEquals(2, Solution.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2, }));
		assertEquals(5, Solution.majorityElement(new int[] { 5, 4, 5, 3, 5, 5, 2, 5, 1, 5 }));
	}

}
