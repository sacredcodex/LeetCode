package Solved;

public class Solution3 {
	// 3 求最长无重复字串长度
	public int lengthOfLongestSubstring(String s) {
		if (s.length() == 0)
			return 0;
		int[] distance = new int[s.length()];
		for (int i = 0; i < distance.length; i++) {
			distance[i] = nextCharDistance(s, i);
		}
		int last = 1;
		int max = 1;
		for (int i = distance.length - 2; i >= 0; i--) {
			int res;
			if (distance[i] == -1)
				res = last + 1;
			else res = Math.min(last + 1, distance[i]);
			max = Math.max(max, res);
			last = res;
		}
		return max;
	}
	public int nextCharDistance(String s, int a){
		int nextIndex = s.substring(a+1).indexOf(s.charAt(a));
		if (nextIndex == -1)
			return -1;
		else return nextIndex + 1;
	}
}
