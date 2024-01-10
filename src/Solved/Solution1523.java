package Solved;

public class Solution1523 {
	public static int countOdds(int low, int high) {
		int res = (high - low) >> 1;
		return ((low & 1) == 1 || (high & 1) == 1) ? 1 + res : res;
	}

	public static void main(String[] args) {
		System.out.println(countOdds(3,7));
	}
}
