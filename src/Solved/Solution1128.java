package Solved;

import java.util.HashMap;

public class Solution1128 {
	public int numEquivDominoPairs(int[][] dominoes) {
		int[] map = new int[100];
		for (int[] domino : dominoes){
			map[code(domino)] += 1;
		}
		int count = 0;
		for (int num : map)
			count += num * (num - 1) / 2;
		return count;
	}
	private int code(int[] pair){
		if (pair[0] < pair[1])
			return pair[0] * 10 + pair[1];
		else return pair[1] * 10 + pair[0];
	}
}
