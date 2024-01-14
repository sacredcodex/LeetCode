package Solved;

public class Solution498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        int idx = 0;
        for (int i = 0; i < m + n - 1; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < n; j++) {
                    int k = i - j;
                    if (k >= 0 && k < m)
                        res[idx++] = mat[k][j];
                }
            }else {
                for (int j = n-1; j >= 0; j--) {
                    int k = i - j;
                    if (k >= 0 && k < m)
                        res[idx++] = mat[k][j];
                }
            }
        }
        return res;
    }
}
