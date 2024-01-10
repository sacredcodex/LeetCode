package Solved;

public class Solution807 {
	public int maxIncreaseKeepingSkyline(int[][] grid) {
		int[] skyLine1 = new int[grid.length];
		int[] skyLine2 = new int[grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				skyLine1[i] = Math.max(skyLine1[i], grid[i][j]);
				skyLine2[j] = Math.max(skyLine2[j], grid[i][j]);
			}
		}
		int increase = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				increase += Math.min(skyLine1[i], skyLine2[j]) - grid[i][j];
			}
		}
		return increase;
	}
}
