package Solved;

public class Solution396 {
	public int maxRotateFunction(int[] nums) {
		long f = 0;
		int sum = 0;
		int n = nums.length;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			f += nums[i] * i;
		}
		long max = f;
		for (int i = nums.length - 1; i >= 0; i--) {
			f -= nums[i] * n;
			f += sum;
			if (f > max)
				max = f;
		}
		return (int) max;

	}
}
