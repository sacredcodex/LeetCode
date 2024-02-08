package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution2248 {
    public List<Integer> intersection(int[][] nums) {
        int[] count = new int[1000];
        for (int[] ints : nums)
            for (int num : ints)
                count[num-1] += 1;
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            if (count[i] == n)
                res.add(i+1);
        }
        return res;
    }
}
