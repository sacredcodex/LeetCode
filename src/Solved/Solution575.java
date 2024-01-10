package Solved;

import java.util.HashSet;

public class Solution575 {
	public int distributeCandies(int[] candyType) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int type : candyType)
			hashSet.add(type);
		return Math.min(hashSet.size(), candyType.length >> 1);
	}
}
