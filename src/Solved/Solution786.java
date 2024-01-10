package Solved;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution786 {
	public int[] kthSmallestPrimeFraction(int[] arr, int k) {
		PriorityQueue<int[]> buffer = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[1]*o1[0] - o2[0]*o1[1];
			}
		});
		int[] index = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int[] num = {arr[index[i]],arr[i],i};
			buffer.offer(num);
		}
		while (k-->=0){
			int[] num = buffer.poll();
			System.out.println(num[0]+"/"+num[1]);
			num[0] = arr[++index[num[2]]];
			buffer.offer(num);
		}
		int[] num = buffer.poll();
		int[] res = {num[0], num[1]};
		return res;
	}
}
