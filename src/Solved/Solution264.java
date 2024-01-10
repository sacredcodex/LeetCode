package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution264 {
	public int nthUglyNumber(int n) {
		List<Integer> ugly = new ArrayList<>();
		ugly.add(1);
		int f2 = 0;
		int f3 = 0;
		int f5 = 0;
		int u2, u3, u5;
		int u = 1;
		for (int i = 0; i < n-1; i++){
			u2 = ugly.get(f2) * 2;
			u3 = ugly.get(f3) * 3;
			u5 = ugly.get(f5) * 5;
			u = Math.min(u2, Math.min(u3, u5));
			if (u2 == u)
				f2++;
			if (u3 == u)
				f3++;
			if (u5 == u)
				f5++;
			ugly.add(u);
		}
		return u;
	}
}
