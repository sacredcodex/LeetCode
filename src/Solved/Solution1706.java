package Solved;

public class Solution1706 {
	int[][] grid;
	public int[] findBall(int[][] grid) {
		this.grid = grid;
		int[] res = new int[grid[0].length];
		for (int i = 0; i < res.length; i++) {
			res[i] = drop(i,0);
			System.out.println(res[i]);
		}
		return res;
	}
	private int drop(int x, int y){
		if (y == grid.length)
			return x;
		int current = grid[y][x];
		x += current;
		if (x < 0 || x >= grid[0].length)
			return -1;
		int beside = grid[y][x];
		if (current != beside)
			return -1;
		return drop(x, y + 1);
	}
}
