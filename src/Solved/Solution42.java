package Solved;

public class Solution42 {
	public int trap(int[] height) {
		int[] water = new int[height.length];
		water[0] = height[0];
		for (int i = 1; i < height.length; i++) {
			water[i] = Math.max(water[i-1], height[i]);
		}
		water[water.length-1] = height[water.length-1];
		for (int i = height.length-2; i >= 0; i--) {
			water[i] = Math.min(water[i],Math.max(water[i+1], height[i]));
		}
		int sum = 0;
		for (int i = 0; i < height.length; i++) {
			sum += water[i] - height[i];
		}
		return sum;
	}
}
