package Solved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution599 {
	public String[] findRestaurant(String[] list1, String[] list2) {
		HashMap<String, HashSet<Integer>> hashMap = new HashMap<>();
		for (int i = 0; i < list1.length; i++) {
			HashSet<Integer> hashSet = new HashSet<>();
			hashSet.add(i);
			hashMap.put(list1[i], hashSet);
		}
		for (int i = 0; i < list2.length; i++) {
			if (hashMap.containsKey(list2[i]))
				hashMap.get(list2[i]).add(1000 + i);
			else {
				HashSet<Integer> hashSet = new HashSet<>();
				hashSet.add(1000 + i);
				hashMap.put(list2[i], hashSet);
			}
		}
		List<String> res = new ArrayList<>();
		int sum = Integer.MAX_VALUE;
		for (String str : hashMap.keySet()){
			if (hashMap.get(str).size() == 2){
				int sums = 0;
				for (int num : hashMap.get(str)){
					sums += num;
				}
				if (sums < sum){
					res.clear();
					sum = sums;
					res.add(str);
				}else if (sums == sum)
					res.add(str);
			}
		}
		String[] ress = new String[res.size()];
		int index = 0;
		for (String str : res)
			ress[index ++] = str;
		return ress;
	}
}
