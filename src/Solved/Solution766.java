package Solved;

import java.util.HashMap;
import java.util.HashSet;

public class Solution766 {
	public boolean isToeplitzMatrix(int[][] matrix) {
		HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (hashMap.containsKey(j-i)){
					hashMap.get(j-i).add(matrix[i][j]);
				}else {
					HashSet<Integer> hashSet = new HashSet<>();
					hashSet.add(matrix[i][j]);
					hashMap.put(j-i, hashSet);
				}
			}
		}
		for (HashSet set : hashMap.values()){
			if (set.size() == 2)
				return false;
		}
		return true;
	}
}
