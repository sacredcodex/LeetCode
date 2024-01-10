package Solved;

public class Solution268 {
	public int missingNumber(int[] nums) {
		int length = nums.length;
		int expectedSum = length * (length + 1) / 2;
		for (int num : nums) {
			expectedSum -= num;
		}
		return expectedSum;
	}
}
