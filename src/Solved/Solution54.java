package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {
    private static int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    private List<Integer> res;
    private int[][] mat;
    private int[][] use;
    int m,n;
    public List<Integer> spiralOrder(int[][] matrix) {
        res = new ArrayList<>();
        mat = matrix;
        m = mat.length;
        n = mat[0].length;
        use= new int[m][n];
        add(0,0,0);
        return res;
    }

    private void add(int x, int y, int d){
        res.add(mat[x][y]);
        use[x][y] = 1;
        int nx = x + dir[d][0];
        int ny = y + dir[d][1];
        if (nx>=0 && nx<m && ny>=0 && ny<n && use[nx][ny] != 1)
            add(nx, ny, d);
        else{
            d = (d+1) % 4;
            nx = x + dir[d][0];
            ny = y + dir[d][1];
            if (nx>=0 && nx<m && ny>=0 && ny<n && use[nx][ny] != 1)
                add(nx, ny, d);
        }
    }
}
