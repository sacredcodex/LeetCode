package Solved;

import java.util.Arrays;
import java.util.HashSet;

public class Solution37{
	class Board{
		
		int[][] board = new int[9][9];
		int[][] solution = new int[9][9];
		HashSet<Integer>[] rows = new HashSet[9];
		HashSet<Integer>[] cols = new HashSet[9];
		HashSet<Integer>[] blocks = new HashSet[9];
		
		Board(char[][] board){
			for (int i = 0; i < 9; i++) {
				rows[i] = new HashSet<>();
				cols[i] = new HashSet<>();
				blocks[i] = new HashSet<>();
			}
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (board[i][j] != '.')
						add(i, j, board[i][j] - '0');
				}
			}
		}
		
		private void add(int i, int j, int num){
			board[i][j] = num;
			rows[i].add(num);
			cols[j].add(num);
			blocks[i/3*3+j/3].add(num);
		}
		
		private int remove(int i, int j){
			int num = board[i][j];
			board[i][j] = 0;
			rows[i].remove(num);
			cols[j].remove(num);
			blocks[i/3*3+j/3].remove(num);
			return num;
		}
		
		private HashSet<Integer> get(int i, int j){
			HashSet<Integer> set = new HashSet<>();
			for (int k = 1; k <= 9; k++) {
				set.add(k);
			}
			set.removeAll(rows[i]);
			set.removeAll(cols[j]);
			set.removeAll(blocks[i/3*3+j/3]);
			return set;
		}
		
		private void solve(int i, int j){
			if (j == 9){
				j = 0;
				i += 1;
			}
			if (i == 9){
				for (int k = 0; k < 9; k++) {
					for (int l = 0; l < 9; l++) {
						solution[i][j] = board[i][j];
					}
				}
				return;
			}
			if (board[i][j] != 0){
				System.out.println(i+","+j+ Arrays.toString(get(i, j).toArray()));
				for (int num : get(i,j)){
					add(i, j, num);
					solve(i, j + 1);
					remove(i, j);
				}
			}else {
				solve(i, j + 1);
			}
		}
	}

	public void solveSudoku(char[][] board) {
		Board boardClass = new Board(board);
		boardClass.solve(0, 0);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = (char)(boardClass.solution[i][j] + '0');
			}
		}
	}
}
