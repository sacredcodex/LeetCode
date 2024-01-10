package Solved;

import java.util.Arrays;

public class Solution1624 {
	public int maxLengthBetweenEqualCharacters(String s) {
		int[] index = new int[26];
		Arrays.fill(index, -1);
		int res = -1;
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			int val = chars[i] - 'a';
			if (index[val] != -1)
				res = Math.max(res, i - index[val] - 1);
			else
				index[val] = i;
		}
		return res;
	}
}
