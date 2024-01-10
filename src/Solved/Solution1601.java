package Solved;

public class Solution1601 {
	int n;
	int[] state;
	int num;
	int res;
	int[][] requests;
	public int maximumRequests(int n, int[][] requests) {
		this.requests = requests;
		this.n = n;
		state = new int[n];
		num = 0;
		dfs(0);
		return res;
	}

	private void dfs(int cur){
		boolean flag = true;
		for (int e : state)
			if (e != 0){
				flag = false;
				break;
			}
		if (flag) res = Math.max(res, num);
		if (cur < requests.length){
			state[requests[cur][0]] += 1;
			state[requests[cur][1]] -= 1;
			num += 1;
			dfs(cur + 1);
			state[requests[cur][0]] -= 1;
			state[requests[cur][1]] += 1;
			num -= 1;
			dfs(cur + 1);
		}
	}
}
