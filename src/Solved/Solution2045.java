package Solved;

import java.util.HashMap;
import java.util.HashSet;

public class Solution2045 {
	public int secondMinimum(int n, int[][] edges, int time, int change) {
		int[] countUse = new int[n+1];
		HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();
		for (int[] edge : edges){
			if (hashMap.containsKey(edge[0]))
				hashMap.get(edge[0]).add(edge[1]);
			else{
				HashSet<Integer> hashSet = new HashSet<>();
				hashSet.add(edge[1]);
				hashMap.put(edge[0], hashSet);
			}
			if (hashMap.containsKey(edge[1]))
				hashMap.get(edge[1]).add(edge[0]);
			else{
				HashSet<Integer> hashSet = new HashSet<>();
				hashSet.add(edge[0]);
				hashMap.put(edge[1], hashSet);
			}
		}

		HashSet<Integer> current = new HashSet<>();
		current.add(1);
		countUse[1] += 1;
		int countN = 0;
		int length = 0;
		while(countN < 2){
			length += 1;
			HashSet<Integer> next = new HashSet<>();
			for (int point : current){
				next.addAll(hashMap.getOrDefault(point, new HashSet<>()));
			}
			current.clear();
			for (int point : next){
				if (countUse[point] < 2){
					current.add(point);
					countUse[point] += 1;
				}
			}
			if (current.contains(n))
				countN += 1;
		}
		int usedTime = 0;
		for (int i = 0; i < length; i++) {
			usedTime += time;
			if (usedTime / change % 2 == 1 && i < length-1)
				usedTime = (usedTime / change + 1) * change;
		}
		return usedTime;
	}
}
