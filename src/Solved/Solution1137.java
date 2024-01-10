package Solved;

public class Solution1137 {
	public int tribonacci(int n) {
		/*
		return (n == 0) ? 0 : (n == 1) ? 1 : (n == 2) ? 1 : tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
		超时
		 */
		if (n == 0) return 0;
		if (n == 1) return 1;
		if (n == 2) return 1;
		int a1 = 0;
		int a2 = 1;
		int a3 = 1;
		for (int i = 3; i < n+1; i++) {
			int tri = a1 + a2 + a3;
			a1 = a2;
			a2 = a3;
			a3 = tri;
		}
		return a3;
	}
}
