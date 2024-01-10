package Solved;

import java.util.HashSet;
import java.util.Random;

public class Solution519 {
	class Solution {

		HashSet<Integer> ones = new HashSet<>();
		int m,n;
		Random r = new Random();

		public Solution(int m, int n) {
			this.m = m;
			this.n = n;
		}

		public int[] flip() {
			int one;
			do {
				one = r.nextInt(m*n);
			}while (!ones.add(one));
			int[] indexs = new int[2];
			indexs[0] = one / n;
			indexs[1] = one % n;
			return indexs;
		}

		public void reset() {
			ones.clear();
		}
	}
}
