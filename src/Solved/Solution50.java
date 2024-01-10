package Solved;

import java.math.BigDecimal;

public class Solution50 {
	public double myPow(double x, int n) {
		if (x >= 2 && n == Integer.MIN_VALUE) return 0;
		if (n < 0){
			n = -n;
			x = 1 / x;
		}
		double[] dic = new double[32];
		dic[0] = 1;
		dic[1] = x;
		for (int i = 2; i < 32; i++) {
			dic[i] = dic[i-1] * dic[i-1];
		}
		long m = Math.abs(n);
		double res = 1;
		int index = 1;
		while (m > 0){
			if ((m & 1) == 1)
				res *= dic[index];
			m >>= 1;
			index ++;
		}
		return res;

	}
}
