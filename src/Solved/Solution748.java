package Solved;

public class Solution748 {
	public String shortestCompletingWord(String licensePlate, String[] words) {
		int[] count = count(licensePlate);
		String res = "1234567890123456";
		for (String str : words){
			if (compare(count, count(str)) && str.length()<res.length())
				res = str;
		}
		return res;
	}
	private int[] count(String str) {
		char[] chars = str.toUpperCase().toCharArray();
		int[] count = new int[26];
		for (char c : chars){
			try {
				count[c-'A'] += 1;
			}catch (IndexOutOfBoundsException ignored){}
		}
		return count;
	}
	private boolean compare(int[] a, int[] b) {
		for (int i = 0; i < 26; i++) {
			if (a[i] > b[i])
				return false;
		}
		return true;
	}
}
