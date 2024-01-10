package Solved;

import java.util.Collections;
import java.util.HashSet;

public class Solution1385 {
	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		int res = 0;
		for (int num1 : arr1){
			boolean flag = true;
			for (int num2 : arr2){
				if (Math.abs(num1 - num2) <= d){
					flag = false;
					break;
				}
			}
			if (flag)
				res += 1;
		}
		return res;
	}
}
