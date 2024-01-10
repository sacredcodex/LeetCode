package Solved;

public class Solution413 {
	public int numberOfArithmeticSlices(int[] nums) {
		if (nums.length < 3) return 0;
		int number = 0;
		int sum = 0;
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] + nums[i-2] == 2 * nums[i-1])
				number += 1;
			else number = 0;
			sum += number;
		}
		return sum;
	}
}
