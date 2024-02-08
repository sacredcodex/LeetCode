package Solved;

import java.util.List;

public class Solution2859 {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (count(i) == k)
                sum += nums.get(i);
        }
        return sum;
    }

    private int count(int num){
        int sum = 0;
        while (num > 0) {
            if ((num & 1) == 1)
                sum += 1;
            num >>= 1;
        }
        return sum;
    }
}
