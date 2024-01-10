package Solved;

public class Solution917 {
	public String reverseOnlyLetters(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		int i1 = 0, i2 = stringBuilder.length() - 1;
		while (i1 < i2){
			if (!isLetter(stringBuilder.charAt(i1))){
				i1 += 1;
			}else if (!isLetter(stringBuilder.charAt(i2))){
				i2 -= 1;
			}else {
				char c = stringBuilder.charAt(i1);
				stringBuilder.setCharAt(i1++, stringBuilder.charAt(i2));
				stringBuilder.setCharAt(i2--, c);
			}
		}
		return stringBuilder.toString();
	}
	private boolean isLetter(char c){
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}
}
