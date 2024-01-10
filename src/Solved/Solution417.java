package Solved;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution417 {
	public List<List<Integer>> pacificAtlantic(int[][] heights) {
		int m = heights.length;
		int n = heights[0].length;
		if (m == 1 || n == 1){
			List<List<Integer>> res = new ArrayList<>();
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					List<Integer> list = new ArrayList<>();
					list.add(i);
					list.add(j);
					res.add(list);
				}
			}
			return res;
		}
		Set<Integer> pacific = new HashSet<>();
		Set<Integer> atlantic = new HashSet<>();
		for (int i = 0; i < n; i++) {
			pacific.add(i);
			atlantic.add((m - 1) * 201 + i);
		}
		for (int i = 0; i < m; i++) {
			pacific.add(201 * i);
			atlantic.add(201 * i + n - 1);
		}
		Set<Integer> Pacific = new HashSet<>();
		while (!pacific.isEmpty()){
			Pacific.addAll(pacific);
			HashSet<Integer> tmp = new HashSet<>();
			for (int pos : pacific){
				int x = pos / 201;
				int y = pos % 201;
				if (x > 0){
					if (heights[x][y] <= heights[x - 1][y])
						if (!Pacific.contains(pos - 201))
							tmp.add(pos - 201);
				}
				if (x < m - 1){
					if (heights[x][y] <= heights[x + 1][y])
						if (!Pacific.contains(pos + 201))
							tmp.add(pos + 201);
				}
				if (y > 0){
					if (heights[x][y] <= heights[x][y - 1])
						if (!Pacific.contains(pos - 1))
							tmp.add(pos - 1);
				}
				if (y < n - 1){
					if (heights[x][y] <= heights[x][y + 1])
						if (!Pacific.contains(pos + 1))
							tmp.add(pos + 1);
				}
			}
			pacific.clear();
			pacific.addAll(tmp);
		}
		Set<Integer> Atlantic = new HashSet<>();
		while (!atlantic.isEmpty()){
			Atlantic.addAll(atlantic);
			HashSet<Integer> tmp = new HashSet<>();
			for (int pos : atlantic){
				int x = pos / 201;
				int y = pos % 201;
				if (x > 0){
					if (heights[x][y] <= heights[x - 1][y])
						if (!Atlantic.contains(pos - 201))
							tmp.add(pos - 201);
				}
				if (x < m - 1){
					if (heights[x][y] <= heights[x + 1][y])
						if (!Atlantic.contains(pos + 201))
							tmp.add(pos + 201);
				}
				if (y > 0){
					if (heights[x][y] <= heights[x][y - 1])
						if (!Atlantic.contains(pos - 1))
							tmp.add(pos - 1);
				}
				if (y < n - 1){
					if (heights[x][y] <= heights[x][y + 1])
						if (!Atlantic.contains(pos + 1))
							tmp.add(pos + 1);
				}
			}
			atlantic.clear();
			atlantic.addAll(tmp);
		}
		Pacific.retainAll(Atlantic);
		List<List<Integer>> res = new ArrayList<>();
		for (int pos : Pacific){
			int x = pos / 201;
			int y = pos % 201;
			List<Integer> list = new ArrayList<>();
			list.add(x);
			list.add(y);
			res.add(list);
		}
		return res;
	}
}
