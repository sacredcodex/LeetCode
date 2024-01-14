package Solved;

import java.util.HashSet;

public class SolutionMS01_08 {
    // https://leetcode.cn/problems/zero-matrix-lcci/
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> columns = new HashSet<>();
        HashSet<Integer> rows = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for (int i : rows)
            for (int j = 0; j < n; j++)
                matrix[i][j] = 0;
        for (int i : columns)
            for (int j = 0; j < m; j++)
                matrix[j][i] = 0;
    }
}
