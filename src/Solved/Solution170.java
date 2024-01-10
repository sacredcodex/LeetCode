package Solved;

import java.util.HashSet;

public class Solution170 {
	class TwoSum {

		HashSet<Integer> numSet, resSet;

		public TwoSum() {
			numSet = new HashSet<>();
			resSet = new HashSet<>();
		}

		public void add(int number) {
			for (int num : numSet){
				resSet.add(num + number);
			}
			numSet.add(number);
		}

		public boolean find(int value) {
			return resSet.contains(value);
		}
	}
}
