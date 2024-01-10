package Solved;

public class Solution821 {
	public int[] shortestToChar(String s, char c) {
		int[] ans = new int[s.length()];
		int fill = ans.length;
		int index = 0;
		for (char e : s.toCharArray()){
			if (e == c){
				ans[index ++] = 0;
				fill = 0;
			}else {
				ans[index ++] = ++fill;
			}
		}
		for (int i = ans.length - 1; i >= 0 ; i--) {
			if (ans[i] == 0){
				fill = 0;
			}else {
				ans[i] = Math.min(ans[i], ++fill);
			}
		}
		return ans;
	}
}
