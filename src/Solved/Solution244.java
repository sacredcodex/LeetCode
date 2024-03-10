package Solved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution244 {
    class WordDistance {
        HashMap<String, List<Integer>> map;

        public WordDistance(String[] wordsDict) {
            map = new HashMap<>();
            int idx = 0;
            for (String word : wordsDict){
                if (!map.containsKey(word))
                    map.put(word, new ArrayList<>());
                map.get(word).add(idx);
                idx += 1;
            }
        }

        public int shortest(String word1, String word2) {
            List<Integer> l1 = map.get(word1);
            List<Integer> l2 = map.get(word2);
            int i1 = 0, i2 = 0;
            int res = Integer.MAX_VALUE;
            while (i1 < l1.size() && i2 < l2.size()){
                res = Math.min(res, Math.abs(l1.get(i1) - l2.get(i2)));
                if (l1.get(i1) < l2.get(i2))
                    i1 += 1;
                else
                    i2 += 1;
            }
            return res;
        }
    }
}
