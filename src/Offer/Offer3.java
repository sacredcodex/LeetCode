package Offer;

import java.util.HashSet;

public class Offer3 {
	public int findRepeatNumber(int[] nums) {
		HashSet<Integer> integers = new HashSet<>();
		for (int num : nums)
			if (!integers.add(num))
				return num;
		return 0;
	}
}
