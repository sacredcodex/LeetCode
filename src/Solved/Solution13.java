package Solved;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution13 {
	final static int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	final static String[] keys = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	public int romanToInt(String s) {
		int res = 0;
		for (int i = 0; i < keys.length;) {
			if (s.indexOf(keys[i]) == 0) {
				res += values[i];
				s = s.substring(keys[i].length());
			}else
				i++;
		}
		return res;
	}

	public static void main(String[] args) throws ParseException {
		String str = "2022-0501";
		DateFormat df = new SimpleDateFormat("yyyy-MMdd");
		Date date = df.parse(str);
		System.out.println(date.getTime());

	}
}
