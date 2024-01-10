package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution2042 {
	public boolean areNumbersAscending(String s) {
		List<Integer> nums = new ArrayList<>();
		for (String word : s.split(" ")){
			try{
				nums.add(Integer.parseInt(word));
			}catch (NumberFormatException ignored){}
		}
		for (int i = 1; i < nums.size(); i++) {
			if (nums.get(i-1) >= nums.get(i))
				return false;
		}
		return true;
	}
}
