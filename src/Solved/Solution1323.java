package Solved;

public class Solution1323 {
	public int maximum69Number (int num) {
		String str = Integer.toString(num).replaceFirst("6", "9");
		return Integer.parseInt(str);
	}
}
