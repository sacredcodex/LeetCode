package Solved;

public class Solution1021 {
	public String removeOuterParentheses(String s) {
		int num = 0;
		StringBuilder stringBuilder = new StringBuilder();
		for (char c : s.toCharArray()){
			if (c == '('){
				if (num++ != 0)
					stringBuilder.append(c);
			}else {
				if (--num != 0)
					stringBuilder.append(c);
			}
		}
		return stringBuilder.toString();
	}
}
