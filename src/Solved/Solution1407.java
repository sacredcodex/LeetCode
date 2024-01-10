package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution1407 {
	public List<Integer> minSubsequence(int[] nums) {
		Arrays.sort(nums);
		int sum = 0 ;
		for (int num : nums){
			sum += num;
		}
		sum >>= 1;
		int current = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = nums.length - 1; i >= 0; i -= 1) {
			if (current > sum)
				return list;
			else{
				list.add(nums[i]);
				current += nums[i];
			}
		}
		return list;
	}

}
