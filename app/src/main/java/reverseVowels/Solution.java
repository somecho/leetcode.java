package reverseVowels;

// 345. Reverse Vowels of a String
// https://leetcode.com/problems/reverse-vowels-of-a-string/

import java.util.LinkedList;

class Solution {
	static Boolean isVowel(char c) {
		return "AEIOUaeiou".contains(String.valueOf(c));
	}

	public static String reverseVowels(String s) {
		LinkedList<Character> vowels = new LinkedList<>();
		char[] chars = s.toCharArray();

		for (char c : chars) {
			if (isVowel(c)) {
				vowels.addLast(c);
			}
		}

		StringBuilder reversedVowels = new StringBuilder();
		for (char c : chars) {
			if (isVowel(c)) {
				reversedVowels.append(vowels.pollLast());
				continue;
			}
			reversedVowels.append(c);
		}
		return reversedVowels.toString();
	}
}
