package Solved;

import java.util.Arrays;

public class Solution434 {
	public static int countSegments(String s) {
		char[] chars = s.toCharArray();
		if (chars.length == 0) return 0;
		int count = chars[chars.length-1] == ' ' ? 0 : 1;
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == ' ' && chars[i-1] != ' ')
				count += 1;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countSegments(", , , ,        a, eaefa"));
	}
}
