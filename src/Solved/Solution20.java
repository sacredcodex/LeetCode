package Solved;

import java.util.Stack;

public class Solution20 {
	public boolean isValid(String s) {
		Stack<Character> brace = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{')
				brace.push(c);
			if (c == ')' || c == ']' || c == '}')
				if (!brace.isEmpty() && (brace.peek() == c - 1 || brace.peek() == c - 2))
					brace.pop();
				else return false;
		}
		return brace.isEmpty();
	}
}
