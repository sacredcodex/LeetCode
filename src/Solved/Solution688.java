package Solved;

import java.util.Arrays;

public class Solution688 {
	double[][][] probalities;

	public double knightProbability(int n, int k, int row, int column) {
		probalities = new double[k + 1][n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				probalities[k][i][j] = 1;
			}
		}
		return dfs(n, 0, row, column, k);
	}

	private double dfs(int n, int step, int row, int column, int k){
		if (row >= 0 && row < n && column >= 0 && column < n){
			if (probalities[step][row][column] != 0) return probalities[step][row][column];
			else {
				double p = 0;
				p += dfs(n, step + 1, row-2, column-1, k);
				p += dfs(n, step + 1, row-2, column+1, k);
				p += dfs(n, step + 1, row-1, column-2, k);
				p += dfs(n, step + 1, row-1, column+2, k);
				p += dfs(n, step + 1, row+1, column-2, k);
				p += dfs(n, step + 1, row+1, column+2, k);
				p += dfs(n, step + 1, row+2, column-1, k);
				p += dfs(n, step + 1, row+2, column+1, k);
				p /= 8;
				probalities[step][row][column] = p;
				return p;
			}
		}else return 0;
	}
}
