package Solved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution884 {
	public String[] uncommonFromSentences(String s1, String s2) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (String str : s1.split(" ")){
			hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
		}
		for (String str : s2.split(" ")){
			hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
		}
		List<String> list = new ArrayList<>();
		for (String str : hashMap.keySet()){
			if (hashMap.get(str) == 1)
				list.add(str);
		}
		String[] res = new String[list.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = list.get(i);
		}
		return res;
	}
}
