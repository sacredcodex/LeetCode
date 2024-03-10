package Solved;

import java.util.*;

public class Solution1976 {
    public int countPaths(int n, int[][] roads) {
        List<int[]>[] next = new List[n];
        for (int i = 0; i < n; i++) {
            next[i] = new ArrayList<>();
        }

        for (int[] road : roads){
            int a = road[0];
            int b = road[1];
            int length = road[2];
            next[a].add(new int[]{b, length});
            next[b].add(new int[]{a, length});
        }

        PriorityQueue<long[]> status = new PriorityQueue<>(new Comparator<long[]>() {
            @Override
            public int compare(long[] o1, long[] o2) {
                return Long.compare(o1[1], o2[1]);
            }
        });

        status.offer(new long[]{0,0});

        long[] minTime = new long[n];
        for (int i = 1; i < n; i++) {
            minTime[i] = Long.MAX_VALUE;
        }
        minTime[0] = 0;
        int[] count = new int[n];
        count[0] = 1;

        while (!status.isEmpty()){
            long[] cur = status.poll();
            System.out.println(Arrays.toString(cur));
            int pos = (int) cur[0];
            long time = cur[1];

            if (time > minTime[pos]) continue;

            for (int[] path : next[pos]) {
                int newPos = path[0];
                long newTime = time + path[1];
                if (minTime[newPos] < newTime){
                    count[newPos] = 0;
                    minTime[newPos] = newTime;
                } else if (minTime[newPos] > newTime) {
                    continue;
                }
                count[newPos] += count[pos];
                status.offer(new long[]{newPos, newTime});
                System.out.println("Add: "+newPos+" | "+newTime);
            }
        }
        return count[n-1];
    }
}
