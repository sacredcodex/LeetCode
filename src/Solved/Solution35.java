package Solved;

public class Solution35 {
	public static int searchInsert(int[] nums, int target) {
		int a = 0, b = nums.length-1;
		int m = 0;
		while (b-a>1){
			m = a + b >> 1;
			if (nums[m] == target)
				return m;
			if (nums[m] < target)
				a = m;
			else
				b = m;
		}
		if (nums[a] >= target)
			return a;
		if (nums[b] >= target)
			return b;
		else return b+1;
	}

	public static void main(String[] args) {
		System.out.println(searchInsert(new int[]{0,3,5,6},2));
	}
}
