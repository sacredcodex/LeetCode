package Solved;

import java.util.Arrays;

public class Solution55 {
	public boolean canJump(int[] nums) {
		/*
		boolean[] jump = new boolean[nums.length];
		Arrays.fill(jump, false);
		jump[jump.length-1] = true;
		for (int i = jump.length - 1; i >= 0; i--) {
			for (int j = 1; j <= nums[i]; j++) {
				try{
					jump[i] = jump[i] || jump[i+j];
				}catch (IndexOutOfBoundsException e){
					break;
				}
			}
		}
		return jump[0];
		 */
		int far = nums[0];
		int index = 1;
		while(index <= far && far < nums.length) {
			far = Math.max(far, index + nums[index]);
			index += 1;
		}
		return far >= nums.length - 1;
	}


}
