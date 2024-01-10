package Solved;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Solution146 {
	class LRUCache {

		int use = 0;
		int size;
		TreeMap<Integer, Integer> keyToValue = new TreeMap<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return keyToTime.get(o1) - keyToTime.get(o2);
			}
		});
		HashMap<Integer, Integer> keyToTime = new HashMap<>();

		public LRUCache(int capacity) {
			size = capacity;
		}

		public int get(int key) {
			return keyToValue.getOrDefault(key, -1);
		}

		public void put(int key, int value) {
			if (keyToValue.size() == size){
				keyToValue.remove(keyToValue.firstKey());
			}
			//keyToValue.put();
		}
	}
}
