package mergeSortedArray;


// 88. Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/

class Solution {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] n1 = nums1.clone();
		int[] n2 = nums2.clone();
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		while (c1 < m || c2 < n) {
			if (c1 == m) {
				nums1[c3] = n2[c2];
				c2++;
				c3++;
				continue;
			}
			if(c2 == n){
				nums1[c3] = n1[c1];
				c1++;
				c3++;
				continue;
			}
			if(n1[c1] > n2[c2]){
				nums1[c3] = n2[c2];
				c2++;
				c3++;
				continue;
			} else {
				nums1[c3] = n1[c1];
				c1++;
				c3++;
				continue;
			}
		}
	}
}
