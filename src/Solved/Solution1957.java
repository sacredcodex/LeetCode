package Solved;

public class Solution1957 {
	public String makeFancyString(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		for (int i = 2; i < stringBuilder.length(); i++) {
			if (stringBuilder.charAt(i-2) == stringBuilder.charAt(i) && stringBuilder.charAt(i-1) == stringBuilder.charAt(i))
				stringBuilder.delete(i, i+1);
		}
		return stringBuilder.toString();
	}
}
