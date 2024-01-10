package Solved;

import java.util.Arrays;
import java.util.Comparator;

public class Solution496 {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] res = new int[nums1.length];
		Arrays.fill(res, -1);
		for (int i = 0; i < nums1.length; i++) {
			int index = 0;
			for (index = 0; index < nums2.length; index += 1){
				if (nums2[index] == nums1[i])
					break;
			}
			for (int j = index + 1; j < nums2.length; j++) {
				if (nums2[j] > nums1[i]){
					res[i] = nums2[j];
					break;
				}
			}
		}
		return res;
	}
}
