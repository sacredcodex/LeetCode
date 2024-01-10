package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution139 {
	public static boolean wordBreak(String s, List<String> wordDict) {
		boolean[] canBreak = new boolean[s.length()+1];
		Arrays.fill(canBreak, false);
		canBreak[0] = true;
		for (int i = 1; i < canBreak.length; i++) {
			for (int j = Math.max(i - 20, 0); j < i; j++) { //the max length of words in wordDic is 20
				if (canBreak[j] && wordDict.contains(s.substring(j,i))){
					canBreak[i] = true;
					break;
				}
			}
		}
		return canBreak[s.length()];
	}

	public static void main(String[] args) {
		List<String> dic = new ArrayList<>();
		dic.add("leet");
		dic.add("code");
		System.out.println(wordBreak("leetcode", dic));
	}
}
