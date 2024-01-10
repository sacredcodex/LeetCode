package Solved;

public class Solution1370 {
	public static String sortString(String s) {
		int[] count = new int[26];
		for (char c : s.toCharArray()){
			count[c-'a'] += 1;
		}
		int kinds = 0;
		for (int num : count)
			if (num > 0)
				kinds += 1;
		StringBuilder stringBuilder = new StringBuilder();
		while (kinds > 0) {
			for (int i = 0; i < 26; i++) {
				if (count[i] > 0) {
					stringBuilder.append((char) (i + 'a'));
					if (--count[i] == 0)
						kinds -= 1;
				}
			}
			for (int i = 25; i >= 0; i -= 1) {
				if (count[i] > 0) {
					stringBuilder.append((char) (i + 'a'));
					if (--count[i] == 0)
						kinds -= 1;
				}
			}
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		System.out.println(sortString("rat"));
	}
}
