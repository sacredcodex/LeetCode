package Solved;

import java.util.Arrays;

public class Solution1984 {
	public int minimumDifference(int[] nums, int k) {
		Arrays.sort(nums);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length - k + 1; i++) {
			min = Math.min(min, nums[i + k - 1] - nums[i]);
		}
		return min;
	}
}
