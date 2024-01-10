package Solved;

public class Solution2029 {
	public boolean stoneGameIX(int[] stones) {
		boolean win = true;
		for (int num : stones){
			if (num % 3 == 0)
				win = !win;
		}
		return win;
	}
}
