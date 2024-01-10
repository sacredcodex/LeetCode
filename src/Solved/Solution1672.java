package Solved;

public class Solution1672 {
	public int maximumWealth(int[][] accounts) {
		int max = 0;
		for (int[] array : accounts){
			int sum = 0;
			for (int num : array)
				sum += num;
			if (sum > max)
				max = sum;
		}
		return max;
	}
}
