package fibonacciNumber;

// 509. Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/

class Solution {
	public static int fib(int n){
		if(n>1){
			return fib(n-1) + fib(n-2);
		}
		return n;
	}
}
