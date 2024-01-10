package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution969 {
	static int n;
	static int[] array;
	public static List<Integer> pancakeSort(int[] arr) {
		List<Integer> res = new ArrayList<>();
		n = arr.length;
		array = arr;
		int current = 1;
		while (current <= n){
			int index = getIndex(current);
			add(res, index + 1);
			reverse(index + 1);
			add(res, n - current + 1);
			reverse(n - current + 1);
			current += 1;
		}
		res.add(n);
		return res;
	}
	private static int getIndex(int num){
		for (int i = 0; i < n; i++) {
			if (array[i] == num)
				return i;
		}
		return -1;
	}
	private static void reverse(int k){
		int a = 0;
		int b = k - 1;
		while (a < b){
			int c = array[a];
			array[a] = array[b];
			array[b] = c;
			a += 1;
			b -= 1;
		}
	}
	private static void add(List<Integer> list, int element){
		if (!list.isEmpty() && list.get(list.size() - 1) == element)
			list.remove(list.size() - 1);
		else list.add(element);
	}

	public static void main(String[] args) {
		System.out.println(pancakeSort(new int[]{3,2,4,1}));
	}
}
