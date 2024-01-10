package Solved;

public class Solution11 {
	public int maxArea(int[] height) {
		int i1 = 0;
		int i2 = height.length-1;
		int contain = (i2-i1) * Math.min(height[i1], height[i2]);
		while (i1 < i2) {
			if (height[i1]<height[i2])
				i1++;
			else
				i2--;
			contain = Math.max(contain, (i2-i1) * Math.min(height[i1], height[i2]));
		}
		return contain;
	}
}
