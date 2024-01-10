package Solved;

import java.util.Arrays;

public class Solution1337 {
	public int[] kWeakestRows(int[][] mat, int k) {
		int[] power = new int[mat.length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1)
					power[i] += 1;
			}
			power[i] <<= 7;
			power[i] += i;
		}
		Arrays.sort(power);
		int[] res = new int[k];
		for (int i = 0; i < k; i++) {
			res[i] = power[i] & 127;
		}
		return res;
	}
}
