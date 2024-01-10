package Solved;

public class Solution1217 {
	public static int minCostToMoveChips(int[] position) {
		int odd = 0;
		int even = 0;
		for (int num : position) {
			if ((num & 1) == 1)
				odd += 1;
			else even += 1;
		}
		return Math.min(odd, even);
	}

	public static void main(String[] args) {
		System.out.println(minCostToMoveChips(new int[]{1,2,3}));
	}
}
