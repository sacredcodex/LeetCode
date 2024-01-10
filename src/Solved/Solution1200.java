package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1200 {
	public List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i] - arr[i-1])
				min = arr[i] - arr[i - 1];
		}
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i-1] == min) {
				List<Integer> list = new ArrayList<>();
				list.add(arr[i-1]);
				list.add(arr[i]);
				res.add(list);
			}
		}
		return res;
	}
}
