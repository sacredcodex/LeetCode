package Solved;

public class Solution680 {
	public static boolean validPalindrome(String s) {
		char[] chars = s.toCharArray();
		int i1 = 0;
		int i2 = chars.length - 1;
		while(i1 < i2){
			if (chars[i1 ++] != chars[i2 --]) {
				i1 -= 1;
				i2 += 1;
				break;
			}
		}
		if (i1 >= i2) return true;
		int i3 = i1;
		int i4 = i2;
		i3 += 1;
		while (i3 < i4){
			if (chars[i3 ++] != chars[i4 --]) {
				i3 -= 1;
				i4 += 1;
				break;
			}
		}
		if (i3 >= i4) return true;
		i2 -= 1;
		while(i1 < i2){
			if (chars[i1 ++] != chars[i2 --])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(validPalindrome("abc"));
	}
}
