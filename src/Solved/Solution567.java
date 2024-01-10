package Solved;

public class Solution567 {
	public boolean checkInclusion(String s1, String s2) {
		if (s1.length()>s2.length()) return false;
		int[] charNum = new int[26];
		char[] s1Array = s1.toCharArray();
		for (char c : s1Array) {
			charNum[c-'a'] += 1;
		}
		char[] s2Array = s2.toCharArray();
		for (int i = 0; i < s1Array.length; i++) {
			charNum[s2Array[i] - 'a'] -= 1;
		}
		int i;
		for (i = 0; i < 26; i++) {
			if (charNum[i] != 0)
				break;
		}
		if (i == 26) return true;
		for (int j = s1Array.length; j < s2Array.length; j++) {
			charNum[s2Array[j] - 'a'] -= 1;
			charNum[s2Array[j-s1Array.length] - 'a'] += 1;
			for (i = 0; i < 26; i++) {
				if (charNum[i] != 0)
					break;
			}
			if (i == 26) return true;
		}
		return false;
	}
}
