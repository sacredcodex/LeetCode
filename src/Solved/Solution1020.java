package Solved;

public class Solution1020 {

	int m, n;
	public int numEnclaves(int[][] grid){
		m = grid.length;
		n = grid[0].length;
		for (int i = 0; i < m; i++) {
			dfs(grid, i, 0);
			dfs(grid, i, n-1);
		}
		for (int i = 0; i < n; i++) {
			dfs(grid, 0, i);
			dfs(grid, m-1, i);
		}
		int count = 0;
		for (int[] line : grid)
			for (int num : line)
				if (num == 1)
					count += 1;
		return count;
	}
	private void dfs(int[][] grid, int x, int y){
		if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0)
			return;
		grid[x][y] = 0;
		dfs(grid, x - 1, y);
		dfs(grid, x + 1, y);
		dfs(grid, x, y - 1);
		dfs(grid, x, y + 1);
	}
}
