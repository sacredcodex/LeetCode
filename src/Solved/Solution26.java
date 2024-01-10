package Solved;

public class Solution26 {
	public int removeDuplicates(int[] nums) {
		int i1 = 1;
		int i2 = 1;
		while (i2 < nums.length) {
			if (nums[i2] != nums[i1-1])
				nums[i1++] = nums[i2++];
			else
				i2 += 1;
		}
		return i1;
	}
}
