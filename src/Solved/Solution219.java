package Solved;

import java.util.HashSet;

public class Solution219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if (k > nums.length - 1)
			k = nums.length - 1;
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i = 0; i <= k; i++) {
			if (!hashSet.add(nums[i]))
				return true;
		}
		for (int i = k+1; i < nums.length; i++) {
			hashSet.remove(nums[i-k-1]);
			if (!hashSet.add(nums[i]))
				return true;
		}
		return false;
	}
}
