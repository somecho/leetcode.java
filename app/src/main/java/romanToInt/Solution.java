package romanToInt;

// 13. Roman to Integer
// https://leetcode.com/problems/roman-to-integer/

import java.util.ArrayList;
import java.util.Map;
import static java.util.Map.entry;

public class Solution {
	String[] subtracted = new String[] {
			"IV", "IX",
			"XL", "XC",
			"CD", "CM"
	};
	Map<String, Integer> values = Map.ofEntries(
			entry("I", 1),
			entry("V", 5),
			entry("X", 10),
			entry("L", 50),
			entry("C", 100),
			entry("D", 500),
			entry("M", 1000),
			entry("IV", 4),
			entry("IX", 9),
			entry("XL", 40),
			entry("XC", 90),
			entry("CD", 400),
			entry("CM", 900));

	public int romanToInt(String s) {
		ArrayList<String> tokens = new ArrayList<String>();
		String roman = s;
		for (String sub : subtracted) {
			if (roman.contains(sub)) {
				tokens.add(sub);
				roman = roman.replace(sub, "");
			}
		}
		for (int i = 0; i < roman.length(); i++) {
			tokens.add(String.valueOf(roman.charAt(i)));
		}
		int total = tokens.stream()
				.map(r -> values.get(r))
				.reduce(0, (a, b) -> a + b);
		return total;
	}
}
