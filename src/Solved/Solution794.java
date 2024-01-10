package Solved;

import java.util.HashSet;
import java.util.Set;

public class Solution794 {
	public boolean validTicTacToe(String[] board) {
		char[][] boa = new char[3][];
		int x=0,o=0;
		for (int i = 0; i < 3; i++) {
			boa[i] = board[i].toCharArray();
			for (char c : boa[i]){
				if (c == 'O')
					o += 1;
				if (c == 'X')
					x += 1;
			}
		}
		Set<Character> complete = new HashSet<>();
		for (int i = 0; i < 3; i++) {
			if (boa[i][0] == boa[i][1] && boa[i][0] == boa[i][2])
				complete.add(boa[i][0]);
			if (boa[0][i] == boa[1][i] && boa[0][i] == boa[2][i])
				complete.add(boa[0][i]);
		}
		if (boa[0][0] == boa[1][1] && boa[0][0] == boa[2][2])
			complete.add(boa[0][0]);
		if (boa[0][2] == boa[1][1] && boa[0][2] == boa[2][0])
			complete.add(boa[0][2]);
		complete.remove(' ');
		if (complete.size() == 2) return false;
		if (complete.isEmpty()) return x - o == 0 || x - o == 1;
		if (complete.contains('x')) return x - o == 1;
		else return x - o == 0;
	}
}
