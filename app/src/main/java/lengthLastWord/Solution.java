package lengthLastWord;

// 58. Length of Last Word
// https://leetcode.com/problems/length-of-last-word/

class Solution {
	public static int lengthOfLastWord(String s) {
		String[] words = s.split(" ");
		return words[words.length - 1].length();
	}
}
