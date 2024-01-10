package Solved;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution1185 {
	final static String[] week = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	public static String dayOfTheWeek(int day, int month, int year) {
		//https://zh.wikipedia.org/wiki/%E8%94%A1%E5%8B%92%E5%85%AC%E5%BC%8F
		if (month < 3) {
			month += 12;
			year -=1;
		}
		int c = year / 100;
		int y = year % 100;
		int w = (y + y / 4 + c / 4 - 2 * c + (26 * (month + 1)) / 10 + day - 1) % 7;
		w = w < 0 ? w + 7 : w;
		return week[w];
	}

	public static void main(String[] args) {
		System.out.println(dayOfTheWeek(7,3,2003));
	}
}
