package Solved;

public class Solution1365 {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] count = new int[102];
		for (int num : nums)
			count[num] += 1;
		for (int i = 1; i < 102; i++) {
			count[i] += count[i-1];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] == 0 ? 0 : count[nums[i]-1];
		}
		return nums;
	}
}
