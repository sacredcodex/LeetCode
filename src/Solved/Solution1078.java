package Solved;

import java.util.*;

public class Solution1078 {
	public String[] findOcurrences(String text, String first, String second) {
		String[] sentence = text.split(" ");
		List<String> res = new ArrayList<>();
		for (int i = 0; i < sentence.length-3; i++) {
			if (Objects.equals(first, sentence[i]) && Objects.equals(second, sentence[i+1]))
				res.add(sentence[i+2]);
		}
		String[] ans = new String[res.size()];
		int index = 0;
		for (String str : res) {
			ans[index++] = str;
		}
		return ans;
	}
}
