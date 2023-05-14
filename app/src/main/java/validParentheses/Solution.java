package validParentheses;

// 20. Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/

import java.util.ArrayList;
import java.util.Map;

public class Solution {
	Map<Character, Character> match = Map.of(')', '(', ']', '[', '}', '{');
	ArrayList<Character> track = new ArrayList<Character>();

	public boolean isValid(String s) {
		if (s.length() % 2 == 1) {
			return false;
		}
		boolean isValid = true;
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur == '(' || cur == '[' || cur == '{') {
				track.add(cur);
				continue;
			}
			if (track.isEmpty()) {
				isValid = false;
				break;
			}
			char validMatch = match.get(cur);
			if (track.get(track.size()-1) == validMatch) {
				track.remove(track.size()-1);
				continue;
			}
			isValid = false;
			break;
		}
		if (!track.isEmpty()) {
			isValid = false;
		}
		return isValid;
	}
}
