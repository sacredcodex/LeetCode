package Solved;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Solution734 {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if (sentence1.length != sentence2.length)
            return false;

        HashSet<String> set = new HashSet<>();
        for (List<String> p : similarPairs){
            set.add(pair(p.get(0),p.get(1)));
        }

        for (int i = 0; i < sentence1.length; i++) {
            if (!Objects.equals(sentence1[i], sentence2[i]) && !set.contains(pair(sentence1[i], sentence2[i]))) {
                return false;
            }
        }

        return true;
    }

    private String pair(String word1, String word2){
        if (word1.compareTo(word2) > 0)
            return word2+"+"+word1;
        else return word1+"+"+word2;
    }
}
