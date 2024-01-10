package Solved;

public class Solution1629 {
	public char slowestKey(int[] releaseTimes, String keysPressed) {
		int last = 0;
		int length = 0;
		char c = 0;
		for (int i = 0; i < releaseTimes.length; i++) {
			int l = releaseTimes[i] - last;
			if (l > length){
				length = l;
				c = keysPressed.charAt(i);
			}else if (l == length){
				if (c < keysPressed.charAt(i))
					c = keysPressed.charAt(i);
			}
			last = releaseTimes[i];
		}
		return c;
	}
}
