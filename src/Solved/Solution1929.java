package Solved;

public class Solution1929 {
	public int[] getConcatenation(int[] nums) {
		int length = nums.length;
		int[] res = new int[length << 1];
		for (int i = 0; i < length; i++) {
			res[i] = nums[i];
			res[i + length] = nums[i];
		}
		return res;
	}
}
