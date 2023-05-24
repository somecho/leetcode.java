package kidsWithCandies;

// 1431. Kids With The Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		// Time Complexity: O(2n)
		// Space Complexity: O(n)
		LinkedList<Boolean> results = new LinkedList<>();
		if (candies.length == 0) {
			return results;
		}
		int max = Arrays.stream(candies).max().getAsInt();
		for (int c : candies) {
			results.addLast(c + extraCandies >= max);
		}
		return results;
	}

	public static List<Boolean> functional(int[] candies, int extraCandies) {
		if (candies.length == 0) {
			return new LinkedList<Boolean>();
		}

		int max = Arrays.stream(candies).max().getAsInt();
		return Arrays.stream(candies)
				.mapToObj(c -> c + extraCandies >= max)
				.collect(Collectors.toList());
	}
}
