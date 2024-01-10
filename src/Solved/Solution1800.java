package Solved;

import java.util.Arrays;

public class Solution1800 {
	public int maxAscendingSum(int[] nums) {
		int[] res = Arrays.copyOf(nums, nums.length);
		for (int i = 1; i < nums.length; i++) {
			int j = i - 1;
			if (nums[j] < nums[i])
				res[i] += res[j];
		}
		int max = 0;
		for (int e : res)
			if (e > max)
				max = e;
		return max;
	}
}
