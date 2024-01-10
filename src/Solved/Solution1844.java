package Solved;

public class Solution1844 {
	public String replaceDigits(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i+=2) {
			char c = s.charAt(i);
			stringBuilder.append(c);
			try {
				int num = s.charAt(i + 1) - '0';
				stringBuilder.append((char) (c + num));
			}catch (Exception ignore){

			}
		}
		return stringBuilder.toString();
	}
}
