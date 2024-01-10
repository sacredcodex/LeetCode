package Solved;

public class Solution400 {
	private static final int[] num = {9,180,2700,36000,450000,5400000,63000000,720000000};

	public int findNthDigit(int n) {
		int index;
		for (index = 0; index < num.length; index++) {
			if (n>num[index])
				n -= num[index];
			else
				break;
		}
		int a = (int) Math.ceil(n/(index+1));
		int b = (n-1) % (index + 1);
		String s = Integer.toString((int) Math.pow(10,index)+a);
		return s.charAt(b) - '0';
	}
}
