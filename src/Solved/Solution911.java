package Solved;

public class Solution911 {
	class TopVotedCandidate {
		/**
		 * 执行用时：54 ms, 在所有 Java 提交中击败了96.33%的用户
		 * 内存消耗：47.1 MB, 在所有 Java 提交中击败了97.96%的用户
		 */

		private int[] top;
		private int[] time;

		public TopVotedCandidate(int[] persons, int[] times) {
			time = times;
			top = new int[times.length];
			int[] vote = new int[5000];
			int max = 0;

			for (int i = 0; i < time.length; i++) {
				if (++vote[persons[i]] >= max) {
					top[i] = persons[i];
					max = vote[persons[i]];
				}
				else top[i] = top[i-1];
			}
		}

		public int q(int t) {
			return top[getIndex(t)];
		}

		private int getIndex(int t) {
			int a = 0, b = time.length - 1;
			while (a < b) {
				if (time[(a+b)>>1] == t)
					return (a + b) >> 1;
				if (time[(a+b)>>1] > t)
					b = ((a+b)>>1)- 1;
				else a = ((a+b)>>1)+ 1;
			}
			if (time[a] > t)
				return a-1;
			if (time[b] < t)
				return b;
			else return a;
		}
	}
}
