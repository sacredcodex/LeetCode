package Solved;

public class Solution566 {
	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int m = mat.length;
		int n = mat[0].length;
		if (m * n != r * c) return mat;
		int[][] res = new int[r][c];
		int number = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				res[i][j] = mat[number / n][number++ % n];
			}
		}
		return res;
	}
}
