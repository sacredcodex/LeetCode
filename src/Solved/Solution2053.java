package Solved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution2053 {
	public static String kthDistinct(String[] arr, int k) {
		HashSet<String> hashSet = new HashSet<>();
		HashSet<String> hashSet1 = new HashSet<>();
		for (String str : arr) {
			if (!hashSet.add(str))
				hashSet1.add(str);
		}
		int count = 0;
		for (String str : arr) {
			if (hashSet1.contains(str)) continue;
			if (++count == k)
				return str;
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println(kthDistinct(new String[]{"d","b","c","b","c","a"},2));
	}
}
