package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution438 {
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> find = new ArrayList<>();
		if (p.length()>s.length()) return find;
		int[] flag = new int[26];
		for (int i = 0; i < p.length(); i++) {
			flag[p.charAt(i)-'a']++;
		}
		for (int i = 0; i < p.length(); i++) {
			flag[s.charAt(i)-'a']--;
		}
		if (allZero(flag)) find.add(0);
		for (int i = 0; i < s.length() - p.length(); i++) {
			flag[s.charAt(i)-'a']++;
			flag[s.charAt(i+p.length())-'a']--;
			if (allZero(flag)) find.add(i+1);
		}
		return find;
	}
	private static boolean allZero(int[] flag){
		for (int i : flag)
			if (i != 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		String s = "abab";
		String p = "ab";
		System.out.println(findAnagrams(s,p));
	}
}
