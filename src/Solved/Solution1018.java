package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution1018 {
	public List<Boolean> prefixesDivBy5(int[] nums) {
		List<Boolean> res = new ArrayList<>();
		int num = nums[0];
		res.add(num == 0);
		for (int i = 1; i < nums.length; i++) {
			num = 2 * num + nums[i];
			num %= 5;
			res.add(num == 0);
		}
		return res;
	}
}
