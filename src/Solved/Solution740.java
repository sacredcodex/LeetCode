package Solved;

public class Solution740 {
	public int deleteAndEarn(int[] nums) {
		int[] numbers = new int[10001];
		for (int num : nums) {
			numbers[num] += 1;
		}
		int[] sums = new int[numbers.length];
		sums[0] = 0;
		sums[1] = numbers[1];
		sums[2] = 2 * numbers[2];
		for (int i = 3; i < numbers.length; i++) {
			sums[i] = numbers[i] * i + Math.max(sums[i-2], sums[i-3]);
		}
		return Math.max(sums[sums.length-1], sums[sums.length-2]);
	}
}
