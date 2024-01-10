package Solved;

public class Solution1314 {
	public int[][] matrixBlockSum(int[][] mat, int k) {
		int[][] pre = new int[mat.length+1][mat[0].length+1];
		pre[1][1] = mat[0][0];
		for (int i = 2; i < pre.length; i++) {
			pre[i][1] = mat[i-1][0] + pre[i-1][1];
		}
		for (int i = 2; i < pre[0].length; i++) {
			pre[1][i] = mat[0][i-1] + pre[1][i-1];
		}
		for (int i = 2; i < pre.length; i++) {
			for (int j = 2; j < pre[0].length; j++) {
				pre[i][j] = pre[i-1][j] - pre[i-1][j-1] + pre[i][j-1] + mat[i-1][j-1];
			}
		}
		int[][] res = new int[mat.length][mat[0].length];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				int a = Math.max(0, i - k);
				int b = Math.min(mat.length, i + k + 1);
				int c = Math.max(0, j - k);
				int d = Math.min(mat[0].length, j + k + 1);
				res[i][j] = pre[b][d] - pre[b][c] - pre[a][d] + pre[a][c];
			}
		}
		return res;
	}
}
