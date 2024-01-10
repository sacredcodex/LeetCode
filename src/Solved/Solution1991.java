package Solved;

public class Solution1991 {
	public int findMiddleIndex(int[] nums) {
		int[] left = new int[nums.length];
		left[0] = 0;
		for (int i = 1; i < nums.length; i++) {
			left[i] = left[i-1] + nums[i-1];
		}
		int[] right = new int[nums.length];
		right[right.length - 1] = 0;
		for (int i = right.length - 2; i >= 0; i -= 1) {
			right[i] = right[i+1] + nums[i+1];
		}
		for (int i = 0; i < left.length; i++) {
			if (left[i] == right[i])
				return i;
		}
		return -1;
	}
}
