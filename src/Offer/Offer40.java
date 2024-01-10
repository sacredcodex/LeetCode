package Offer;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Offer40 {
	public int[] getLeastNumbers(int[] arr, int k) {
		PriorityQueue<Integer> mins = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		if (k == 0) return new int[0];
 		for (int i = 0; i < k; i++) {
			mins.offer(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if (mins.peek() > arr[i]) {
				mins.remove(mins.peek());
				mins.offer(arr[i]);
			}
		}
		int[] res = new int[k];
		for (int i = 0; i < k; i++) {
			res[i] = mins.poll();
		}
		return res;
	}
}
