package canPlaceFlowers;

// 605. Can Place Flowers
// https://leetcode.com/problems/can-place-flowers/

class Solution {
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int validPlaces = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			int pi = i == 0 ? 0 : flowerbed[i - 1];
			int ni = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
			if (pi == 0 && ni == 0 && flowerbed[i] != 1) {
				flowerbed[i] = 1;
				validPlaces++;
			}
		}
		return validPlaces >= n;
	}
}
