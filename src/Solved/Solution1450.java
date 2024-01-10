package Solved;

public class Solution1450 {
	public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		int count = 0;
		for (int i = 0; i < startTime.length; i++) {
			if (startTime[i] <= queryTime && queryTime <= endTime[i])
				count += 1;
		}
		return count;
	}
}
