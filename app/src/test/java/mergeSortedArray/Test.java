package mergeSortedArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MergeSortedArray {

	@Test
	void example1() {
		int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = new int[] { 2, 5, 6 };
		int[] expected = new int[] { 1, 2, 2, 3, 5, 6 };
		Solution.merge(nums1, 3, nums2, 3);
		for (int i = 0; i < nums1.length; i++) {
			assertEquals(expected[i], nums1[i]);
		}
	}

	@Test
	void example2() {
		int[] nums1 = new int[] { 1 };
		int[] nums2 = new int[] {};
		int[] expected = new int[] { 1 };
		Solution.merge(nums1, 1, nums2, 0);
		for (int i = 0; i < nums1.length; i++) {
			assertEquals(expected[i], nums1[i]);
		}
	}

	@Test
	void example3() {
		int[] nums1 = new int[] { 0 };
		int[] nums2 = new int[] { 1 };
		int[] expected = new int[] { 1 };
		Solution.merge(nums1, 0, nums2, 1);
		for (int i = 0; i < nums1.length; i++) {
			assertEquals(expected[i], nums1[i]);
		}
	}
}
