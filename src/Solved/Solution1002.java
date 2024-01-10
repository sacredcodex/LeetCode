package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1002 {
	public List<String> commonChars(String[] words) {
		int[] res = new int[26];
		Arrays.fill(res, 100);
		for (String word : words){
			int[] count = new int[26];
			for (char c : word.toCharArray()){
				count[c-'a'] += 1;
			}
			for (int i = 0; i < 26; i++) {
				if (count[i] < res[i])
					res[i] = count[i];
			}
		}
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 26; i++) {
			if (res[i] > 0){
				String str = String.valueOf((char)('a'+i));
				for (int j = 0; j < res[i]; j++) {
					list.add(str);
				}
			}
		}
		return list;
	}
	private int code(String word){
		int res = 0;
		for (char c : word.toCharArray()){
			res |= 1 << (c - 'a');
		}
		return res;
	}
}
