package Solved;

public class Solution2011 {
	public int finalValueAfterOperations(String[] operations) {
		int res = 0;
		for (String operation : operations) {
			if (operation.charAt(1) == '+')
				res += 1;
			else res -= 1;
		}
		return res;
	}
}
