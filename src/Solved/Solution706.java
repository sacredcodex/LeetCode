package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Solution706 {
	class MyHashMap {

		ArrayList<Integer[]>[] lists;
		final int K = 1223;

		public MyHashMap() {
			lists = new ArrayList[K];
			for (int i = 0; i < K; i++) {
				lists[i] = new ArrayList<>();
			}
		}

		public boolean containKey(int key) {
			int h = key % K;
			for (Integer[] entry : lists[h]){
				if (entry[0] == key){
					return true;
				}
			}
			return false;
		}

		public void put(int key, int value) {
			int h = key % K;
			for (Integer[] entry : lists[h]){
				if (entry[0] == key){
					entry[1] = value;
					return;
				}
			}
			lists[h].add(new Integer[]{key, value});
		}

		public int get(int key) {
			int h = key % K;
			for (Integer[] entry : lists[h]){
				if (entry[0] == key){
					return entry[1];
				}
			}
			return -1;
		}

		public void remove(int key) {
			int h = key % K;
			int index = 0;
			for (index = 0; index < lists[h].size(); index++) {
				if (lists[h].get(index)[0] == key)
					break;
			}
			if (index < lists[h].size())
				lists[h].remove(index);
		}
	}
}
