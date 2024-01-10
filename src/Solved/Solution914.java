package Solved;

import java.util.HashMap;
import java.util.HashSet;

public class Solution914 {
	public boolean hasGroupsSizeX(int[] deck) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int num : deck){
			hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
		}
		int factor = -1;
		for (int num : hashMap.values()){
			if (factor == -1){
				factor = num;
			}else {
				factor = gcd(factor, num);
			}
			if (factor == 1) return false;
		}
		return true;
	}
	public int gcd(int x, int y) {
		return x == 0 ? y : gcd(y % x, x);
	}
}
