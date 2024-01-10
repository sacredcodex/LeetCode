package Solved;

import java.util.HashSet;

public class Solution1935 {
	public int canBeTypedWords(String text, String brokenLetters) {
		HashSet<Character> chars = new HashSet<>();
		int count = 0;
		for (char c : brokenLetters.toCharArray())
			chars.add(c);
		for (String word : text.split(" ")){
			boolean flag = true;
			for (char c : word.toCharArray()) {
				if (chars.contains(c)){
					flag = false;
					break;
				}
			}
			if (flag)
				count += 1;
		}
		return count;
	}
}
