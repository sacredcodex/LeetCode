package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution1389 {
	public int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			list.add(index[i], nums[i]);
		}
		int[] res = new int[list.size()];
		int i = 0;
		for (int num : list){
			res[i++] = num;
		}
		return res;
	}
}
