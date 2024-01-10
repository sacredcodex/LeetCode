package Solved;

public class Solution2013 {
	class DetectSquares {

		int[][] points;

		public DetectSquares() {
			points = new int[1001][1001];
		}

		public void add(int[] point) {
			points[point[0]][point[1]] += 1;
		}

		public int count(int[] point) {
			int sum = 0;
			int x = point[0];
			int y = point[1];
			for (int i = 0; i < 1001; i++) {
				if (points[x][i] > 0){
					int a = points[x][i];
					int b = 0, c = 0;
					int length = Math.abs(y - i);
					if (length == 0) continue;
					int y1 = x - length;
					int y2 = x + length;
					if (y1 >= 0 && y1 < 1001) {
						b = points[y1][i];
						c = points[y1][y];
					}
					sum += a * b * c;
					b = 0; c = 0;
					if (y2 >= 0 && y2 < 1001) {
						b = points[y2][i];
						c = points[y2][y];
					}
					sum += a * b * c;
				}
			}
			return sum;
		}
	}
}
