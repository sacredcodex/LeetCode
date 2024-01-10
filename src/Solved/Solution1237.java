package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution1237 {
	static class CustomFunction{
		int f(int x, int y){
			return x + y;
		}
	}
	public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 1000; i > 0; i -= 1) {
			int begin = 1;
			if (res.size() > 0){
				begin = res.get(res.size() - 1).get(1) + 1;
			}
			for (int j = begin; j < 1001; j++) {
				if (customfunction.f(i,j) == z){
					List<Integer> list = new ArrayList<>();
					list.add(i);
					list.add(j);
					res.add(list);
					break;
				}
			}
		}
		return res;
	}
}
