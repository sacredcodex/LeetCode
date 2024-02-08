package Solved;

import java.util.Arrays;

public class Solution2731 {

    public static int v = 1000000007;
    public int sumDistance(int[] nums, String s, int d) {
        int l = nums.length;

        long[] pos = new long[l];
        for (int i = 0; i < l; i++) {
            pos[i] = (long)nums[i] + (s.charAt(i) == 'L' ? -1 : 1) * d;
        }
        Arrays.sort(pos);
        long res = 0;
        long pre = pos[0];
        for (int i = 1; i < l; i++) {
            res += (pos[i] * (long) i - pre) % v;
            pre += pos[i];
        }
        return (int)(res % v);

    }
}
