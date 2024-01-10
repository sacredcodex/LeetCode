package Solved;

import java.util.HashMap;

public class Solution2170 {
	public int minimumOperations(int[] nums) {
		HashMap<Integer, Integer> oddCount = new HashMap<>();
		HashMap<Integer, Integer> evenCount = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if ((i & 1) == 1)
				oddCount.put(nums[i], oddCount.getOrDefault(nums[i], 0) + 1);
			else evenCount.put(nums[i], evenCount.getOrDefault(nums[i], 0) + 1);
		}
		int[] odd = max(oddCount);
		int[] even = max(evenCount);
		if (odd[2] != even[2]){
			return nums.length - odd[0] - even[0];
		}else return nums.length - Math.max(odd[1] + even[0], odd[0] + even[1]);
	}
	private int[] max(HashMap<Integer, Integer> map){
		int max = 0;
		int second = 0;
		int maxNum = 0;
		for (Integer num : map.keySet()){
			if (map.get(num) > max){
				second = max;
				max = map.get(num);
				maxNum = num;
			}else if (map.get(num) > second){
				second = map.get(num);
			}
		}
		return new int[]{max, second, maxNum};
	}
}
