package Solved;

public class Solution283 {
	public void moveZeroes(int[] nums) {
		int i=0,j=0;
		while (i<nums.length){
			if (j < nums.length)
				if (nums[j] == 0)
					j++;
				else {
					nums[i] = nums[j];
					i++;
					j++;
				}
			else{
				nums[i] = 0;
				i++;
			}
		}
	}
}
