package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int i,j,k;
        int length = nums.length;
        for (i = 0;i < length; i = add(nums, i)) {
            j = i+1;
            k = length - 1;
            while (j < k){
                int s = nums[j]+nums[k]+nums[i];
                if (s == 0) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(nums[i]);
                    pair.add(nums[j]);
                    pair.add(nums[k]);
                    res.add(pair);
                    j = add(nums, j);
                    k = minus(nums, k);
                }else if (s < 0)
                    j = add(nums, j);
                else k = minus(nums, k);
            }
        }
        return res;
    }

    private int add(int[] nums, int i){
        int val = nums[i];
        while (true){
            i += 1;
            if (i == nums.length || nums[i] != val)
                return i;
        }
    }

    private int minus(int[] nums, int i){
        int val = nums[i];
        while (true){
            i -= 1;
            if (i == -1 || nums[i] != val)
                return i;
        }
    }
}
