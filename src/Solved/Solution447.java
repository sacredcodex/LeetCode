package Solved;

import java.util.HashMap;

public class Solution447 {
    public int numberOfBoomerangs(int[][] points) {
        int length = points.length;
        int[][] dis = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (dis[i][j] != 0)
                    continue;
                int d = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0])
                        + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
                dis[i][j] = d;
                dis[j][i] = d;
            }
        }

        int res=0;

        for (int i = 0; i < length; i++) {
            HashMap<Integer, Integer> dis_count = new HashMap<Integer, Integer>();
            for (int j = 0; j < length; j++) {
                if (i == j)
                    continue;
                dis_count.put(dis[i][j], dis_count.getOrDefault(dis[i][j], 0) + 1);
            }
            for (int d : dis_count.keySet()) {
                int num = dis_count.get(d);
                res += num * (num - 1);
            }
        }

        return res;
    }
}
