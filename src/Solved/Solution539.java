package Solved;

import java.util.Arrays;
import java.util.List;

public class Solution539 {
	public int findMinDifference(List<String> timePoints) {
		int length = timePoints.size();
		if (length > 1440) return 0;
		int[] times = new int[length];
		int index = 0;
		for (String time : timePoints){
			times[index++] = time(time);
		}
		Arrays.sort(times);
		int dif = times[0] - times[length-1] + 1440;
		for (int i = 1; i < length; i++) {
			dif = Math.min(dif, times[i] - times[i-1]);
		}
		return dif;
	}
	private int time(String time) {
		char[] chars = time.toCharArray();
		return 600 * (chars[0]-'0') + 60 * (chars[1]-'0') + 10 * (chars[3]-'0') + (chars[4]-'0');
	}
}
