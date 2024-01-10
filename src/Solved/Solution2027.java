package Solved;

public class Solution2027 {
	public int minimumMoves(String s) {
		int count = 0;
		int index = 0;
		char[] chars = s.toCharArray();
		while (index < s.length()) {
			if (chars[index] == 'X'){
				count += 1;
				index += 3;
			}
			else
				index += 1;
		}
		return count;
	}
}
