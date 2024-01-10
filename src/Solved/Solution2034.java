package Solved;

import java.util.HashMap;
import java.util.TreeMap;

public class Solution2034 {
	class StockPrice {

		TreeMap<Integer, Integer> treeMap;
		HashMap<Integer, Integer> hashMap;
		int currentTime;

		public StockPrice() {
			treeMap = new TreeMap<>();
			hashMap = new HashMap<>();
			currentTime = 0;
		}

		public void update(int timestamp, int price) {
			if (hashMap.containsKey(timestamp)) {
				int oldPrice = hashMap.get(timestamp);
				int times = treeMap.get(oldPrice) - 1;
				if (times == 0)
					treeMap.remove(oldPrice);
				else treeMap.put(oldPrice, times);
			}
			hashMap.put(timestamp, price);
			treeMap.put(price, treeMap.getOrDefault(price, 0)+1);
			if (timestamp>currentTime)
				currentTime = timestamp;
		}

		public int current() {
			return hashMap.get(currentTime);
		}

		public int maximum() {
			return treeMap.floorKey(Integer.MAX_VALUE);
		}

		public int minimum() {
			return treeMap.ceilingKey(Integer.MIN_VALUE);
		}
	}
}
