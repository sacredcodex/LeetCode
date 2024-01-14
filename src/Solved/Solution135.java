package Solved;

import java.util.Arrays;
import java.util.HashSet;

public class Solution135 {
    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = right[n-1] = 1;
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i-1])
                left[i] = left[i-1] + 1;
            else left[i] = 1;
            if (ratings[n-1-i] > ratings[n-i])
                right[n-1-i] = right[n-i] + 1;
            else right[n-1-i] = 1;
            System.out.println(Arrays.toString(left));
            System.out.println(Arrays.toString(right));
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.max(left[i],right[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        candy(new int[]{1,2,3,3,3,2,1});
    }
}
