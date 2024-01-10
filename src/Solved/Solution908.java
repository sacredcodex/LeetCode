package Solved;

public class Solution908 {
	public int smallestRangeI(int[] nums, int k) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int num : nums){
			if (num > max) max = num;
			if (num < min) min = num;
		}
		return Math.max(max - min - (k << 1), 0);
	}
}
