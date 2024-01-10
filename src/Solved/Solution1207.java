package Solved;

import java.util.HashMap;
import java.util.HashSet;

public class Solution1207 {
	public boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> count = new HashMap<>();
		for (int num : arr){
			count.put(num, count.getOrDefault(num, 0) + 1);
		}
		HashSet<Integer> set = new HashSet<>();
		for (int num : count.values())
			if (!set.add(num))
				return false;
		return true;
	}
}
