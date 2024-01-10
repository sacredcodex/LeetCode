package Solved;

import java.util.regex.Pattern;

public class Solution2047 {
	public int countValidWords(String sentence) {
		int count = 0;
		for (String word : sentence.split(" "))
			if (word.length() > 0 && word.matches("^[a-z]*([a-z]-[a-z]+)?[!.,]?$"))
				count += 1;
		return count;
	}
}
