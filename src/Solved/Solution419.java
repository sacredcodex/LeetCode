package Solved;

public class Solution419 {
	public int countBattleships(char[][] board) {
		int count = 0;
		if (board[0][0] == 'X')
			count += 1;
		for (int i = 1; i < board[0].length; i++) {
			if (board[0][i] == 'X' && board[0][i-1] == '.')
				count += 1;
		}
		for (int i = 1; i < board.length; i++) {
			if (board[i][0] == 'X' && board[i-1][0] == '.')
				count += 1;
			for (int j = 1; j < board[1].length; j++) {
				if (board[i][j] == 'X' && board[i-1][j] == '.' && board[i][j-1] == '.')
					count += 1;
			}
		}
		return count;
	}
}
