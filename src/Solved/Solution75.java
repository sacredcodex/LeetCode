package Solved;

import java.util.Arrays;

public class Solution75 {
    public void sortColors(int[] nums) {
        int i1 = 0, i2 = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums));
            if (nums[i] == 0){
                nums[i--] = nums[i1];
                nums[i1++] = 0;
            }else if (nums[i] == 2){
                nums[i--] = nums[i2];
                nums[i2--] = 2;
            }
            if (i >= i2) break;
        }
    }
}
