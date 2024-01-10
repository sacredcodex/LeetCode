package Solved;

public class Solution461 {
	public int hammingDistance(int x, int y) {
		int a = x ^ y;
		int count = 0;
		while(a > 0){
			if ((a & 1) == 1)
				count += 1;
			a >>= 1;
		}
		return count;
	}
}
