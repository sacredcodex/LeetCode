package Solved;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution2809 {
    public int minimumTime(List<Integer> nums1, List<Integer> nums2, int x) {
        Collections.sort(nums1);
        Collections.sort(nums2);
        int length = nums1.size();

        int sum1 = 0;
        for (int n : nums1)
            sum1 += n;
        if (sum1 <= x)
            return 0;
        int[] n2 = new int[length];
        n2[0] = nums2.get(0);
        for (int i = 1; i < length; i++) {
            n2[i] = nums2.get(i) + n2[i - 1];
        }
        int tmp = 0;
        for (int i = 0; i < length; i++) {
            sum1 -= nums1.get(length - 1 -i);
            tmp += n2[i];
            if (sum1 + tmp <= x)
                return i + 1;
        }
        return -1;
    }
}
