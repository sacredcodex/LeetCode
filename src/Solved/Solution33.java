package Solved;

import java.util.Arrays;

public class Solution33 {
    public int search(int[] nums, int target) {
        int minidx;
        for (minidx = 1; minidx < nums.length; minidx ++){
            if (nums[minidx] < nums[minidx-1])
                break;
        }


        int ans;
        if (nums[0] == target) return 0;
        if (nums[0] < target)
            ans = Arrays.binarySearch(nums,0, minidx, target);
        else ans = Arrays.binarySearch(nums, minidx, nums.length, target);
        return ans >= 0 ? ans : -1;
    }

}
