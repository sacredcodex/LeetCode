package Solved;

import java.util.Arrays;

public class Solution1422 {
	public int maxScore(String s) {
		char[] chars = s.toCharArray();
		int[] pre = new int[chars.length];
		pre[0] = chars[0] == '0' ? 1 : 0;
		for (int i = 1; i < pre.length; i++) {
			pre[i] = pre[i-1];
			pre[i] += chars[i] == '0' ? 1 : 0;
		}
		int res = 0;
		for (int i = 0; i < pre.length - 1; i++) {
			int score = pre[i] * 2 + chars.length - pre[pre.length-1] - i - 1;
			if (score > res)
				res = score;
		}
		return res;
	}
}
