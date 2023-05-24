package mergeStringsAlternately;

// 1768. Merge Strings Alternately
// https://leetcode.com/problems/merge-strings-alternately

class Solution {
	public static String mergeAlternately(String word1, String word2) {
		// I'm using two pointers to track the strings here,
		// which is not very necessary. This problem can be solved
		// using a single pointer for traversl.
		int p1 = 0;
		int p2 = 0;
		String merged = "";
		while (p1 < word1.length() || p2 < word2.length()) {
			if (p1 >= word1.length()) {
				merged += word2.charAt(p2);
				p2++;
				continue;
			}
			if (p2 >= word2.length()) {
				merged += word1.charAt(p1);
				p1++;
				continue;
			}
			merged += word1.charAt(p1);
			merged += word2.charAt(p2);
			p1++;
			p2++;
		}
		return merged;
	}
}
