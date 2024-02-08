package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution1177 {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int[] count = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            count[i+1] = count[i] ^ (1 << (s.charAt(i) - 'a'));
        }
        List<Boolean> res = new ArrayList<>();
        for (int[] q : queries){

            int c = count[q[1]+1] ^ count[q[0]];

            int ones = 0;
            while (c > 0){
                ones += c & 1;
                c >>= 1;
            }
            res.add(ones<=(q[2]<< 1) + 1);
        }
        return res;
    }
}
