package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = Arrays.toString(chars);
            if (!map.containsKey(s))
                map.put(s, new ArrayList<>());
            List<String> list = map.get(s);
            list.add(str);
        }
        return new ArrayList<>(map.values());
    }
}
