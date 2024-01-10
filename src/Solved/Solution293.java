package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution293 {
	public List<String> generatePossibleNextMoves(String currentState) {
		List<String> result = new ArrayList<>();
		if (currentState == null || currentState.length() < 2) {
			return result;
		}
		char[] chars = currentState.toCharArray();
		for (int i = 0; i < chars.length - 1; i++) {
			if (chars[i] == '+' && chars[i] == chars[i + 1]) {
				chars[i] = '-';
				chars[i + 1] = '-';
				result.add(new String(chars));
				chars[i] = '+';
				chars[i + 1] = '+';
			}
		}
		return result;
	}
}
