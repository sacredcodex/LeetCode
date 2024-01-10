package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution696 {
	public int countBinarySubstrings(String s) {
		char[] chars = s.toCharArray();
		List<Integer> list = new ArrayList<>();
		int length = 1;
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] != chars[i-1]) {
				list.add(length);
				length = 1;
			}else
				length += 1;
		}
		list.add(length);
		int count = 0;
		for (int i = 0; i < list.size()-1; i++) {
			count += Math.min(list.get(i), list.get(i+1));
		}
		return count;
	}
}
