package Solved;

import java.util.*;

public class Solution345 {
	public int minJumps(int[] arr) {
		HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			HashSet<Integer> hashSet = hashMap.getOrDefault(arr[i], new HashSet<>());
			hashSet.add(i);
			hashMap.put(arr[i], hashSet);
		}
		int[] steps = new int[arr.length];
		Arrays.fill(steps, -1);
		HashSet<Integer> index1 = new HashSet<>();

		index1.add(0);
		int step = 0;
		while (steps[steps.length-1] == -1){
			HashSet<Integer> index2 = new HashSet<>();
			for (int index : index1){
				if (steps[index] == -1) {
					steps[index] = step;
					index2.add(index - 1);
					index2.add(index + 1);
					index2.addAll(hashMap.getOrDefault(arr[index], new HashSet<>()));
					hashMap.remove(arr[index]);
				}
			}
			index2.remove(-1);
			index2.remove(steps.length);
			index1 = index2;
			step += 1;
		}
		return steps[steps.length-1];
	}
}
