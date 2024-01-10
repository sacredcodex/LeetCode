package Solved;

import java.util.Arrays;

public class Solution338 {
	public static int[] countBits(int n) {
		int[] res = new int[n+1];
		int length = 1;
		int index = 1;
		while(index < n + 1){
			if (index >= length << 1){
				length <<= 1;
			}else {
				res[index] = res[index - length] + 1;
				index += 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(5)));
	}
}
