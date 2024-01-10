package Solved;

import java.util.Arrays;

public class Solution387 {
	public int firstUniqChar(String s) {
		int[] index = new int[26];
		Arrays.fill(index, -1);
		for (int i = 0; i < s.length(); i++) {
			int char2int = s.charAt(i) - 'a';
			if (index[char2int] != -1)
				index[char2int] = -2;
			else index[char2int] = i;
		}
		int first = Integer.MAX_VALUE;
		for (int i = 0; i < 26; i++) {
			if (index[i] < 0) continue;
			else first = Math.min(first, index[i]);
		}
		return first == Integer.MAX_VALUE ? -1 : first;
	}
}
