package Solved;

public class Solution474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (String str : strs){
            int[] cost = new int[2];
            for (char c : str.toCharArray()){
                cost[c=='0'?0:1] += 1;
            }
            for (int i = m; i >= cost[0]; i--) {
                for (int j = n; j >= cost[1]; j--) {
                    dp[i][j] = Math.max(dp[i][j],dp[i-cost[0]][j-cost[1]]+1);
                }
            }
        }
        return dp[m][n];
    }
}
