package Solved;

public class Solution377 {
	public int combinationSum4(int[] nums, int target) {
		int[] combinations = new int[target+1];
		combinations[0] = 1;
		for (int i = 1; i < combinations.length; i++) {
			for (int j : nums) {
				if (j < i)
					combinations[i] += combinations[i-j];
			}
		}
		return combinations[target];
	}
}
