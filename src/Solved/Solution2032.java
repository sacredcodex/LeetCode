package Solved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Solution2032 {
	public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
		int[] count = new int[100];
		for (int num : nums1)
			if (count[num-1] % 8 == 0)
				count[num-1] += 4;
		for (int num : nums2)
			if (count[num-1] % 4 == 0)
				count[num-1] += 2;
		for (int num : nums3)
			if (count[num-1] % 2 == 0)
				count[num-1] += 1;
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			if (count[i] == 3 || count[i] == 5 || count[i] == 6 || count[i] == 7)
				res.add(i+1);
		}
		return res;
	}
}
