package Solved;

import java.util.HashSet;

public class Solution266 {
	public boolean canPermutePalindrome(String s) {
		HashSet<Character> set = new HashSet<>();
		for (char c : s.toCharArray()){
			if (!set.add(c))
				set.remove(c);
		}
		return set.size() <= 1;
	}
}
