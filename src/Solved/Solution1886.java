package Solved;

public class Solution1886 {
	public boolean findRotation(int[][] mat, int[][] target) {
		int n = mat.length;
		boolean r0 = true, r1 = true, r2 = true, r3 = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (r0) {
					if (target[i][j] != mat[i][j])
						r0 = false;
				}
				if (r1) {
					if (target[i][j] != mat[j][n-i-1])
						r1 = false;
				}
				if (r2) {
					if (target[i][j] != mat[n-i-1][n-j-1])
						r2 = false;
				}
				if (r3) {
					if (target[i][j] != mat[n-j-1][i])
						r3 = false;
				}
			}
		}
		return r0 || r1 || r2 || r3;
	}
}
