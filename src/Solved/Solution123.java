package Solved;

public class Solution123 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int length = prices.length;
        int max = prices[0];
        int profit = 0;
        int[] firstProfit = new int[length];
        for (int i = 0; i < length; i++) {
            if (prices[i] > max){
                max = prices[i];
                profit = Math.max(profit, max - min);
            }
            firstProfit[i] = profit;
            if (prices[i] < min){
                min = prices[i];
                max = prices[i];
            }
        }
        min = prices[length-1];
        max = prices[length-1];
        profit = 0;
        int[] secondProfit = new int[length];
        for (int i = length-1; i >= 0; i--) {
            if (prices[i] < min){
                min = prices[i];
                profit = Math.max(profit, max - min);
            }
            secondProfit[i] = profit;
            if (prices[i] > max){
                min = prices[i];
                max = prices[i];
            }
        }
        for (int i = 0; i < length-1; i++) {
            profit = Math.max(profit, firstProfit[i] + secondProfit[i+1]);
        }
        return Math.max(profit, firstProfit[length-1]);
    }
}
