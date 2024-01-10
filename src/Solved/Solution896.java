package Solved;

public class Solution896 {
	public boolean isMonotonic(int[] nums) {
		boolean increase = (nums[0] < nums[nums.length - 1]);
		if (increase){
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] > nums[i+1])
					return false;
			}
		}else {
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] < nums[i+1])
					return false;
			}
		}
		return true;
	}
}
