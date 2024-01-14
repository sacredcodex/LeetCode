import java.util.Arrays;
import java.util.Comparator;

public class Solution452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int index = points[0][0];
        int right = points[0][1];
        for (int[] balloon : points){
        }
        return 0;
    }
}
