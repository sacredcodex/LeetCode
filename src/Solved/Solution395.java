package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution395 {
	public static int longestSubstring(String s, int k) {
		int length = s.length();
		char[] chars = s.toCharArray();
		return dfs(chars, 0, length-1, k);
	}
	private static int dfs(char[] chars, int begin, int end, int k){
		if (end - begin + 1 < k) return 0;
		int[] count = new int[26];
		for (int i = begin; i <= end ; i++) {
			count[chars[i] -'a'] += 1;
		}
		List<Integer> breakPionts = new ArrayList<>();
		for (int i = begin; i <= end; i++) {
			if (count[chars[i] - 'a'] < k)
				breakPionts.add(i);
		}
		if (breakPionts.isEmpty()) return end - begin + 1;
		int res = 0;
		int dfsRes = dfs(chars, begin, breakPionts.get(0) - 1, k);
		if (dfsRes > res) res = dfsRes;
		for (int i = 0; i < breakPionts.size() - 1; i++) {
			dfsRes = dfs(chars, breakPionts.get(i) + 1, breakPionts.get(i + 1) - 1, k);
			if (dfsRes > res) res = dfsRes;
		}
		dfsRes = dfs(chars, breakPionts.get(breakPionts.size() - 1) + 1, end, k);
		if (dfsRes > res) res = dfsRes;
		return res;
	}

	public static void main(String[] args) {
		System.out.println(longestSubstring("ababbc", 2));
	}
}
