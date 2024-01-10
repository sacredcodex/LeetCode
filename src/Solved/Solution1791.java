package Solved;

import java.util.HashSet;

public class Solution1791 {
	public int findCenter(int[][] edges) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int[] edge : edges){
			for (int e : edge)
				if (!hashSet.add(e))
					return e;
		}
		return 0;
	}
}
