package Solved;

import java.util.HashMap;

public class Solution1160 {
	public int countCharacters(String[] words, String chars) {
		HashMap<Character, Integer> provide = count(chars);
		int res = 0;
		for (String word : words){
			HashMap<Character, Integer> wordCount = count(word);
			if (contain(provide, wordCount))
				res += word.length();
		}
		return res;
	}
	private HashMap<Character, Integer> count(String str){
		HashMap<Character, Integer> count = new HashMap<>();
		for (char c : str.toCharArray()){
			count.put(c, count.getOrDefault(c, 0) + 1);
		}
		return count;
	}
	private boolean contain(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2){
		for (char c : map2.keySet()){
			if (map1.getOrDefault(c, 0) < map2.get(c))
				return false;
		}
		return true;
	}

}
