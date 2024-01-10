package Solved;

public class Solution409 {
	public int longestPalindrome(String s) {
		int[] counts = new int[58];
		for (char c : s.toCharArray()){
			counts[c-'A'] += 1;
		}
		boolean odd = false;
		int sum = 0;
		for (int num : counts){
			odd = odd | num % 2 == 1;
			sum += num>>1<<1;
		}
		return odd?sum+1:sum;
	}
}
