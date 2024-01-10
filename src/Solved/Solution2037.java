package Solved;

import java.util.Arrays;

public class Solution2037 {
	public int minMovesToSeat(int[] seats, int[] students) {
		Arrays.sort(seats);
		Arrays.sort(students);
		int sum = 0;
		for (int i = 0; i < seats.length; i++) {
			sum += Math.abs(seats[i] - students[i]);
		}
		return sum;
	}
}
