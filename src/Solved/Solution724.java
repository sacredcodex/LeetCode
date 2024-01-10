package Solved;

public class Solution724 {
	public int pivotIndex(int[] nums) {
		int[] left = new int[nums.length];
		left[0] = 0;
		for (int i = 1; i < nums.length; i++) {
			left[i] = left[i-1] + nums[i-1];
		}
		int sum = left[left.length - 1] + nums[nums.length - 1];
		for (int i = 0; i < left.length; i++) {
			if (left[i] << 1 == sum - nums[i])
				return i;
		}
		return -1;
	}
}
