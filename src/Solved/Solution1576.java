package Solved;

public class Solution1576 {
	public String modifyString(String s) {
		char[] chars = s.toCharArray();
		if (chars[0] == '?')
			chars[0] = 'a';
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == '?')
				chars[i] = addOne(chars[i-1]);
			else if (chars[i] == chars[i-1])
				chars[i-1] = addOne(chars[i-1]);
		}
		return new String(chars);
	}
	private char addOne(char c) {
		if (c == 'z')
			return 'a';
		else return (char) (c + 1);
	}
}
