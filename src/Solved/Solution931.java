package Solved;

public class Solution931 {
	public int minFallingPathSum(int[][] matrix) {
		int length = matrix.length;
		if (length == 1) return matrix[0][0];
		for (int i = 1; i < length; i++) {
			matrix[i][0] += Math.min(matrix[i-1][0], matrix[i-1][1]);
			for (int j = 1; j < length-1; j++) {
				matrix[i][j] += Math.min(matrix[i-1][j-1], Math.min(matrix[i-1][j], matrix[i-1][j+1]));
			}
			matrix[i][length-1] += Math.min(matrix[i-1][length-2], matrix[i-1][length-1]);
		}
		int min = matrix[length-1][0];
		for (int i = 1; i < length; i++) {
			if (min > matrix[length-1][i])
				min = matrix[length-1][i];
		}
		return min;
	}
}
