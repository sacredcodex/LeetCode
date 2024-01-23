package Solved;

public class Solution463 {
	public int islandPerimeter(int[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1){
					if (i == 0 || grid[i-1][j] == 0)
						count += 1;
					if (i == grid.length - 1 || grid[i+1][j] == 0)
						count += 1;
					if (j == 0 || grid[i][j-1] == 0)
						count += 1;
					if (j == grid[0].length - 1 || grid[i][j+1] == 0)
						count += 1;
				}
			}
		}
		return count;
	}
	public int islandPerimeter1(int[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 0) continue;
				if (i == 0 && i == grid.length - 1){
					count += 2;
				}else if (i == 0){
					count += 1;
					count += 1 - grid[i+1][j];
				}else if (i == grid.length - 1){
					count += 1;
					count += 1 - grid[i-1][j];
				}else {
					count += 1 - grid[i+1][j];
					count += 1 - grid[i-1][j];
				}
				if (j == 0 && j == grid[0].length - 1){
					count += 2;
				}else if (j == 0){
					count += 1;
					count += 1 - grid[i][j+1];
				}else if (j == grid[0].length - 1){
					count += 1;
					count += 1 - grid[i][j-1];
				}else {
					count += 1 - grid[i][j+1];
					count += 1 - grid[i][j-1];
				}
			}
		}
		return count;
	}
}
