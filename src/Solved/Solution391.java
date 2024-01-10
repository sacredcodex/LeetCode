package Solved;

import java.util.HashSet;
import java.util.Set;

public class Solution391 {
	public boolean isRectangleCover(int[][] rectangles) {
		Set<point> pointSet = new HashSet<>();
		point a,b,c,d;
		int minX = 100001;
		int maxX = -100001;
		int minY = 100001;
		int maxY = -100001;
		int area = 0;
		for (int[] rectangle : rectangles){
			area += (rectangle[0]-rectangle[2])*(rectangle[1]-rectangle[3]);
			minX = Math.min(minX, rectangle[0]);
			maxX = Math.max(maxX, rectangle[2]);
			minY = Math.min(minY, rectangle[1]);
			maxY = Math.max(maxY, rectangle[3]);
			a = new point(rectangle[0], rectangle[1]);
			b = new point(rectangle[2], rectangle[1]);
			c = new point(rectangle[0], rectangle[3]);
			d = new point(rectangle[2], rectangle[3]);
			if (pointSet.contains(a))
				pointSet.remove(a);
			else
				pointSet.add(a);
			if (pointSet.contains(b))
				pointSet.remove(b);
			else
				pointSet.add(b);
			if (pointSet.contains(c))
				pointSet.remove(c);
			else
				pointSet.add(c);
			if (pointSet.contains(d))
				pointSet.remove(d);
			else
				pointSet.add(d);
		}
		if (area != (minX-maxX)*(minY-maxY))
			return false;
		a = new point(minX, minY);
		b = new point(maxX, minY);
		c = new point(minX, maxY);
		d = new point(maxX, maxY);
		if (!pointSet.remove(a)) return false;
		if (!pointSet.remove(b)) return false;
		if (!pointSet.remove(c)) return false;
		if (!pointSet.remove(d)) return false;
		return pointSet.isEmpty();
	}

	static class point {
		int x,y;
		point(int x, int y){
			this.x = x;
			this.y = y;
		}

		@Override
		public int hashCode() {
			return (1231*x) ^ (1237*y);
		}

		@Override
		public boolean equals(Object a) {
			if (a instanceof point) {
				point b = (point) a;
				return b.x == x && b.y == y;
			} else
				return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(new point(1,3).hashCode());
		Solution391 solution391 = new Solution391();
		int[][] rec = new int[1][4];
		rec[0][0] = 1;
		rec[0][1] = 1;
		rec[0][2] = 3;
		rec[0][3] = 3;
		System.out.println(solution391.isRectangleCover(rec));
	}
}
