package Solved;

import java.util.HashSet;

public class Solution961 {
	public int repeatedNTimes(int[] nums) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int num : nums){
			if (!hashSet.add(num))
				return num;
		}
		return 0;
	}
}
