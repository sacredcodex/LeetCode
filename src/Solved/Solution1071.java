package Solved;

public class Solution1071 {
	public String gcdOfStrings(String str1, String str2) {
		if ((str1+str2).equals(str2+str1)){
			int length = gcd(str1.length(), str2.length());
			return str1.substring(0, length);
		}else
			return "";
	}
	private int gcd(int a, int b){
		return b == 0 ? a : gcd(b, a % b);
	}
}
