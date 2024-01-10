package Solved;

import java.util.Arrays;

public class Solution1051 {
	public int heightChecker(int[] heights) {
		int[] expected = Arrays.copyOf(heights, heights.length);
		Arrays.sort(expected);
		int count = 0;
		for (int i = 0; i < heights.length; i++) {
			if (expected[i] != heights[i])
				count += 1;
		}
		return count;
	}
}
