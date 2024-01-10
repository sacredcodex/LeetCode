package Solved;

public class Solution1220 {
	public int countVowelPermutation(int n) {
		int[][] count = new int[n][5];
		for (int i = 0; i < 5; i++) {
			count[0][i] = 1;
		}
		for (int i = 1; i < n; i++) {
			count[i][0] = count[i-1][1];
			count[i][1] = (count[i-1][0] + count[i-1][2]) % 1000000007;
			count[i][2] = (((count[i-1][0] + count[i-1][1]) % 1000000007 + count[i-1][3]) % 1000000007 + count[i-1][4]) % 1000000007;
			count[i][3] = (count[i-1][2] + count[i-1][4]) % 1000000007;
			count[i][4] = count[i-1][0];
		}
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += count[n-1][i];
			sum %= 1000000007;
		}
		return sum;
	}
}
