package Solved;

public class Solution221 {
	public int maximalSquare(char[][] matrix) {
		int max = 0;
		int[][] squares = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == '1'){
				squares[i][0] = 1;
				max = 1;
			}
		}
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == '1'){
				squares[0][i] = 1;
				max =1;
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == '1') {
					squares[i][j] = 1 + Math.min(squares[i][j - 1], Math.min(squares[i - 1][j - 1], squares[i - 1][j]));
					if (squares[i][j] > max)
						max = squares[i][j];
				}
			}
		}
		return max * max;
	}
}
