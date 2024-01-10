package Solved;

public class Solution1961 {
	public boolean isPrefixString(String s, String[] words) {
		StringBuilder stringBuilder = new StringBuilder(s);
		for (String word : words) {
			if (stringBuilder.indexOf(word) != 0)
				return false;
			stringBuilder.delete(0, word.length());
			if (stringBuilder.length() == 0) return true;
		}
		return false;
	}
}
