package Solved;

public class Solution714 {
	public static int maxProfit(int[] prices, int fee) {
		int buy = prices[0] + fee;
		int profit = 0;
		for (int i = 1; i < prices.length; ++i) {
			if (prices[i] + fee < buy) {
				buy = prices[i] + fee;
			} else if (prices[i] > buy) {
				profit += prices[i] - buy;
				buy = prices[i];
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[]{1,3,2,8,4,9}, 2));
	}
}
