package Solved;

public class Solution58 {
	public int lengthOfLastWord(String s) {
		char[] chars = s.toCharArray();
		int length = 0;
		for (int i = chars.length-1; i >= 0; i--) {
			if (length == 0 && chars[i] == ' ') continue;
			if (chars[i]  != ' ') length += 1;
			else return length;
		}
		return length;
	}
}
