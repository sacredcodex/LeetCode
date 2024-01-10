package Solved;

public class Solution942 {
	public int[] diStringMatch(String s) {
		int[] res = new int[s.length()+1];
		int max = s.length();
		int min = 0;
		for (int i = s.length() - 1; i >= 0; i -= 1) {
			if (s.charAt(i) == 'I'){
				res[i+1] = max--;
			}else res[i+1] = min++;
		}
		res[0] = max;
		return res;
	}
}
