package Solved;

import java.util.Arrays;

public class Solution1309 {
	public String freqAlphabets(String s) {
		String[] strs = s.split("#");
		System.out.println(Arrays.toString(strs));
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < strs.length - 1; i++) {
			for (int j = 0; j < strs[i].length() - 2; j++) {
				stringBuilder.append((char) (strs[i].charAt(j)-'1'+'a'));
			}
			int num = (strs[i].charAt(strs[i].length() - 2) - '0') * 10 +  strs[i].charAt(strs[i].length() - 1) - '1';
			stringBuilder.append((char)(num + 'a'));
		}
		if (s.charAt(s.length()-1) != '#') {
			for (int j = 0; j < strs[strs.length - 1].length(); j++) {
				stringBuilder.append((char) (strs[strs.length - 1].charAt(j) - '1' + 'a'));
			}
		}else {
			int i = strs.length - 1;
			for (int j = 0; j < strs[i].length() - 2; j++) {
				stringBuilder.append((char) (strs[i].charAt(j)-'1'+'a'));
			}
			int num = (strs[i].charAt(strs[i].length() - 2) - '0') * 10 +  strs[i].charAt(strs[i].length() - 1) - '1';
			stringBuilder.append((char)(num + 'a'));
		}
		return stringBuilder.toString();
	}
}
