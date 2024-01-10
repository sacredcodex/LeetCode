package Solved;

public class Solution1869 {
	public static boolean checkZeroOnes(String s) {
		char[] chars = s.toCharArray();
		int lengthZero = 0;
		int lengthOne = 0;
		int length = 1;
		char last = chars[0];
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == last)
				length += 1;
			else {
				if (last == '1')
					lengthOne = Math.max(length, lengthOne);
				else lengthZero = Math.max(length, lengthZero);
				length = 1;
				last = chars[i];
			}
		}
		if (last == '1')
			lengthOne = Math.max(length, lengthOne);
		else lengthZero = Math.max(length, lengthZero);
		System.out.println(lengthZero+","+lengthOne);
		return lengthOne > lengthZero;
	}

	public static void main(String[] args) {
		System.out.println(checkZeroOnes("01111110"));
	}
}
