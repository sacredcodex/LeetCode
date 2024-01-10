package Solved;

import java.util.ArrayList;
import java.util.Stack;

public class Solution1414 {
	public int findMinFibonacciNumbers(int k) {
		if (k < 4) return 1;
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		while (arrayList.get(arrayList.size() - 1) < k){
			arrayList.add(arrayList.get(arrayList.size() - 1) + arrayList.get(arrayList.size() - 2));
		}
		int count = 0;
		for (int i = arrayList.size() - 1; i >= 0; i-= 1) {
			int num = arrayList.get(i);
			if (num <= k){
				k -= num;
				count += 1;
			}
		}
		return count;
	}
}
