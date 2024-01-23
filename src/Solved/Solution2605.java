package Solved;

public class Solution2605 {
    public int minNumber(int[] nums1, int[] nums2) {
        int cnt1 = 0;
        for (int num : nums1){
            cnt1 |= 1<<(num-1);
        }
        int cnt2 = 0;
        for (int num : nums2){
            cnt2 |= 1<<(num-1);
        }
        if ((cnt1&cnt2) != 0){
            cnt1 &= cnt2;
            int count = 1;
            while((cnt1 & 1)!= 1){
                cnt1 >>= 1;
                count += 1;
            }
            return count;
        }else {
            int count1 = 1, count2 = 1;
            while((cnt1 & 1)!= 1){
                cnt1 >>= 1;
                count1 += 1;
            }
            while((cnt2 & 1)!= 1){
                cnt2 >>= 1;
                count2 += 1;
            }
            return count1<count2 ? 10*count1+count2 : 10*count2+count1;
        }
    }
}
