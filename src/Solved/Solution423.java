package Solved;

import java.util.HashMap;

public class Solution423 {
	public String originalDigits(String s) {
		int[] numbers = new int[10];
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
				case 'z':
					numbers[0]++;
					break;
				case 'o':
					numbers[1]++;
					break;
				case 'w':
					numbers[2]++;
					break;
				case 'h':
					numbers[3]++;
					break;
				case 'u':
					numbers[4]++;
					break;
				case 'f':
					numbers[5]++;
					break;
				case 'x':
					numbers[6]++;
					break;
				case 'v':
					numbers[7]++;
					break;
				case 'g':
					numbers[8]++;
					break;
				case 'i':
					numbers[9]++;
					break;
			}
		}
		numbers[1] = numbers[1] - numbers[0] - numbers[2] - numbers[4];
		numbers[3] -= numbers[8];
		numbers[5] -= numbers[4];
		numbers[7] -= numbers[5];
		numbers[9] = numbers[9] - numbers[5] - numbers[6] - numbers[8];
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < numbers[i]; j++) {
				res.append(i);
			}
		}
		return res.toString();
	}
}
