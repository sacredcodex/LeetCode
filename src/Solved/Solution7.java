package Solved;

public class Solution7 {
	/**
	 * 7 正数反转输出
	 */
	public int reverse(int x) {
		boolean positive;
		if (x >= 0)
			positive = true;
		else {
			positive = false;
			x = -x;
		}
		char[] num = Integer.toString(x).toCharArray();
		String reverse = "";
		final String max = "2147483647";
		for (int i = 0; i < num.length; i++) {
			reverse = reverse + num[num.length - 1 - i];
		}
		if (reverse.length() > max.length() || (reverse.length() == max.length() && reverse.compareTo(max) > 0))
			return 0;
		int res = Integer.parseInt(reverse);
		if (!positive)
			res = -res;
		return res;
	}
}
