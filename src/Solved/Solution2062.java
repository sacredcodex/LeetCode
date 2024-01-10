package Solved;

import java.util.HashSet;

public class Solution2062 {
	public int countVowelSubstrings(String word) {
		HashSet<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		int count = 0;
		char[] chars = word.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			HashSet<Character> characterHashSet = new HashSet<>();
			for (int j = i; j < chars.length; j++) {
				if (vowels.contains(chars[j]))
					characterHashSet.add(chars[j]);
				else break;
				if (characterHashSet.size() == 5)
					count += 1;
			}
		}
		return count;
	}
}
