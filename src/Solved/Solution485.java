package Solved;

public class Solution485 {
	public int findMaxConsecutiveOnes(int[] nums) {
		int length = nums[0];
		int max = length;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == 1){
				length += 1;
			}
			else {
				max = Math.max(max, length);
				length = 0;
			}
		}
		return Math.max(max, length);
	}
}
