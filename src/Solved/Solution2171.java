package Solved;

import java.util.HashMap;

public class Solution2171 {
	public long minimumRemoval(int[] beans) {
		int[] count = new int[100001];
		long sum = 0;
		for (int bean : beans){
			count[bean] += 1;
			sum += bean;
		}
		for (int i = 99999; i >= 0; i -= 1) {
			count[i] += count[i+1];
		}
		long max = 0;
		for (int i = 0; i < 100001; i++) {
			long times = (long) i * count[i];
			if (times > max)
				max = times;
		}
		return sum - max;
	}
}
