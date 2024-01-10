package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution1413 {
	public int minStartValue(int[] nums) {
		int sum = 0;
		int min = 0;
		for (int i = 0; i < nums.length; i += 1) {
			sum += nums[i];
			if (sum < min)
				min = sum;
		}
		return 1 - min;
	}
}
