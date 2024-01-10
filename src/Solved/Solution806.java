package Solved;

public class Solution806 {
	public int[] numberOfLines(int[] widths, String s) {
		int[] res = new int[]{1, 0};
		for (char c : s.toCharArray()){
			res[1] += widths[c - 'a'];
			if (res[1] > 100){
				res[0] += 1;
				res[1] = widths[c - 'a'];
			}
		}
		return res;
	}
}
