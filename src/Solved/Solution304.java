package Solved;

public class Solution304 {
	class NumMatrix {

		private int[][] pref;

		public NumMatrix(int[][] matrix) {
			pref = new int[matrix.length][matrix[0].length];
			pref[0][0]= matrix[0][0];
			for (int i = 1; i < pref[0].length; i++) {
				pref[0][i] = pref[0][i-1] + matrix[0][i];
			}
			for (int i = 1; i < pref.length; i++) {
				pref[i][0] = pref[i-1][0] + matrix[i][0];
				for (int j = 1; j < pref[0].length; j++) {
					pref[i][j] = matrix[i][j] + pref[i-1][j] + pref[i][j-1] - pref[i-1][j-1];
				}
			}
		}

		public int sumRegion(int row1, int col1, int row2, int col2) {
			int a=0,b=0,c=0,d=pref[row2][col2];
			if (row1 > 0){
				c = pref[row1-1][col2];
				if (col1 > 0) {
					a = pref[row1 - 1][col1 - 1];
					b = pref[row2][col1 - 1];
				}
			}else if (col1 > 0)
				b = pref[row2][col1 - 1];
			return d - b - c + a;
		}
	}
}
