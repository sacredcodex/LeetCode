package Solved;

public class Solution2575 {
    public int[] divisibilityArray(String word, int m) {
        char[] chars = word.toCharArray();
        int n = chars.length;
        int[] div = new int[n];
        long remain = 0;
        for (int i = 0; i < n; i++) {
            remain = (10 * remain + chars[i] - '0') % m;
            div[i] = remain == 0 ? 1 : 0;
        }
        return div;
    }
}
