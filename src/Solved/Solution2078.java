package Solved;

public class Solution2078 {
	public int maxDistance(int[] colors) {
		int a=0, b=0;
		for (int i = colors.length-1; i >= 0 ; i--) {
			if (colors[i] != colors[0]){
				a = i;
				break;
			}
		}
		for (int i = 0; i < colors.length; i++) {
			if (colors[i] != colors[colors.length-1]) {
				b = colors.length-i-1;
				break;
			}
		}
		return Math.max(a,b);
	}
}
