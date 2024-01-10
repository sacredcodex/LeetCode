package Solved;

public class Solution392 {
	public static boolean isSubsequence(String s, String t) {
		char[] array = s.toCharArray();
		int index = -1;
		for (char c : array) {
			t = t.substring(index+1);
			index = t.indexOf(c);
			if (index == -1)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isSubsequence("aa","a"));
	}
}
