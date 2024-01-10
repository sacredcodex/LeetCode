package Solved;

public class Solution1360 {
	final static int dayPass[]=new int[]{0,31,59,90,120,151,181,212,243,273,304,334};
	public int daysBetweenDates(String date1, String date2) {
		return Math.abs(daysPassed1971(date1)-daysPassed1971(date2));
	}
	public int daysPassed1971(String date){
		int ans=0;
		String d[]=date.split("-");
		int year=Integer.parseInt(d[0]);
		int month=Integer.parseInt(d[1]);
		int day=Integer.parseInt(d[2]);
		for(int i=1971;i<year;i++){ans+=i%4==0?366:365;}
		if(year<2100&&year%4==0&&month>2){ans++;}
		return ans+dayPass[month-1]+day-1;
	}
}
