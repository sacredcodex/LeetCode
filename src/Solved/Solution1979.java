package Solved;

public class Solution1979 {
	public int findGCD(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int num : nums) {
			if (num > max)
				max = num;
			if (num < min)
				min = num;
		}
		return greatestCommonDivisor(max, min);
	}
	private int greatestCommonDivisor(int a, int b){
		int p = a / b;
		int q = a % b;
		if (q == 0) return b;
		return greatestCommonDivisor(b, q);
	}
}
