package Solved;

import java.util.Arrays;
import java.util.Comparator;

public class Solution1356 {
	public static int[] sortByBits(int[] arr) {
		Arrays.sort(arr);
		Integer[] res = new Integer[arr.length];
		int index = 0;
		for (int num : arr){
			res[index++] = num;
		}
		Arrays.sort(res, new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				int num1 = 0;
				while (o1 > 0){
					if ((o1 & 1) == 1) num1 += 1;
					o1 >>= 1;
				}
				int num2 = 0;
				while (o2 > 0){
					if ((o2 & 1) == 1) num2 += 1;
					o2 >>= 1;
				}
				return num1 - num2;
			}
		});
		index = 0;
		for (Integer num : res){
			arr[index++] = num;
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortByBits(new int[]{1024,512,256})));
	}
}
