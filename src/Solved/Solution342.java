package Solved;

public class Solution342 {
	public boolean isPowerOfFour(int n) {
		return n > 0 && (n & 0xaaaaaaaa) == 0 && (n & (n-1)) == 0;
	}
}
