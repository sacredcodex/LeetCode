package Solved;

import java.util.Stack;

public class Solution504 {
	public String convertToBase7(int num) {
		StringBuilder res = new StringBuilder();
		if (num<0){
			num = -num;
			res.append('-');
		}
		Stack<Character> seven = new Stack<>();
		while (num>0){
			seven.add((char) (num % 7 + '0'));
			num = num / 7;
		}
		while (!seven.empty()) {
			res.append(seven.pop());
		}
		if (res.toString().equals(""))
			return "0";
		return res.toString();
	}
}
