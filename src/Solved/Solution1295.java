package Solved;

public class Solution1295 {
	public int findNumbers(int[] nums) {
		int count = 0;
		for (int num : nums){
			if ((Integer.toString(num).length() & 1) == 0)
				count += 1;
		}
		return count;
	}
}
