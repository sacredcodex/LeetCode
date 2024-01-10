package Solved;

import java.util.LinkedList;

public class Solution346 {
	class MovingAverage {

		LinkedList<Integer> list = new LinkedList<>();
		int sum = 0;
		int size;

		public MovingAverage(int size) {
			this.size = size;
		}

		public double next(int val) {
			sum += val;
			list.add(val);
			if (list.size() > size)
				sum -= list.remove(0);
			return (double) sum / list.size();
		}
	}
}
