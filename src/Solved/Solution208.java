package Solved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution208 {
	class Trie {

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

		public boolean search(String word) {
			Trie trie = this;
			for (int i = 0; i < word.length(); i++) {
				trie = trie.set[word.charAt(i) - 'a'];
				if (trie == null)
					return false;
			}
			return trie.isEnd;
		}

		public boolean startsWith(String prefix) {
			Trie trie = this;
			for (int i = 0; i < prefix.length(); i++) {
				trie = trie.set[prefix.charAt(i) - 'a'];
				if (trie == null)
					return false;
			}
			return true;
		}
	}
}

