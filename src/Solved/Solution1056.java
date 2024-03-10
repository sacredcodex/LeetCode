package Solved;

import java.util.HashSet;

public class Solution1056 {
    private static HashSet<Integer> set;
    public boolean confusingNumber(int n) {
        int org = n;
        if (set == null){
            set = new HashSet<>();
            set.add(2);
            set.add(3);
            set.add(3);
            set.add(4);
            set.add(5);
            set.add(7);
        }
        int reverse = 0;
        while(n > 0){
            int num = n % 10;
            if (set.contains(num))
                return false;
            if (num == 6) reverse = 10 * reverse + 9;
            else if (num == 9) reverse = 10 * reverse + 6;
            else reverse = 10 * reverse + num;
            n /= 10;
        }

        return org != reverse;
    }
}
