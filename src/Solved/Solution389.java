package Solved;

public class Solution389 {
	public char findTheDifference(String s, String t) {
		int[] counts = new int[26];
		int i;
		for (i = 0; i < s.length(); i++) {
			counts[s.charAt(i) - 'a'] -= 1;
			counts[t.charAt(i) - 'a'] += 1;
		}
		counts[t.charAt(i) - 'a'] += 1;
		for (int j = 0; j < 26; j++) {
			if (counts[j] == 1)
				return (char)(j+'a');
		}
		return 'a';
	}
}
