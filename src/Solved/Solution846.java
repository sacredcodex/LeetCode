package Solved;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Solution846 {
	public static boolean isNStraightHand(int[] hand, int groupSize) {
		if (groupSize == 1) return true;
		if (hand.length % groupSize != 0) return false;
		Arrays.sort(hand);
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		for (int card : hand) {
			hashMap.put(card, hashMap.getOrDefault(card, 0) + 1);
		}
		for (int card : hand) {
			if (!hashMap.containsKey(card)) continue;
			int num = hashMap.get(card);
			if (num == 0) {
				hashMap.remove(card);
				continue;
			}
			for (int i = 1; i < groupSize; i++) {
				if (!hashMap.containsKey(card + i)) return false;
				int num2 = hashMap.get(card + i) - num;
				if (num2 < 0) return false;
				hashMap.put(card + i, num2);
			}
			hashMap.remove(card);
		}
		return true;
		/*
		空间占用太高，max-min
		时间上：On
		if (groupSize == 1) return true;
		if (hand.length % groupSize != 0) return false;
		int max = hand[0];
		int min = hand[0];
		for (int card : hand) {
			if (card > max) max = card;
			if (card < min) min = card;
		}
		int[] count = new int[max - min + 1];
		for (int card : hand) {
			count[card - min] += 1;
		}
		for (int i = 0; i < count.length - groupSize + 1; i++) {
			if (count[i] < 0) return false;
			if (count[i] > 0)
				for (int j = groupSize - 1; j >= 0; j--) {
					count[i + j] -= count[i];
				}
		}
		for (int i = count.length - groupSize + 1; i < count.length; i++) {
			if (count[i] != 0) return false;
		}
		return true;
		 */
	}

	public static void main(String[] args) {
		System.out.println(isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8}, 3));
	}
}
