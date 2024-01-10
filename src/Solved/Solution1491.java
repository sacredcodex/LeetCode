package Solved;

public class Solution1491 {
	public double average(int[] salary) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int num : salary){
			if (num > max)
				max = num;
			if (num < min)
				min = num;
			sum += num;
		}
		sum -= max;
		sum -= min;
		return (double) sum / (salary.length - 2);
	}
}
