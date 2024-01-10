package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> res = new ArrayList<>();
		long num = 1;
		res.add((int)num);
		for (int i = 1; i < rowIndex + 1; i++) {
			num = num * (rowIndex + 1 - i) / i;
			res.add((int)num);
		}
		return res;
	}
}
