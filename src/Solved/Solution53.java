package Solved;

public class Solution53 {
	public int maxSubArray(int[] nums) {
		int max = 0;
		int res = nums[0];
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, 0) + nums[i];
			res = Math.max(res, max);
		}
		return res;
	}
}
