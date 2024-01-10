package Solved;

import java.util.Arrays;
import java.util.HashMap;

public class Solution1331 {
	public int[] arrayRankTransform(int[] arr) {
		int[] res = Arrays.copyOf(arr,arr.length);
		Arrays.sort(arr);
		HashMap<Integer, Integer> map = new HashMap<>();
		int num = 1;
		for (int j : arr) {
			if (!map.containsKey(j))
				map.put(j, num++);
		}

		for (int i = 0; i < res.length; i++) {
			res[i] = map.get(res[i]);
		}
		return res;
	}
}
