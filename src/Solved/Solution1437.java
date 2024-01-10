package Solved;

public class Solution1437 {
	public boolean kLengthApart(int[] nums, int k) {
		if (k == 0) return true;
		int index = 0;
		while (index < nums.length){
			while (nums[index] == 0) {
				index += 1;
				if (index == nums.length) return true;
			}
			for (int i = 0; i < k; i++) {
				index += 1;
				if (index == nums.length) return true;
				if (nums[index] == 1)
					return false;
			}
		}
		return true;
	}
}
