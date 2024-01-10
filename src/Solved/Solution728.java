package Solved;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution728 {
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			if (isSelfDividing(i))
				list.add(i);
		}
		return list;
	}
	private static boolean isSelfDividing(int num){
		int copy = num;
		HashSet<Integer> hashSet = new HashSet<>();
		while (num > 0){
			hashSet.add(num % 10);
			num /= 10;
		}
		if (hashSet.contains(0))
			return false;
		for (int e : hashSet) {
			if (copy % e > 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isSelfDividing(13));
	}
}
