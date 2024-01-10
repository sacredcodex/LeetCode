package Solved;

public class Solution883 {
	public int projectionArea(int[][] grid) {
		int count = 0;
		for (int[] ints : grid) {
			int max = 0;
			for (int j = 0; j < grid[0].length; j++) {
				if (ints[j] > 0) {
					count += 1;
					if (ints[j] > max)
						max = ints[j];
				}
			}
			count += max;
		}
		for (int i = 0; i < grid[0].length; i++) {
			int max = 0;
			for (int[] ints : grid) {
				if (ints[i] > max)
					max = ints[i];
			}
			count += max;
		}
		return count;
	}
}
