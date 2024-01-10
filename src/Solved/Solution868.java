package Solved;

public class Solution868 {
	public int binaryGap(int n) {
		if ((n & (n-1)) == 0) return 0;
		while((n & 1) != 1){
			n >>= 1;
		}
		int max = 0;
		while (n > 0){
			n >>= 1;
			int length = 1;
			while ((n & 1) != 1 && n > 0){
				n >>= 1;
				length += 1;
			}
			if (length > max)
				max = length;
		}
		return max;
	}
}
