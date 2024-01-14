package Solved;

public class Solution48 {
    public void rotate(int[][] matrix) {
        flip1(matrix);
        flip2(matrix);
    }

    private void flip1(int[][] matrix){
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                matrix[i][j] += matrix[j][i];
                matrix[j][i] = matrix[i][j] - matrix[j][i];
                matrix[i][j] -= matrix[j][i];
            }
        }
    }

    private void flip2(int[][] matrix){
        int n = matrix.length;
        int m = n >> 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] += matrix[i][n-1 - j];
                matrix[i][n-1 - j] = matrix[i][j] - matrix[i][n-1 - j];
                matrix[i][j] -= matrix[i][n-1 - j];
            }
        }
    }
}
