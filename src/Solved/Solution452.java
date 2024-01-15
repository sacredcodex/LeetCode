package Solved;

import java.util.Arrays;
import java.util.Comparator;

public class Solution452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]<o2[0]?-1:1;
            }
        });
        int arrow = 1;
        int right = points[0][1];
        for (int[] balloon : points){
            if (right >= balloon[0]){
                right = Math.min(right, balloon[1]);
            }else {
                arrow += 1;
                right = balloon[1];
            }
        }
        return arrow;
    }
}
