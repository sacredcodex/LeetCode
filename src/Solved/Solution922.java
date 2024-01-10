package Solved;

public class Solution922 {
	public int[] sortArrayByParityII(int[] nums) {
		int length = nums.length >> 1;
		int[] odds = new int[length];
		int[] evens = new int[length];
		int indexOdd = 0;
		int indexEven = 0;
		for (int num : nums){
			if ((num & 1) == 1)
				odds[indexOdd++] = num;
			else evens[indexEven++] = num;
		}
		for (int i = 0; i < nums.length; i++) {
			if ((i & 1) == 1){
				nums[i] = odds[i >> 1];
			}else nums[i] = evens[i >> 1];
		}
		return nums;
	}
}
