package Solved;

public class Solution1837 {
	public int sumBase(int n, int k) {
		int num = 0;
		while(n > 0){
			num += n % k;
			n /= k;
		}
		return num;
	}
}
