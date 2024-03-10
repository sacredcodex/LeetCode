package Solved;

import java.util.HashSet;

public class Solution73 {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> col, row;
        col = new HashSet<>();
        row = new HashSet<>();

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if (matrix[i][j] == 0) {
                    col.add(i);
                    row.add(j);
                }

        for (int c : col)
            for (int i = 0; i < matrix[0].length; i++)
                matrix[c][i] = 0;

        for (int r : row)
            for (int i = 0; i < matrix.length; i++)
                matrix[i][r] = 0;
    }
}
