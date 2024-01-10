package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution1447 {
	int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};

	public List<String> simplifiedFractions(int n) {
		int[] codes = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			codes[i] = code(i);
		}
		List<String> res = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if ((codes[i] & codes[j]) == 0)
					res.add(j + "/" + i);
			}
		}
		return res;
	}

	private int code(int num){
		int code = 0;
		for (int i = 0; i < 15; i++) {
			if (num % primes[i] == 0)
				code += (1<<i);
		}
		return code;
	}
}
