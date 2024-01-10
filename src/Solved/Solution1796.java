package Solved;

import java.util.*;

public class Solution1796 {
	public int secondHighest(String s) {
		HashSet<Integer> set = new HashSet<>();
		for (char c : s.toCharArray()){
			if ('0'<=c && c<='9')
				set.add(c-'0');
		}
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		return list.size() > 1 ? list.get(1) : -1;
	}
}
