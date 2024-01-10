package Solved;

import java.util.HashSet;
import java.util.TreeSet;

public class Solution414 {
	public int thirdMax(int[] nums) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		for (int num : nums) {
			treeSet.add(num);
			if (treeSet.size() > 3)
				treeSet.pollFirst();
		}
		return treeSet.size()==3 ? treeSet.pollFirst() : treeSet.pollLast();
	}
}
