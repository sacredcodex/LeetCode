package Solved;

import java.util.Arrays;

public class Solution628 {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int res1 = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
		int res2 = nums[0] * nums[1] * nums[nums.length-1];
		boolean contain0 = false;
		for (int num : nums){
			if (num == 0){
				contain0 = true;
				break;
			}
		}
		return contain0 ? Math.max(0, Math.max(res1, res2)): Math.max(res1, res2);
	}
}
