package Solved;

import java.util.ArrayList;
import java.util.List;

public class solution1431 {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = 0;
		for (int num : candies){
			if (num > max)
				max = num;
		}
		List<Boolean> list = new ArrayList<>();
		for (int num : candies)
			list.add(num + extraCandies >= max);
		return list;
	}
}
