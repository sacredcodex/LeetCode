package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution386 {
	List<Integer> res = new ArrayList<>();
	int n;
	public List<Integer> lexicalOrder(int n) {
		this.n = n;
		res.add(0);
		dfs(1);
		dfs(2);
		dfs(3);
		dfs(4);
		dfs(5);
		dfs(6);
		dfs(7);
		dfs(8);
		dfs(9);
		return res;
	}
	private void dfs(int num){
		if (num <= n) {
			res.add(num);
			num *= 10;
			dfs(num);
			dfs(num + 1);
			dfs(num + 2);
			dfs(num + 3);
			dfs(num + 4);
			dfs(num + 5);
			dfs(num + 6);
			dfs(num + 7);
			dfs(num + 8);
			dfs(num + 9);
		}
	}
}
