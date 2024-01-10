package Solved;

public class Solution492 {
	public int[] constructRectangle(int area) {
		int w = (int) (Math.sqrt(area) + 1.5);
		while (area % --w != 0);
		return new int[]{area / w, w};
	}
}
