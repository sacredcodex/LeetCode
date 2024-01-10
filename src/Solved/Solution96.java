package Solved;

public class Solution96 {
	public int numTrees(int n) {
		int[] res = new int[20];
		res[0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				res[i] += res[j] * res[i-j-1];
			}
		}
		return res[n];
	}
}
