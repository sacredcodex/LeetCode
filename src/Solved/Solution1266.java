package Solved;

public class Solution1266 {
	public int minTimeToVisitAllPoints(int[][] points) {
		int x = points[0][0];
		int y = points[0][1];
		int time = 0;
		for (int[] point : points){
			int x1 = point[0];
			int y1 = point[1];
			time += Math.max(Math.abs(x - x1), Math.abs(y - y1));
			x = x1;
			y = y1;
		}
		return time;
	}
}
