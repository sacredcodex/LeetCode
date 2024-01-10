package Solved;

import java.util.Arrays;

public class Solution300 {
	public int lengthOfLIS(int[] nums) {
		int[] length = new int[nums.length];
		int maxres = 1;
		Arrays.fill(length, 1);
		for (int i = 1; i < length.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i])
					length[i] = Math.max(length[j] + 1, length[i]);
			}
			maxres = Math.max(maxres, length[i]);
		}
		return maxres;
	}
}
