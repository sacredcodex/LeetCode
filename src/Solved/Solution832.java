package Solved;

public class Solution832 {
	public int[][] flipAndInvertImage(int[][] image) {
		int m = image.length;
		int n = image[0].length;
		int[][] newImg = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				newImg[i][j] = image[i][n-j-1] == 1 ? 0 : 1;
			}
		}
		return newImg;
	}
}
