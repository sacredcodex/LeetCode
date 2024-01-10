package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution46 {
	public List<List<Integer>> permute(int[] nums) {
		this.nums = nums;
		n = nums.length;
		state = new int[n];
		Arrays.fill(state, 1);
		dfs(0);
		return res;
	}
	int[] nums;
	int n;
	int[] state;
	List<List<Integer>> res = new ArrayList<>();
	List<Integer> list = new ArrayList<>();
	void dfs(int i){
		if (i == n){
			List<Integer> list = new ArrayList<>(this.list);
			res.add(list);
		}
		for (int j = 0; j < n; j++) {
			if (state[j] == 1){
				state[j] = 0;
				list.add(nums[j]);
				dfs(i + 1);
				list.remove(list.size()-1);
				state[j] = 1;
			}
		}
	}
}
