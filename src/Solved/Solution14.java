package Solved;

public class Solution14 {
	public String longestCommonPrefix(String[] strs) {
		int shortLength = strs[0].length();
		for (int i = 1; i < strs.length; i++) {
			if (shortLength > strs[i].length()){
				shortLength = strs[i].length();
			}
		}
		String prefix = strs[0].substring(0, shortLength);
		for (int i = 1; i < strs.length; i++) {
			for (int j = 0; j < shortLength; j++) {
				if (strs[i].charAt(j) != prefix.charAt(j)){
					shortLength = j;
				}
			}
		}
		return prefix.substring(0,shortLength);
	}
}
