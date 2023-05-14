package firstOccurence;

// 28. Find the Index of the First Occurence in a String
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

class Solution {
	public static int strStr(String haystack, String needle) {
		int hlength = haystack.length();
		int nlength = needle.length();
		if (nlength > hlength) {
			return -1;
		}
		for (int i = 0; i <= hlength - nlength; i++) {
			if (haystack.substring(i, i+nlength).equals(needle)) {
				return i;
			}
		}
		return -1;
	}
}
