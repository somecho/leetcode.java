package removeDuplicates;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	public static int removeDuplicates(int[] nums) {
		ArrayList<Integer> buffer = new ArrayList<Integer>(0);

		Arrays.stream(nums)
				.forEach(i -> {
					if (!buffer.contains(i)) {
						buffer.add(i);
					}
				});

		for (int i = 0; i < buffer.size(); i++) {
			nums[i] = buffer.get(i);
		}

		return buffer.size();
	}
}
