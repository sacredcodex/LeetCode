package Solved;

import com.sun.jdi.IntegerType;

import java.util.HashSet;

public class Solution1994 {
	static long res;
	static final int basic = 1000000007;
	static int state = 0;
	static int[] unused = new int[]{2,3,5,6,7,10,11,13,14,15,21,22,26,30};//length = 14
	static int[] change = new int[]{1,2,4,3,8,5,16,32,9,6,10,17,33,7};
	static int[] count;
	public static int numberOfGoodSubsets(int[] nums) {
		count = new int[31];
		for (int num : nums)
			count[num] += 1;
		add(0, 1);
		res = sum;
		time(count[17]+1);
		time(count[19]+1);
		time(count[23]+1);
		time(count[29]+1);
		res -= 1;
		if (res < 0)
			res += basic;
		for (int i = 0; i < count[1]; i++) {
			time(2);
		}
		return (int) res;
	}
	private static void time(int num){
		res *= num;
		res %= basic;
	}

	static long sum = 0;
	private static void add(int begin, long current){
		System.out.println(state);
		sum += current;
		sum %= basic;
		for (int i = begin; i < 14; i++) {
			if (count[unused[i]] != 0 && (state & change[i]) == 0){
				state ^= change[i];
				long next = current * count[unused[i]];
				next %= basic;
				add(i + 1, next);
				state ^= change[i];
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(numberOfGoodSubsets(new int[]{2,15,30,17,29}));
	}
}
