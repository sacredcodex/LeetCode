package Solved;

public class Solution344 {
	public void reverseString(char[] s) {
		int index1 = 0;
		int index2 = s.length-1;
		while (index1 < index2){
			char c = s[index1];
			s[index1] = s[index2];
			s[index2] = c;
			index1++;
			index2--;
		}
	}
}
