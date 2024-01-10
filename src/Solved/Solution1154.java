package Solved;

public class Solution1154 {
	final static int[][] months = {{0,31,59,90,120,151,181,212,243,273,304,334},{0,31,60,91,121,152,182,213,244,274,305,335}};
	public int dayOfYear(String date) {
		char[] chars = date.toCharArray();
		int year = 1000*(chars[0]-'0') + 100*(chars[1]-'0') + 10*(chars[2]-'0') + (chars[3]-'0');
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			return months[1][10*(chars[5]-'0') + (chars[6]-'0')-1] + 10*(chars[8]-'0') + (chars[9]-'0');
		else return months[0][10*(chars[5]-'0') + (chars[6]-'0')-1] + 10*(chars[8]-'0') + (chars[9]-'0');
	}
}
