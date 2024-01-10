package Solved;

import java.util.Arrays;
import java.util.HashSet;

public class Solution888 {
	public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		int difference = 0;
		HashSet<Integer> hashSet = new HashSet<>();
		for (int num : aliceSizes)
			difference += num;
		for (int num : bobSizes) {
			difference -= num;
			hashSet.add(num);
		}
		difference >>= 1;
		for (int num : aliceSizes){
			int target = num - difference;
			if (hashSet.contains(target))
				return new int[]{num, target};
		}
		return new int[]{};
	}
}
