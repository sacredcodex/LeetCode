package Solved;

public class Solution1455 {
	public int isPrefixOfWord(String sentence, String searchWord) {
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].indexOf(searchWord) == 0)
				return i;
		}
		return -1;
	}
}
