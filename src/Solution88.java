public class Solution88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] res = new int[m+n];
		int i1=0,i2=0;
		for (int i = 0; i < res.length; i++) {
			if (nums1[i1] < nums2[i2])
				res[i] = nums1[i1++];
			else
				res[i] = nums2[i2++];
		}
		nums1 = res;
	}
}
