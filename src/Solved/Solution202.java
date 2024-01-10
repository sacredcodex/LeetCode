package Solved;

import java.util.HashSet;

public class Solution202 {
	public boolean isHappy(int n) {
		HashSet<Integer> hashSet = new HashSet<>();
		int num = n;
		while(hashSet.add(num)){
			num = calculate(num);
		}
		return hashSet.contains(1);
	}
	private int calculate(int n) {
		int res = 0;
		while(n > 0){
			int a = n % 10;
			n /= 10;
			res += a * a;
		}
		return res;
	}
}
