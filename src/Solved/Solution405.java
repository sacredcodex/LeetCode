package Solved;

import java.util.Arrays;

public class Solution405 {
	private static char[] chars = new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	public static String toHex(int num) {
		if (num == 0) return "0";
		int[] nums = new int[32];
		if (num<0){
			num = (int) (2147483648l + num);
			nums[0] = 1;
		}
		int index = 31;
		while(num > 0){
			nums[index--] = num % 2;
			num /= 2;
		}
		System.out.println(Arrays.toString(nums));
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			int a = 0;
			for (int j = 0; j < 4; j++) {
				a *= 2;
				a += nums[4 * i +j];
			}
			if (a != 0 || stringBuilder.length() != 0)
				stringBuilder.append(chars[a]);
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		System.out.println(toHex(26));
	}
}
