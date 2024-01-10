package Solved;

public class Solution859 {
	public boolean buddyStrings(String s, String goal) {
		int length = s.length();
		if (length != goal.length()) return false;
		int[] index = new int[2];
		int dif = 0;
		for (int i = 0; i < length; i++) {
			if (s.charAt(i) != goal.charAt(i)){
				try{
					index[dif++] = i;
				}catch (IndexOutOfBoundsException e){
					return false;
				}
			}
		}
		if (dif == 0 ) containRepeatChar(s);
		if (dif == 1) return false;
		return s.charAt(index[0]) == goal.charAt(index[1]) && s.charAt(index[1]) == goal.charAt(index[0]);
	}
	public  static  boolean  containRepeatChar(String str){
		char [] elements=str.toCharArray();
		for ( char  e:elements){
			if (str.indexOf(e)!=str.lastIndexOf(e)){
				return  true ;
			}
		}
		return  false ;
	}
}
