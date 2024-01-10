package Solved;

public class Solution551 {
	public boolean checkRecord(String s) {
		char[] chars = s.toCharArray();
		int countL = 0;
		int count = 0;
		for (char c : chars){
			if (c == 'L'){
				if (++countL == 3)
					return false;
			}else {
				countL = 0;
				if (c == 'A' && ++count == 2)
					return false;
			}
		}
		return true;
	}
}
