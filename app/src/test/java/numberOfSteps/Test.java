package numberOfSteps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StepsTest {
	@Test
	void example1(){
		assertEquals(6, Solution.numberOfSteps(14));
	}
}
