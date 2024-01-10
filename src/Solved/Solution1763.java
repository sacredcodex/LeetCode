package Solved;

import java.util.HashMap;
import java.util.HashSet;

public class Solution1763 {
	public String longestNiceSubstring(String s) {
		for (int i = s.length(); i > 0; i -= 1) {
			for (int j = 0; j <= s.length() - i; j++) {
				String str = s.substring(j, j + i);
				if (isNice(str)) return str;
			}
		}
		return "";
	}
	private boolean isNice(String str){
		HashSet<Character> set1 = new HashSet<>();
		HashSet<Character> set2 = new HashSet<>();
		for (char c : str.toCharArray()){
			if (c > 'Z'){
				set1.add(c);
			}else {
				set2.add((char)(c + 32));
			}
		}
		if (set1.size() != set2.size()) return false;
		set1.removeAll(set2);
		return set1.isEmpty();
	}
}
