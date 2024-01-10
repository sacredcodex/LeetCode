package Solved;

import java.util.HashSet;

public class Solution804 {
	final String[] codes = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	public int uniqueMorseRepresentations(String[] words) {
		HashSet<String> hashSet = new HashSet<>();
		for (String word : words){
			StringBuilder stringBuilder = new StringBuilder();
			for (char c : word.toCharArray()){
				stringBuilder.append(codes[c-'a']);
			}
			hashSet.add(stringBuilder.toString());
		}
		return hashSet.size();
	}
}
