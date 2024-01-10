package Solved;

import java.util.HashSet;

public class Solution1252 {
	public int oddCells(int m, int n, int[][] indices) {
		HashSet<Integer> rows = new HashSet<>();
		HashSet<Integer> cols = new HashSet<>();
		for (int[] indice : indices){
			if (!rows.add(indice[0])) rows.remove(indice[0]);
			if (!cols.add(indice[1])) cols.remove(indice[1]);
		}
		return m * cols.size() + n * rows.size() - 2 * cols.size() * rows.size();
	}
}
