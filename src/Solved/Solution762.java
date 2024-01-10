package Solved;

import java.util.Arrays;

public class Solution762 {

	final int[] prime = new int[]{2,3,5,7,11,13,17,19};
	public int countPrimeSetBits(int left, int right) {
		int count = 0;
		for (int i = left; i < right; i++) {
			if (primeBits(i)) {
				System.out.println(i);
				count += 1;
			}
		}
		return count;
	}
	private boolean isPrime(int num){
		if (num == 1) return false;
		if (num == 2 || num == 3 || num == 5) return true;
		return num % 2 != 0 && num % 3 != 0 && num % 5 != 0;
	}
	private boolean primeBits(int num){
		int count = 0;
		while (num > 0){
			if ((num & 1) == 1)
				count += 1;
			num >>= 1;
		}
		return isPrime(count);
	}
}
