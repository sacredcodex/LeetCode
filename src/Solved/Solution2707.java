package Solved;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution2707 {
    int[] minExtra;
    HashSet<String> dic;

    public int minExtraChar(String s, String[] dictionary) {
        minExtra = new int[s.length()];
        Arrays.fill(minExtra, -1);
        dic = new HashSet<>(List.of(dictionary));
        return ExtraChar(s, 0);
    }

    private int ExtraChar(String s, int start){
        if (minExtra[start] != -1)
            return minExtra[start];
        String substr = s.substring(start);
        System.out.println("s = " + s + ", start = " + start);
        if (dic.contains(substr)) {
            minExtra[start] = 0;
            return 0;
        }
        if (substr.length() == 1) {
            minExtra[start] = 1;
            return 1;
        }
        int min = Integer.MAX_VALUE;
        for (int i = start+1; i < s.length(); i++) {
            String head = s.substring(start, i);
            if (dic.contains(head)){
                min = Math.min(ExtraChar(s, i), min);
            }else{
                min = Math.min(ExtraChar(s, i) + i - start, min);
            }
        }
        minExtra[start] = min;
        return min;
    }

    public static void main(String[] args) {
        Solution2707 solution = new Solution2707();
        String s = "leetscode";
        String[] dictionary = {"leet","code","leetcode"};
        System.out.println(solution.minExtraChar(s, dictionary));
    }
}
