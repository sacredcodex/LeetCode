package Solved;

public class Solution4 {
	/**
	 * 4 寻找两个正序数列合并的中位数
	 * 进阶：O(log(m+n))
	 *      分别找两个数组的中位数，然后比较大小，中位数较小的数组保留较大的一半，中位数较大的数组保留较小的一半
	 *      重复直到确定
	 */
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int index1 = 0;
		int index2 = 0;
		int a1,a2;
		int length = nums1.length + nums2.length;
		int count = 0;
		while (count < length / 2.0 - 1){
			if (index1 < nums1.length)
				a1 = nums1[index1];
			else a1 = 10000000;
			if (index2 < nums2.length)
				a2 = nums2[index2];
			else a2 = 10000000;
			if (a1 < a2)
				index1++;
			else index2++;
			count ++;
		}
		if (index1 < nums1.length)
			a1 = nums1[index1];
		else a1 = 10000000;
		if (index2 < nums2.length)
			a2 = nums2[index2];
		else a2 = 10000000;
		if (length % 2 == 1)
			return Math.min(a1,a2);
		if (a1 < a2) {
			if (index1 + 1 < nums1.length)
				a2 = Math.min(a2, nums1[index1 + 1]);
		}else if (index2 + 1 < nums2.length)
			a1 = Math.min(a1, nums2[index2 + 1]);
		return (a1 + a2) / 2.0;
	}
}
