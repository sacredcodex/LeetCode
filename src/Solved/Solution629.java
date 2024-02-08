package Solved;

import java.util.Arrays;

public class Solution629 {
	public int kInversePairs(int n, int k) {
		int[][] number = new int[n+1][k];
		Arrays.fill(number[1],0);
		for (int i = 2; i < n+1; i++) {
			for (int j = 0; j < k; j++) {

			}
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += kInversePairs(n-1, k-i);
		}
		return sum;
	}

	public static void main(String[] args) {
		Solution629 solution629 = new Solution629();
		System.out.println(solution629.kInversePairs(1000,2));
	}
}
