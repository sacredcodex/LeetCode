package Solved;

import java.util.List;

public class Solution120 {
	public int minimumTotal(List<List<Integer>> triangle) {
		int[][] cost = new int[triangle.size()][];
		for (int i = 0; i < cost.length; i++) {
			cost[i] = new int[i+1];
		}
		cost[0][0] = triangle.get(0).get(0);
		for (int i = 1; i < cost.length; i++) {
			cost[i][0] = triangle.get(i).get(0) + cost[i-1][0];
			cost[i][i] = triangle.get(i).get(i) + cost[i-1][i-1];
			for (int j = 1; j < i; j++) {
				cost[i][j] = triangle.get(i).get(j) + Math.min(cost[i-1][j-1], cost[i-1][j]);
			}
		}
		int min = cost[cost.length-1][0];
		for (int i = 1; i < cost.length; i++) {
			if (min > cost[cost.length-1][i])
				min = cost[cost.length-1][i];
		}
		return min;
	}

}
