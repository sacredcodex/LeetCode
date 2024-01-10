package Solved;

public class Solution1089 {
	public void duplicateZeros(int[] arr) {
		int difference = 0;
		for (int i = 0; i + difference < arr.length; i++) {
			if (arr[i] % 10 == 0) difference += 1;
			else arr[i + difference] += (arr[i] % 10) * 10;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] /= 10;
		}
	}
}
