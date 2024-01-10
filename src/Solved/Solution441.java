package Solved;

public class Solution441 {
	public int arrangeCoins(int n) {
		return (int)(Math.sqrt(1 + 8 * (double) n) - 1) >> 1;
	}
}
