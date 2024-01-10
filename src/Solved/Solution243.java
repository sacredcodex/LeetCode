package Solved;

import java.util.HashSet;

public class Solution243 {
	public int shortestDistance(String[] wordsDict, String word1, String word2) {
		HashSet<Integer> index1 = new HashSet<>();
		HashSet<Integer> index2 = new HashSet<>();
		for (int i = 0; i < wordsDict.length; i++) {
			if (wordsDict[i].equals(word1))
				index1.add(i);
			if (wordsDict[i].equals(word2))
				index2.add(i);
		}
		int min = wordsDict.length;
		for (int num1 : index1)
			for (int num2 : index2) {
				int dis = Math.abs(num1 - num2);
				if (dis < min)
					min = dis;
			}
		return min;
	}
}
