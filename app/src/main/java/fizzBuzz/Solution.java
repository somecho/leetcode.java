package fizzBuzz;

// 412. FizzBuzz;
// https://leetcode.com/problems/fizz-buzz/

import java.util.LinkedList;
import java.util.List;

class Solution {
	public static List<String> fizzBuzz(int n){
			List<String> result = new LinkedList<String>();
			for(int i =1; i < n+1;i++){
				String fb = "";
				if(i % 3 == 0){
					fb += "Fizz";
				}
				if(i % 5 == 0){
					fb += "Buzz";
				}
				if(fb.equals("")){
					fb += i;
				}
				result.add(fb);
			}
			return result;
	}
}
