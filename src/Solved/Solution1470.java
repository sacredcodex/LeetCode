package Solved;

public class Solution1470 {
	public int[] shuffle(int[] nums, int n) {
		int[] res = new int[n << 1];
		int i1 = 0;
		int i2 = n;
		for (int i = 0; i < n; i++) {
			res[2 * i] = nums[i1++];
			res[2 * i + 1] = nums[i2++];
		}
		return res;
	}
}
