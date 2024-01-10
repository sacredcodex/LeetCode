package Solved;

public class Solution1567 {
	public static int getMaxLen(int[] nums) {
		int maxPos = 0;
		int maxNeg = 0;
		int maxLength = 0;
		for (int num : nums) {
			if (num > 0) {
				maxPos += 1;
				if (maxNeg > 0)
					maxNeg += 1;
			} else if (num < 0) {
				int tmp = maxPos;
				if (maxNeg > 0)
					maxPos = maxNeg + 1;
				else maxPos = 0;
				maxNeg = tmp + 1;
			} else {
				maxPos = 0;
				maxNeg = 0;
			}
			maxLength = Math.max(maxLength, maxPos);
		}
		return maxLength;
	}

	public static void main(String[] args) {
		System.out.println(getMaxLen(new int[]{1,1,1,1,-1,1,0,1}));
	}
}
