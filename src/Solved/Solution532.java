package Solved;

import java.util.Arrays;
import java.util.HashSet;

public class Solution532 {
	public int findPairs(int[] nums, int k) {
		HashSet<Integer> contains = new HashSet<>();
		HashSet<Integer> repeats = new HashSet<>();

		if (k == 0){
			for (int num : nums){
				if (!contains.add(num))
					repeats.add(num);
			}
		}else {
			for (int num : nums){
				if (contains.add(num))
					if (contains.contains(num - k))
						repeats.add(num);
					if (contains.contains(num + k))
						repeats.add(num + k);
			}
		}
		return repeats.size();
	}
}
