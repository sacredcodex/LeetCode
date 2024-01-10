package Solved;

public class Solution1725 {
	public int countGoodRectangles(int[][] rectangles) {
		int largest = 0;
		int count = 0;
		for (int[] rectangle : rectangles){
			int edge = Math.min(rectangle[0], rectangle[1]);
			if (edge > largest){
				largest = edge;
				count = 1;
			}else if (edge == largest)
				count += 1;
		}
		return count;
	}
}
