package Solved;

public class Solution739 {
	public int[] dailyTemperatures(int[] temperatures) {
		int n = temperatures.length;
		int[] res = new int[n];
		for (int i = n - 2; i >= 0; i -= 1) {
			if (temperatures[i] >= temperatures[i + 1]){
				if (res[i+1] == 0)
					res[i] = 0;
				else res[i] = res[i+1] + 1;
			}else
				res[i] = 1;
		}

		return res;

	}

}
