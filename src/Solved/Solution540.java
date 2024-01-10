package Solved;

public class Solution540 {
	public int singleNonDuplicate(int[] nums) {
		return binary(nums, 0, nums.length - 1);
	}

	private int binary(int[] nums, int begin, int end){
		if (begin == end) return nums[begin];
		int middle = (begin + end) >> 1;
		if (nums[middle] == nums[middle - 1])
			return middle % 2 == 0 ? binary(nums, begin, middle) : binary(nums, middle + 1, end);
		if (nums[middle] == nums[middle + 1])
			return middle % 2 == 0 ? binary(nums, middle, end) : binary(nums, begin, middle - 1);
		return nums[middle];
	}
}
