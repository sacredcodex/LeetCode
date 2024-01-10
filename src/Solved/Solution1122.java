package Solved;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class Solution1122 {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> order = new HashMap<>();
		for (int i = 0; i < arr2.length; i++) {
			order.put(arr2[i],i);
		}
		Integer[] res = new Integer[arr1.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = arr1[i];
		}
		Arrays.sort(res, new Comparator<Integer>(){
			public int compare(Integer i1, Integer i2){
				return order.getOrDefault(i1, 1000 + i1) - order.getOrDefault(i2, 1000 + i2);
			}
		});
		for (int i = 0; i < res.length; i++) {
			arr1[i] = res[i];
		}
		return arr1;
	}
}
