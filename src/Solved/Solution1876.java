package Solved;

public class Solution1876 {
	public int countGoodSubstrings(String s) {
		if (s.length() < 3) return 0;
		char[] chars = s.toCharArray();
		boolean b1 = chars[0] == chars[1];
		boolean b2;
		int count = 0;
		for (int i = 2; i < chars.length; i++) {
			b2 = chars[i] == chars[i-1];
			if (!b1 && !b2 && chars[i] != chars[i-2])
				count += 1;
			b1 = b2;
		}
		return count;
	}
}
