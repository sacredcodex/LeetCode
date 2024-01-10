package Solved;

public class Solution1716 {
	public int totalMoney(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += i / 7 + i % 7;
		}
		return sum;
	}
}
