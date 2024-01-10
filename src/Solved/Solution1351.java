package Solved;

public class Solution1351 {
	public int countNegatives(int[][] grid) {
		int count = 0;
		for (int[] row : grid){
			for (int i = row.length - 1; i >= 0; i -= 1) {
				if (row[i] < 0)
					count += 1;
				else break;
			}
		}
		return count;
	}
}
