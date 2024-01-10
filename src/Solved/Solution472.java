package Solved;

import java.util.*;

public class Solution472 {
	//执行用时： 45 ms , 在所有 Java 提交中击败了 95.59% 的用户 内存消耗： 46.8 MB , 在所有 Java 提交中击败了 63.23% 的用户

	static class Trie {
	//208
		Trie[] set;
		boolean isEnd;

		public Trie() {
			set = new Trie[26];
			isEnd = false;
		}

		public void insert(String word) {
			Trie trie = this;
			for (int i = 0; i < word.length(); i++) {
				if (trie.set[word.charAt(i) - 'a'] == null)
					trie.set[word.charAt(i) - 'a'] = new Trie();
				trie = trie.set[word.charAt(i) - 'a'];
			}
			trie.isEnd = true;
		}

		boolean isConcatenated(String word) {
			Trie trie = this;
			for (int i = 0; i < word.length(); i++) {
				trie = trie.set[word.charAt(i) - 'a'];
				if (trie == null)
					return false;
				if (trie.isEnd) {
					if (i == word.length() - 1)
						return true;
					else if (isConcatenated(word.substring(i + 1)))
						return true;
				}
			}
			return false;
		}
	}

	public static List<String> findAllConcatenatedWordsInADict(String[] words) {
		Trie trie = new Trie();
		Arrays.sort(words, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		});
		List<String> stringList = new ArrayList<>();
		for (String word : words) {
			if (word.isEmpty()) continue;
			if (trie.isConcatenated(word))
				stringList.add(word);
			else
				trie.insert(word);
		}
		return stringList;
	}

	public static void main(String[] args) {
		System.out.println(findAllConcatenatedWordsInADict(new String[]{"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"}));
	}

}
