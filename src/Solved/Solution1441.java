package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution1441 {
	public List<String> buildArray(int[] target, int n) {
		List<String> res = new ArrayList<>();
		int index = 0;
		for (int i = 1; i <= n; i++) {
			if (target[index] == i){
				res.add("Push");
				if (++index == target.length)
					return res;
			}else {
				res.add("Push");
				res.add("Pop");
			}
		}
		return res;
	}
}
