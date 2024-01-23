package Solved;

public class Solution695 {

    int[][] grid;
    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        int m = grid.length, n = grid[0].length;
        int maxArea = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxArea = Math.max(dfs(i,j), maxArea);
            }
        }
        return maxArea;
    }

    private int dfs(int i, int j){
        if (grid[i][j] == 1){
            int area = 1;
            grid[i][j] = 0;
            if (i>0)
                area += dfs(i-1, j);
            if (i < grid.length - 1)
                area += dfs(i+1, j);
            if (j>0)
                area += dfs(i, j-1);
            if (j < grid[0].length - 1)
                area += dfs(i, j+1);
            return area;
        }else return 0;
    }
}
