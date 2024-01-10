package Solved;

public class Solution1832 {
	public boolean checkIfPangram(String sentence) {
		int[] count = new int[26];
		int num = 0;
		for (char c : sentence.toCharArray()){
			if (count[c-'a'] == 0) {
				count[c - 'a'] += 1;
				num += 1;
			}
			if (num == 26)
				return true;
		}
		return false;
	}
}
