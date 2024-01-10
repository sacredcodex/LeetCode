package Solved;

public class Solution2038 {
	public boolean winnerOfGame(String colors) {
		String[] subStrings1 = colors.split("A");
		int b = 0;
		for (String s : subStrings1){
			b += Math.max(0, s.length() - 2);
		}
		String[] subStrings2 = colors.split("B");
		int a = 0;
		for (String s : subStrings2){
			a += Math.max(0, s.length() - 2);
		}
		return a > b;
	}
}
