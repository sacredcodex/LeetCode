package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution476 {
	public int findComplement(int num) {
		List<Integer> list = new ArrayList<>();
		int index = 0;
		while (num > 0){
			if ((num & 1) == 1)
			    list.add(0);
			else list.add(1);
			num >>= 1;
			index += 1;
		}
		while (list.size()>0 && list.get(list.size()-1) == 0){
			list.remove(list.size()-1);
		}
		int a = 0;
		index = list.size()-1;
		while (index >= 0){
			a <<= 1;
			if (list.get(index--) == 1)
				a += 1;
		}
		return a;
	}
}
