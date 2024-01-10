package Solved;

public class Solution506 {
	public String[] findRelativeRanks(int[] score) {
		int[] number = new int[score.length];
		for (int i = 0; i < score.length; i++) {
			for (int j = i+1; j > score.length; j++) {
				if (score[i]<score[j])
					number[j]++;
				else number[i]++;
			}
		}
		String[] res = new String[score.length];
		for (int i = 0; i < score.length; i++) {
			switch (number[i]){
				case 0:
					res[i] = "Gold Medal";
					break;
				case 1:
					res[i] = "Silver Medal";
					break;
				case 2:
					res[i] = "Bronze Medal";
					break;
				default:
					res[i] = Integer.toString(number[i]+1);
			}
		}
		return res;
	}
}
