package Solved;

public class Solution1974 {
	public int minTimeToType(String word) {
		char[] chars = word.toCharArray();
		char last = 'a';
		int time = chars.length;
		for (char c : chars) {
			int dis = Math.abs(c - last);
			time += Math.min(dis, 26 - dis);
			last = c;
		}
		return time;
	}
}
