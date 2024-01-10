package Solved;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution1705 {
	public int eatenApples(int[] apples, int[] days) {
		PriorityQueue<Integer[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
		for (int i = 0; i < apples.length; i += 1) {
			Integer[] element = {apples[i] , days[i]};
			priorityQueue.offer(element);
			for (Integer[] e : priorityQueue){
				e[1] -= 1;
			}
		}
		return -1;
	}
}
