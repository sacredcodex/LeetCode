package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution733 {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int oldColor = image[sr][sc];
		if (oldColor == newColor) return image;
		change(image, sr, sc, newColor, oldColor);
		return image;
	}
	private void change(int[][] image, int r, int c, int color, int oldColor){
		if (r >= 0 && r < image.length && c >= 0 && c < image[0].length && image[r][c] == oldColor){
			image[r][c] = color;
			change(image, r+1, c, color, oldColor);
			change(image, r-1, c, color, oldColor);
			change(image, r, c+1, color, oldColor);
			change(image, r, c-1, color, oldColor);
		}
	}
}
