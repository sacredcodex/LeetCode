package Solved;

import java.util.Arrays;

public class Solution661 {
	public int[][] imageSmoother(int[][] img) {
		int[][] res = new int[img.length][img[0].length];
		for (int[] row : res)
			Arrays.fill(row, 1);
		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[0].length; j++) {
				int sum = img[i][j];
				int n = 1;
				if (i > 0){
					if (j > 0) {
						sum += img[i - 1][j - 1];
						n += 1;
					}
					sum += img[i-1][j];
					n += 1;
					if (j < img[0].length - 1){
						sum += img[i-1][j+1];
						n += 1;
					}
				}
				if (j > 0) {
					sum += img[i][j - 1];
					n += 1;
				}
				if (j < img[0].length - 1){
					sum += img[i][j+1];
					n += 1;
				}
				if (i < img.length - 1){
					if (j > 0) {
						sum += img[i+1][j - 1];
						n += 1;
					}
					sum += img[i+1][j];
					n += 1;
					if (j < img[0].length - 1){
						sum += img[i+1][j+1];
						n += 1;
					}
				}
				res[i][j] = sum / n;
			}
		}
		return res;
	}
}
