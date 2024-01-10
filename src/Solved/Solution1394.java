package Solved;

import java.util.HashMap;

public class Solution1394 {
	public int findLucky(int[] arr) {
		HashMap<Integer, Integer> count = new HashMap<>();
		for (int num : arr)
			count.put(num, count.getOrDefault(num, 0) + 1);
		int res = -1;
		for (int num : count.keySet()){
			if (num == count.get(num) && num > res)
				res = num;
		}
		return res;
	}
}
