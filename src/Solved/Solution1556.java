package Solved;

import java.util.Stack;

public class Solution1556 {
	public String thousandSeparator(int n) {
		if (n == 0) return "0";
		StringBuilder stringBuilder = new StringBuilder();
		int count = 0;
		while (n > 0){
			if (count == 3){
				stringBuilder.append('.');
				count = 0;
			}
			stringBuilder.append(n % 10);
			n /= 10;
			count += 1;
		}
		return stringBuilder.reverse().toString();
	}
}
