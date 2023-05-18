package fizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	@Test
	void n3(){
		int n = 3;
		String[] expected = new String[]{"1","2","Fizz"};
		List<String> result = Solution.fizzBuzz(n);
		for(int i = 0; i < expected.length;i++){
			assertEquals(expected[i],result.get(i));
		}
	}
}
