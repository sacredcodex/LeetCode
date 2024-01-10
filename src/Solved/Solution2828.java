package Solved;

import java.util.List;

public class Solution2828 {
    public boolean isAcronym(List<String> words, String s) {
        String acronym = "";
        for (String word : words) {
            acronym += word.charAt(0);
        }
        return acronym.equals(s);
    }
}
