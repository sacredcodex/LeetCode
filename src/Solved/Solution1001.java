package Solved;

import java.util.HashMap;
import java.util.HashSet;

public class Solution1001 {
	class Lamps{
		HashMap<Integer, Integer> rows;
		HashMap<Integer, Integer> cols;
		HashMap<Integer, Integer> sums;
		HashMap<Integer, Integer> difs;
		HashMap<Integer, HashSet<Integer>> lamps;

		Lamps(){
			rows = new HashMap<>();
			cols = new HashMap<>();
			sums = new HashMap<>();
			difs = new HashMap<>();
			lamps = new HashMap<>();
		}

		void add(int[] lamp){
			int x = lamp[0];
			int y = lamp[1];
			if (!lamps.containsKey(x) || lamps.get(x).add(y)) {
				rows.put(x, rows.getOrDefault(x, 0) + 1);
				cols.put(y, cols.getOrDefault(y, 0) + 1);
				sums.put(x + y, sums.getOrDefault(x + y, 0) + 1);
				difs.put(x - y, difs.getOrDefault(x - y, 0) + 1);
			}
			HashSet<Integer> hashSet = lamps.getOrDefault(x, new HashSet<>());
			hashSet.add(y);
			lamps.put(x, hashSet);
		}

		void delete(int[] lamp){
			int x = lamp[0];
			int y = lamp[1];
			if (lamps.containsKey(x)) {
				if (lamps.get(x).remove(y)){
					rows.put(x, rows.getOrDefault(x, 0) - 1);
					cols.put(y, cols.getOrDefault(y, 0) - 1);
					sums.put(x + y, sums.getOrDefault(x + y, 0) - 1);
					difs.put(x - y, difs.getOrDefault(x - y, 0) - 1);
				}
			}
		}

		public boolean search(int[] pos){
			int x = pos[0];
			int y = pos[1];
			boolean res = (rows.containsKey(x) && rows.get(x) > 0) || (cols.containsKey(y) && cols.get(y) > 0) ||
					(sums.containsKey(x + y) && sums.get(x + y) > 0) || (difs.containsKey(x - y) && difs.get(x - y) > 0);
			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++) {
					delete(new int[]{x + i, y + j});
				}
			}
			return res;
		}
	}
	public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
		Lamps grid = new Lamps();
		for (int[] lamp : lamps)
			grid.add(lamp);
		int[] res = new int[queries.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = grid.search(queries[i]) ? 1 : 0;
		}
		return res;
	}
}
