package Solved;

public class Solution793 {
	public int preimageSizeFZF(int k) {
		int res = 0;
		while(k > 0){
			k /= 5;
			res += k;
		}
		return res;
	}
}
