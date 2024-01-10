package Solved;

import java.util.HashMap;
import java.util.HashSet;

public class Solution290 {
	public boolean wordPattern(String pattern, String s) {
		char[] chars = pattern.toCharArray();
		String[] strings = s.split(" ");
		int length = chars.length;
		if (strings.length != length) return false;
		HashMap<Character, String> hashMap1 = new HashMap<>();
		HashSet<String> hashSet = new HashSet<>();
		for (int i = 0; i < length; i++) {
			if (!hashMap1.containsKey(chars[i])){
				if (hashSet.contains(strings[i]))
					return false;
				else {
					hashMap1.put(chars[i], strings[i]);
					hashSet.add(strings[i]);
				}
			}else if (!hashMap1.get(chars[i]).equals(strings[i]))
				return false;
		}
		return true;
	}
}
