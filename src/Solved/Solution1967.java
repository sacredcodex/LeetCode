package Solved;

public class Solution1967 {
	public int numOfStrings(String[] patterns, String word) {
		int count = 0;
		for (String pattern : patterns) {
			if (word.contains(pattern))
				count += 1;
		}
		return count;
	}
}
