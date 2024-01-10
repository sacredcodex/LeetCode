package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution500 {
	private static String keyboard = "qwertyuiopasdfghjklzxcvbnm";
	public static String[] findWords(String[] words) {
		List<String> list = new ArrayList<>();
		for (String word : words) {
			HashSet hashSet = new HashSet();
			for (char c : word.toLowerCase().toCharArray()) {
				int index = keyboard.indexOf(c);
				if (index < 10)
					hashSet.add(1);
				else if (index > 18)
					hashSet.add(3);
				else hashSet.add(2);
				if (hashSet.size() > 1)
					break;
			}
			if (hashSet.size() == 1)
				list.add(word);
		}
		String[] res = new String[list.size()];
		int index = 0;
		for (String word : list)
			res[index++] = word;
		return res;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
	}
}
