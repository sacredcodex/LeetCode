package Solved;

import java.util.HashMap;
import java.util.HashSet;

public class Solution1748 {
	public int sumOfUnique(int[] nums) {
		int count = 0;
		int[] counts = new int[101];
		for (int num : nums)
			counts[num] += 1;
		for (int i = 1; i < 101; i++)
			if (counts[i] == 1)
				count += i;
		return count;

		/*
		int count = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int num : nums)
			hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
		for (int key : hashMap.keySet())
			if (hashMap.get(key) == 1)
				count += key;
		return count;
		 */
	}
}
