package mergeStringsAlternately;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MergeStringsAlternately {

	@Test
	void example1() {
		assertEquals("apbqcr", Solution.mergeAlternately("abc", "pqr"));
	}

  @Test
	void example2(){
		assertEquals("apbqrs", Solution.mergeAlternately("ab","pqrs"));
	}

	@Test
	void oneEmpty(){
		assertEquals("xyz", Solution.mergeAlternately("","xyz"));
		assertEquals("xyz", Solution.mergeAlternately("xyz",""));
	}

	@Test
	void bothEmpty(){
		assertEquals("", Solution.mergeAlternately("",""));
	}
}
