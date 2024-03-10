package Solved;

public class Solution2673 {
    int res;
    public int minIncrements(int n, int[] cost) {
        int res = 0;
        for (int i = n-2; i > 0; i-=2) {
            res += Math.abs(cost[i] -  cost[i+1]);
            cost[i>>1] += Math.max(cost[i], cost[i+1]);
        }
        return res;
    }
}
