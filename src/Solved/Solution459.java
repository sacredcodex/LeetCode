package Solved;

public class Solution459 {
	public boolean repeatedSubstringPattern(String s) {
		return (s+s).substring(1).indexOf(s)!=s.length();
	}
}
