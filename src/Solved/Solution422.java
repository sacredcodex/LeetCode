package Solved;

import java.util.List;

public class Solution422 {
	public boolean validWordSquare(List<String> words) {
		int length = words.size();
		char[][] chars = new char[length][];
		for (int i = 0; i < length; i++) {
			chars[i] = words.get(i).toCharArray();
		}
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < chars[i].length; j++) {
				try {
					if (chars[i][j] != chars[j][i])
						return false;
				}catch (IndexOutOfBoundsException e){
					return false;
				}
			}
		}
		return true;
	}
}
