package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution228 {
	public List<String> summaryRanges(int[] nums) {
		List<String> res = new ArrayList<>();
		if (nums.length == 0) return res;
		int begin = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if ((long)nums[i] - nums[i-1] > 1){
				if (nums[i-1] == begin)
					res.add(String.valueOf(begin));
				else {
					String str = String.valueOf(begin);
					str += "->";
					str += String.valueOf(nums[i-1]);
					res.add(str);
				}
				begin = nums[i];
			}
		}
		if (nums[nums.length-1] == begin)
			res.add(String.valueOf(begin));
		else {
			String str = String.valueOf(begin);
			str += "->";
			str += String.valueOf(nums[nums.length-1]);
			res.add(str);
		}
		return res;
	}
}
