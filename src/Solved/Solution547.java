package Solved;

import java.util.HashSet;

public class Solution547 {
    int[] capital, rank;
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        capital = new int[n];
        for (int i = 0; i < n; i++) capital[i] = i;
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (isConnected[i][j] == 1)
                    merge(i, j);
            }
        }

        HashSet<Integer> capitals = new HashSet<>();
        for (int i = 0; i < n; i++) {
            capitals.add(capital(i));
        }
        return capitals.size();
    }

    private int capital(int i){
        return i == capital[i] ? i : capital(capital[i]);
    }

    private  void merge(int i, int j){
        int capitalI = capital(i);
        int capitalJ = capital(j);
        if (capitalI == capitalJ)
            return;
        if (rank[capitalI] == rank[capitalJ]){
            capital[capitalJ] = capitalI;
            rank[capitalI] += 1;
        }else if (rank[capitalI] > rank[capitalJ])
            capital[capitalJ] = capitalI;
        else capital[capitalI] = capitalJ;
    }
}
