package Solved;

import java.util.HashMap;

public class Solution383 {
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] magazineNum = new int[26];
		char[] magazineChar = magazine.toCharArray();
		for (char c : magazineChar) {
			magazineNum[c-'a'] += 1;
		}
		char[] ransomChar = ransomNote.toCharArray();
		for (char c : ransomChar) {
			magazineNum[c-'a'] -= 1;
		}
		for (int i : magazineNum) {
			if (i < 0)
				return false;
		}
		return true;
	}
}
