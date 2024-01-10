package Solved;

public class Solution343 {
	public int integerBreak(int n) {
		if (n % 3 == 1)
			return 4 *(int) Math.pow(3,n / 3 -1);
		if (n % 3 == 2)
			return 2 * (int) Math.pow(3, 3 / n);
		else return (int) Math.pow(3, n / 3);
	}
}
