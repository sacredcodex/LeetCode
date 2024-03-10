package Solved;

public class Solution299 {
    public String getHint(String secret, String guess) {
        char[] s = secret.toCharArray();
        char[] g = guess.toCharArray();
        int n = s.length;
        int B = 0;
        int[] countS = new int[10];
        int[] countG = new int[10];
        for (int i = 0; i < n; i++) {
            if (s[i] == g[i])
                B += 1;
            else {
                countS[s[i]-'0'] += 1;
                countG[g[i]-'0'] += 1;
            }
        }
        int C = 0;
        for (int i = 0; i < 10; i++) {
            C += Math.min(countG[i], countS[i]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(B).append("A").append(C).append("B");
        return sb.toString();
    }
}
