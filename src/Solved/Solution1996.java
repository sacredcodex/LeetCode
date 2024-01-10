package Solved;

import java.util.Arrays;
import java.util.Comparator;

public class Solution1996 {
	public static int numberOfWeakCharacters(int[][] properties) {
		Arrays.sort(properties, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0])
					return o2[1] - o1[1];
				else return o2[0] - o1[0];
			}
		});
		int maxDef = 0;
		int rowDef = 0;
		int curAtc = 0;
		int count = 0;
		for (int[] character : properties){

			if (character[0] != curAtc){
				curAtc = character[0];
				maxDef = Math.max(maxDef, rowDef);
				rowDef = character[1];
			}
			if (character[1] < maxDef)
					count += 1;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(numberOfWeakCharacters(new int[][]{{7,10},{10,1},{5,9},{7,2},{1,10}}));
	}
}
