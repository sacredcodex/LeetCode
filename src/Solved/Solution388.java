package Solved;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution388 {

	public int lengthLongestPath(String input) {
		String[] strs = input.split("\n");
		System.out.println(Arrays.toString(strs));
		ArrayList<String> list = new ArrayList<>();
		int size = 0;
		int res = 0;
		for (String str : strs){
			int count = 0;
			while(str.charAt(count) == '\t')
				count += 1;
			if (count == size)
				list.add(str.substring(count));
			else {
				if (size > count) {
					list.subList(count, size).clear();
				}
				list.add(count, str.substring(count));
			}
			size = count + 1;
			for (int i = 0; i < size; i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
			if (str.contains(".")){
				int num = size-1;
				for (int i = 0; i < size; i++) {
					num += list.get(i).length();
				}
				if (num > res)
					res = num;
			}
		}
		return res;
	}
}
