package Solved;

public class Solution258 {
	public int addDigits(int num) {
		if (num < 10) return num;
		int res = num % 9;
		if (res == 0) return 9;
		else return res;
	}
}
