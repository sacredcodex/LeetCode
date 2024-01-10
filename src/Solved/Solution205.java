package Solved;

import java.util.HashMap;

public class Solution205 {
	public boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> hashMap1 = new HashMap<>();
		HashMap<Character, Character> hashMap2 = new HashMap<>();
		int length = s.length();
		if (length != t.length()) return false;
		for (int i = 0; i < length; i++) {
			if (!hashMap1.containsKey(s.charAt(i))){
				hashMap1.put(s.charAt(i), t.charAt(i));
			}else if (hashMap1.get(s.charAt(i)) != t.charAt(i))
				return false;
			if (!hashMap2.containsKey(t.charAt(i))){
				hashMap2.put(t.charAt(i), s.charAt(i));
			}else if (hashMap2.get(t.charAt(i)) != s.charAt(i))
				return false;
		}
		return true;
	}
}
