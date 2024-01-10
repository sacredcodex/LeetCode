package Solved;

import java.util.PriorityQueue;

public class Solution1005 {
	public int largestSumAfterKNegations(int[] nums, int k) {
		PriorityQueue negatives = new PriorityQueue();
		int positive = 0;
		int min_positive = 101;
		for (int num : nums) {
			if (num <= 0)
				negatives.offer(num);
			else{
				positive += num;
				min_positive = Math.min(num, min_positive);
			}
		}
		if (negatives.size()==0)
			if ((k & 1) == 1)
				return positive - 2 * min_positive;
			else
				return positive;
		else if (negatives.size() >= k) {
			for (int i = 0; i < k; i++) {
				positive -= (int) negatives.poll();
			}
			while (!negatives.isEmpty())
				positive += (int) negatives.poll();
		}else {
			int more = k - negatives.size();
			while (negatives.size() > 1)
				positive -= (int) negatives.poll();
			int max_negative = (int) negatives.poll();
			positive -= max_negative;
			min_positive = Math.min(min_positive, -max_negative);
			if ((more & 1) == 1)
				return positive - 2 * min_positive;
		}
		return positive;
	}
}
