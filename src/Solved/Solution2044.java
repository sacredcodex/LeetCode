package Solved;

public class Solution2044 {
	int count = 0;
	int n;
	int target;
	int[] nums;
	public int countMaxOrSubsets(int[] nums) {
		target = 0;
		n = nums.length;
		this.nums = nums;
		for (int num : nums)
			target |= num;
		dfs(0, 0, true);
		return count;
	}
	private void dfs(int i, int or, boolean add){
		if (add && or == target) count += 1;
		if (i < n) {
			dfs(i + 1, or | nums[i], true);
			dfs(i + 1, or, false);
		}
	}

}
