package Solved;

public class Solution1572 {
    public int diagonalSum(int[][] mat) {
        int l = mat.length;
        int sum = 0;
        for (int i = 0; i < l; i++) {
            sum += mat[i][i];
            sum += l - 1 - i == i ? 0 : mat[l - 1 - i][i];
        }
        return sum;
    }
}
