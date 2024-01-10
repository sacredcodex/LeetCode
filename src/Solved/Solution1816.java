package Solved;

public class Solution1816 {
	public String truncateSentence(String s, int k) {
		char[] array = s.toCharArray();
		int space = 0;
		StringBuilder res = new StringBuilder();
		for (char c : array) {
			if (c == ' '){
				space++;
				if (space == k)
					break;
			}
			res.append(c);
		}
		return res.toString();
	}
}
