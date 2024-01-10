package Solved;

public class Solution1332 {
	public int removePalindromeSub(String s) {
		if (s.length() == 0) return 0;
		if (isPalindrome(s))
			return 1;
		else return 2;
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
