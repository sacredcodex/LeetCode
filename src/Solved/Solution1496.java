package Solved;

import java.util.HashSet;

public class Solution1496 {
	public boolean isPathCrossing(String path) {
		HashSet<Integer> positions = new HashSet<>();
		int x = 0, y = 0;
		if (!positions.add(x << 14 + y))
			return true;
		for (char c : path.toCharArray()){
			if (c == 'N')
				y += 1;
			if (c == 'S')
				y -= 1;
			if (c == 'W')
				x -= 1;
			if (c == 'E')
				x += 1;
			if (!positions.add((x << 14) + y))
				return true;
		}
		return false;
	}
}
