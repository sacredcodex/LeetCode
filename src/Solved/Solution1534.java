package Solved;

public class Solution1534 {
	public int countGoodTriplets(int[] arr, int a, int b, int c) {
		int res = 0;
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				for (int k = j + 1; k < length; k++) {
					if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[k] - arr[j]) <= b && Math.abs(arr[i] - arr[k]) <= c)
						res += 1;
				}
			}
		}
		return res;
	}
}
