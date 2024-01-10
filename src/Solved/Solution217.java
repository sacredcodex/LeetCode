package Solved;

import java.util.HashSet;

public class Solution217 {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> numSet = new HashSet<>();
		for (int num : nums) {
			if (!numSet.add(num))
				return true;
		}
		return false;
	}
}
