package Solved;

import java.util.Arrays;

public class Solution322 {
	public int coinChange(int[] coins, int amount) {
		int[] coinsNum = new int[amount+1];
		Arrays.fill(coinsNum, -1);
		coinsNum[0] = 0;
		for (int i = 1; i < coinsNum.length; i++) {
			int min = -1;
			for (int coin : coins){
				if (i - coin >= 0 && coinsNum[i - coin] != -1){
					if (min == -1)
						min = coinsNum[i - coin];
					else
						min = Math.min(min, coinsNum[i - coin]);
				}
			}
			if (min != -1)
				coinsNum[i] = min + 1;
		}
		return coinsNum[amount];
	}
}
