package Solved;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Solution1030 {
	public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
		HashMap<Integer, HashSet<int[]>> hashMap = new HashMap<>();
		int maxDis = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int dis = Math.abs(i - rCenter) + Math.abs(j - cCenter);
				if (dis > maxDis) maxDis = dis;
				if (!hashMap.containsKey(dis))
					hashMap.put(dis, new HashSet<>());
				hashMap.get(dis).add(new int[]{i, j});
			}
		}
		int[][] res = new int[rows * cols][2];
		int index = 0;
		for (int i = 0; i <= maxDis; i++) {
			for (int[] point : hashMap.get(i))
				res[index ++] = point;
		}
		return res;
	}
}
