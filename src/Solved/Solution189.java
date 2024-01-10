package Solved;

public class Solution189 {
	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length-1);
	}
	private void reverse(int[] nums, int begin, int end) {
		int value;
		while (begin < end){
			value = nums[begin];
			nums[begin] = nums[end];
			nums[end] = value;
			begin++;
			end--;
		}
	}
}
