package Solved;

import java.util.Arrays;

public class Solution475 {
	public int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(houses);
		Arrays.sort(heaters);
		int maxDis = 0;
		for (int i = 0, j = 0; i < houses.length; i++) {
			int dis = Math.abs(houses[i] - heaters[j]);
			while (j < heaters.length - 1 && Math.abs(houses[i] - heaters[j]) >= Math.abs(houses[i] - heaters[j+1])) {
				j += 1;
				dis = Math.abs(houses[i] - heaters[j]);
			}
			maxDis = Math.max(maxDis, dis);
		}
		return maxDis;
	}
}
