package Solved;

import java.util.HashMap;

public class Solution128 {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : nums){
            if (map.containsKey(num))
                continue;
            else{
                int left = map.getOrDefault(num-1, 0);
                int right = map.getOrDefault(num+1, 0);
                int length = left + right + 1;
                max = Math.max(max, length);
                map.put(num, length);
                map.put(num-left, length);
                map.put(num+right, length);
            }
        }
        return max;
    }
}
