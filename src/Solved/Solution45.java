package Solved;

import java.util.Arrays;

public class Solution45 {
	public int jump(int[] nums) {
		int[] times = new int[nums.length];
		Arrays.fill(times, 10000);
		times[times.length-1] = 0;
		for (int i = nums.length - 2; i >= 0; i--) {
			int min = times[i+1];
			for (int j = 2; j <= nums[i] ; j++) {
				try {
					min = Math.min(min, times[i + j]);
				}catch(IndexOutOfBoundsException e){
					break;
				}
			}
			times[i] = min + 1;
		}
		return times[0];
	}
}
