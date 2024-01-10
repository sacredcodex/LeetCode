package Solved;

public class Solution844 {
	public boolean backspaceCompare(String s, String t) {
		StringBuilder stringBuilder1 = new StringBuilder();
		for (char c : s.toCharArray()){
			if (c == '#'){
				if (stringBuilder1.length() > 0)
					stringBuilder1.deleteCharAt(stringBuilder1.length()-1);
			}else {
				stringBuilder1.append(c);
			}
		}
		StringBuilder stringBuilder2 = new StringBuilder();
		for (char c : t.toCharArray()){
			if (c == '#'){
				if (stringBuilder2.length() > 0)
					stringBuilder2.deleteCharAt(stringBuilder2.length()-1);
			}else {
				stringBuilder2.append(c);
			}
		}
		return stringBuilder1.compareTo(stringBuilder2) == 0;
	}
}
