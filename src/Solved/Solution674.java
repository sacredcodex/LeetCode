package Solved;

public class Solution674 {
	public int findLengthOfLCIS(int[] nums) {
		int length = 1;
		int max = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i-1]){
				length += 1;
			}else {
				max = Math.max(max, length);
				length = 1;
			}
		}
		return Math.max(max, length);
	}
}
