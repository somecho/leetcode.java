package ransomNote;

import java.util.HashMap;

class Solution {
	public static boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> store = new HashMap<>();

		for (int i = 0; i < magazine.length(); i++) {
			char c = magazine.charAt(i);
			if (store.get(c) == null) {
				store.put(c, 1);
			} else {
				store.put(c, store.get(c) + 1);
			}
		}

		for (int i = 0; i < ransomNote.length(); i++) {
			char c = ransomNote.charAt(i);
			if (store.get(c) == null || store.get(c) == 0) {
				return false;
			} else {
				store.put(c, store.get(c) - 1);
			}
		}

		return true;
	}
}
