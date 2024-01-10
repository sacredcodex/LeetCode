package Solved;

public class Solution1317 {
	public int[] getNoZeroIntegers(int n) {
		for (int i = 1; i <= n >> 1; i++) {
			if (!containZero(i) && !containZero(n - i))
				return new int[]{i, n - i};
		}
		return new int[2];
	}

	private boolean containZero(int num){
		while (num > 0){
			if (num % 10 == 0) return true;
			num /= 10;
		}
		return false;
	}
}
