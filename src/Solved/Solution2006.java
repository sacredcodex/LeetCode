package Solved;

public class Solution2006 {
	public int countKDifference(int[] nums, int k) {
		int[] count = new int[100];
		for (int num : nums)
			count[num - 1] += 1;
		int res = 0;
		for (int i = 0; i < 100 - k; i++) {
			res += count[i] * count[i+k];
		}
		return res;
	}
}
