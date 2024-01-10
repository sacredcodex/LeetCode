package Solved;

public class Solution169 {
	public int majorityElement(int[] nums) {
		int count = 0;
		int maj = 0;
		for (int num : nums){
			if (count == 0){
				maj = num;
				count = 1;
			}else {
				if (maj == num){
					count += 1;
				}else {
					count -= 1;
				}
			}
		}
		return maj;
	}
}
