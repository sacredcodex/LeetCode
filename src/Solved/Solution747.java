package Solved;

import java.util.Arrays;

public class Solution747 {
	public int dominantIndex(int[] nums) {
		if (nums.length < 2) return 0;
		int first = 0;
		int second = 0;
		int index = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > first){
				second = first;
				first = nums[i];
				index = i;
			}else if (nums[i] > second){
				second = nums[i];
			}
		}
		if (first >= second<<1)
			return index;
		else return -1;
	}
}
