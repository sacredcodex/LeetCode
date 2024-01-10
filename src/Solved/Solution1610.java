package Solved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1610 {
	public int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
		List<Double> angles = new ArrayList<>();
		int locationPiont = 0;
		for (List<Integer> point : points){
			int dx = point.get(0) - location.get(0);
			int dy = point.get(1) - location.get(1);
			if (dx == 0 && dy == 0)
				locationPiont += 1;
			else
				angles.add(Math.atan2(dy, dx) * 180 / Math.PI);
		}
		Collections.sort(angles);
		int n = angles.size(), max = 0;
		for (int i = 0; i < n; i++)
			angles.add(angles.get(i) + 360);
		for (int i = 0, j = 0; j < 2 * n; j++) {
			while (i < j && angles.get(j) - angles.get(i) > angle ) i++;
			max = Math.max(max, j - i + 1);
		}
		return locationPiont + max;
	}
}
