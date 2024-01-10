package Solved;

import java.util.TreeMap;

public class Solution715 {
	class RangeModule {

		TreeMap<Integer, Integer> treeMap;

		public RangeModule() {
			treeMap = new TreeMap<>();
		}

		public void addRange(Integer left, int right) {
			if (treeMap.floorKey(left) != null && treeMap.floorKey(left) == left){
				if (treeMap.get(left) == -1)
					treeMap.remove(left);
			}else {
				Integer leftleft = treeMap.firstKey();
			}
		}

		public boolean queryRange(int left, int right) {
			return true;
		}

		public void removeRange(int left, int right) {

		}
	}
}
