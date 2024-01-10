package Solved;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution1765 {
	public static int[][] highestPeak(int[][] isWater) {
		int m = isWater.length;
		int n = isWater[0].length;
		Queue<int[]> queue = new LinkedList<>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (isWater[i][j] == 1) {
					queue.offer(new int[]{i, j});
					isWater[i][j] = 0;
				}
				else isWater[i][j] = -1;
			}
		}
		int height = 0;
		while(!queue.isEmpty()){
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int[] position = queue.poll();
				if (position == null) continue;
				int x = position[0];
				int y = position[1];
				if (isWater[x][y] > 0) continue;
				if (x > 0 && isWater[x-1][y] == -1)
					queue.offer(new int[]{x-1, y});
				if (x < m-1 && isWater[x+1][y] == -1)
					queue.offer(new int[]{x+1, y});
				if (y > 0 && isWater[x][y-1] == -1)
					queue.offer(new int[]{x, y-1});
				if (y < n-1 && isWater[x][y+1] == -1)
					queue.offer(new int[]{x, y+1});
				isWater[x][y] = height;
			}
			height += 1;
		}
		return isWater;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(highestPeak(new int[][]{{0, 0, 1}, {1, 0, 0}, {0, 0, 0}})));
	}
}
