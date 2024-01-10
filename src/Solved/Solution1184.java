package Solved;

public class Solution1184 {
	public int distanceBetweenBusStops(int[] distance, int start, int destination) {
		int dis1 = 0, dis2 = 0;
		if (start > destination){
			int a = start;
			start = destination;
			destination = a;
		}
		for (int i = 0; i < start; i++) {
			dis2 += distance[i];
		}
		for (int i = start; i < destination; i++) {
			dis1 += distance[i];
		}
		for (int i = destination; i < distance.length; i++) {
			dis2 += distance[i];
		}
		return Math.min(dis1, dis2);
	}
}
