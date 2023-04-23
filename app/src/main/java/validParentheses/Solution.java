package validParentheses;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Solution {
	List<Character> openChars = Arrays.asList('(', '[', '{');
	Map<Character, Character> match = Map.of(')', '(', ']', '[', '}', '{');
	Stack<Character> openings = new Stack<Character>();

	public boolean isValid(String s) {
		if (s.length() % 2 == 1) {
			return false;
		}
		boolean isValid = true;
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (openChars.contains(cur)) {
				openings.push(cur);
				continue;
			}
			if (openings.empty()) {
				isValid = false;
				break;
			}
			char validMatch = match.get(cur);
			if (openings.peek() == validMatch) {
				openings.pop();
				continue;
			}
			isValid = false;
			break;
		}
		if (!openings.empty()) {
			isValid = false;
		}
		return isValid;
	}
}
