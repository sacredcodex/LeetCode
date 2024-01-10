package Solved;

public class Solution1941 {
	public boolean areOccurrencesEqual(String s) {
		int[] count = new int[26];
		for (char c : s.toCharArray()) {
			count[c - 'a'] += 1;
		}
		int num = 0;
		for (int c : count) {
			if (c == 0) continue;
			if (num == 0) num = c;
			if (num != c) return false;
		}
		return true;
	}
}
