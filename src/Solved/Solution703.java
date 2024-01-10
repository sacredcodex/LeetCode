package Solved;

import java.util.PriorityQueue;

public class Solution703 {
	class KthLargest {

		PriorityQueue<Integer> priorityQueue;
		int length;

		public KthLargest(int k, int[] nums) {
			priorityQueue = new PriorityQueue<>();
			length = k;
			for (int num : nums){
				priorityQueue.offer(num);
				if (priorityQueue.size() > k)
					priorityQueue.poll();
			}
		}

		public int add(int val) {
			priorityQueue.offer(val);
			if (priorityQueue.size() > length)
				priorityQueue.poll();
			int res = priorityQueue.poll();
			priorityQueue.offer(res);
			return res;
		}
	}
}
