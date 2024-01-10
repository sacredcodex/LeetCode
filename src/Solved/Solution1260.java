package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution1260 {
	public List<List<Integer>> shiftGrid(int[][] grid, int k) {
		int m = grid.length;
		int n = grid[0].length;
		k %= m * n;
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				int num = i * n + j;
				num -= k;
				if (num < 0) num += m * n;
				int x = num / n;
				int y = num % n;
				list.add(grid[x][y]);
			}
			res.add(list);
		}
		return res;
	}
}
