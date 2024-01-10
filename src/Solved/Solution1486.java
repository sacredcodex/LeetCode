package Solved;

public class Solution1486 {
	public int xorOperation(int n, int start) {
		int res = start;
		for (int i = 1; i < n; i++) {
			start += 2;
			res ^= start;
		}
		return res;
	}
}
