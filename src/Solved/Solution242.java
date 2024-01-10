package Solved;

public class Solution242 {
	public boolean isAnagram(String s, String t) {
		int[] count = new int[26];
		for (char c : s.toCharArray()){
			count[c-'a'] += 1;
		}
		for (char c : t.toCharArray()){
			count[c-'a'] -= 1;
		}
		for (int i = 0; i < 26; i++) {
			if (count[i] != 0)
				return false;
		}
		return true;
	}
}
