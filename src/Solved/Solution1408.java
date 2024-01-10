package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution1408 {
	public List<String> stringMatching(String[] words) {
		List<String> list = new ArrayList<>();
		for (String word1 : words){
			for (String word2 : words){
				if (!word1.equals(word2) && word2.contains(word1)) {
					list.add(word1);
					break;
				}
			}
		}
		return list;
	}
}
