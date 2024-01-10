package Solved;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class Solution380 {
	static class RandomizedSet {

		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> map2 = new HashMap<>();
		int size = 0;
		Random random = new Random();

		public RandomizedSet() {
		}

		public boolean insert(int val) {
			if (map2.containsKey(val))
				return false;
			else {
				map2.put(val, size);
				map.put(size++, val);
				return true;
			}
		}

		public boolean remove(int val) {
			if (map2.containsKey(val)){
				int index = map2.remove(val);
				int lastValue = map.remove(size - 1);
				if (lastValue != val){
					map.put(index, lastValue);
					map2.put(lastValue, index);
				}
				size -= 1;
				return true;
			}else {
				return false;
			}
		}

		public int getRandom() {
			return map.get(random.nextInt(size));
		}
	}

	public static void main(String[] args) {
		RandomizedSet randomizedSet = new RandomizedSet();
		randomizedSet.insert(1);
		randomizedSet.remove(2);
		randomizedSet.insert(2);
		System.out.println(randomizedSet.getRandom());
		randomizedSet.remove(1);
		randomizedSet.insert(2);
		System.out.println(randomizedSet.getRandom());
	}
}
