package Solved;

public class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        int length = Math.min(chars1.length, chars2.length);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(chars1[i]);
            sb.append(chars2[i]);
        }
        sb.append(word1.substring(length));
        sb.append(word2.substring(length));
        return sb.toString();
    }
}
