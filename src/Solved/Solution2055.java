package Solved;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution2055 {
	TreeMap<Integer, Integer> map = new TreeMap<>();
	public int[] platesBetweenCandles(String s, int[][] queries) {
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '|')
				map.put(i, num++);
		}
		int[] res = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			res[i] = search(queries[i]);
		}
		return res;
	}
	private int search(int[] query){
		if (query[1] - query[0] < 2) return 0;
		int last = map.floorKey(query[1]);
		int first = map.ceilingKey(query[0]);
		if (last <= first) return 0;
		return last - first - (map.get(last) - map.get(first));
	}
}
