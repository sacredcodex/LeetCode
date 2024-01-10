package Solved;

public class Solution999 {
	public int numRookCaptures(char[][] board) {
		int[] pos = new int[]{-1, -1};
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board[i][j] == 'R')
					pos = new int[]{i, j};
			}
		}
		int count = 0;
		for (int i = pos[0]; i < 8; i++) {
			if (board[i][pos[1]] == 'B')
				break;
			if (board[i][pos[1]] == 'p') {
				count += 1;
				break;
			}
		}
		for (int i = pos[0]; i >= 0; i--) {
			if (board[i][pos[1]] == 'B')
				break;
			if (board[i][pos[1]] == 'p') {
				count += 1;
				break;
			}
		}
		for (int i = pos[1]; i < 8; i++) {
			if (board[pos[0]][i] == 'B')
				break;
			if (board[pos[0]][i] == 'p') {
				count += 1;
				break;
			}
		}
		for (int i = pos[1]; i >= 0; i--) {
			if (board[pos[0]][i] == 'B')
				break;
			if (board[pos[0]][i] == 'p') {
				count += 1;
				break;
			}
		}
		return count;
	}
}
