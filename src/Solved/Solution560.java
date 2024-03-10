package Solved;

public class Solution560 {
    public int subarraySum(int[] nums, int k) {
        int[] sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i+1] = sum[i] + nums[i];
        }

        int res = 0;
        for (int i = 0; i < sum.length; i++) {
            for (int j = i; j < sum.length; j++) {
                if (sum[j] - sum[i] == k)
                    res+= 1;
            }
        }
        return res;
    }
}
