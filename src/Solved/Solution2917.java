package Solved;

import java.util.Arrays;

public class Solution2917 {
    public int findKOr(int[] nums, int k) {
        int[] count = new int[32];
        for (int num : nums){
            int idx = 0;
            while (num > 0){
                if ((num & 1) == 1){
                    count[idx++] += 1;
                }else idx += 1;
                num >>= 1;
            }
        }
        System.out.println(Arrays.toString(count));
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            if (count[i] >= k){
                res <<= 1;
                res |= 1;
            }
        }
        return res;
    }
}
