package Solved;

import java.util.Stack;

public class Solution2000 {
	public String reversePrefix(String word, char ch) {
		char[] chars = word.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		boolean flag = true;
		for (char c : chars) {
			stringBuilder.append(c);
			if (flag && ch == c) {
				stringBuilder.reverse();
				flag = false;
			}
		}
		return stringBuilder.toString();
	}
}
