package Solved;

public class solution1304 {
	public int[] sumZero(int n) {
		int[] res = new int[n];
		int index = 0;
		for (int i = 1 - n; i < n; i += 2) {
			res[index++] = i;
		}
		return res;
	}
}
