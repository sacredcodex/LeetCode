package Solved;

public class Solution1460 {
	public boolean canBeEqual(int[] target, int[] arr) {
		int[] count = new int[1001];
		for (int num : target)
			count[num] += 1;
		for (int num : arr)
			count[num] -= 1;
		for (int num : count)
			if (num != 0)
				return false;
		return true;
	}
}
