package Solved;

import java.util.Arrays;
import java.util.Comparator;

public class Solution1859 {
	public String sortSentence(String s) {
		String[] word = s.split(" ");
		Arrays.sort(word, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.charAt(o1.length()-1) - o2.charAt(o2.length()-1);
			}
		});
		StringBuilder stringBuilder = new StringBuilder();
		for (String w : word) {
			stringBuilder.append(w);
			stringBuilder.replace(stringBuilder.length()-1,stringBuilder.length()," ");
		}
		stringBuilder.delete(stringBuilder.length()-1, stringBuilder.length());
		return stringBuilder.toString();
	}
}
