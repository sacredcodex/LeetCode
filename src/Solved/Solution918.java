package Solved;

public class Solution918 {
	public int maxSubArray(int[] nums) {
		int max = 0;
		int res = nums[0];
		for (int num : nums) {
			max = Math.max(max, 0) + num;
			res = Math.max(res, max);
		}
		return res;
	}
	public int maxSubarraySumCircular(int[] nums) {
		int sum = 0;
		int maxSub = maxSubArray(nums);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			nums[i] = -nums[i];
		}
		int minSub = sum + maxSubArray(nums);
		int res = Math.max(maxSub, minSub);
		if (res > 0) return res;
		else return maxSub;
	}
}
