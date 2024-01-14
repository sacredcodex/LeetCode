package Solved;

public class Solution153 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (right - left > 1){
            int mid = (left + right) >> 1;
            if (nums[mid] > nums[right])
                left = mid;
            else
                right = mid;
        }
        return Math.min(nums[left], nums[right]);
    }
}
