package Solved;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Solution1 {
	/**
	 * 1 从nums中找到两数和为target
	 * 进阶：时间复杂度小于O(n^2)
	 *      用hashmap
	 */
	/*
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target)
					return new int[]{i, j};
			}
		}
		return null;
	} */
	public static int[] twoSum(int[] nums, int target) {
		int[] numsCopy = Arrays.copyOf(nums, nums.length);
		Arrays.sort(numsCopy);
		int i = 0, j = nums.length-1;
		while (i<j){
			if (numsCopy[i]+numsCopy[j] < target)
				i++;
			else if (numsCopy[i]+numsCopy[j] > target)
				j--;
			else break;
		}
		int[] res = new int[2];
		int index = 0;
		for (int k = 0; k < nums.length; k++) {
			if (nums[k] == numsCopy[i]){
				res[index] = k;
				index++;
			} else if (nums[k] == numsCopy[j]) {
				res[index] = k;
				index++;
			}if (index == 2)
				return res;
		}
		return res;
	}

	public static class RandomMessage {
		static String[] words = new String[]{"cute","beautiful","lovely"};
		static String randomMessage(){
			Random random = new Random();
			String word = words[random.nextInt(3)];
			String end = "!".repeat(random.nextInt(3));
			String str1 = "That's so "+word+end;
			String str2 = word+end;
			String str3 = "I like it, it is so "+word+end;
			switch (random.nextInt(3)){
				case 0:
					return str1;
				case 1:
					return str2;
				case 2:
					return str3;
			}
			return "";
		}

		public static void main(String[] args) {
			for (int i = 0; i < 100; i++) {
				System.out.println(randomMessage());
			}
		}
	}


	public static void main(String[] args) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		char[] chars = new char[]{'a','b','c','d','e','f','g'};
		for (char c : chars){
			hashMap.putIfAbsent(c, 1);
		}
	}
}
