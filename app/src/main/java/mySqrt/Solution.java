package mySqrt;

// 69. Sqrt(x)
// https://leetcode.com/problems/sqrtx

class Solution {
	public static int mySqrt(int x){
		// it is a good idea to use longs 
		// when dealing with exponentiation stuff
		long i = 0;
		while(i*i <= x){
			i++;
		}
		return (int) i-1;
	}
}
