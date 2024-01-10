package Solved;

import java.util.HashSet;

public class Solution349 {
	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> hashSet1 = toSet(nums1);
		HashSet<Integer> hashSet2 = toSet(nums2);
		hashSet1.retainAll(hashSet2);
		int[] res = new int[hashSet1.size()];
		int index = 0;
		for (int num : hashSet1){
			res[index++] = num;
		}
		return res;
	}
	private HashSet<Integer> toSet(int[] nums){
		HashSet<Integer> hashSet = new HashSet<>();
		for (int num : nums)
			hashSet.add(num);
		return hashSet;
	}
}
