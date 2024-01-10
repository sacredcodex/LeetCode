package Solved;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution373 {
	public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		PriorityQueue<List<Integer>> priorityQueue = new PriorityQueue<>(new Comparator<List<Integer>>() {
			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				return o1.get(0) + o1.get(1) - o2.get(0) - o2.get(1);
			}
		});
		for (int i = 0; i < k; i++) {
			if (i == nums1.length) break;
			for (int j = 0; j < k; j++) {
				if (j == nums2.length) break;
				List<Integer> list = new ArrayList<>();
				list.add(nums1[i]);
				list.add(nums2[j]);
				priorityQueue.offer(list);
			}
		}
		List<List<Integer>> res = new ArrayList<>();
		int size = priorityQueue.size();
		for (int i = 0; i < Math.min(k, size); i++) {
			res.add(priorityQueue.poll());
		}
		return res;
	}
}