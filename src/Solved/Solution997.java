package Solved;

public class Solution997 {
	public int findJudge(int n, int[][] trust) {
		int[] people = new int[n];
		for (int[] t : trust) {
			people[t[0] - 1] -= 1;
			people[t[1] - 1] += 1;
		}
		for (int i = 0; i < n; i++) {
			if (people[i] == n-1)
				return i+1;
		}
		return -1;
	}
}
