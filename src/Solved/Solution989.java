package Solved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution989 {
	public List<Integer> addToArrayForm(int[] num, int k) {
		List<Integer> res = new ArrayList<Integer>();
		int n = num.length;
		for (int i = n - 1; i >= 0; --i) {
			int sum = num[i] + k % 10;
			k /= 10;
			if (sum >= 10) {
				k++;
				sum -= 10;
			}
			res.add(sum);
		}
		for (; k > 0; k /= 10) {
			res.add(k % 10);
		}
		Collections.reverse(res);
		return res;
	}
}
