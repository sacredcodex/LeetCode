package Solved;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution350 {
	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> hashMap1 = count(nums1);
		HashMap<Integer, Integer> hashMap2 = count(nums2);
		ArrayList<Integer> list = new ArrayList<>();
		for (int num : hashMap1.keySet()){
			int time = Math.min(hashMap1.get(num), hashMap2.getOrDefault(num, 0));
			for (int i = 0; i < time; i++) {
				list.add(num);
			}
		}
		int[] nums = new int[list.size()];
		int index = 0;
		for (int num : list)
			nums[index++] = num;
		return nums;
	}
	private HashMap<Integer, Integer> count(int[] nums){
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int num : nums){
			hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
		}
		return hashMap;
	}
}
