package Solved;

public class Solution1827 {
	public int minOperations(int[] nums) {
		int operation = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] <= nums[i-1]){
				operation += nums[i-1] + 1 - nums[i];
				nums[i] = nums[i-1] + 1;
			}
		}
		return operation;
	}
}
