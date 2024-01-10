package Solved;

import java.util.Arrays;

public class Solution689 {
	public static int[] maxSumOfThreeSubarrays(int[] nums, int k) {
		int[] subSum = new int[nums.length - k + 1];
		for (int i = 0; i < k; i++) {
			subSum[0] += nums[i];
		}
		for (int i = 1; i < subSum.length; i++) {
			subSum[i] = subSum[i-1] + nums[i+k-1] - nums[i-1];
		}
		int[] pref = new int[subSum.length - k];
		pref[0] = subSum[0];
		for (int i = 1; i < pref.length; i++) {
			pref[i] = Math.max(pref[i-1], subSum[i]);
		}
		int[] suf = new int[pref.length];
		suf[suf.length-1] = subSum[subSum.length-1];
		for (int i = 1; i < suf.length; i++) {
			suf[suf.length-i-1] = Math.max(suf[suf.length-i], subSum[subSum.length-i-1]);
		}
		int sum = 0;
		int index = 0;
		for (int i = k; i < subSum.length-k; i++) {
			int total = subSum[i] + pref[i-k] + suf[i];
			if (total>sum){
				sum = total;
				index = i;
			}
		}
		int[] indexs = new int[3];
		indexs[1] = index;
		for (int i = 0; i < subSum.length; i++) {
			if (subSum[i] == pref[index-k]) {
				indexs[0] = i;
				break;
			}
		}
		for (int i = index + k; i < subSum.length; i++) {
			if (subSum[i] == suf[index]){
				indexs[2] = i;
				break;
			}
		}
		return indexs;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(maxSumOfThreeSubarrays(new int[]{1, 2, 1, 2, 6, 7, 5, 1}, 2)));
	}
}
