package Offer;

import java.util.HashSet;
import java.util.Set;

public class Offer56 {
	public int[] singleNumbersI(int[] nums) {
		Set<Integer> nums1 = new HashSet<>();
		Set<Integer> nums2 = new HashSet<>();
		for (int num : nums){
			if (!nums1.add(num))
				nums2.add(num);
		}
		nums1.removeAll(nums2);
		int[] res = new int[nums1.size()];
		int index = 0;
		for (int num : nums1)
			res[index++] = num;
		return res;
	}
	public int singleNumberII(int[] nums) {
		Set<Integer> nums1 = new HashSet<>();
		Set<Integer> nums2 = new HashSet<>();
		for (int num : nums){
			if (!nums1.add(num))
				nums2.add(num);
		}
		nums1.removeAll(nums2);
		for (int num : nums1)
			return num;
		return 0;
	}
}
