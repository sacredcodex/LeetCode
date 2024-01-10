package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution51 {
	static class Board{
		int n;
		int[] loc;
		HashSet<Integer> col = new HashSet<>();
		HashSet<Integer> plus = new HashSet<>();
		HashSet<Integer> minus = new HashSet<>();
		List<List<String>> solution = new ArrayList<>();
		Board(int n){
			this.n = n;
			loc = new int[n];
			Arrays.fill(loc, -1);
		}
		boolean add(int i, int j){
			if (loc[i] == -1){
				if (col.contains(j) || plus.contains(i + j) || minus.contains(i - j))
					return false;
				else {
					loc[i] = j;
					col.add(j);
					plus.add(i + j);
					minus.add(i - j);
					return true;
				}
			}else return false;
		}
		void remove(int i){
			int j = loc[i];
			loc[i] = -1;
			col.remove(j);
			plus.remove(i + j);
			minus.remove(i - j);
		}
		List<String> toList(){
			List<String> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				list.add(toString(loc[i]));
			}
			return list;
		}
		String toString(int x){
			StringBuilder str = new StringBuilder();
			str.append(".".repeat(n));
			str.replace(x, x + 1, "Q");
			return str.toString();
		}
		void solve(int i){
			if (i == n)
				solution.add(toList());
			else {
				for (int j = 0; j < n; j++) {
					if (add(i, j)) {
						solve(i + 1);
						remove(i);
					}
				}
			}
		}
	}
	public List<List<String>> solveNQueens(int n) {
		Board board = new Board(n);
		board.solve(0);
		return board.solution;
	}

	public static void main(String[] args) {
		Board board = new Board(4);
		board.solve(0);
		System.out.println(board.solution);
	}
}
