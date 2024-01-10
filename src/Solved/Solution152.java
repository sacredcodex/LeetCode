package Solved;

public class Solution152 {
	public int maxProduct(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		int res = max;
		for (int i = 1; i < nums.length; i++) {
			int mx = max, mn = min;
			max = Math.max(nums[i], Math.max(mx * nums[i], mn * nums[i]));
			min = Math.min(nums[i], Math.min(mx * nums[i], mn * nums[i]));
			res = Math.max(max, res);
		}
		return res;
	}
}
