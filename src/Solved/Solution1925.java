package Solved;

public class Solution1925 {
	public int countTriples(int n) {
		int count = 0;
		for (int i = 3; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int c2 = i * i + j * j;
				int c = (int) Math.sqrt(c2 + 1);
				if (c > n) break;
				if (c * c == c2) count += 1;
			}
		}
		return count << 1;
	}
}
