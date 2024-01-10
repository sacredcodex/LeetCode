package Solved;

public class Solution1812 {
	public boolean squareIsWhite(String coordinates) {
		return ((coordinates.charAt(0) - 'a' + coordinates.charAt(1) - '1') & 1) == 1;
	}
}
