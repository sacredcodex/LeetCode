package Solved;

public class Solution34 {
	public int[] searchRange(int[] nums, int target) {
		if (nums.length == 0) return new int[]{-1, -1};
		else if(nums.length == 1) {
			if (nums[0] == target)
				return new int[]{0, 0};
			else return new int[]{-1, -1};
		}
		return new int[]{searchFirst(nums, target, 0, nums.length-1), searchLast(nums, target, 0, nums.length-1)};
	}
	private int searchFirst(int[] nums, int target, int a, int b){
		if (b - a <= 1){
			if (nums[a] == target) return a;
			else if (nums[b] == target) return b;
			else return -1;
		}
		int middle = a + b;
		middle >>= 1;
		if (nums[middle] == target){
			if (middle == 0 || nums[middle - 1] < target)
				return middle;
			else return searchFirst(nums, target, a, middle - 1);
		}else if (nums[middle] < target)
			return searchFirst(nums, target, middle + 1, b);
		else return searchFirst(nums, target, a, middle - 1);
	}
	private int searchLast(int[] nums, int target, int a, int b){
		if (b - a <= 1){
			if (nums[b] == target) return b;
			else if (nums[a] == target) return a;
			else return -1;
		}
		int middle = a + b;
		middle >>= 1;
		if (nums[middle] == target){
			if (middle == nums.length - 1 || nums[middle + 1] > target)
				return middle;
			else return searchLast(nums, target, middle + 1, b);
		}else if (nums[middle] < target)
			return searchLast(nums, target, middle + 1, b);
		else return searchLast(nums, target, a, middle - 1);
	}
}
