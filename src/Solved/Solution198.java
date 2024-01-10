package Solved;

public class Solution198 {
	public int rob(int[] nums) {
		if (nums.length == 1) return nums[0];
		if (nums.length == 2) return Math.max(nums[0], nums[1]);
		int[] sums = new int[nums.length];
		sums[0] = nums[0];
		sums[1] = nums[1];
		sums[2] = sums[0] + nums[2];
		for (int i = 3; i < sums.length; i++) {
			sums[i] = nums[i] + Math.max(sums[i-2], sums[i-3]);
		}
		return Math.max(sums[sums.length-1], sums[sums.length-2]);
	}
}
