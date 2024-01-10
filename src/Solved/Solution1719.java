package Solved;

import java.util.HashMap;

public class Solution1719 {
	public int checkWays(int[][] pairs) {
		HashMap<Integer, Integer> degrees = new HashMap<>();
		for (int[] pair : pairs){
			degrees.put(pair[0], degrees.getOrDefault(pair[0], 0) + 1);
			degrees.put(pair[1], degrees.getOrDefault(pair[1], 1) + 1);
		}
		return -1;
	}
}
