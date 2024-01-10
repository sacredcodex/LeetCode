package Solved;

public class Solution1909 {
	public boolean canBeIncreasing(int[] nums) {
		int idx = -1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] <= nums[i-1])
				if (idx == -1)
					idx = i;
				else return false;
		}
		if (idx == -1 || idx == 1 || idx == nums.length -1)
			return true;
		else
			return nums[idx+1] > nums[idx-1] || nums[idx] > nums[idx-2];
	}
}
