package Solved;

public class Solution5 {
	/**
	 * 5 找字符串中最长的回文子串
	 */
	public String longestPalindrome(String s) {
		String res = s.substring(0, 1);
		String sub;
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + res.length() + 1; j <= s.length(); j++){
				sub = s.substring(i,j);
				if (isPalindrome(sub)){
					res = sub;
				}
			}
		}
		return res;
	}
	public boolean isPalindrome(String s) {
		int index1 = 0;
		int index2 = s.length()-1;
		while (index2 - index1 >= 1){
			if (s.charAt(index1) != s.charAt(index2))
				return false;
			index1++;
			index2--;
		}
		return true;
	}
}
