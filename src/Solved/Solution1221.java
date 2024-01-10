package Solved;

public class Solution1221 {
	public int balancedStringSplit(String s) {
		int count = 0;
		int balance = 0;
		for (char c : s.toCharArray()){
			if (c == 'L')
				balance += 1;
			else balance -= 1;
			if (balance == 0)
				count += 1;
		}
		return count;
	}
}
