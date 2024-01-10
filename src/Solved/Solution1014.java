package Solved;

public class Solution1014 {
	public int maxScoreSightseeingPair(int[] values) {
		int maxScore = 0;
		int maxSingle = values[0];
		for (int i = 1; i < values.length; i++) {
			maxScore = Math.max(maxScore, values[i] + maxSingle -i);
			values[i] = values[i] + i;
			maxSingle = Math.max(maxSingle, values[i]);
		}
		return maxScore;
	}
}
