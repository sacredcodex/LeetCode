package Solved;

import java.util.HashSet;

public class Solution136 {
	public int singleNumber(int[] nums) {
		int res = 0;
		for (int num : nums)
			res ^= num;
		return res;
	}
}
