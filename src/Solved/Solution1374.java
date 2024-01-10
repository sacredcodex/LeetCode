package Solved;

public class Solution1374 {
	public String generateTheString(int n) {
		if ((n & 1) == 1)
			return "a".repeat(n);
		else return "b" + "a".repeat(n - 1);
	}
}
