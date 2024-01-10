package Solved;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		HashSet<Integer> hashSet = new HashSet<>();
		int n = nums.length;
		for (int i = 1; i <= n; i++)
			hashSet.add(i);
		for (int num : nums)
			hashSet.remove(num);
		return new ArrayList<>(hashSet);
	}
}
