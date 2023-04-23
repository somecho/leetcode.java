package longestCommonPrefix;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		Boolean prefixFound = false;
		int pos = 0;
		String prefix = "";
		while (!prefixFound) {
			Character cur = 0;
			for (String str : strs) {
				if (pos == str.length()) {
					prefixFound = true;
					break;
				}
				if (cur == 0) {
					cur = str.charAt(pos);
				}
				if (cur != str.charAt(pos)) {
					prefixFound = true;
					break;
				}
			}
			if (prefixFound) {
				break;
			}
			prefix += String.valueOf(cur);
			pos++;
		}
		return prefix;
	}
}
