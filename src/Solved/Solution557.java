package Solved;

import java.util.Stack;

public class Solution557 {
	public String reverseWords(String s) {
		char[] str = s.toCharArray();
		Stack<Character> characterStack = new Stack<>();
		StringBuilder res = new StringBuilder();
		for (char c : str) {
			if (c == ' '){
				while (!characterStack.empty()) {
					res.append(characterStack.pop());
				}
				res.append(' ');
			}else
				characterStack.push(c);
		}
		while (!characterStack.empty()) {
			res.append(characterStack.pop());
		}
		return res.toString();
	}
}
