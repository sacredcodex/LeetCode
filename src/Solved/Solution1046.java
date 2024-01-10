package Solved;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution1046 {
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		for (int stone : stones)
			priorityQueue.offer(stone);
		while (priorityQueue.size() > 1){
			int a = priorityQueue.poll();
			int b = priorityQueue.poll();
			a -= b;
			if (a > 0)
				priorityQueue.offer(a);
		}
		return priorityQueue.isEmpty()? 0 : priorityQueue.poll();
	}
}
