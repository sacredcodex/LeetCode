package Solved;

public class Solution798 {
	public int bestRotation(int[] nums) {
		int n = nums.length;
		int[] scores = new int[n];
		for (int i = 0; i < n; i++) {
			int index = i;
			int num = nums[i];
			if (num <= index) {
				scores[0] += 1;
				if (index - num + 1 < n)
					scores[index - num + 1] -= 1;
			}else {
				if (index + n - num + 1 < n)
					scores[index + n - num + 1] -= 1;
			}
			if (index + 1 < n)
				scores[index + 1] += 1;
		}
		int res = 0;
		int max = 0;
		int k = 0;
		for (int i = 0; i < scores.length; i++) {
			int change = scores[i];
			res += change;
			if (max < res){
				max = res;
				k = i;
			}
		}
		return k;
	}
}
