package Solved;

import java.util.*;

public class Solution720 {

	private static class Trie{
		boolean isWord;
		Trie[] children;

		Trie(){
			isWord = false;
			children = new Trie[26];
		}

		public void add(String str){
			char[] chars = str.toCharArray();
			Trie node = this;
			for (char c : chars){
				if (node.children[c - 'a'] == null)
					node.children[c - 'a'] = new Trie();
				node = node.children[c - 'a'];
			}
			node.isWord = true;
		}

		public void bfs(){
			for (int i = 0; i < 26; i++) {
				if (children[i] != null){
					if (!children[i].isWord)
						children[i] = null;
					else children[i].bfs();
				}
			}
		}

		public void dfs(StringBuilder stringBuilder, String[] res){
			for (int i = 0; i < 26; i++) {
				if (children[i] != null){
					stringBuilder.append((char)('a' + i));
					if (stringBuilder.toString().length() > res[0].length())
						res[0] = stringBuilder.toString();
					children[i].dfs(stringBuilder, res);
					stringBuilder.deleteCharAt(stringBuilder.length() - 1);
				}
			}
		}

	}

	public static String longestWord(String[] words) {
		Trie root = new Trie();
		root.isWord = true;
		for (String word : words){
			root.add(word);
		}
		root.bfs();
		StringBuilder stringBuilder = new StringBuilder();
		String[] res = new String[]{""};
		root.dfs(stringBuilder, res);
		return res[0];
	}

	public static void main(String[] args) {
		String[] words = new String[]{"w","wo","wor","worl","world"};
		System.out.println(longestWord(words));
	}
}
