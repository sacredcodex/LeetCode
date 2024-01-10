package Solved;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution630 {
	public int scheduleCourse(int[][] courses) {
		Arrays.sort(courses, (a,b)->a[1]-b[1]);
		PriorityQueue<Integer> q = new PriorityQueue<>((a, b)->b-a);
		int sum = 0;
		for (int[] c : courses) {
			int d = c[0], e = c[1];
			sum += d;
			q.add(d);
			if (sum > e) sum -= q.poll();
		}
		return q.size();
	}
}