package Solved;

import java.util.HashSet;

public class Solution252 {
	public boolean canAttendMeetings(int[][] intervals) {
		HashSet<Integer[]> hashSet = new HashSet<>();
		for (int[] interval : intervals){
			Integer[] i = new Integer[]{interval[0], interval[1]};
			for (Integer[] exist : hashSet){
				if (!notConflict(i, exist))
					return false;
			}
			hashSet.add(i);
		}
		return true;
	}
	private boolean notConflict(Integer[] a, Integer[] b){
		return a[1] <= b[0] || a[0] >= b[1];
	}
}
