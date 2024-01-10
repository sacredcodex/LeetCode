package Solved;

public class Solution905 {
	public int[] sortArrayByParity(int[] nums) {
		int index1 = 0;
		int index2 = nums.length - 1;
		while (index1 < nums.length && (nums[index1] & 1) == 0)
			index1 += 1;
		while (index2 >= 0 && (nums[index2] & 1) == 1)
			index2 -= 1;
		while (index1 < index2){
			int num = nums[index1];
			nums[index1] = nums[index2];
			nums[index2] = num;
			while (index1 < nums.length && (nums[index1] & 1) == 0)
				index1 += 1;
			while (index2 >= 0 && (nums[index2] & 1) == 1)
				index2 -= 1;
		}
		return nums;
	}
}
