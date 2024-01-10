package Solved;

public class Solution892 {
	public int surfaceArea(int[][] grid) {
		int surface = 0;
		int n = grid.length;
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {
				int num = grid[x][y];
				if (num > 0){
					surface += 2;
					if (x == 0){
						surface += num;
					}else {
						surface += Math.max(0, num - grid[x-1][y]);
					}
					if (x == n-1){
						surface += num;
					}else {
						surface += Math.max(0, num - grid[x+1][y]);
					}
					if (y == 0){
						surface += num;
					}else {
						surface += Math.max(0, num - grid[x][y-1]);
					}
					if (y == n-1){
						surface += num;
					}else {
						surface += Math.max(0, num - grid[x][y+1]);
					}
				}
			}
		}
		return surface;
	}
}
