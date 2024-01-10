package Solved;

import java.util.List;

public class Solution541 {
	public String reverseStr(String s, int k) {
		char[] chars = s.toCharArray();
		int time = chars.length / (k << 1);
		if (chars.length % (k << 1) > 0) time += 1;
		for (int i = 0; i < time; i++) {
			reverse(chars, 2 * k * i, 2 * k * i + k - 1);
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (char c : chars)
			stringBuilder.append(c);
		return stringBuilder.toString();
	}
	private void reverse(char[] chars, int left, int right){
		right = Math.min(right, chars.length-1);
		while (left < right){
			char c = chars[left];
			chars[left++] = chars[right];
			chars[right--] = c;
		}
	}
}
