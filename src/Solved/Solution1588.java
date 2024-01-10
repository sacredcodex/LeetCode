package Solved;

public class Solution1588 {
	public int sumOddLengthSubarrays(int[] arr) {
		int length = arr.length;
		int[] weights = new int[length];
		for (int i = 0; i < length; i++) {
			int left = i + 1;
			int right = length - i;
			weights[i] += (left >> 1) * (right >> 1) + ((left + 1) >> 1) * ((right + 1) >> 1);
		}
		int res = 0;
		for (int i = 0; i < length; i++) {
			res += weights[i] * arr[i];
		}
		return res;
	}
}
