package Solved;

public class Solution977 {
	public int[] sortedSquares(int[] nums) {
		int i1 = 0;
		int i2 = nums.length-1;
		int[] squares = new int[nums.length];
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i1] + nums[i2] > 0) {
				squares[i] = nums[i2] * nums[i2];
				i2--;
			}else{
				squares[i] = nums[i1] * nums[i1];
				i1++;
			}
		}
		return squares;
	}
}
