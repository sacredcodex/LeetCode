package Solved;

import java.util.Arrays;
import java.util.Comparator;

public class Solution953 {
	public static boolean isAlienSorted(String[] words, String order) {
		for (int i = 1; i < words.length; i++) {
			int length = Math.min(words[i-1].length(), words[i].length());
			for (int j = 0; j < length; j++) {
				if (words[i-1].charAt(j) == words[i].charAt(j))
					if (j < length - 1)
						continue;
					else if (words[i-1].length() < words[i].length())
						continue;
					else return false;
				if (order.indexOf(words[i-1].charAt(j)) < order.indexOf(words[i].charAt(j)))
					break;
				else return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isAlienSorted(new String[]{"hello", "leetcode"}, "hlagiuogfioqhfi"));
	}
}
