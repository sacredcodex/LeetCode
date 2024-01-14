package Solved;

public class Solution289 {
    private static int[] dx = new int[]{-1,-1,-1,0,0,1,1,1};
    private static int[] dy = new int[]{-1,0,1,-1,1,-1,0,1};
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] next = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 8; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];
                    if (x>=0 && x<m && y>=0 && y<n)
                        next[i][j] += board[x][y];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (next[i][j]==3)
                    board[i][j] = 1;
                if (next[i][j]<2 || next[i][j]>3)
                    board[i][j] = 0;
            }
        }
    }
}
