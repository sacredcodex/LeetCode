package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution830 {
	public List<List<Integer>> largeGroupPositions(String s) {
		List<List<Integer>> res = new ArrayList<>();
		char[] chars = s.toCharArray();
		int now = 0;
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] != chars[now]){
				if (i - now >= 3){
					List<Integer> e = new ArrayList<>();
					e.add(now);
					e.add(i-1);
					res.add(e);
				}
				now = i;
			}
		}
		if (chars.length - now >= 3){
			List<Integer> e = new ArrayList<>();
			e.add(now);
			e.add(chars.length-1);
			res.add(e);
		}
		return res;
	}
}
