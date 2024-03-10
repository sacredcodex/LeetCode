package Solved;

import java.util.HashSet;

public class Solution41 {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        for (int i = 1; i < 500002; i++) {
            if (!set.contains(i))
                return i;
        }
        return 0;
    }
}
