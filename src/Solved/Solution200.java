package Solved;

public class Solution200 {
    char[][] grid;
    public int numIslands(char[][] grid) {
        this.grid = grid;
        int m = grid.length, n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                count += dfs(i,j) > 0 ? 1 : 0;
            }
        }
        return count;
    }

    private int dfs(int i, int j){
        if (grid[i][j] == '1'){
            int area = 1;
            grid[i][j] = '0';
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
