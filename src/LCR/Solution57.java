package LCR;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Solution57 {
    public int getMaximumNumber(int[][] moles) {
        Arrays.sort(moles, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        int[][][] dp = new int[3][3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        dp[1][1] = new int[]{0,0};

        int time = 0;
        HashMap<Integer, int[]> hashMap = new HashMap<>();

        for (int[] mole : moles){
            int mole_time = mole[0];
            if (mole_time != time){
                for (int i : hashMap.keySet()){
                    int new_score

                }
            }
            int x = mole[1];
            int y = mole[2];
            int score = -1;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int dp_time = dp[i][j][0];
                    int dp_score = dp[i][j][1];
                    if (dp_time == -1)
                        continue;
                    int distance = Math.abs(x - i) + Math.abs(y - j);
                    if (time - dp_time >= distance){
                        score = Math.max(dp_score + 1, score);
                    }
                }
            }
            dp[x][y] = new int[]{time, score};
        }

        int max = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                max = Math.max(max, dp[i][j][1]);
            }
        }

        return max;
    }
}
