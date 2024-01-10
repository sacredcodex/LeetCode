package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution163 {

	private List<String> res = new ArrayList<>();

	public List<String> findMissingRanges(int[] nums, int lower, int upper) {
		Arrays.sort(nums);
		if (nums.length == 0){
			add(lower, upper);
			return res;
		}
		add(lower, nums[0] - 1);
		for (int i = 0; i < nums.length - 1; i++) {
			add(nums[i] + 1, nums[i + 1] - 1);
		}
		add(nums[nums.length - 1] + 1, upper);
		return res;
	}

	private void add(int begin, int end){
		if (begin == end)
			res.add(String.valueOf(begin));
		if (begin < end){
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(begin);
			stringBuilder.append("->");
			stringBuilder.append(end);
			res.add(stringBuilder.toString());
		}
	}
}
