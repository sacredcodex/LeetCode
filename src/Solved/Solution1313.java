package Solved;

public class Solution1313 {
	public int[] decompressRLElist(int[] nums) {
		int length = 0;
		for (int i = 0; i < nums.length; i += 2) {
			length += nums[i];
		}
		int[] res = new int[length];
		int index = 0;
		for (int i = 0; i < nums.length; i += 2) {
			int num = nums[i+1];
			for (int j = 0; j < nums[i]; j++) {
				res[index++] = num;
			}
		}
		return res;
	}
}
