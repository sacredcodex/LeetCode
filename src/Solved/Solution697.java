package Solved;

import java.util.HashMap;
import java.util.HashSet;

public class Solution697 {
	public int findShortestSubArray(int[] nums) {
		HashMap<Integer, HashSet<Integer>> hashMap = new HashMap();
		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(nums[i])){
				hashMap.get(nums[i]).add(i);
			}else {
				HashSet<Integer> hashSet = new HashSet<>();
				hashSet.add(i);
				hashMap.put(nums[i], hashSet);
			}
		}
		int degree = 0;
		for (HashSet hashSet : hashMap.values()){
			if (degree < hashSet.size())
				degree = hashSet.size();
		}
		int length = Integer.MAX_VALUE;
		for (HashSet<Integer> hashSet : hashMap.values()){
			if (hashSet.size() == degree) {
				int max = Integer.MIN_VALUE;
				int min = Integer.MAX_VALUE;
				for (int num : hashSet) {
					if (num > max) max = num;
					if (num < min) min = num;
				}
				int l = max - min + 1;
				if (l < length)
					length = l;
			}
		}
		return length;
	}
}
