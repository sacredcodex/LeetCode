package Solved;

import java.util.HashSet;

public class Solution1346 {
	public boolean checkIfExist(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : arr){
			if ((num & 1) == 0 && set.contains(num >> 1) || set.contains(num << 1))
				return true;
			set.add(num);
		}
		return false;
	}
}
