package Solved;

import java.util.LinkedList;

public class Solution705 {

	class MyHashSet {

		LinkedList<Integer>[] lists;
		final int K = 1223;

		public MyHashSet() {
			lists = new LinkedList[K];
			for (int i = 0; i < K; i++) {
				lists[i] = new LinkedList<>();
			}
		}

		public void add(int key) {
			if (!lists[key % K].contains(key))
				lists[key % K].add(key);
		}

		public void remove(int key) {
			int index = lists[key % K].indexOf(key);
			if (index >= 0)
				lists[key % K].remove(index);
		}

		public boolean contains(int key) {
			return lists[key % K].contains(key);
		}
	}
}
