package Solved;

public class Solution1848 {
	public int getMinDistance(int[] nums, int target, int start) {
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target)
				res = Math.min(res, Math.abs(start - i));
		}
		return res;
	}
}
