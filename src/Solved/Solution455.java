package Solved;

import java.util.Arrays;

public class Solution455 {
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int indexG = 0;
		for (int size : s) {
			if (size >= g[indexG]){
				indexG += 1;
				if (indexG == g.length)
					return indexG;
			}
		}
		return indexG;
	}
}
