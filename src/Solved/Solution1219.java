package Solved;

public class Solution1219 {
	int max;
	int m,n;
	public int getMaximumGold(int[][] grid) {
		max = 0;
		m = grid.length;
		n = grid[0].length;
		int[][] connected = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] != 0){
					if (i > 0) connected[i-1][j] += 1;
					if (i < m-1) connected[i+1][j] += 1;
					if (j > 0) connected[i][j-1] += 1;
					if (j < n-1) connected[i][j+1] += 1;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] != 0 && connected[i][j] < 3){
					dfs(grid, 0, i, j);
				}
			}
		}
		return max;
	}
	private void dfs(int[][] grid, int count, int x, int y){
		int num = grid[x][y];
		if (num == 0) return;
		grid[x][y] = 0;
		count += num;
		if (count > max) max = count;
		if (x > 0) dfs(grid, count, x-1, y);
		if (x < m-1) dfs(grid, count, x+1, y);
		if (y > 0) dfs(grid, count, x, y-1);
		if (y < n-1) dfs(grid, count, x, y+1);
		grid[x][y] = num;
	}
}
