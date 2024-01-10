package Solved;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Solution1636 {
	HashMap<Integer, Integer> hashMap = new HashMap<>();
	public int[] frequencySort(int[] nums) {
		Integer[] copy = new Integer[nums.length];
		int index = 0;
		for (int num : nums) {
			copy[index++] = num;
			hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
		}
		Arrays.sort(copy, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int val1 = hashMap.get(o1);
				int val2 = hashMap.get(o2);
				if (val1 != val2)
					return val1 - val2;
				else return o2 - o1;
			}
		});
		index = 0;
		for (Integer n : copy)
			nums[index ++] = n;
		return nums;
	}
}
