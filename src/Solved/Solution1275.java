package Solved;

public class Solution1275 {
	public String tictactoe(int[][] moves) {
		int[][] board = new int[3][3];
		boolean flag = true;
		for (int[] point : moves){
			board[point[0]][point[1]] = flag ? 1 : 2;
			flag = !flag;
		}
		for (int i = 0; i < 3; i++) {
			if (board[i][0] != 0 && board[i][0] == board[i][1] && board[i][1] == board[i][2])
				return board[i][0] == 1 ? "A" : "B";
			if (board[0][i] != 0 && board[0][i] == board[1][i] && board[1][i] == board[2][i])
				return board[0][i] == 1 ? "A" : "B";
		}
		if (board[0][0] != 0 && board[0][0] == board[1][1] && board[1][1] == board[2][2])
			return board[0][0] == 1 ? "A" : "B";
		if (board[2][0] != 0 && board[0][2] == board[1][1] && board[1][1] == board[2][0])
			return board[0][2] == 1 ? "A" : "B";
		if (moves.length == 9) return "Draw";
		else return "Pending";
	}
}
