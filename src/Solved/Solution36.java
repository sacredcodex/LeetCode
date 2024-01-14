package Solved;

import java.util.HashSet;

public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (!set.add(board[i][j]) && board[i][j]!='.') {
                    System.out.println(i);
                    System.out.println(j);
                    return false;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (!set.add(board[j][i]) && board[j][i]!='.') {
                    System.out.println(i);
                    System.out.println(j);
                    return false;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                HashSet<Character> set = new HashSet<>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (!set.add(board[3*i+k][3*j+l]) && board[3*i+k][3*j+l]!='.')
                            return false;
                    }
                }
            }
        }
        return false;
    }
}
