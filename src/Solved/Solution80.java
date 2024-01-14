package Solved;

public class Solution80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3)
            return nums.length;
        int left = 2;
        int right = 2;
        while(right < nums.length){
            if (nums[left-2] == nums[right]) {
                right ++;
            }else {
                nums[left++] = nums[right++];
            }
        }
        return left;
    }
}
