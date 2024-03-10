package Solved;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2369 {

    public boolean validPartition(int[] nums) {

        int length = nums.length;
        boolean[] valid = new boolean[length+1];

        valid[0] = true;
        valid[1] = false;
        if (nums[0]==nums[1]) valid[2] = true;

        for (int i = 3; i < valid.length; i++) {
            valid[i] = (valid[i-3] && ((nums[i-1] == nums[i-2] && nums[i-2] == nums[i-3]) || (nums[i-1] - nums[i-2] == 1) && (nums[i-2] - nums[i-3] == 1)) || (valid[i-2] && nums[i-1] == nums[i-2]));
        }

        return valid[length];
    }
}
