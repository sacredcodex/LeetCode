package Template;

import java.util.ArrayList;
import java.util.List;

public class TrieNode {
	TrieNode[] children = new TrieNode[26];
	// To simplify the structure, we suppose the essay consists of only lowercase letters and ' '
	// index 0~25 stands for a~z
	int count = 0;
	// 0 : not a word, just a prefix
	// > 0 : this word occurs count times

	TrieNode(){}

	public void insert(String word){
		TrieNode node = this;
		for (int i = 0; i < word.length(); i++) {
			if (node.children[word.charAt(i) - 'a'] == null)
				node.children[word.charAt(i) - 'a'] = new TrieNode();
			node = node.children[word.charAt(i) - 'a'];
		}
		node.count += 1;
	}

	private TrieNode search(String word) {
		TrieNode node = this;
		for (int i = 0; i < word.length(); i++) {
			node = node.children[word.charAt(i) - 'a'];
			if (node == null)
				return null;
		}
		return node;
	}

	public int searchWord(String word){
		TrieNode node = search(word);
		return node == null ? -1 : node.count;
	}

	public List<String> sortWords(){
		List<String> list = new ArrayList<>();
		StringBuilder stringBuilder = new StringBuilder();
		preOrder(list, stringBuilder);
		return list;
	}

	private void preOrder(List<String> list, StringBuilder stringBuilder){
		if (count > 0)
			list.add(stringBuilder.toString());
		for (int i = 0; i < 26; i++) {
			if (children[i] != null) {
				stringBuilder.append((char) ('a' + i));
				children[i].preOrder(list, stringBuilder);
				stringBuilder.deleteCharAt(stringBuilder.length() - 1);
			}
		}
	}

	public boolean remove(String word){
		TrieNode node = search(word);
		if (node == null)
			return false;
		if (--node.count == 0)
			delete(word);
		return true;
	}

	public void delete(String word){
		char c = word.charAt(0);
		children[c - 'a'].delete(word.substring(1));
	}
}
