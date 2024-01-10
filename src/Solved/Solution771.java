package Solved;

import java.util.Collections;
import java.util.HashSet;

public class Solution771 {
	public int numJewelsInStones(String jewels, String stones) {
		HashSet<Character> jewelSet = new HashSet<>();
		for (char c : jewels.toCharArray()){
			jewelSet.add(c);
		}
		int count = 0;
		for (char c : stones.toCharArray()){
			if (jewelSet.contains(c))
				count += 1;
		}
		return count;
	}
}
