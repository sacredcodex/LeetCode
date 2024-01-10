package Solved;

import java.util.HashSet;
import java.util.List;

public class Solution1436 {
	public String destCity(List<List<String>> paths) {
		HashSet<String> start = new HashSet<>();
		HashSet<String> end = new HashSet<>();
		for (List<String> path : paths){
			start.add(path.get(0));
			end.add(path.get(1));
		}
		end.removeAll(start);
		for (String str : end)
			return str;
		return "";
	}
}
