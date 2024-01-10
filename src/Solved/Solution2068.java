package Solved;

public class Solution2068 {
	public boolean checkAlmostEquivalent(String word1, String word2) {
		int[] count = new int[26];
		for (char c : word1.toCharArray())
			count[c-'a'] += 1;
		for (char c : word2.toCharArray())
			count[c-'a'] -= 1;
		for (int i : count)
			if (i<-3 || i > 3) return false;
		return true;
	}
}
