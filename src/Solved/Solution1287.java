package Solved;

import java.util.HashMap;
import java.util.HashSet;

public class Solution1287 {
	public int findSpecialInteger(int[] arr) {
		int quarter = arr.length >> 2;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[i + quarter])
				return arr[i];
		}
		return -1;
	}
}
