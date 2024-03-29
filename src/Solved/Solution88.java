package Solved;

public class Solution88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i1=m-1,i2=n-1;
		int idx = m + n - 1;
		while(i2 >= 0){
			if (i1 >= 0){
				if (nums1[i1] < nums2[i2]){
					nums1[idx--] = nums2[i2--];
				}else {
					nums1[idx--] = nums1[i1--];
				}
			}else {
				nums1[idx--] = nums2[i2--];
			}
		}
	}
}
