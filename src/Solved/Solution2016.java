package Solved;

public class Solution2016 {
	public int maximumDifference(int[] nums) {
		int minNum = nums[0];
		int maxDif = 0;
		for (int num : nums) {
			if (num > minNum)
				maxDif = Math.max(maxDif, num - minNum);
			else minNum = num;
		}
		return maxDif;
	}
}
