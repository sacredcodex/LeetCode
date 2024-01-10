package Solved;

public class Solution825 {
	public int numFriendRequests(int[] ages) {
		int[] peopleNum = new int[121];
		int res = 0;
		for (int age : ages) {
			peopleNum[age] += 1;
		}
		for (int i = 0; i < 121; i++) {
			for (int j = i-1; j > i/2 + 7 ; j--) {
				res += peopleNum[i] *peopleNum[j];
			}
			if (i > 14)
				res += peopleNum[i] * (peopleNum[i] - 1);
		}
		return res;

	}
}
