package Solved;

public class Solution121 {
	public int maxProfit(int[] prices) {
		int maxIncome = 0;
		int minPrice = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < minPrice)
				minPrice = prices[i];
			else maxIncome = Math.max(maxIncome, prices[i] - minPrice);
		}
		return maxIncome;
	}
}
