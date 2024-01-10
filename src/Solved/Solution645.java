package Solved;

import java.util.HashSet;

public class Solution645 {
	public int[] findErrorNums(int[] nums) {
		HashSet<Integer> hashSet = new HashSet<>();
		int repeat = 0;
		int sum = nums.length * (nums.length+1) / 2;
		for (int num : nums){
			if (hashSet.add(num))
				sum -= num;
			else repeat = num;
		}
		return new int[]{repeat, sum};
	}
}
