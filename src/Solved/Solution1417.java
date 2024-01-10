package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution1417 {
	public String reformat(String s) {
		char[] chars = s.toCharArray();
		int charAmount = 0, numAmount = 0;
		for (char c : chars) {
			if (c >= '0' && c <= '9') {
				numAmount += 1;
			} else {
				charAmount += 1;
			}
		}

		if (Math.abs(charAmount - numAmount) > 1) {
			return "";
		}

		char[] ans = new char[s.length()];
		int i = charAmount >= numAmount ? 0 : 1;
		int j = i == 0 ? 1 : 0;
		for (char c : chars) {
			if (c >= '0' && c <= '9') {
				ans[j] = c;
				j += 2;
			} else {
				ans[i] = c;
				i += 2;
			}
		}
		return new String(ans);
	}
}
