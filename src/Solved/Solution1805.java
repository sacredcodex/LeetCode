package Solved;

import java.util.HashSet;

public class Solution1805 {
	public int numDifferentIntegers(String word) {
		String[] nums = word.split("[a-z]+");
		HashSet<String> set = new HashSet<>();
		for (String num : nums) {
			while (num.length() > 1 && num.charAt(0) == '0')
				num = num.substring(1);
			set.add(num);
		}
		set.remove("");
		return set.size();
	}
}
