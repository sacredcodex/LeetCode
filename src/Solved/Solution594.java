package Solved;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution594 {
	public int findLHS(int[] nums) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int num : nums)
			hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
		int length = 0;
		for (int num : hashMap.keySet()){
			if (hashMap.containsKey(num+1))
				length = Math.max(length, hashMap.get(num) + hashMap.get(num + 1));
		}
		return length;
	}
}
