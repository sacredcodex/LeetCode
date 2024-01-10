package Solved;

public class Solution1893 {
	public boolean isCovered(int[][] ranges, int left, int right) {
		boolean[] arrays = new boolean[51];
		for (int[] range : ranges)
			for (int i = range[0]; i <= range[1]; i++) {
				arrays[i] = true;
			}
		for (int i = left; i <= right; i++) {
			if (!arrays[i]) return false;
		}
		return true;
	}
}
