package Solved;

import java.util.HashMap;

public class Solution1399 {
	public int countLargestGroup(int n) {
		HashMap<Integer, Integer> count = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			int sum = digitSum(i);
			count.put(sum, count.getOrDefault(sum, 0) + 1);
		}
		int max = Integer.MIN_VALUE;
		int res = 0;
		for (int key : count.keySet()){
			if (count.get(key) > max){
				max = count.get(key);
				res = 1;
			}else if (count.get(key) == max)
				res += 1;
		}
		return res;
	}
	private int digitSum(int num){
		int res = 0;
		while (num > 0){
			res += num % 10;
			num /= 10;
		}
		return res;
	}
}
