package removeElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class RemoveElementTest {

	@Test
	void example1() {
		int[] nums = new int[] { 3, 2, 2, 3 };
		int val = 3;
		int expected = 2;
		int output = Solution.removeElement(nums, val);
		assertEquals(expected, output);
		assertEquals(2, nums[0]);
		assertEquals(2, nums[1]);
	}

	@Test
	void example2() {
		int[] nums = new int[] { 0,1,2,2,3,0,4,2 };
		int val = 2;
		int expected = 5;
		int output = Solution.removeElement(nums, val);
		int[] subarray = Arrays.copyOfRange(nums,0,5);


		assertEquals(expected, output);
		assertTrue(subarray.length == 5);

		assertTrue(Arrays.stream(subarray).anyMatch(i->i==0));
		assertTrue(Arrays.stream(subarray).anyMatch(i->i==1));
		assertTrue(Arrays.stream(subarray).anyMatch(i->i==3));
		assertTrue(Arrays.stream(subarray).anyMatch(i->i==4));
			
	}
}
