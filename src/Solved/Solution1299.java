package Solved;

public class Solution1299 {
	public int[] replaceElements(int[] arr) {
		int[] res = new int[arr.length];
		res[res.length - 1] = -1;
		for (int i = res.length - 2; i >= 0; i -= 1) {
			res[i] = Math.max(res[i + 1], arr[i+1]);
		}
		return res;
	}
}
