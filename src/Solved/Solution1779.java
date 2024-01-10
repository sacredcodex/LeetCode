package Solved;

public class Solution1779 {
	public int nearestValidPoint(int x, int y, int[][] points) {
		int dis = Integer.MAX_VALUE;
		int index = -1;
		for (int i = 0; i < points.length; i++) {
			int[] point = points[i];
			if (point[0] == x){
				int d = Math.abs(y - point[1]);
				if (d < dis){
					dis = d;
					index = i;
				}
			}
			else if (point[1] == y){
				int d = Math.abs(x - point[0]);
				if (d < dis) {
					dis = d;
					index = i;
				}
			}
		}
		return index;
	}
}
