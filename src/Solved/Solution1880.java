package Solved;

public class Solution1880 {
	public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
		return toInteger(firstWord) + toInteger(secondWord) == toInteger(targetWord);
	}
	private int toInteger(String s) {
		int num = 0;
		for (char c : s.toCharArray()) {
			num *= 10;
			num += c - 'a';
		}
		return num;
	}
}
