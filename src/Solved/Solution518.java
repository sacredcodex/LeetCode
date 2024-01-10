package Solved;

public class Solution518 {
	public int change(int amount, int[] coins) {
		int[] solutionsNum = new int[amount+1];
		solutionsNum[0] = 1;
		for (int coin : coins){
			for (int i = coin; i < solutionsNum.length; i++) {
				solutionsNum[i] += solutionsNum[i-coin];
			}
		}
		return solutionsNum[amount];
	}
}
