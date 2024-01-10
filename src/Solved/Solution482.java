package Solved;

public class Solution482 {
	public String licenseKeyFormatting(String s, int k) {
		char[] chars = s.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		int count = 0;
		for (int i = chars.length-1; i >= 0 ; i -= 1) {
			if (chars[i] != '-'){
				if (chars[i]>='a' && chars[i]<='z')
					stringBuilder.append((char)(chars[i]-32));
				else
					stringBuilder.append(chars[i]);
				if (++count == k){
					count = 0;
					stringBuilder.append('-');
				}
			}
		}
		if (stringBuilder.length() > 0 && stringBuilder.charAt(stringBuilder.length()-1) == '-')
			stringBuilder.deleteCharAt(stringBuilder.length()-1);
		stringBuilder.reverse();
		return stringBuilder.toString();
	}
}
