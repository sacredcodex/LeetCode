package Solved;

public class Solution151 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            if (!word.isBlank()) {
                str.append(word);
                str.append(" ");
            }
        }
        str.delete(str.length() - 1, str.length());
        return str.toString();
    }
}
