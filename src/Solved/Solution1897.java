package Solved;

public class Solution1897 {
	public boolean makeEqual(String[] words) {
		int[] count = new int[26];
		for (String word : words)
			for (char c : word.toCharArray())
				count[c - 'a'] += 1;
		for (int num : count)
			if (num % words.length != 0)
				return false;
		return true;
	}
}
