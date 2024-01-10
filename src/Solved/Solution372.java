package Solved;

public class Solution372 {
	public int superPow(int a, int[] b) {
		a = a & 1337;
		return dfs(a,b,b.length-1);
	}
	private int dfs(int a, int[] b, int u) {
		if (u == -1) return 1;
		return power(dfs(a,b,u-1), 10) * power(a, b[u]) % 1337;
	}
	private int power(int a, int b){
		int res = 1;
		for (int i = 0; i < b; i++) {
			res = (res * a) % 1337;
		}
		return res;
	}
}
