package Solved;

public class Solution704 {
	public static int search(int[] nums, int target) {
		int a = 0, b =nums.length-1;
		int m;
		while (a<=b){
			m = (a+b) / 2;
			if (nums[m] == target)
				return m;
			else if (nums[m] < target)
				a = m + 1;
			else b = m - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(search(new int[]{2,5},0));
	}
}
