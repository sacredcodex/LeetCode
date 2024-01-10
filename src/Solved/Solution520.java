package Solved;

public class Solution520 {
	public boolean detectCapitalUse(String word) {
		if (word.length() == 1)
			return true;
		boolean head;
		if (word.charAt(0) > 'Z') {
			for (int i = 1; i < word.length(); i++) {
				if (word.charAt(i) < 'a')
					return false;
			}
		} else {
			head = word.charAt(1) < 'a';
			for (int i = 1; i < word.length(); i++) {
				if (word.charAt(i) > 'Z' == head)
					return false;
			}
		}
		return true;
	}
}
