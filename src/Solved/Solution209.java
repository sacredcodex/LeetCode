package Solved;

public class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left, right;
        left = right = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE;
        while(true){
            if (sum < target){
                if (right >= nums.length)
                    break;
                sum += nums[right++];
            }
            if (sum >= target){
                length = Math.min(length, right - left);
                sum -= nums[left++];
            }
        }
        if (length == Integer.MAX_VALUE)
            return 0;
        else return length;
    }
}
